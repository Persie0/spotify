package p196j$.nio.file;

import java.io.IOException;
import p196j$.nio.file.attribute.BasicFileAttributes;

/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public interface FileVisitor<T> {
    FileVisitResult postVisitDirectory(Object obj, IOException iOException);

    FileVisitResult preVisitDirectory(Object obj, BasicFileAttributes basicFileAttributes);

    FileVisitResult visitFile(Object obj, BasicFileAttributes basicFileAttributes);

    FileVisitResult visitFileFailed(Object obj, IOException iOException);
}
