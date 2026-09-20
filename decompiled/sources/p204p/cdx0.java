package p204p;

import java.io.BufferedOutputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class cdx0 extends BufferedOutputStream {

    /* JADX INFO: renamed from: a */
    public boolean f36965a;

    /* JADX INFO: renamed from: a */
    public final void m32467a(OutputStream outputStream) {
        c95.m31855u(this.f36965a);
        ((BufferedOutputStream) this).out = outputStream;
        ((BufferedOutputStream) this).count = 0;
        this.f36965a = false;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        this.f36965a = true;
        flush();
        th = null;
        try {
            ((BufferedOutputStream) this).out.close();
        } catch (Throwable th) {
            if (th == null) {
                th = th;
            }
        }
        if (th == null) {
            return;
        }
        String str = h0b1.f86200a;
        throw th;
    }
}
