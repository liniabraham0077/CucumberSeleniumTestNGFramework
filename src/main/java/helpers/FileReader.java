package helpers;

public class FileReader {
    private static final FileReader fileReader = new FileReader();
    private static ConfigFileReader configFileReader;

    private FileReader() {}

    public static FileReader getInstance() {
        return fileReader;
    }

    public ConfigFileReader getConfigFileReader() {
        return (configFileReader == null) ? new ConfigFileReader() : configFileReader;
    }
}
