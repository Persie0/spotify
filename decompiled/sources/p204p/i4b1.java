package p204p;

import kotlinx.serialization.SerializationException;

/* JADX INFO: loaded from: classes3.dex */
public final class i4b1 {

    /* JADX INFO: renamed from: d */
    public static final long[] f98482d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* JADX INFO: renamed from: a */
    public final byte[] f98483a;

    /* JADX INFO: renamed from: b */
    public int f98484b;

    /* JADX INFO: renamed from: c */
    public int f98485c;

    public /* synthetic */ i4b1(byte[] bArr) {
        this(bArr, bArr.length);
    }

    /* JADX INFO: renamed from: a */
    public static long m49667a(int i, boolean z, byte[] bArr) {
        long j = ((long) bArr[0]) & 255;
        if (z) {
            j &= ~f98482d[i - 1];
        }
        for (int i2 = 1; i2 < i; i2++) {
            j = (j << 8) | (((long) bArr[i2]) & 255);
        }
        return j;
    }

    /* JADX INFO: renamed from: b */
    public void m49668b(int i) {
        int i2 = this.f98484b;
        if (i <= i2 - this.f98485c) {
            return;
        }
        throw new SerializationException("Unexpected EOF, available " + (i2 - this.f98485c) + " bytes, requested: " + i);
    }

    /* JADX INFO: renamed from: c */
    public int m49669c() {
        int i = this.f98485c;
        if (i >= this.f98484b) {
            return -1;
        }
        this.f98485c = i + 1;
        return this.f98483a[i] & 255;
    }

    /* JADX INFO: renamed from: d */
    public long m49670d(d5y d5yVar, boolean z, boolean z2, int i) {
        int i2;
        int i3 = this.f98484b;
        byte[] bArr = this.f98483a;
        if (i3 == 0) {
            if (!d5yVar.mo35038h(bArr, 0, 1, z)) {
                return -1L;
            }
            int i4 = bArr[0] & 255;
            int i5 = 0;
            while (true) {
                if (i5 >= 8) {
                    i2 = -1;
                    break;
                }
                if ((f98482d[i5] & ((long) i4)) != 0) {
                    i2 = i5 + 1;
                    break;
                }
                i5++;
            }
            this.f98485c = i2;
            if (i2 == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.f98484b = 1;
        }
        int i6 = this.f98485c;
        if (i6 > i) {
            this.f98484b = 0;
            return -2L;
        }
        if (i6 != 1) {
            d5yVar.readFully(bArr, 1, i6 - 1);
        }
        this.f98484b = 0;
        return m49667a(this.f98485c, z2, bArr);
    }

    /* JADX INFO: renamed from: e */
    public long m49671e(boolean z) {
        int i = this.f98485c;
        int i2 = this.f98484b;
        if (i == i2) {
            if (z) {
                return -1L;
            }
            throw new SerializationException("Unexpected EOF");
        }
        int i3 = i + 1;
        byte[] bArr = this.f98483a;
        long j = bArr[i];
        long j2 = 0;
        if (j >= 0) {
            this.f98485c = i3;
            return j;
        }
        if (i2 - i > 1) {
            int i4 = i + 2;
            long j3 = (((long) bArr[i3]) << 7) ^ j;
            if (j3 < 0) {
                this.f98485c = i4;
                return j3 ^ (-128);
            }
        }
        for (int i5 = 0; i5 < 64; i5 += 7) {
            int iM49669c = m49669c();
            j2 |= ((long) (iM49669c & 127)) << i5;
            if ((iM49669c & 128) == 0) {
                return j2;
            }
        }
        throw new SerializationException("Input stream is malformed: Varint too long (exceeded 64 bits)");
    }

    public i4b1(byte[] bArr, int i) {
        this.f98483a = bArr;
        this.f98484b = i;
    }

    public i4b1() {
        this.f98483a = new byte[8];
    }
}
