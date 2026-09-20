package java.nio.file;

import java.io.IOException;
import java.util.ConcurrentModificationException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public final class DirectoryIteratorException extends ConcurrentModificationException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DirectoryIteratorException(IOException iOException) {
        super(iOException);
        Objects.requireNonNull(iOException);
    }

    @Override // java.lang.Throwable
    public IOException getCause() {
        return (IOException) super.getCause();
    }
}
