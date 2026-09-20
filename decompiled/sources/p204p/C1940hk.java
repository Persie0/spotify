package p204p;

/* JADX INFO: renamed from: p.hk */
/* JADX INFO: loaded from: classes7.dex */
public final class C1940hk {

    /* JADX INFO: renamed from: a */
    public final Boolean f92296a;

    /* JADX INFO: renamed from: b */
    public final Boolean f92297b;

    /* JADX INFO: renamed from: c */
    public final msb1 f92298c;

    /* JADX INFO: renamed from: d */
    public final Boolean f92299d;

    /* JADX INFO: renamed from: e */
    public final Boolean f92300e;

    /* JADX INFO: renamed from: f */
    public final Boolean f92301f;

    /* JADX INFO: renamed from: g */
    public final Boolean f92302g;

    public C1940hk(Boolean bool, Boolean bool2, msb1 msb1Var, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6) {
        this.f92296a = bool;
        this.f92297b = bool2;
        this.f92298c = msb1Var;
        this.f92299d = bool3;
        this.f92300e = bool4;
        this.f92301f = bool5;
        this.f92302g = bool6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1940hk)) {
            return false;
        }
        C1940hk c1940hk = (C1940hk) obj;
        return wj50.m88271j(this.f92296a, c1940hk.f92296a) && wj50.m88271j(this.f92297b, c1940hk.f92297b) && wj50.m88271j(this.f92298c, c1940hk.f92298c) && wj50.m88271j(this.f92299d, c1940hk.f92299d) && wj50.m88271j(this.f92300e, c1940hk.f92300e) && wj50.m88271j(this.f92301f, c1940hk.f92301f) && wj50.m88271j(this.f92302g, c1940hk.f92302g);
    }

    public final int hashCode() {
        Boolean bool = this.f92296a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.f92297b;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        msb1 msb1Var = this.f92298c;
        int iHashCode3 = (iHashCode2 + (msb1Var == null ? 0 : msb1Var.hashCode())) * 31;
        Boolean bool3 = this.f92299d;
        int iHashCode4 = (iHashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.f92300e;
        int iHashCode5 = (iHashCode4 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.f92301f;
        int iHashCode6 = (iHashCode5 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.f92302g;
        return iHashCode6 + (bool6 != null ? bool6.hashCode() : 0);
    }

    public /* synthetic */ C1940hk(Boolean bool, Boolean bool2, msb1 msb1Var, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, int i) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2, (i & 4) != 0 ? null : msb1Var, (i & 8) != 0 ? null : bool3, (i & 16) != 0 ? null : bool4, (i & 32) != 0 ? null : bool5, (i & 64) != 0 ? null : bool6);
    }
}
