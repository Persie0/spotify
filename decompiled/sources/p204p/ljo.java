package p204p;

import java.io.InputStream;
import java.io.OutputStream;
import p196j$.p198io.DesugarInputStream;
import p196j$.p198io.InputStreamRetargetInterface;

/* JADX INFO: loaded from: classes3.dex */
public final class ljo extends InputStream implements InputStreamRetargetInterface {

    /* JADX INFO: renamed from: a */
    public final uio f134107a;

    /* JADX INFO: renamed from: b */
    public final sjo f134108b;

    /* JADX INFO: renamed from: d */
    public boolean f134110d = false;

    /* JADX INFO: renamed from: e */
    public boolean f134111e = false;

    /* JADX INFO: renamed from: c */
    public final byte[] f134109c = new byte[1];

    public ljo(uio uioVar, sjo sjoVar) {
        this.f134107a = uioVar;
        this.f134108b = sjoVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m59173a() {
        if (this.f134110d) {
            return;
        }
        this.f134107a.mo28175u(this.f134108b);
        this.f134110d = true;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f134111e) {
            return;
        }
        this.f134107a.close();
        this.f134111e = true;
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.f134109c;
        if (read(bArr, 0, bArr.length) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }

    @Override // java.io.InputStream, p196j$.p198io.InputStreamRetargetInterface
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        c95.m31855u(!this.f134111e);
        m59173a();
        int i3 = this.f134107a.read(bArr, i, i2);
        if (i3 == -1) {
            return -1;
        }
        return i3;
    }
}
