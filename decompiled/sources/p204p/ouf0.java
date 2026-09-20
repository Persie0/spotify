package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class ouf0 {

    /* JADX INFO: renamed from: a */
    public final int f170276a;

    /* JADX INFO: renamed from: b */
    public final o690 f170277b;

    /* JADX INFO: renamed from: c */
    public final k69 f170278c;

    public ouf0(int i, o690 o690Var, k69 k69Var) {
        this.f170276a = i;
        this.f170277b = o690Var;
        this.f170278c = k69Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ouf0)) {
            return false;
        }
        ouf0 ouf0Var = (ouf0) obj;
        return this.f170276a == ouf0Var.f170276a && wj50.m88271j(this.f170277b, ouf0Var.f170277b) && wj50.m88271j(this.f170278c, ouf0Var.f170278c);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f170276a) * 31;
        o690 o690Var = this.f170277b;
        int iHashCode2 = (iHashCode + (o690Var == null ? 0 : o690Var.hashCode())) * 31;
        k69 k69Var = this.f170278c;
        return iHashCode2 + (k69Var != null ? k69Var.hashCode() : 0);
    }
}
