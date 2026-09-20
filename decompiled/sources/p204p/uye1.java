package p204p;

import java.nio.ByteBuffer;
import java.util.zip.Adler32;

/* JADX INFO: loaded from: classes16.dex */
public final class uye1 extends Adler32 {

    /* JADX INFO: renamed from: a */
    public volatile int f235239a;

    @Override // java.util.zip.Adler32, java.util.zip.Checksum
    public final long getValue() {
        int value = (int) super.getValue();
        int i = ((65535 & value) - 1) % 65521;
        int i2 = ((value >>> 16) - this.f235239a) % 65521;
        if (i2 < 0) {
            i2 += 65521;
        }
        if (i < 0) {
            i += 65521;
        }
        return ((long) ((i2 << 16) | i)) & 4294967295L;
    }

    @Override // java.util.zip.Adler32, java.util.zip.Checksum
    public final void reset() {
        super.reset();
        this.f235239a = 0;
    }

    @Override // java.util.zip.Adler32, java.util.zip.Checksum
    public final void update(int i) {
        super.update(i);
        this.f235239a = (int) ((((long) this.f235239a) + ((long) 1)) % 65521);
    }

    @Override // java.util.zip.Adler32, java.util.zip.Checksum
    public final void update(byte[] bArr, int i, int i2) {
        super.update(bArr, i, i2);
        this.f235239a = (int) ((((long) this.f235239a) + ((long) i2)) % 65521);
    }

    @Override // java.util.zip.Adler32, java.util.zip.Checksum
    public final void update(byte[] bArr) {
        super.update(bArr);
        this.f235239a = (int) ((((long) this.f235239a) + ((long) bArr.length)) % 65521);
    }

    @Override // java.util.zip.Adler32, java.util.zip.Checksum
    public final void update(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[2048];
        while (true) {
            int iMin = Math.min(2048, byteBuffer.remaining());
            if (iMin <= 0) {
                return;
            }
            byteBuffer.get(bArr, 0, iMin);
            update(bArr, 0, iMin);
        }
    }
}
