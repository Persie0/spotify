package p204p;

import java.io.Closeable;
import java.io.Flushable;

/* JADX INFO: loaded from: classes2.dex */
public interface ai21 extends Closeable, Flushable {
    /* JADX INFO: renamed from: U0 */
    void mo25160U0(npa npaVar, long j);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    void flush();

    /* JADX INFO: renamed from: m */
    au71 mo25161m();
}
