package p204p;

import java.io.OutputStream;

/* JADX INFO: loaded from: classes4.dex */
public final class t580 extends OutputStream {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f217241a;

    /* JADX INFO: renamed from: b */
    public long f217242b;

    @Override // java.io.OutputStream
    public final void write(int i) {
        switch (this.f217241a) {
            case 0:
                this.f217242b++;
                break;
            case 1:
                this.f217242b++;
                break;
            default:
                this.f217242b++;
                break;
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        switch (this.f217241a) {
            case 0:
                this.f217242b += (long) bArr.length;
                break;
            case 1:
                this.f217242b += (long) bArr.length;
                break;
            default:
                this.f217242b += (long) bArr.length;
                break;
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        int i3;
        int length;
        int i4;
        int length2;
        int i5;
        switch (this.f217241a) {
            case 0:
                if (i >= 0 && i <= bArr.length && i2 >= 0 && (i3 = i + i2) <= bArr.length && i3 >= 0) {
                    this.f217242b += (long) i2;
                    return;
                }
                throw new IndexOutOfBoundsException();
            case 1:
                if (i >= 0 && i <= (length = bArr.length) && i2 >= 0 && (i4 = i + i2) <= length && i4 >= 0) {
                    this.f217242b += (long) i2;
                    return;
                }
                throw new IndexOutOfBoundsException();
            default:
                if (i >= 0 && i <= (length2 = bArr.length) && i2 >= 0 && (i5 = i + i2) <= length2 && i5 >= 0) {
                    this.f217242b += (long) i2;
                    return;
                }
                throw new IndexOutOfBoundsException();
        }
    }
}
