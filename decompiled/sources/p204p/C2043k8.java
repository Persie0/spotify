package p204p;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import p196j$.p198io.DesugarInputStream;
import p196j$.p198io.InputStreamRetargetInterface;

/* JADX INFO: renamed from: p.k8 */
/* JADX INFO: loaded from: classes11.dex */
public final class C2043k8 extends FilterInputStream implements InputStreamRetargetInterface {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f120217a;

    /* JADX INFO: renamed from: b */
    public int f120218b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2043k8(InputStream inputStream, int i, int i2) {
        super(inputStream);
        this.f120217a = i2;
        this.f120218b = i;
    }

    /* JADX INFO: renamed from: a */
    private /* synthetic */ long m55713a(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    /* JADX INFO: renamed from: c */
    private /* synthetic */ long m55714c(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        switch (this.f120217a) {
            case 0:
                break;
        }
        return Math.min(super.available(), this.f120218b);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        switch (this.f120217a) {
            case 0:
                if (this.f120218b <= 0) {
                    return -1;
                }
                int i = super.read();
                if (i < 0) {
                    return i;
                }
                this.f120218b--;
                return i;
            default:
                if (this.f120218b <= 0) {
                    return -1;
                }
                int i2 = super.read();
                if (i2 < 0) {
                    return i2;
                }
                this.f120218b--;
                return i2;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws IOException {
        switch (this.f120217a) {
            case 0:
                long jSkip = super.skip(Math.min(j, this.f120218b));
                if (jSkip >= 0) {
                    this.f120218b = (int) (((long) this.f120218b) - jSkip);
                }
                return jSkip;
            default:
                int iSkip = (int) super.skip(Math.min(j, this.f120218b));
                if (iSkip >= 0) {
                    this.f120218b -= iSkip;
                }
                return iSkip;
        }
    }

    @Override // java.io.InputStream, p196j$.p198io.InputStreamRetargetInterface
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        switch (this.f120217a) {
            case 0:
                return m55714c(outputStream);
            default:
                return m55713a(outputStream);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        switch (this.f120217a) {
            case 0:
                int i3 = this.f120218b;
                if (i3 <= 0) {
                    return -1;
                }
                int i4 = super.read(bArr, i, Math.min(i2, i3));
                if (i4 < 0) {
                    return i4;
                }
                this.f120218b -= i4;
                return i4;
            default:
                int i5 = this.f120218b;
                if (i5 <= 0) {
                    return -1;
                }
                int i6 = super.read(bArr, i, Math.min(i2, i5));
                if (i6 < 0) {
                    return i6;
                }
                this.f120218b -= i6;
                return i6;
        }
    }
}
