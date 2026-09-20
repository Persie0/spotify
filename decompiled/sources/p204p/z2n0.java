package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class z2n0 implements CharSequence {

    /* JADX INFO: renamed from: a */
    public CharSequence f278616a;

    /* JADX INFO: renamed from: b */
    public sq00 f278617b;

    /* JADX INFO: renamed from: c */
    public int f278618c;

    /* JADX INFO: renamed from: d */
    public int f278619d;

    /* JADX INFO: renamed from: a */
    public final void m95227a(int i, int i2, CharSequence charSequence, int i3, int i4) {
        if (i > i2) {
            pt40.m70891a("start=" + i + " > end=" + i2);
        }
        if (i3 > i4) {
            pt40.m70891a("textStart=" + i3 + " > textEnd=" + i4);
        }
        if (i < 0) {
            pt40.m70891a("start must be non-negative, but was " + i);
        }
        if (i3 < 0) {
            pt40.m70891a("textStart must be non-negative, but was " + i3);
        }
        sq00 sq00Var = this.f278617b;
        int i5 = i4 - i3;
        if (sq00Var == null) {
            int iMax = Math.max(255, i5 + 128);
            char[] cArr = new char[iMax];
            int iMin = Math.min(i, 64);
            int iMin2 = Math.min(this.f278616a.length() - i2, 64);
            int i6 = i - iMin;
            o2h1.m66119m(this.f278616a, cArr, 0, i6, i);
            int i7 = iMax - iMin2;
            int i8 = iMin2 + i2;
            o2h1.m66119m(this.f278616a, cArr, i7, i2, i8);
            o2h1.m66119m(charSequence, cArr, iMin, i3, i4);
            sq00 sq00Var2 = new sq00(1);
            sq00Var2.f212978b = iMax;
            sq00Var2.f212979c = cArr;
            sq00Var2.f212980d = iMin + i5;
            sq00Var2.f212981e = i7;
            this.f278617b = sq00Var2;
            this.f278618c = i6;
            this.f278619d = i8;
            return;
        }
        int i9 = this.f278618c;
        int i10 = i - i9;
        int i11 = i2 - i9;
        if (i10 < 0 || i11 > sq00Var.f212978b - sq00Var.m78931a()) {
            this.f278616a = toString();
            this.f278617b = null;
            this.f278618c = -1;
            this.f278619d = -1;
            m95227a(i, i2, charSequence, i3, i4);
            return;
        }
        int i12 = i5 - (i11 - i10);
        if (i12 > sq00Var.m78931a()) {
            int iM78931a = i12 - sq00Var.m78931a();
            int i13 = sq00Var.f212978b;
            do {
                i13 *= 2;
            } while (i13 - sq00Var.f212978b < iM78931a);
            char[] cArr2 = new char[i13];
            bk5.m29631q0(sq00Var.f212979c, cArr2, 0, 0, sq00Var.f212980d);
            int i14 = sq00Var.f212978b;
            int i15 = sq00Var.f212981e;
            int i16 = i14 - i15;
            int i17 = i13 - i16;
            bk5.m29631q0(sq00Var.f212979c, cArr2, i17, i15, i16 + i15);
            sq00Var.f212979c = cArr2;
            sq00Var.f212978b = i13;
            sq00Var.f212981e = i17;
        }
        int i18 = sq00Var.f212980d;
        if (i10 < i18 && i11 <= i18) {
            int i19 = i18 - i11;
            char[] cArr3 = sq00Var.f212979c;
            bk5.m29631q0(cArr3, cArr3, sq00Var.f212981e - i19, i11, i18);
            sq00Var.f212980d = i10;
            sq00Var.f212981e -= i19;
        } else if (i10 >= i18 || i11 < i18) {
            int iM78931a2 = sq00Var.m78931a() + i10;
            int iM78931a3 = sq00Var.m78931a() + i11;
            int i20 = sq00Var.f212981e;
            char[] cArr4 = sq00Var.f212979c;
            bk5.m29631q0(cArr4, cArr4, sq00Var.f212980d, i20, iM78931a2);
            sq00Var.f212980d += iM78931a2 - i20;
            sq00Var.f212981e = iM78931a3;
        } else {
            sq00Var.f212981e = sq00Var.m78931a() + i11;
            sq00Var.f212980d = i10;
        }
        o2h1.m66119m(charSequence, sq00Var.f212979c, sq00Var.f212980d, i3, i4);
        sq00Var.f212980d += i5;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        sq00 sq00Var = this.f278617b;
        if (sq00Var == null) {
            return this.f278616a.charAt(i);
        }
        if (i < this.f278618c) {
            return this.f278616a.charAt(i);
        }
        int iM78931a = sq00Var.f212978b - sq00Var.m78931a();
        int i2 = this.f278618c;
        if (i >= iM78931a + i2) {
            return this.f278616a.charAt(i - ((iM78931a - this.f278619d) + i2));
        }
        int i3 = i - i2;
        int i4 = sq00Var.f212980d;
        return i3 < i4 ? sq00Var.f212979c[i3] : sq00Var.f212979c[(i3 - i4) + sq00Var.f212981e];
    }

    @Override // java.lang.CharSequence
    public final int length() {
        sq00 sq00Var = this.f278617b;
        if (sq00Var == null) {
            return this.f278616a.length();
        }
        return (sq00Var.f212978b - sq00Var.m78931a()) + (this.f278616a.length() - (this.f278619d - this.f278618c));
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return toString().subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        sq00 sq00Var = this.f278617b;
        if (sq00Var == null) {
            return this.f278616a.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f278616a, 0, this.f278618c);
        sb.append(sq00Var.f212979c, 0, sq00Var.f212980d);
        char[] cArr = sq00Var.f212979c;
        int i = sq00Var.f212981e;
        sb.append(cArr, i, sq00Var.f212978b - i);
        CharSequence charSequence = this.f278616a;
        sb.append(charSequence, this.f278619d, charSequence.length());
        return sb.toString();
    }
}
