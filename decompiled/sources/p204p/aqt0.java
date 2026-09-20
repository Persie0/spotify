package p204p;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import p196j$.p198io.DesugarInputStream;
import p196j$.p198io.InputStreamRetargetInterface;

/* JADX INFO: loaded from: classes4.dex */
public final class aqt0 extends InputStream implements InputStreamRetargetInterface {

    /* JADX INFO: renamed from: a */
    public int f18806a;

    /* JADX INFO: renamed from: b */
    public int f18807b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ cqt0 f18808c;

    public aqt0(cqt0 cqt0Var, zpt0 zpt0Var) {
        this.f18808c = cqt0Var;
        this.f18806a = cqt0Var.m33644p(zpt0Var.f285226b + 4);
        this.f18807b = zpt0Var.f285227c;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (bArr == null) {
            throw new NullPointerException("buffer");
        }
        if ((i | i2) < 0 || i2 > bArr.length - i) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i3 = this.f18807b;
        if (i3 <= 0) {
            return -1;
        }
        if (i2 > i3) {
            i2 = i3;
        }
        int i4 = this.f18806a;
        cqt0 cqt0Var = this.f18808c;
        cqt0Var.m33641k(i4, bArr, i, i2);
        this.f18806a = cqt0Var.m33644p(this.f18806a + i2);
        this.f18807b -= i2;
        return i2;
    }

    @Override // java.io.InputStream, p196j$.p198io.InputStreamRetargetInterface
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        if (this.f18807b == 0) {
            return -1;
        }
        cqt0 cqt0Var = this.f18808c;
        cqt0Var.f40987a.seek(this.f18806a);
        int i = cqt0Var.f40987a.read();
        this.f18806a = cqt0Var.m33644p(this.f18806a + 1);
        this.f18807b--;
        return i;
    }
}
