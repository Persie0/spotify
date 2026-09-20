package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class rx8 extends ox8 {

    /* JADX INFO: renamed from: i */
    public static final byte[] f203522i = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

    /* JADX INFO: renamed from: b */
    public final byte[] f203523b;

    /* JADX INFO: renamed from: c */
    public int f203524c;

    /* JADX INFO: renamed from: d */
    public int f203525d;

    /* JADX INFO: renamed from: e */
    public final boolean f203526e;

    /* JADX INFO: renamed from: f */
    public final boolean f203527f;

    /* JADX INFO: renamed from: g */
    public final boolean f203528g;

    /* JADX INFO: renamed from: h */
    public final byte[] f203529h;

    public rx8() {
        this.f170906a = null;
        this.f203526e = true;
        this.f203527f = false;
        this.f203528g = false;
        this.f203529h = f203522i;
        this.f203523b = new byte[2];
        this.f203524c = 0;
        this.f203525d = -1;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0047  */
    /* JADX INFO: renamed from: f1 */
    public final boolean m76609f1(byte[] bArr, int i) {
        int i2;
        int i3;
        int i4;
        byte b;
        byte b2;
        byte b3;
        int i5;
        byte[] bArr2 = (byte[]) this.f170906a;
        int i6 = this.f203525d;
        int i7 = this.f203524c;
        byte[] bArr3 = this.f203523b;
        char c = 2;
        if (i7 != 1) {
            if (i7 == 2 && 1 <= i) {
                i2 = ((bArr3[0] & 255) << 16) | ((bArr3[1] & 255) << 8) | (bArr[0] & 255);
                this.f203524c = 0;
                i3 = 1;
            } else {
                i3 = 0;
                i2 = -1;
            }
        } else if (2 <= i) {
            i2 = ((bArr3[0] & 255) << 16) | ((bArr[0] & 255) << 8) | (bArr[1] & 255);
            this.f203524c = 0;
            i3 = 2;
        } else {
            i3 = 0;
            i2 = -1;
        }
        byte b4 = 13;
        boolean z = this.f203528g;
        int i8 = 0;
        byte[] bArr4 = this.f203529h;
        if (i2 != -1) {
            bArr2[0] = bArr4[(i2 >> 18) & 63];
            bArr2[1] = bArr4[(i2 >> 12) & 63];
            bArr2[2] = bArr4[(i2 >> 6) & 63];
            bArr2[3] = bArr4[i2 & 63];
            i6--;
            if (i6 == 0) {
                if (z) {
                    bArr2[4] = 13;
                    i5 = 5;
                } else {
                    i5 = 4;
                }
                i4 = i5 + 1;
                bArr2[i5] = 10;
                i6 = 19;
            } else {
                i4 = 4;
            }
        } else {
            i4 = 0;
        }
        while (true) {
            i3 += 3;
            if (i3 > i) {
                break;
            }
            char c2 = c;
            byte b5 = b4;
            int i9 = ((bArr[i3] & 255) << 16) | ((bArr[i3 + 1] & 255) << 8) | (bArr[i3 + 2] & 255);
            bArr2[i4] = bArr4[(i9 >> 18) & 63];
            bArr2[i4 + 1] = bArr4[(i9 >> 12) & 63];
            bArr2[i4 + 2] = bArr4[(i9 >> 6) & 63];
            bArr2[i4 + 3] = bArr4[i9 & 63];
            int i10 = i4 + 4;
            i6--;
            if (i6 == 0) {
                if (z) {
                    bArr2[i10] = b5;
                    i10 = i4 + 5;
                }
                i4 = i10 + 1;
                bArr2[i10] = 10;
                i6 = 19;
            } else {
                i4 = i10;
            }
            c = c2;
            b4 = b5;
        }
        byte b6 = b4;
        int i11 = this.f203524c;
        int i12 = i3 - i11;
        int i13 = i - 1;
        boolean z2 = this.f203526e;
        boolean z3 = this.f203527f;
        if (i12 == i13) {
            if (i11 > 0) {
                b3 = bArr3[0];
                i8 = 1;
            } else {
                b3 = bArr[i3];
            }
            int i14 = (b3 & 255) << 4;
            this.f203524c = i11 - i8;
            bArr2[i4] = bArr4[(i14 >> 6) & 63];
            int i15 = i4 + 2;
            bArr2[i4 + 1] = bArr4[i14 & 63];
            if (z2) {
                bArr2[i15] = 61;
                i15 = i4 + 4;
                bArr2[i4 + 3] = 61;
            }
            if (z3) {
                if (z) {
                    bArr2[i15] = b6;
                    i15++;
                }
                bArr2[i15] = 10;
            }
        } else if (i12 == i - 2) {
            if (i11 > 1) {
                b = bArr3[0];
                i8 = 1;
            } else {
                byte b7 = bArr[i3];
                i3++;
                b = b7;
            }
            int i16 = (b & 255) << 10;
            if (i11 > 0) {
                b2 = bArr3[i8];
                i8++;
            } else {
                b2 = bArr[i3];
            }
            int i17 = i16 | ((b2 & 255) << 2);
            this.f203524c = i11 - i8;
            bArr2[i4] = bArr4[(i17 >> 12) & 63];
            bArr2[i4 + 1] = bArr4[(i17 >> 6) & 63];
            int i18 = i4 + 3;
            bArr2[i4 + 2] = bArr4[i17 & 63];
            if (z2) {
                bArr2[i18] = 61;
                i18 = i4 + 4;
            }
            if (z3) {
                if (z) {
                    bArr2[i18] = b6;
                    i18++;
                }
                bArr2[i18] = 10;
            }
        } else if (z3 && i4 > 0 && i6 != 19) {
            if (z) {
                bArr2[i4] = b6;
                i4++;
            }
            bArr2[i4] = 10;
        }
        this.f203525d = i6;
        return true;
    }
}
