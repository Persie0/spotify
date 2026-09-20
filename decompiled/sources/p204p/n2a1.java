package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class n2a1 {

    /* JADX INFO: renamed from: a */
    public final Integer f149718a;

    /* JADX INFO: renamed from: b */
    public final String f149719b;

    /* JADX INFO: renamed from: c */
    public final q3f f149720c;

    /* JADX INFO: renamed from: d */
    public final g5u0 f149721d;

    /* JADX INFO: renamed from: e */
    public final l2a1 f149722e;

    /* JADX INFO: renamed from: f */
    public final gs31 f149723f;

    /* JADX INFO: renamed from: g */
    public final Boolean f149724g;

    /* JADX INFO: renamed from: h */
    public final Boolean f149725h;

    /* JADX INFO: renamed from: i */
    public final m2a1 f149726i;

    /* JADX INFO: renamed from: j */
    public final Boolean f149727j;

    public n2a1(Integer num, String str, q3f q3fVar, g5u0 g5u0Var, l2a1 l2a1Var, gs31 gs31Var, Boolean bool, Boolean bool2, m2a1 m2a1Var, Boolean bool3) {
        this.f149718a = num;
        this.f149719b = str;
        this.f149720c = q3fVar;
        this.f149721d = g5u0Var;
        this.f149722e = l2a1Var;
        this.f149723f = gs31Var;
        this.f149724g = bool;
        this.f149725h = bool2;
        this.f149726i = m2a1Var;
        this.f149727j = bool3;
    }

    /* JADX INFO: renamed from: a */
    public final Boolean m63547a() {
        return this.f149724g;
    }

    /* JADX INFO: renamed from: b */
    public final l2a1 m63548b() {
        return this.f149722e;
    }

    /* JADX INFO: renamed from: c */
    public final Boolean m63549c() {
        return this.f149727j;
    }

    /* JADX INFO: renamed from: d */
    public final m2a1 m63550d() {
        return this.f149726i;
    }

    /* JADX INFO: renamed from: e */
    public final q3f m63551e() {
        return this.f149720c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n2a1)) {
            return false;
        }
        n2a1 n2a1Var = (n2a1) obj;
        return wj50.m88271j(this.f149718a, n2a1Var.f149718a) && wj50.m88271j(this.f149719b, n2a1Var.f149719b) && wj50.m88271j(this.f149720c, n2a1Var.f149720c) && wj50.m88271j(this.f149721d, n2a1Var.f149721d) && wj50.m88271j(this.f149722e, n2a1Var.f149722e) && wj50.m88271j(this.f149723f, n2a1Var.f149723f) && wj50.m88271j(this.f149724g, n2a1Var.f149724g) && wj50.m88271j(this.f149725h, n2a1Var.f149725h) && wj50.m88271j(this.f149726i, n2a1Var.f149726i) && wj50.m88271j(this.f149727j, n2a1Var.f149727j);
    }

    /* JADX INFO: renamed from: f */
    public final g5u0 m63552f() {
        return this.f149721d;
    }

    /* JADX INFO: renamed from: g */
    public final gs31 m63553g() {
        return this.f149723f;
    }

    /* JADX INFO: renamed from: h */
    public final Integer m63554h() {
        return this.f149718a;
    }

    public final int hashCode() {
        Integer num = this.f149718a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f149719b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        q3f q3fVar = this.f149720c;
        int iHashCode3 = (iHashCode2 + (q3fVar == null ? 0 : q3fVar.hashCode())) * 31;
        g5u0 g5u0Var = this.f149721d;
        int iHashCode4 = (iHashCode3 + (g5u0Var == null ? 0 : g5u0Var.hashCode())) * 31;
        l2a1 l2a1Var = this.f149722e;
        int iHashCode5 = (iHashCode4 + (l2a1Var == null ? 0 : l2a1Var.hashCode())) * 31;
        gs31 gs31Var = this.f149723f;
        int iHashCode6 = (iHashCode5 + (gs31Var == null ? 0 : gs31Var.hashCode())) * 31;
        Boolean bool = this.f149724g;
        int iHashCode7 = (iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f149725h;
        int iHashCode8 = (iHashCode7 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        m2a1 m2a1Var = this.f149726i;
        int iHashCode9 = (iHashCode8 + (m2a1Var == null ? 0 : m2a1Var.hashCode())) * 31;
        Boolean bool3 = this.f149727j;
        return iHashCode9 + (bool3 != null ? bool3.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i */
    public final Boolean m63555i() {
        return this.f149725h;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ n2a1(q3f q3fVar, l2a1 l2a1Var, m2a1 m2a1Var, int i) {
        gs31 gs31Var = t3f.f216760a;
        Boolean bool = Boolean.TRUE;
        this(100, "protobuf", q3fVar, null, l2a1Var, gs31Var, bool, (i & 128) != 0 ? null : bool, m2a1Var, Boolean.FALSE);
    }
}
