package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class aac0 {

    /* JADX INFO: renamed from: a */
    public final String f13811a;

    /* JADX INFO: renamed from: b */
    public final z5c0 f13812b;

    /* JADX INFO: renamed from: c */
    public final Boolean f13813c;

    /* JADX INFO: renamed from: d */
    public final Boolean f13814d;

    /* JADX INFO: renamed from: e */
    public final Boolean f13815e;

    /* JADX INFO: renamed from: f */
    public final boolean f13816f;

    /* JADX INFO: renamed from: g */
    public final boolean f13817g;

    /* JADX INFO: renamed from: h */
    public final boolean f13818h;

    public aac0(String str, z5c0 z5c0Var, Boolean bool, Boolean bool2, Boolean bool3, boolean z, boolean z2, boolean z3) {
        this.f13811a = str;
        this.f13812b = z5c0Var;
        this.f13813c = bool;
        this.f13814d = bool2;
        this.f13815e = bool3;
        this.f13816f = z;
        this.f13817g = z2;
        this.f13818h = z3;
    }

    /* JADX INFO: renamed from: a */
    public static aac0 m25217a(aac0 aac0Var, Boolean bool, Boolean bool2, Boolean bool3, boolean z, boolean z2, boolean z3, int i) {
        String str = aac0Var.f13811a;
        z5c0 z5c0Var = aac0Var.f13812b;
        if ((i & 4) != 0) {
            bool = aac0Var.f13813c;
        }
        Boolean bool4 = bool;
        if ((i & 8) != 0) {
            bool2 = aac0Var.f13814d;
        }
        Boolean bool5 = bool2;
        if ((i & 16) != 0) {
            bool3 = aac0Var.f13815e;
        }
        Boolean bool6 = bool3;
        if ((i & 32) != 0) {
            z = aac0Var.f13816f;
        }
        boolean z4 = z;
        if ((i & 64) != 0) {
            z2 = aac0Var.f13817g;
        }
        boolean z5 = z2;
        boolean z6 = (i & 128) != 0 ? aac0Var.f13818h : z3;
        aac0Var.getClass();
        return new aac0(str, z5c0Var, bool4, bool5, bool6, z4, z5, z6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aac0)) {
            return false;
        }
        aac0 aac0Var = (aac0) obj;
        return wj50.m88271j(this.f13811a, aac0Var.f13811a) && this.f13812b == aac0Var.f13812b && wj50.m88271j(this.f13813c, aac0Var.f13813c) && wj50.m88271j(this.f13814d, aac0Var.f13814d) && wj50.m88271j(this.f13815e, aac0Var.f13815e) && this.f13816f == aac0Var.f13816f && this.f13817g == aac0Var.f13817g && this.f13818h == aac0Var.f13818h;
    }

    public final int hashCode() {
        int iHashCode = (this.f13812b.hashCode() + (this.f13811a.hashCode() * 31)) * 31;
        Boolean bool = this.f13813c;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f13814d;
        int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f13815e;
        return Boolean.hashCode(this.f13818h) + s571.m77245d(s571.m77245d((iHashCode3 + (bool3 != null ? bool3.hashCode() : 0)) * 31, 31, this.f13816f), 31, this.f13817g);
    }
}
