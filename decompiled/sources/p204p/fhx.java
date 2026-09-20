package p204p;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import p196j$.p198io.DesugarInputStream;
import p196j$.p198io.InputStreamRetargetInterface;

/* JADX INFO: loaded from: classes.dex */
public final class fhx extends InputStream implements InputStreamRetargetInterface {

    /* JADX INFO: renamed from: a */
    public final InputStream f69726a;

    /* JADX INFO: renamed from: b */
    public int f69727b = 1073741824;

    public fhx(InputStream inputStream) {
        this.f69726a = inputStream;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f69727b;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f69726a.close();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        int i = this.f69726a.read();
        if (i == -1) {
            this.f69727b = 0;
        }
        return i;
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        return this.f69726a.skip(j);
    }

    @Override // java.io.InputStream, p196j$.p198io.InputStreamRetargetInterface
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        int i = this.f69726a.read(bArr);
        if (i == -1) {
            this.f69727b = 0;
        }
        return i;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f69726a.read(bArr, i, i2);
        if (i3 == -1) {
            this.f69727b = 0;
        }
        return i3;
    }
}
