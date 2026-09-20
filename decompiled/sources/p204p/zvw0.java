package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class zvw0 {

    /* JADX INFO: renamed from: a */
    public final long f286815a;

    /* JADX INFO: renamed from: b */
    public final un71 f286816b;

    /* JADX INFO: renamed from: c */
    public final String f286817c;

    /* JADX INFO: renamed from: d */
    public String f286818d = null;

    /* JADX INFO: renamed from: e */
    public Integer f286819e = null;

    /* JADX INFO: renamed from: f */
    public Long f286820f = null;

    /* JADX INFO: renamed from: g */
    public Long f286821g = null;

    /* JADX INFO: renamed from: h */
    public Long f286822h = null;

    /* JADX INFO: renamed from: i */
    public Long f286823i = null;

    /* JADX INFO: renamed from: j */
    public Long f286824j = null;

    /* JADX INFO: renamed from: k */
    public Long f286825k = null;

    /* JADX INFO: renamed from: l */
    public Long f286826l = null;

    /* JADX INFO: renamed from: m */
    public Long f286827m = null;

    /* JADX INFO: renamed from: n */
    public Long f286828n = null;

    /* JADX INFO: renamed from: o */
    public Long f286829o = null;

    /* JADX INFO: renamed from: p */
    public Long f286830p = null;

    /* JADX INFO: renamed from: q */
    public boolean f286831q = false;

    /* JADX INFO: renamed from: r */
    public boolean f286832r = true;

    /* JADX INFO: renamed from: s */
    public e69 f286833s = e69.f56590c;

    /* JADX INFO: renamed from: t */
    public int f286834t = 2;

    /* JADX INFO: renamed from: u */
    public un71 f286835u = null;

    public zvw0(long j, un71 un71Var, String str) {
        this.f286815a = j;
        this.f286816b = un71Var;
        this.f286817c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zvw0)) {
            return false;
        }
        zvw0 zvw0Var = (zvw0) obj;
        return this.f286815a == zvw0Var.f286815a && this.f286816b.equals(zvw0Var.f286816b) && wj50.m88271j(this.f286817c, zvw0Var.f286817c) && wj50.m88271j(this.f286818d, zvw0Var.f286818d) && wj50.m88271j(this.f286819e, zvw0Var.f286819e) && wj50.m88271j(this.f286820f, zvw0Var.f286820f) && wj50.m88271j(this.f286821g, zvw0Var.f286821g) && wj50.m88271j(this.f286822h, zvw0Var.f286822h) && wj50.m88271j(this.f286823i, zvw0Var.f286823i) && wj50.m88271j(this.f286824j, zvw0Var.f286824j) && wj50.m88271j(this.f286825k, zvw0Var.f286825k) && wj50.m88271j(this.f286826l, zvw0Var.f286826l) && wj50.m88271j(this.f286827m, zvw0Var.f286827m) && wj50.m88271j(this.f286828n, zvw0Var.f286828n) && wj50.m88271j(this.f286829o, zvw0Var.f286829o) && wj50.m88271j(this.f286830p, zvw0Var.f286830p) && this.f286831q == zvw0Var.f286831q && this.f286832r == zvw0Var.f286832r && this.f286833s == zvw0Var.f286833s && this.f286834t == zvw0Var.f286834t && wj50.m88271j(this.f286835u, zvw0Var.f286835u);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(dq60.m36605e(Long.hashCode(this.f286815a) * 31, this.f286816b.f232090a, 31), 31, this.f286817c);
        String str = this.f286818d;
        int iHashCode = (iM77243b + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f286819e;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 961;
        Long l = this.f286820f;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.f286821g;
        int iHashCode4 = (iHashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.f286822h;
        int iHashCode5 = (iHashCode4 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.f286823i;
        int iHashCode6 = (iHashCode5 + (l4 == null ? 0 : l4.hashCode())) * 31;
        Long l5 = this.f286824j;
        int iHashCode7 = (iHashCode6 + (l5 == null ? 0 : l5.hashCode())) * 31;
        Long l6 = this.f286825k;
        int iHashCode8 = (iHashCode7 + (l6 == null ? 0 : l6.hashCode())) * 31;
        Long l7 = this.f286826l;
        int iHashCode9 = (iHashCode8 + (l7 == null ? 0 : l7.hashCode())) * 31;
        Long l8 = this.f286827m;
        int iHashCode10 = (iHashCode9 + (l8 == null ? 0 : l8.hashCode())) * 31;
        Long l9 = this.f286828n;
        int iHashCode11 = (iHashCode10 + (l9 == null ? 0 : l9.hashCode())) * 31;
        Long l10 = this.f286829o;
        int iHashCode12 = (iHashCode11 + (l10 == null ? 0 : l10.hashCode())) * 31;
        Long l11 = this.f286830p;
        int iM40938f = f710.m40938f(this.f286834t, (this.f286833s.hashCode() + s571.m77245d(s571.m77245d((iHashCode12 + (l11 == null ? 0 : l11.hashCode())) * 31, 31, this.f286831q), 31, this.f286832r)) * 31, 31);
        un71 un71Var = this.f286835u;
        return iM40938f + (un71Var != null ? Long.hashCode(un71Var.f232090a) : 0);
    }
}
