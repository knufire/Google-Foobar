import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class ElevatorMaintenance {

    public static class Solution {

        public static class Version implements Comparable<Version> {
            final int major;
            final int minor;
            final int revision;

            public Version(int major, int minor, int revision) {
                this.major = major;
                this.minor = minor;
                this.revision = revision;
            }

            @Override
            public boolean equals(Object o) {
                if (o == this)
                    return true;
                if (!(o instanceof Version)) {
                    return false;
                }
                Version version = (Version) o;
                return major == version.major && minor == version.minor && revision == version.revision;
            }

            @Override
            public int hashCode() {
                return Objects.hash(major, minor, revision);
            }

            @Override
            public int compareTo(Version v) {
                if (major != v.major) {
                    return Integer.compare(major, v.major);
                } else if (minor != v.minor) {
                    return compareIndividualVersionNumber(minor, v.minor);
                } else {
                    return compareIndividualVersionNumber(revision, v.revision);
                }
            }

            private int compareIndividualVersionNumber(int mine, int other) {
                if (mine == other)
                    return 0;
                if (mine == -1)
                    return -1;
                if (other == -1)
                    return 1;
                return Integer.compare(mine, other);
            }

            @Override
            public String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append(major);
                if (minor > -1) {
                    sb.append(".");
                    sb.append(minor);
                    if (revision > -1) {
                        sb.append(".");
                        sb.append(revision);
                    }
                }
                return sb.toString();
            }
        }

        public static String[] solution(String[] l) {
            List<Version> versions = Arrays.stream(l).map(s -> {
                return convertStringToVersion(s);
            }).collect(Collectors.toList());

            Collections.sort(versions);

            return versions.stream().map(v -> {
                return v.toString();
            }).collect(Collectors.toList()).toArray(new String[0]);
        }

        public static Version convertStringToVersion(String s) {
            String[] splitString = s.split("\\.");
            List<Integer> numbers = Arrays.stream(splitString).mapToInt(Integer::parseInt).boxed()
                    .collect(Collectors.toList());
            int major = numbers.get(0);
            int minor = numbers.size() > 1 ? numbers.get(1) : -1;
            int revision = numbers.size() > 2 ? numbers.get(2) : -1;
            return new Version(major, minor, revision);
        }

    }

}