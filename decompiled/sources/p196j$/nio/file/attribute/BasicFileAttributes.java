package p196j$.nio.file.attribute;

/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public interface BasicFileAttributes {
    FileTime creationTime();

    Object fileKey();

    boolean isDirectory();

    boolean isOther();

    boolean isRegularFile();

    boolean isSymbolicLink();

    FileTime lastAccessTime();

    FileTime lastModifiedTime();

    long size();
}
