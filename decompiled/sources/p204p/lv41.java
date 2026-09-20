package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class lv41 {

    /* JADX INFO: renamed from: e */
    public static final lv41 f137220e = new lv41(iy71.f106895b, 0, 0, 0);

    /* JADX INFO: renamed from: a */
    public final int f137221a;

    /* JADX INFO: renamed from: b */
    public final iy71 f137222b;

    /* JADX INFO: renamed from: c */
    public final int f137223c;

    /* JADX INFO: renamed from: d */
    public final int f137224d;

    public lv41(iy71 iy71Var, int i, int i2, int i3) {
        this.f137222b = iy71Var;
        this.f137221a = i;
        this.f137223c = i2;
        this.f137224d = i3;
    }

    /* JADX INFO: renamed from: a */
    public final lv41 m60058a(int i) {
        int i2;
        iy71 ed21Var = this.f137222b;
        int i3 = this.f137221a;
        int i4 = this.f137224d;
        if (i3 == 4 || i3 == 2) {
            int[] iArr = yr20.f275368b[i3];
            i3 = 0;
            int i5 = iArr[0];
            int i6 = 65535 & i5;
            int i7 = i5 >> 16;
            ed21Var.getClass();
            i4 += i7;
            ed21Var = new ed21(ed21Var, i6, i7);
        }
        int i8 = this.f137223c;
        if (i8 == 0 || i8 == 31) {
            i2 = 18;
        } else {
            i2 = i8 == 62 ? 9 : 8;
        }
        int i9 = i8 + 1;
        lv41 lv41Var = new lv41(ed21Var, i3, i9, i4 + i2);
        return i9 == 2078 ? lv41Var.m60059b(i + 1) : lv41Var;
    }

    /* JADX INFO: renamed from: b */
    public final lv41 m60059b(int i) {
        int i2 = this.f137223c;
        if (i2 == 0) {
            return this;
        }
        iy71 iy71Var = this.f137222b;
        iy71Var.getClass();
        return new lv41(new of9(iy71Var, i - i2, i2), this.f137221a, 0, this.f137224d);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m60060c(lv41 lv41Var) {
        int i;
        int i2 = this.f137224d + (yr20.f275368b[this.f137221a][lv41Var.f137221a] >> 16);
        int i3 = lv41Var.f137223c;
        if (i3 > 0 && ((i = this.f137223c) == 0 || i > i3)) {
            i2 += 10;
        }
        return i2 <= lv41Var.f137224d;
    }

    /* JADX INFO: renamed from: d */
    public final lv41 m60061d(int i, int i2) {
        int i3 = this.f137224d;
        iy71 ed21Var = this.f137222b;
        int i4 = this.f137221a;
        if (i != i4) {
            int i5 = yr20.f275368b[i4][i];
            int i6 = 65535 & i5;
            int i7 = i5 >> 16;
            ed21Var.getClass();
            i3 += i7;
            ed21Var = new ed21(ed21Var, i6, i7);
        }
        int i8 = i == 2 ? 4 : 5;
        ed21Var.getClass();
        return new lv41(new ed21(ed21Var, i2, i8), i, 0, i3 + i8);
    }

    /* JADX INFO: renamed from: e */
    public final lv41 m60062e(int i, int i2) {
        int i3 = this.f137221a;
        int i4 = i3 == 2 ? 4 : 5;
        int i5 = yr20.f275370d[i3][i];
        iy71 iy71Var = this.f137222b;
        iy71Var.getClass();
        return new lv41(new ed21(new ed21(iy71Var, i5, i4), i2, 5), i3, 0, this.f137224d + i4 + 5);
    }

    public final String toString() {
        return String.format("%s bits=%d bytes=%d", yr20.f275367a[this.f137221a], Integer.valueOf(this.f137224d), Integer.valueOf(this.f137223c));
    }
}
