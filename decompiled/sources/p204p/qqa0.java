package p204p;

import java.io.Writer;

/* JADX INFO: loaded from: classes3.dex */
public final class qqa0 extends Writer {

    /* JADX INFO: renamed from: a */
    public final StringBuilder f191515a = new StringBuilder(128);

    /* JADX INFO: renamed from: a */
    public final void m73511a() {
        StringBuilder sb = this.f191515a;
        if (sb.length() > 0) {
            sb.toString();
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        m73511a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        m73511a();
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == '\n') {
                m73511a();
            } else {
                this.f191515a.append(c);
            }
        }
    }
}
