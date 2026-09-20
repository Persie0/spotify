package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class zy90 {

    /* JADX INFO: renamed from: a */
    public final xy90 f287522a;

    /* JADX INFO: renamed from: b */
    public final ly90 f287523b;

    /* JADX INFO: renamed from: c */
    public final String f287524c;

    /* JADX INFO: renamed from: d */
    public final boolean f287525d;

    /* JADX INFO: renamed from: e */
    public final boolean f287526e;

    /* JADX INFO: renamed from: f */
    public final boolean f287527f;

    /* JADX INFO: renamed from: g */
    public final boolean f287528g;

    /* JADX INFO: renamed from: h */
    public final boolean f287529h;

    /* JADX INFO: renamed from: i */
    public final az90 f287530i;

    /* JADX INFO: renamed from: j */
    public final my90 f287531j;

    /* JADX INFO: renamed from: k */
    public final ul71 f287532k;

    /* JADX INFO: renamed from: l */
    public final boolean f287533l;

    /* JADX INFO: renamed from: m */
    public final boolean f287534m;

    /* JADX INFO: renamed from: n */
    public final boolean f287535n;

    /* JADX INFO: renamed from: o */
    public final String f287536o;

    public zy90(xy90 xy90Var, ly90 ly90Var, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, az90 az90Var, my90 my90Var, ul71 ul71Var, boolean z6, boolean z7, boolean z8, String str2) {
        this.f287522a = xy90Var;
        this.f287523b = ly90Var;
        this.f287524c = str;
        this.f287525d = z;
        this.f287526e = z2;
        this.f287527f = z3;
        this.f287528g = z4;
        this.f287529h = z5;
        this.f287530i = az90Var;
        this.f287531j = my90Var;
        this.f287532k = ul71Var;
        this.f287533l = z6;
        this.f287534m = z7;
        this.f287535n = z8;
        this.f287536o = str2;
    }

    /* JADX INFO: renamed from: a */
    public static zy90 m97230a(zy90 zy90Var, ly90 ly90Var, boolean z, ul71 ul71Var, boolean z2, int i) {
        xy90 xy90Var = zy90Var.f287522a;
        ly90 ly90Var2 = (i & 2) != 0 ? zy90Var.f287523b : ly90Var;
        String str = zy90Var.f287524c;
        ly90 ly90Var3 = ly90Var2;
        boolean z3 = zy90Var.f287525d;
        boolean z4 = zy90Var.f287526e;
        boolean z5 = zy90Var.f287527f;
        boolean z6 = (i & 64) != 0 ? zy90Var.f287528g : false;
        boolean z7 = (i & 128) != 0 ? zy90Var.f287529h : z;
        az90 az90Var = zy90Var.f287530i;
        boolean z8 = z6;
        boolean z9 = z7;
        my90 my90Var = zy90Var.f287531j;
        ul71 ul71Var2 = (i & 1024) != 0 ? zy90Var.f287532k : ul71Var;
        boolean z10 = (i & 2048) != 0 ? zy90Var.f287533l : z2;
        boolean z11 = zy90Var.f287534m;
        boolean z12 = zy90Var.f287535n;
        String str2 = zy90Var.f287536o;
        zy90Var.getClass();
        return new zy90(xy90Var, ly90Var3, str, z3, z4, z5, z8, z9, az90Var, my90Var, ul71Var2, z10, z11, z12, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zy90)) {
            return false;
        }
        zy90 zy90Var = (zy90) obj;
        return wj50.m88271j(this.f287522a, zy90Var.f287522a) && wj50.m88271j(this.f287523b, zy90Var.f287523b) && wj50.m88271j(this.f287524c, zy90Var.f287524c) && this.f287525d == zy90Var.f287525d && this.f287526e == zy90Var.f287526e && this.f287527f == zy90Var.f287527f && this.f287528g == zy90Var.f287528g && this.f287529h == zy90Var.f287529h && wj50.m88271j(this.f287530i, zy90Var.f287530i) && wj50.m88271j(this.f287531j, zy90Var.f287531j) && wj50.m88271j(this.f287532k, zy90Var.f287532k) && this.f287533l == zy90Var.f287533l && this.f287534m == zy90Var.f287534m && this.f287535n == zy90Var.f287535n && wj50.m88271j(this.f287536o, zy90Var.f287536o);
    }

    public final int hashCode() {
        return this.f287536o.hashCode() + s571.m77245d(s571.m77245d(s571.m77245d((this.f287532k.hashCode() + ((this.f287531j.hashCode() + ((this.f287530i.hashCode() + s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77243b(s571.m77244c(this.f287522a.hashCode() * 31, 31, this.f287523b.f138006a), 31, this.f287524c), 31, this.f287525d), 31, this.f287526e), 31, this.f287527f), 31, this.f287528g), 31, this.f287529h)) * 31)) * 31)) * 31, 31, this.f287533l), 31, this.f287534m), 31, this.f287535n);
    }
}
