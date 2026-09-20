package p196j$.nio.file;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.util.Iterator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: j$.nio.file.z */
/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public final class C1503z implements DirectoryStream {

    /* JADX INFO: renamed from: a */
    public final DirectoryStream f10599a;

    public C1503z(DirectoryStream directoryStream) {
        this.f10599a = directoryStream;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f10599a.close();
    }

    @Override // java.lang.Iterable
    public final void forEach(Consumer consumer) {
        this.f10599a.forEach(new C1502y(consumer, 0));
    }

    @Override // java.nio.file.DirectoryStream, java.lang.Iterable
    public final Iterator iterator() {
        return new C1464b0(this.f10599a.iterator());
    }
}
