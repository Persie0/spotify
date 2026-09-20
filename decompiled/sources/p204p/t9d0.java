package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class t9d0 {

    /* JADX INFO: renamed from: a */
    public final ogy f218251a;

    /* JADX INFO: renamed from: b */
    public final boolean f218252b;

    /* JADX INFO: renamed from: c */
    public final int f218253c;

    /* JADX INFO: renamed from: d */
    public final int f218254d;

    /* JADX INFO: renamed from: e */
    public final int f218255e;

    /* JADX INFO: renamed from: f */
    public final int f218256f;

    /* JADX INFO: renamed from: g */
    public final int f218257g;

    /* JADX INFO: renamed from: h */
    public final int f218258h;

    /* JADX INFO: renamed from: i */
    public final int f218259i;

    /* JADX INFO: renamed from: j */
    public final int f218260j;

    /* JADX INFO: renamed from: k */
    public final boolean f218261k;

    /* JADX INFO: renamed from: l */
    public final int f218262l;

    /* JADX INFO: renamed from: m */
    public final boolean f218263m;

    /* JADX INFO: renamed from: n */
    public final int f218264n;

    /* JADX INFO: renamed from: o */
    public boolean f218265o;

    /* JADX INFO: renamed from: p */
    public final int f218266p;

    /* JADX INFO: renamed from: q */
    public final boolean f218267q;

    /* JADX INFO: renamed from: r */
    public final int f218268r;

    /* JADX INFO: renamed from: s */
    public final int f218269s;

    public t9d0(ogy ogyVar, boolean z, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z2, int i9, boolean z3, int i10) {
        boolean z4 = ogyVar.f165291a;
        this.f218251a = ogyVar;
        this.f218252b = z;
        this.f218253c = i;
        this.f218254d = i2;
        this.f218255e = i3;
        this.f218256f = i4;
        this.f218257g = i5;
        this.f218258h = i6;
        this.f218259i = i7;
        this.f218260j = i8;
        this.f218261k = z2;
        this.f218262l = i9;
        this.f218263m = z3;
        this.f218264n = i10;
        boolean z5 = ogyVar instanceof mgy;
        this.f218265o = z5;
        this.f218266p = (z5 && z4 && z && i3 < i8) ? i3 : z5 ? i8 : i7;
        this.f218267q = z && z5 && z4;
        this.f218268r = z5 ? 12288 : 1048576;
        this.f218269s = Math.min(m80278b(), i10);
    }

    /* JADX INFO: renamed from: a */
    public final int m80277a() {
        return this.f218265o ? this.f218254d : this.f218257g;
    }

    /* JADX INFO: renamed from: b */
    public final int m80278b() {
        return this.f218265o ? this.f218254d : this.f218257g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t9d0)) {
            return false;
        }
        t9d0 t9d0Var = (t9d0) obj;
        return wj50.m88271j(this.f218251a, t9d0Var.f218251a) && this.f218252b == t9d0Var.f218252b && this.f218253c == t9d0Var.f218253c && this.f218254d == t9d0Var.f218254d && this.f218255e == t9d0Var.f218255e && this.f218256f == t9d0Var.f218256f && this.f218257g == t9d0Var.f218257g && this.f218258h == t9d0Var.f218258h && this.f218259i == t9d0Var.f218259i && this.f218260j == t9d0Var.f218260j && this.f218261k == t9d0Var.f218261k && this.f218262l == t9d0Var.f218262l && this.f218263m == t9d0Var.f218263m && this.f218264n == t9d0Var.f218264n;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f218264n) + s571.m77245d(mt60.m62800g(this.f218262l, s571.m77245d(mt60.m62800g(this.f218260j, mt60.m62800g(this.f218259i, mt60.m62800g(this.f218258h, mt60.m62800g(this.f218257g, mt60.m62800g(this.f218256f, mt60.m62800g(this.f218255e, mt60.m62800g(this.f218254d, mt60.m62800g(this.f218253c, s571.m77245d(this.f218251a.hashCode() * 31, 31, this.f218252b), 31), 31), 31), 31), 31), 31), 31), 31), 31, this.f218261k), 31), 31, this.f218263m);
    }
}
