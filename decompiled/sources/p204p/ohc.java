package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class ohc {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f165388a;

    /* JADX INFO: renamed from: b */
    public byte[] f165389b;

    /* JADX INFO: renamed from: c */
    public int f165390c;

    /* JADX INFO: renamed from: d */
    public int f165391d;

    /* JADX INFO: renamed from: e */
    public int f165392e;

    public ohc() {
        this.f165388a = 1;
        this.f165389b = h0b1.f86201b;
    }

    /* JADX INFO: renamed from: a */
    public void m66948a() {
        int i;
        int i2 = this.f165390c;
        c95.m31855u(i2 >= 0 && (i2 < (i = this.f165392e) || (i2 == i && this.f165391d == 0)));
    }

    /* JADX INFO: renamed from: b */
    public int m66949b() {
        return ((this.f165392e - this.f165390c) * 8) - this.f165391d;
    }

    /* JADX INFO: renamed from: c */
    public void m66950c() {
        if (this.f165391d == 0) {
            return;
        }
        this.f165391d = 0;
        this.f165390c++;
        m66948a();
    }

    /* JADX INFO: renamed from: d */
    public int m66951d() {
        c95.m31855u(this.f165391d == 0);
        return this.f165390c;
    }

    /* JADX INFO: renamed from: e */
    public int m66952e() {
        return (this.f165390c * 8) + this.f165391d;
    }

    /* JADX INFO: renamed from: f */
    public boolean m66953f() {
        switch (this.f165388a) {
            case 1:
                boolean z = (this.f165389b[this.f165390c] & (128 >> this.f165391d)) != 0;
                m66961n();
                return z;
            default:
                boolean z2 = (((this.f165389b[this.f165391d] & 255) >> this.f165392e) & 1) == 1;
                m66962o(1);
                return z2;
        }
    }

    /* JADX INFO: renamed from: g */
    public int m66954g(int i) {
        switch (this.f165388a) {
            case 1:
                if (i == 0) {
                    return 0;
                }
                this.f165391d += i;
                int i2 = 0;
                while (true) {
                    int i3 = this.f165391d;
                    if (i3 <= 8) {
                        byte[] bArr = this.f165389b;
                        int i4 = this.f165390c;
                        int i5 = ((-1) >>> (32 - i)) & (i2 | ((bArr[i4] & 255) >> (8 - i3)));
                        if (i3 == 8) {
                            this.f165391d = 0;
                            this.f165390c = i4 + 1;
                        }
                        m66948a();
                        return i5;
                    }
                    int i6 = i3 - 8;
                    this.f165391d = i6;
                    byte[] bArr2 = this.f165389b;
                    int i7 = this.f165390c;
                    this.f165390c = i7 + 1;
                    i2 |= (bArr2[i7] & 255) << i6;
                }
                break;
            default:
                int i8 = this.f165391d;
                int iMin = Math.min(i, 8 - this.f165392e);
                byte[] bArr3 = this.f165389b;
                int i9 = i8 + 1;
                int i10 = ((bArr3[i8] & 255) >> this.f165392e) & (255 >> (8 - iMin));
                while (iMin < i) {
                    i10 |= (bArr3[i9] & 255) << iMin;
                    iMin += 8;
                    i9++;
                }
                int i11 = i10 & ((-1) >>> (32 - i));
                m66962o(i);
                return i11;
        }
    }

    /* JADX INFO: renamed from: h */
    public void m66955h(byte[] bArr, int i) {
        int i2 = i >> 3;
        for (int i3 = 0; i3 < i2; i3++) {
            byte[] bArr2 = this.f165389b;
            int i4 = this.f165390c;
            int i5 = i4 + 1;
            this.f165390c = i5;
            byte b = bArr2[i4];
            int i6 = this.f165391d;
            byte b2 = (byte) (b << i6);
            bArr[i3] = b2;
            bArr[i3] = (byte) (((255 & bArr2[i5]) >> (8 - i6)) | b2);
        }
        int i7 = i & 7;
        if (i7 == 0) {
            return;
        }
        byte b3 = (byte) (bArr[i2] & (255 >> i7));
        bArr[i2] = b3;
        int i8 = this.f165391d;
        if (i8 + i7 > 8) {
            byte[] bArr3 = this.f165389b;
            int i9 = this.f165390c;
            this.f165390c = i9 + 1;
            bArr[i2] = (byte) (b3 | ((bArr3[i9] & 255) << i8));
            this.f165391d = i8 - 8;
        }
        int i10 = this.f165391d + i7;
        this.f165391d = i10;
        byte[] bArr4 = this.f165389b;
        int i11 = this.f165390c;
        bArr[i2] = (byte) (((byte) (((255 & bArr4[i11]) >> (8 - i10)) << (8 - i7))) | bArr[i2]);
        if (i10 == 8) {
            this.f165391d = 0;
            this.f165390c = i11 + 1;
        }
        m66948a();
    }

    /* JADX INFO: renamed from: i */
    public long m66956i(int i) {
        if (i <= 32) {
            int iM66954g = m66954g(i);
            String str = h0b1.f86200a;
            return 4294967295L & ((long) iM66954g);
        }
        int iM66954g2 = m66954g(i - 32);
        int iM66954g3 = m66954g(32);
        String str2 = h0b1.f86200a;
        return (4294967295L & ((long) iM66954g3)) | ((((long) iM66954g2) & 4294967295L) << 32);
    }

    /* JADX INFO: renamed from: j */
    public void m66957j(byte[] bArr, int i) {
        c95.m31855u(this.f165391d == 0);
        System.arraycopy(this.f165389b, this.f165390c, bArr, 0, i);
        this.f165390c += i;
        m66948a();
    }

    /* JADX INFO: renamed from: k */
    public void m66958k(l2n0 l2n0Var) {
        m66959l(l2n0Var.f129054a, l2n0Var.f129056c);
        m66960m(l2n0Var.f129055b * 8);
    }

    /* JADX INFO: renamed from: l */
    public void m66959l(byte[] bArr, int i) {
        this.f165389b = bArr;
        this.f165390c = 0;
        this.f165391d = 0;
        this.f165392e = i;
    }

    /* JADX INFO: renamed from: m */
    public void m66960m(int i) {
        int i2 = i / 8;
        this.f165390c = i2;
        this.f165391d = i - (i2 * 8);
        m66948a();
    }

    /* JADX INFO: renamed from: n */
    public void m66961n() {
        int i = this.f165391d + 1;
        this.f165391d = i;
        if (i == 8) {
            this.f165391d = 0;
            this.f165390c++;
        }
        m66948a();
    }

    /* JADX INFO: renamed from: o */
    public void m66962o(int i) {
        int i2;
        switch (this.f165388a) {
            case 1:
                int i3 = i / 8;
                int i4 = this.f165390c + i3;
                this.f165390c = i4;
                int i5 = (i - (i3 * 8)) + this.f165391d;
                this.f165391d = i5;
                if (i5 > 7) {
                    this.f165390c = i4 + 1;
                    this.f165391d = i5 - 8;
                }
                m66948a();
                break;
            default:
                int i6 = i / 8;
                int i7 = this.f165391d + i6;
                this.f165391d = i7;
                int i8 = (i - (i6 * 8)) + this.f165392e;
                this.f165392e = i8;
                boolean z = true;
                if (i8 > 7) {
                    this.f165391d = i7 + 1;
                    this.f165392e = i8 - 8;
                }
                int i9 = this.f165391d;
                if (i9 < 0 || (i9 >= (i2 = this.f165390c) && (i9 != i2 || this.f165392e != 0))) {
                    z = false;
                }
                c95.m31855u(z);
                break;
        }
    }

    /* JADX INFO: renamed from: p */
    public void m66963p(int i) {
        c95.m31855u(this.f165391d == 0);
        this.f165390c += i;
        m66948a();
    }

    public ohc(byte[] bArr) {
        this.f165388a = 2;
        this.f165389b = bArr;
        this.f165390c = bArr.length;
    }

    public ohc(byte[] bArr, int i) {
        this.f165388a = 1;
        this.f165389b = bArr;
        this.f165392e = i;
    }

    public ohc(int i, int i2) {
        this.f165388a = 0;
        this.f165390c = i;
        this.f165391d = i2;
        this.f165389b = new byte[(i2 * 2) - 1];
        this.f165392e = 0;
    }
}
