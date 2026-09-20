package java.nio.file;

import java.io.Closeable;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public interface DirectoryStream<T> extends Closeable, Iterable<T> {

    /* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
    public interface Filter<T> {
        boolean accept(T t);
    }

    Iterator<T> iterator();
}
