package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class kha implements jha {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f122573a;

    /* JADX INFO: renamed from: b */
    public int f122574b;

    /* JADX INFO: renamed from: c */
    public int f122575c;

    /* JADX INFO: renamed from: d */
    public int f122576d;

    /* JADX INFO: renamed from: e */
    public int f122577e;

    /* JADX INFO: renamed from: f */
    public Object f122578f;

    public kha(j15 j15Var, long j) {
        this.f122573a = 1;
        String str = j15Var.f107641b;
        w780 w780Var = new w780((char) 0, 5);
        w780Var.f248600d = str;
        w780Var.f248598b = -1;
        w780Var.f248599c = -1;
        this.f122578f = w780Var;
        this.f122574b = ic71.m50239g(j);
        this.f122575c = ic71.m50238f(j);
        this.f122576d = -1;
        this.f122577e = -1;
        int iM50239g = ic71.m50239g(j);
        int iM50238f = ic71.m50238f(j);
        if (iM50239g < 0 || iM50239g > str.length()) {
            StringBuilder sbM56838j = klh.m56838j(iM50239g, "start (", ") offset is outside of text region ");
            sbM56838j.append(str.length());
            throw new IndexOutOfBoundsException(sbM56838j.toString());
        }
        if (iM50238f < 0 || iM50238f > str.length()) {
            StringBuilder sbM56838j2 = klh.m56838j(iM50238f, "end (", ") offset is outside of text region ");
            sbM56838j2.append(str.length());
            throw new IndexOutOfBoundsException(sbM56838j2.toString());
        }
        if (iM50239g > iM50238f) {
            throw new IllegalArgumentException(s571.m77247f(iM50239g, "Do not set reversed range: ", iM50238f, " > "));
        }
    }

    /* JADX INFO: renamed from: A */
    public void m56394A(int i) {
        if (!(i >= 0)) {
            nt40.m65597a("Cannot set selectionStart to a negative value: " + i);
        }
        this.f122574b = i;
    }

    /* JADX INFO: renamed from: B */
    public boolean m56395B(int i) {
        int i2 = i - 2;
        if (this.f122575c > i2 || i >= this.f122574b) {
            return false;
        }
        byte[] bArr = (byte[]) this.f122578f;
        return bArr[i] == 3 && bArr[i2] == 0 && bArr[i - 1] == 0;
    }

    /* JADX INFO: renamed from: C */
    public void m56396C() {
        int i = this.f122577e + 1;
        this.f122577e = i;
        if (i == 8) {
            this.f122577e = 0;
            int i2 = this.f122576d;
            this.f122576d = i2 + (m56395B(i2 + 1) ? 2 : 1);
        }
        m56398b();
    }

    /* JADX INFO: renamed from: D */
    public void m56397D(int i) {
        int i2 = this.f122576d;
        int i3 = i / 8;
        int i4 = i2 + i3;
        this.f122576d = i4;
        int i5 = (i - (i3 * 8)) + this.f122577e;
        this.f122577e = i5;
        if (i5 > 7) {
            this.f122576d = i4 + 1;
            this.f122577e = i5 - 8;
        }
        while (true) {
            i2++;
            if (i2 > this.f122576d) {
                m56398b();
                return;
            } else if (m56395B(i2)) {
                this.f122576d++;
                i2 += 2;
            }
        }
    }

    @Override // p204p.jha
    /* JADX INFO: renamed from: a */
    public int mo53370a() {
        l2n0 l2n0Var = (l2n0) this.f122578f;
        int i = this.f122575c;
        if (i == 8) {
            return l2n0Var.m57917E();
        }
        if (i == 16) {
            return l2n0Var.m57924L();
        }
        int i2 = this.f122576d;
        this.f122576d = i2 + 1;
        if (i2 % 2 != 0) {
            return this.f122577e & 15;
        }
        int iM57917E = l2n0Var.m57917E();
        this.f122577e = iM57917E;
        return (iM57917E & 240) >> 4;
    }

    /* JADX INFO: renamed from: b */
    public void m56398b() {
        int i;
        int i2 = this.f122576d;
        c95.m31855u(i2 >= 0 && (i2 < (i = this.f122574b) || (i2 == i && this.f122577e == 0)));
    }

    /* JADX INFO: renamed from: c */
    public boolean m56399c(int i) {
        int i2 = this.f122576d;
        int i3 = i / 8;
        int i4 = i2 + i3;
        int i5 = (this.f122577e + i) - (i3 * 8);
        if (i5 > 7) {
            i4++;
            i5 -= 8;
        }
        while (true) {
            i2++;
            if (i2 > i4 || i4 > this.f122574b) {
                break;
            }
            if (m56395B(i2)) {
                i4++;
                i2 += 2;
            }
        }
        int i6 = this.f122574b;
        if (i4 >= i6) {
            return i4 == i6 && i5 == 0;
        }
        return true;
    }

    /* JADX INFO: renamed from: d */
    public boolean m56400d() {
        int i = this.f122576d;
        int i2 = this.f122577e;
        int i3 = 0;
        while (this.f122576d < this.f122574b && !m56412r()) {
            i3++;
        }
        boolean z = this.f122576d == this.f122574b;
        this.f122576d = i;
        this.f122577e = i2;
        return !z && m56399c((i3 * 2) + 1);
    }

    /* JADX INFO: renamed from: e */
    public void m56401e() {
        this.f122576d = -1;
        this.f122577e = -1;
    }

    /* JADX INFO: renamed from: f */
    public void m56402f(int i, int i2) {
        long jM37112n = dvg1.m37112n(i, i2);
        ((w780) this.f122578f).m87335G(i, i2, "");
        long jM63420a0 = n0e1.m63420a0(dvg1.m37112n(this.f122574b, this.f122575c), jM37112n);
        m56394A(ic71.m50239g(jM63420a0));
        m56420z(ic71.m50238f(jM63420a0));
        if (m56411q()) {
            long jM63420a1 = n0e1.m63420a0(dvg1.m37112n(this.f122576d, this.f122577e), jM37112n);
            if (ic71.m50236d(jM63420a1)) {
                m56401e();
            } else {
                this.f122576d = ic71.m50239g(jM63420a1);
                this.f122577e = ic71.m50238f(jM63420a1);
            }
        }
    }

    @Override // p204p.jha
    /* JADX INFO: renamed from: g */
    public int mo53371g() {
        return -1;
    }

    /* JADX INFO: renamed from: h */
    public char m56403h(int i) {
        w780 w780Var = (w780) this.f122578f;
        sq00 sq00Var = (sq00) w780Var.f248601e;
        if (sq00Var == null) {
            return ((String) w780Var.f248600d).charAt(i);
        }
        if (i < w780Var.f248598b) {
            return ((String) w780Var.f248600d).charAt(i);
        }
        int iM78931a = sq00Var.f212978b - sq00Var.m78931a();
        int i2 = w780Var.f248598b;
        if (i >= iM78931a + i2) {
            return ((String) w780Var.f248600d).charAt(i - ((iM78931a - w780Var.f248599c) + i2));
        }
        int i3 = i - i2;
        int i4 = sq00Var.f212980d;
        return i3 < i4 ? sq00Var.f212979c[i3] : sq00Var.f212979c[(i3 - i4) + sq00Var.f212981e];
    }

    @Override // p204p.jha
    /* JADX INFO: renamed from: i */
    public int mo53372i() {
        return this.f122574b;
    }

    /* JADX INFO: renamed from: j */
    public ic71 m56404j() {
        if (m56411q()) {
            return new ic71(dvg1.m37112n(this.f122576d, this.f122577e));
        }
        return null;
    }

    /* JADX INFO: renamed from: k */
    public int m56405k() {
        return this.f122577e;
    }

    /* JADX INFO: renamed from: l */
    public int m56406l() {
        return this.f122576d;
    }

    /* JADX INFO: renamed from: m */
    public int m56407m() {
        int i = this.f122574b;
        int i2 = this.f122575c;
        if (i == i2) {
            return i2;
        }
        return -1;
    }

    /* JADX INFO: renamed from: n */
    public int m56408n() {
        return ((w780) this.f122578f).m87377p();
    }

    /* JADX INFO: renamed from: o */
    public int m56409o() {
        return this.f122575c;
    }

    /* JADX INFO: renamed from: p */
    public int m56410p() {
        return this.f122574b;
    }

    /* JADX INFO: renamed from: q */
    public boolean m56411q() {
        return this.f122576d != -1;
    }

    /* JADX INFO: renamed from: r */
    public boolean m56412r() {
        boolean z = (((byte[]) this.f122578f)[this.f122576d] & (128 >> this.f122577e)) != 0;
        m56396C();
        return z;
    }

    /* JADX INFO: renamed from: s */
    public int m56413s(int i) {
        int i2;
        this.f122577e += i;
        int i3 = 0;
        while (true) {
            i2 = this.f122577e;
            int i4 = 2;
            if (i2 <= 8) {
                break;
            }
            int i5 = i2 - 8;
            this.f122577e = i5;
            byte[] bArr = (byte[]) this.f122578f;
            int i6 = this.f122576d;
            i3 |= (bArr[i6] & 255) << i5;
            if (!m56395B(i6 + 1)) {
                i4 = 1;
            }
            this.f122576d = i6 + i4;
        }
        byte[] bArr2 = (byte[]) this.f122578f;
        int i7 = this.f122576d;
        int i8 = ((-1) >>> (32 - i)) & (i3 | ((bArr2[i7] & 255) >> (8 - i2)));
        if (i2 == 8) {
            this.f122577e = 0;
            this.f122576d = i7 + (m56395B(i7 + 1) ? 2 : 1);
        }
        m56398b();
        return i8;
    }

    /* JADX INFO: renamed from: t */
    public int m56414t() {
        int i = 0;
        while (!m56412r()) {
            i++;
        }
        return ((1 << i) - 1) + (i > 0 ? m56413s(i) : 0);
    }

    public String toString() {
        switch (this.f122573a) {
            case 1:
                return ((w780) this.f122578f).toString();
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: u */
    public int m56415u() {
        int iM56414t = m56414t();
        return ((iM56414t + 1) / 2) * (iM56414t % 2 == 0 ? -1 : 1);
    }

    /* JADX INFO: renamed from: v */
    public void m56416v(int i, int i2, String str) {
        w780 w780Var = (w780) this.f122578f;
        if (i < 0 || i > w780Var.m87377p()) {
            StringBuilder sbM56838j = klh.m56838j(i, "start (", ") offset is outside of text region ");
            sbM56838j.append(w780Var.m87377p());
            throw new IndexOutOfBoundsException(sbM56838j.toString());
        }
        if (i2 < 0 || i2 > w780Var.m87377p()) {
            StringBuilder sbM56838j2 = klh.m56838j(i2, "end (", ") offset is outside of text region ");
            sbM56838j2.append(w780Var.m87377p());
            throw new IndexOutOfBoundsException(sbM56838j2.toString());
        }
        if (i > i2) {
            throw new IllegalArgumentException(s571.m77247f(i, "Do not set reversed range: ", i2, " > "));
        }
        w780Var.m87335G(i, i2, str);
        m56394A(str.length() + i);
        m56420z(str.length() + i);
        this.f122576d = -1;
        this.f122577e = -1;
    }

    /* JADX INFO: renamed from: w */
    public void m56417w(int i, int i2) {
        w780 w780Var = (w780) this.f122578f;
        if (i < 0 || i > w780Var.m87377p()) {
            StringBuilder sbM56838j = klh.m56838j(i, "start (", ") offset is outside of text region ");
            sbM56838j.append(w780Var.m87377p());
            throw new IndexOutOfBoundsException(sbM56838j.toString());
        }
        if (i2 < 0 || i2 > w780Var.m87377p()) {
            StringBuilder sbM56838j2 = klh.m56838j(i2, "end (", ") offset is outside of text region ");
            sbM56838j2.append(w780Var.m87377p());
            throw new IndexOutOfBoundsException(sbM56838j2.toString());
        }
        if (i >= i2) {
            throw new IllegalArgumentException(s571.m77247f(i, "Do not set reversed or empty range: ", i2, " > "));
        }
        this.f122576d = i;
        this.f122577e = i2;
    }

    /* JADX INFO: renamed from: x */
    public void m56418x(int i) {
        m56419y(i, i);
    }

    /* JADX INFO: renamed from: y */
    public void m56419y(int i, int i2) {
        w780 w780Var = (w780) this.f122578f;
        if (i < 0 || i > w780Var.m87377p()) {
            StringBuilder sbM56838j = klh.m56838j(i, "start (", ") offset is outside of text region ");
            sbM56838j.append(w780Var.m87377p());
            throw new IndexOutOfBoundsException(sbM56838j.toString());
        }
        if (i2 < 0 || i2 > w780Var.m87377p()) {
            StringBuilder sbM56838j2 = klh.m56838j(i2, "end (", ") offset is outside of text region ");
            sbM56838j2.append(w780Var.m87377p());
            throw new IndexOutOfBoundsException(sbM56838j2.toString());
        }
        if (i > i2) {
            throw new IllegalArgumentException(s571.m77247f(i, "Do not set reversed range: ", i2, " > "));
        }
        m56394A(i);
        m56420z(i2);
    }

    /* JADX INFO: renamed from: z */
    public void m56420z(int i) {
        if (!(i >= 0)) {
            nt40.m65597a("Cannot set selectionEnd to a negative value: " + i);
        }
        this.f122575c = i;
    }

    public kha(byte[] bArr, int i, int i2) {
        this.f122573a = 2;
        this.f122578f = bArr;
        this.f122575c = i;
        this.f122576d = i;
        this.f122574b = i2;
        this.f122577e = 0;
        m56398b();
    }

    public kha(i4i0 i4i0Var) {
        this.f122573a = 0;
        l2n0 l2n0Var = i4i0Var.f98533e;
        this.f122578f = l2n0Var;
        l2n0Var.m57930R(12);
        this.f122575c = l2n0Var.m57921I() & 255;
        this.f122574b = l2n0Var.m57921I();
    }
}
