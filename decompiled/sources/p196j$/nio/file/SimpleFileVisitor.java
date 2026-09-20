package p196j$.nio.file;

import java.io.IOException;
import java.util.Objects;
import p196j$.nio.file.attribute.BasicFileAttributes;

/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public class SimpleFileVisitor<T> implements FileVisitor<T> {
    @Override // p196j$.nio.file.FileVisitor
    public FileVisitResult postVisitDirectory(T t, IOException iOException) throws IOException {
        Objects.requireNonNull(t);
        if (iOException == null) {
            return FileVisitResult.CONTINUE;
        }
        throw iOException;
    }

    @Override // p196j$.nio.file.FileVisitor
    public FileVisitResult preVisitDirectory(T t, BasicFileAttributes basicFileAttributes) {
        Objects.requireNonNull(t);
        Objects.requireNonNull(basicFileAttributes);
        return FileVisitResult.CONTINUE;
    }

    @Override // p196j$.nio.file.FileVisitor
    public FileVisitResult visitFile(T t, BasicFileAttributes basicFileAttributes) {
        Objects.requireNonNull(t);
        Objects.requireNonNull(basicFileAttributes);
        return FileVisitResult.CONTINUE;
    }

    @Override // p196j$.nio.file.FileVisitor
    public FileVisitResult visitFileFailed(T t, IOException iOException) throws IOException {
        Objects.requireNonNull(t);
        throw iOException;
    }
}
