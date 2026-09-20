package p204p;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class mir {

    /* JADX INFO: renamed from: a */
    public int[] f144077a;

    /* JADX INFO: renamed from: b */
    public int f144078b;

    public mir(int[] iArr, int i) {
        int length = iArr.length;
        if (length == 4) {
            this.f144078b = i;
            this.f144077a = iArr;
        } else {
            StringBuilder sb = new StringBuilder(String.valueOf(length).length() + 44);
            sb.append(u2h1.m82254a("Ake3rgkWMjm+UlOd1Tg3PHccqBbIRJQk3bhyKj5k"));
            sb.append(length);
            sb.append(u2h1.m82254a("a0CvvBEaN339T0zNlXk="));
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* JADX INFO: renamed from: d */
    public static long m61897d(boolean z, int i, int i2, int i3, int i4) {
        int i5 = z ? i3 : i4;
        if (z) {
            i3 = i4;
        }
        if (i < i2) {
            return dvg1.m37112n(i, i);
        }
        if (i == i2) {
            return i5 == 0 ? dvg1.m37112n(i2, i3 + i2) : dvg1.m37112n(i2, i2);
        }
        if (i < i2 + i5) {
            return i3 == 0 ? dvg1.m37112n(i2, i2) : dvg1.m37112n(i2, i3 + i2);
        }
        int i6 = (i - i5) + i3;
        return dvg1.m37112n(i6, i6);
    }

    /* JADX INFO: renamed from: a */
    public int[] m61898a() {
        return this.f144077a;
    }

    /* JADX INFO: renamed from: b */
    public int m61899b(int i) {
        return this.f144077a[i + this.f144078b];
    }

    /* JADX INFO: renamed from: c */
    public long m61900c(int i, boolean z) {
        int iMin;
        int iMax;
        int[] iArr = this.f144077a;
        int i2 = this.f144078b;
        if (i2 < 0) {
            iMin = i;
            iMax = iMin;
        } else if (z) {
            int iMax2 = i;
            int i3 = 0;
            int i4 = iMax2;
            while (i3 < i2) {
                int i5 = i3 * 3;
                int i6 = iArr[i5];
                int i7 = iArr[i5 + 1];
                int i8 = iArr[i5 + 2];
                long jM61897d = m61897d(z, i4, i6, i7, i8);
                long jM61897d2 = m61897d(z, iMax2, i6, i7, i8);
                int i9 = ic71.f100751c;
                int iMin2 = Math.min((int) (jM61897d >> 32), (int) (jM61897d2 >> 32));
                iMax2 = Math.max((int) (jM61897d & 4294967295L), (int) (jM61897d2 & 4294967295L));
                i3++;
                i4 = iMin2;
            }
            iMin = i4;
            iMax = iMax2;
        } else {
            iMax = i;
            iMin = iMax;
            for (int i10 = i2 - 1; -1 < i10; i10--) {
                int i11 = i10 * 3;
                int i12 = iArr[i11];
                int i13 = iArr[i11 + 1];
                int i14 = iArr[i11 + 2];
                long jM61897d3 = m61897d(z, iMin, i12, i13, i14);
                long jM61897d4 = m61897d(z, iMax, i12, i13, i14);
                int i15 = ic71.f100751c;
                iMin = Math.min((int) (jM61897d3 >> 32), (int) (jM61897d4 >> 32));
                iMax = Math.max((int) (jM61897d3 & 4294967295L), (int) (jM61897d4 & 4294967295L));
            }
        }
        return dvg1.m37112n(iMin, iMax);
    }

    /* JADX INFO: renamed from: e */
    public void m61901e(int i, int i2, int i3) {
        int i4 = this.f144078b;
        int[] iArrCopyOf = this.f144077a;
        int i5 = i4 + 3;
        if (i5 >= iArrCopyOf.length) {
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, iArrCopyOf.length * 2);
            this.f144077a = iArrCopyOf;
        }
        iArrCopyOf[i4] = i + i3;
        iArrCopyOf[i4 + 1] = i2 + i3;
        iArrCopyOf[i4 + 2] = i3;
        this.f144078b = i5;
    }

    /* JADX INFO: renamed from: f */
    public void m61902f(int i, int i2, int i3, int i4) {
        int i5 = this.f144078b;
        int[] iArrCopyOf = this.f144077a;
        int i6 = i5 + 4;
        if (i6 >= iArrCopyOf.length) {
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, iArrCopyOf.length * 2);
            this.f144077a = iArrCopyOf;
        }
        iArrCopyOf[i5] = i;
        iArrCopyOf[i5 + 1] = i2;
        iArrCopyOf[i5 + 2] = i3;
        iArrCopyOf[i5 + 3] = i4;
        this.f144078b = i6;
    }

    /* JADX INFO: renamed from: g */
    public void m61903g(int i, int i2) {
        if (i < i2) {
            int i3 = i - 3;
            for (int i4 = i; i4 < i2; i4 += 3) {
                int[] iArr = this.f144077a;
                int i5 = iArr[i4];
                int i6 = iArr[i2];
                if (i5 < i6 || (i5 == i6 && iArr[i4 + 1] <= iArr[i2 + 1])) {
                    i3 += 3;
                    m61906j(i3, i4);
                }
            }
            m61906j(i3 + 3, i2);
            m61903g(i, i3);
            m61903g(i3 + 6, i2);
        }
    }

    /* JADX INFO: renamed from: h */
    public void m61904h(int i, int i2, int i3) {
        if (!(i3 >= 0)) {
            pt40.m70891a("Expected newLen to be ≥ 0, was " + i3);
        }
        int iMin = Math.min(i, i2);
        int iMax = Math.max(iMin, i2) - iMin;
        if (iMax >= 2 || iMax != i3) {
            int i4 = this.f144078b + 1;
            int[] iArr = this.f144077a;
            if (i4 > iArr.length / 3) {
                this.f144077a = Arrays.copyOf(this.f144077a, Math.max(i4 * 2, (iArr.length / 3) * 2) * 3);
            }
            int[] iArr2 = this.f144077a;
            int i5 = this.f144078b * 3;
            iArr2[i5] = iMin;
            iArr2[i5 + 1] = iMax;
            iArr2[i5 + 2] = i3;
            this.f144078b = i4;
        }
    }

    /* JADX INFO: renamed from: i */
    public void m61905i(int i, int i2) {
        this.f144077a[i + this.f144078b] = i2;
    }

    /* JADX INFO: renamed from: j */
    public void m61906j(int i, int i2) {
        int[] iArr = this.f144077a;
        int i3 = iArr[i];
        iArr[i] = iArr[i2];
        iArr[i2] = i3;
        int i4 = i + 1;
        int i5 = i2 + 1;
        int i6 = iArr[i4];
        iArr[i4] = iArr[i5];
        iArr[i5] = i6;
        int i7 = i + 2;
        int i8 = i2 + 2;
        int i9 = iArr[i7];
        iArr[i7] = iArr[i8];
        iArr[i8] = i9;
    }

    /* JADX INFO: renamed from: k */
    public void m61907k(byte[] bArr, int i) {
        mir mirVar = this;
        int i2 = 0;
        int i3 = 2055825325;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        char c = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        char c2 = 0;
        char c3 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (i3 != 1173404700) {
            if (i3 == 1523783727) {
                int i16 = (-350379027) + i3;
                i3 += 370337140;
                if (i2 == i13) {
                    i3 = i16;
                }
                mirVar = this;
            } else if (i3 != 2055825325) {
                int[] iArr = mirVar.f144077a;
                i4 += (((i11 << i10) ^ (i11 >>> i12)) + i11) ^ (i2 + iArr[i2 & i9]);
                i2 += i14;
                i11 += (((i4 << i10) ^ (i4 >>> i12)) + i4) ^ (iArr[(i2 >>> i15) & i9] + i2);
                i3 -= 370337140;
            } else {
                i4 = mirVar.f144078b;
                i3 -= 532041598;
                i9 = 3;
                i7 = 255;
                c3 = 7;
                c2 = 6;
                c = 2;
                i5 = 24;
                i15 = 11;
                i14 = 1340169305;
                i12 = 5;
                i10 = 4;
                i13 = -64255200;
                i6 = 16;
                i8 = 8;
                i11 = i;
                i2 = 0;
            }
        }
        bArr[0] = (byte) (i4 >> i5);
        bArr[1] = (byte) ((((i4 >> i6) & i7) << i5) >> i5);
        bArr[c] = (byte) ((((i4 >> i8) & i7) << i5) >> i5);
        bArr[i9] = (byte) (((i4 & i7) << i5) >> i5);
        bArr[i10] = (byte) (i11 >> i5);
        bArr[i12] = (byte) ((((i11 >> i6) & i7) << i5) >> i5);
        bArr[c2] = (byte) ((((i11 >> i8) & i7) << i5) >> i5);
        bArr[c3] = (byte) (((i11 & i7) << i5) >> i5);
    }

    public mir() {
        this.f144077a = new int[30];
    }

    public mir(int i, int i2) {
        switch (i2) {
            case 1:
                this.f144077a = new int[i];
                break;
            default:
                int[] iArr = new int[i];
                this.f144077a = iArr;
                this.f144078b = iArr.length / 2;
                break;
        }
    }
}
