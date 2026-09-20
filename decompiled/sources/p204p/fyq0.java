package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class fyq0 {

    /* JADX INFO: renamed from: a */
    public final eyq0 f74815a;

    /* JADX INFO: renamed from: b */
    public final String f74816b;

    /* JADX INFO: renamed from: c */
    public final kkl f74817c;

    /* JADX INFO: renamed from: d */
    public final String f74818d;

    /* JADX INFO: renamed from: e */
    public final myq0 f74819e;

    /* JADX INFO: renamed from: f */
    public final boolean f74820f;

    /* JADX INFO: renamed from: g */
    public final cwk f74821g;

    /* JADX INFO: renamed from: h */
    public final fri0 f74822h;

    /* JADX INFO: renamed from: i */
    public final boolean f74823i;

    /* JADX INFO: renamed from: j */
    public final int f74824j;

    /* JADX INFO: renamed from: k */
    public final boolean f74825k;

    /* JADX INFO: renamed from: l */
    public final boolean f74826l;

    public fyq0(eyq0 eyq0Var, String str, kkl kklVar, String str2, myq0 myq0Var, boolean z, cwk cwkVar, fri0 fri0Var, boolean z2, int i, boolean z3, boolean z4) {
        this.f74815a = eyq0Var;
        this.f74816b = str;
        this.f74817c = kklVar;
        this.f74818d = str2;
        this.f74819e = myq0Var;
        this.f74820f = z;
        this.f74821g = cwkVar;
        this.f74822h = fri0Var;
        this.f74823i = z2;
        this.f74824j = i;
        this.f74825k = z3;
        this.f74826l = z4;
    }

    /* JADX INFO: renamed from: a */
    public static fyq0 m43116a(fyq0 fyq0Var, int i) {
        eyq0 eyq0Var = fyq0Var.f74815a;
        String str = fyq0Var.f74816b;
        kkl kklVar = fyq0Var.f74817c;
        String str2 = fyq0Var.f74818d;
        myq0 myq0Var = fyq0Var.f74819e;
        boolean z = fyq0Var.f74820f;
        cwk cwkVar = fyq0Var.f74821g;
        fri0 fri0Var = fyq0Var.f74822h;
        boolean z2 = fyq0Var.f74823i;
        boolean z3 = fyq0Var.f74825k;
        boolean z4 = fyq0Var.f74826l;
        fyq0Var.getClass();
        return new fyq0(eyq0Var, str, kklVar, str2, myq0Var, z, cwkVar, fri0Var, z2, i, z3, z4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fyq0)) {
            return false;
        }
        fyq0 fyq0Var = (fyq0) obj;
        return this.f74815a.equals(fyq0Var.f74815a) && this.f74816b.equals(fyq0Var.f74816b) && this.f74817c.equals(fyq0Var.f74817c) && wj50.m88271j(this.f74818d, fyq0Var.f74818d) && this.f74819e.equals(fyq0Var.f74819e) && this.f74820f == fyq0Var.f74820f && this.f74821g.equals(fyq0Var.f74821g) && this.f74822h.equals(fyq0Var.f74822h) && this.f74823i == fyq0Var.f74823i && this.f74824j == fyq0Var.f74824j && this.f74825k == fyq0Var.f74825k && this.f74826l == fyq0Var.f74826l;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f74826l) + s571.m77245d(mt60.m62800g(this.f74824j, s571.m77245d(s571.m77245d((this.f74821g.hashCode() + s571.m77245d((this.f74819e.hashCode() + s571.m77243b((this.f74817c.hashCode() + s571.m77243b(this.f74815a.hashCode() * 31, 31, this.f74816b)) * 31, 31, this.f74818d)) * 31, 31, this.f74820f)) * 31, 31, this.f74822h.f72489a), 31, this.f74823i), 31), 31, this.f74825k);
    }
}
