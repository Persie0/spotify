package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class l4c0 {

    /* JADX INFO: renamed from: a */
    public final String f129649a;

    /* JADX INFO: renamed from: b */
    public final emr0 f129650b;

    /* JADX INFO: renamed from: c */
    public final int f129651c;

    /* JADX INFO: renamed from: d */
    public final boolean f129652d;

    /* JADX INFO: renamed from: e */
    public final e0n0 f129653e;

    /* JADX INFO: renamed from: f */
    public final cs10 f129654f;

    /* JADX INFO: renamed from: g */
    public final r9o0 f129655g;

    /* JADX INFO: renamed from: h */
    public final xmq f129656h;

    public l4c0(String str, emr0 emr0Var, int i, boolean z, e0n0 e0n0Var, cs10 cs10Var, r9o0 r9o0Var, xmq xmqVar) {
        this.f129649a = str;
        this.f129650b = emr0Var;
        this.f129651c = i;
        this.f129652d = z;
        this.f129653e = e0n0Var;
        this.f129654f = cs10Var;
        this.f129655g = r9o0Var;
        this.f129656h = xmqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l4c0)) {
            return false;
        }
        l4c0 l4c0Var = (l4c0) obj;
        return this.f129649a.equals(l4c0Var.f129649a) && this.f129650b.equals(l4c0Var.f129650b) && this.f129651c == l4c0Var.f129651c && this.f129652d == l4c0Var.f129652d && wj50.m88271j(this.f129653e, l4c0Var.f129653e) && wj50.m88271j(this.f129654f, l4c0Var.f129654f) && wj50.m88271j(this.f129655g, l4c0Var.f129655g) && this.f129656h.equals(l4c0Var.f129656h);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(f710.m40938f(this.f129651c, (this.f129650b.hashCode() + (this.f129649a.hashCode() * 31)) * 31, 31), 31, this.f129652d);
        e0n0 e0n0Var = this.f129653e;
        int iHashCode = (iM77245d + (e0n0Var == null ? 0 : e0n0Var.hashCode())) * 31;
        cs10 cs10Var = this.f129654f;
        int iHashCode2 = (iHashCode + (cs10Var == null ? 0 : Integer.hashCode(cs10Var.f41439a))) * 31;
        r9o0 r9o0Var = this.f129655g;
        return edb.m38547C(this.f129656h.f263426a) + ((iHashCode2 + (r9o0Var != null ? r9o0Var.hashCode() : 0)) * 31);
    }
}
