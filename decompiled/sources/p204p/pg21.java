package p204p;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public final class pg21 extends OutputStream {

    /* JADX INFO: renamed from: a */
    public final FileOutputStream f177208a;

    public pg21(FileOutputStream fileOutputStream) {
        this.f177208a = fileOutputStream;
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        this.f177208a.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        this.f177208a.write(i);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        this.f177208a.write(bArr);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        this.f177208a.write(bArr, i, i2);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
