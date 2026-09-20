package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class gfz0 {

    /* JADX INFO: renamed from: a */
    public final byte[] f79489a;

    /* JADX INFO: renamed from: b */
    public int f79490b;

    /* JADX INFO: renamed from: c */
    public int f79491c;

    /* JADX INFO: renamed from: d */
    public boolean f79492d;

    /* JADX INFO: renamed from: e */
    public final boolean f79493e;

    /* JADX INFO: renamed from: f */
    public gfz0 f79494f;

    /* JADX INFO: renamed from: g */
    public gfz0 f79495g;

    public gfz0() {
        this.f79489a = new byte[8192];
        this.f79493e = true;
        this.f79492d = false;
    }

    /* JADX INFO: renamed from: a */
    public final gfz0 m44640a() {
        gfz0 gfz0Var = this.f79494f;
        if (gfz0Var == this) {
            gfz0Var = null;
        }
        gfz0 gfz0Var2 = this.f79495g;
        wj50.m88279p(gfz0Var2);
        gfz0Var2.f79494f = this.f79494f;
        gfz0 gfz0Var3 = this.f79494f;
        wj50.m88279p(gfz0Var3);
        gfz0Var3.f79495g = this.f79495g;
        this.f79494f = null;
        this.f79495g = null;
        return gfz0Var;
    }

    /* JADX INFO: renamed from: b */
    public final void m44641b(gfz0 gfz0Var) {
        gfz0Var.f79495g = this;
        gfz0Var.f79494f = this.f79494f;
        gfz0 gfz0Var2 = this.f79494f;
        wj50.m88279p(gfz0Var2);
        gfz0Var2.f79495g = gfz0Var;
        this.f79494f = gfz0Var;
    }

    /* JADX INFO: renamed from: c */
    public final gfz0 m44642c() {
        this.f79492d = true;
        return new gfz0(this.f79489a, this.f79490b, this.f79491c, true, false);
    }

    /* JADX INFO: renamed from: d */
    public final void m44643d(gfz0 gfz0Var, int i) {
        boolean z = gfz0Var.f79493e;
        byte[] bArr = gfz0Var.f79489a;
        if (!z) {
            throw new IllegalStateException("only owner can write");
        }
        int i2 = gfz0Var.f79491c;
        int i3 = i2 + i;
        if (i3 > 8192) {
            if (gfz0Var.f79492d) {
                throw new IllegalArgumentException();
            }
            int i4 = gfz0Var.f79490b;
            if (i3 - i4 > 8192) {
                throw new IllegalArgumentException();
            }
            bk5.m29634s0(i4, i2, 2, bArr, bArr);
            gfz0Var.f79491c -= gfz0Var.f79490b;
            gfz0Var.f79490b = 0;
        }
        int i5 = gfz0Var.f79491c;
        int i6 = this.f79490b;
        bk5.m29625n0(i5, i6, i6 + i, this.f79489a, bArr);
        gfz0Var.f79491c += i;
        this.f79490b += i;
    }

    public gfz0(byte[] bArr, int i, int i2, boolean z, boolean z2) {
        this.f79489a = bArr;
        this.f79490b = i;
        this.f79491c = i2;
        this.f79492d = z;
        this.f79493e = z2;
    }
}
