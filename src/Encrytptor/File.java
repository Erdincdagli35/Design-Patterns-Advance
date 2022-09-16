package Encrytptor;

public class File {

    private final String name;

    public File(String name) {
        this.name = name;
    }

    public void encrypt(Encryptor encryptor) {
        System.out.println(encryptor.encryptFile() + " to " + name);
    }
}
