package lec11;

public class StringUtils {

    private StringUtils(){}

    private boolean isDirectoryPath(String path) {
        return path.endsWith("/");
    }
}
