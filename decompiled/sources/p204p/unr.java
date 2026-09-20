package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class unr {

    /* JADX INFO: renamed from: a */
    public final String f232248a;

    /* JADX INFO: renamed from: b */
    public final String f232249b;

    /* JADX INFO: renamed from: c */
    public final hbd1 f232250c;

    /* JADX INFO: renamed from: d */
    public final String f232251d;

    /* JADX INFO: renamed from: e */
    public final rcm0 f232252e;

    /* JADX INFO: renamed from: f */
    public final int f232253f;

    public unr(String str, String str2, hbd1 hbd1Var, String str3, rcm0 rcm0Var, int i) {
        this.f232248a = str;
        this.f232249b = str2;
        this.f232250c = hbd1Var;
        this.f232251d = str3;
        this.f232252e = rcm0Var;
        this.f232253f = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof unr)) {
            return false;
        }
        unr unrVar = (unr) obj;
        return wj50.m88271j(this.f232248a, unrVar.f232248a) && wj50.m88271j(this.f232249b, unrVar.f232249b) && wj50.m88271j(this.f232250c, unrVar.f232250c) && wj50.m88271j(this.f232251d, unrVar.f232251d) && wj50.m88271j(this.f232252e, unrVar.f232252e) && this.f232253f == unrVar.f232253f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f232253f) + yds.m93483m(this.f232252e, s571.m77243b((this.f232250c.hashCode() + s571.m77243b(this.f232248a.hashCode() * 31, 31, this.f232249b)) * 31, 31, this.f232251d), 31);
    }
}
