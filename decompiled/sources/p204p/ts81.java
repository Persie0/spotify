package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class ts81 {

    /* JADX INFO: renamed from: a */
    public final String f223242a;

    /* JADX INFO: renamed from: b */
    public final String f223243b;

    /* JADX INFO: renamed from: c */
    public final yt81 f223244c;

    /* JADX INFO: renamed from: d */
    public final yt81 f223245d;

    /* JADX INFO: renamed from: e */
    public final f5b0 f223246e;

    /* JADX INFO: renamed from: f */
    public final String f223247f;

    /* JADX INFO: renamed from: g */
    public final boolean f223248g;

    /* JADX INFO: renamed from: h */
    public final boolean f223249h;

    /* JADX INFO: renamed from: i */
    public final boolean f223250i;

    /* JADX INFO: renamed from: j */
    public final bz31 f223251j;

    /* JADX INFO: renamed from: k */
    public final boolean f223252k;

    public ts81(String str, String str2, yt81 yt81Var, yt81 yt81Var2, f5b0 f5b0Var, String str3, boolean z, boolean z2, boolean z3, bz31 bz31Var, boolean z4) {
        this.f223242a = str;
        this.f223243b = str2;
        this.f223244c = yt81Var;
        this.f223245d = yt81Var2;
        this.f223246e = f5b0Var;
        this.f223247f = str3;
        this.f223248g = z;
        this.f223249h = z2;
        this.f223250i = z3;
        this.f223251j = bz31Var;
        this.f223252k = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ts81)) {
            return false;
        }
        ts81 ts81Var = (ts81) obj;
        return wj50.m88271j(this.f223242a, ts81Var.f223242a) && this.f223243b.equals(ts81Var.f223243b) && this.f223244c.equals(ts81Var.f223244c) && this.f223245d.equals(ts81Var.f223245d) && wj50.m88271j(this.f223246e, ts81Var.f223246e) && wj50.m88271j(this.f223247f, ts81Var.f223247f) && this.f223248g == ts81Var.f223248g && this.f223249h == ts81Var.f223249h && this.f223250i == ts81Var.f223250i && this.f223251j.equals(ts81Var.f223251j) && this.f223252k == ts81Var.f223252k;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f223252k) + ((this.f223251j.hashCode() + s571.m77245d(s571.m77245d(s571.m77245d(s571.m77243b((this.f223246e.hashCode() + ((this.f223245d.hashCode() + ((this.f223244c.hashCode() + s571.m77243b(this.f223242a.hashCode() * 31, 31, this.f223243b)) * 31)) * 31)) * 31, 31, this.f223247f), 31, this.f223248g), 31, this.f223249h), 31, this.f223250i)) * 31);
    }
}
