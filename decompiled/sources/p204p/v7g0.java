package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class v7g0 {

    /* JADX INFO: renamed from: a */
    public final s7g0 f238178a;

    /* JADX INFO: renamed from: b */
    public final t7g0 f238179b;

    /* JADX INFO: renamed from: c */
    public final u7g0 f238180c;

    public v7g0(s7g0 s7g0Var, t7g0 t7g0Var, u7g0 u7g0Var) {
        this.f238178a = s7g0Var;
        this.f238179b = t7g0Var;
        this.f238180c = u7g0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v7g0)) {
            return false;
        }
        v7g0 v7g0Var = (v7g0) obj;
        return wj50.m88271j(this.f238178a, v7g0Var.f238178a) && wj50.m88271j(this.f238179b, v7g0Var.f238179b) && wj50.m88271j(this.f238180c, v7g0Var.f238180c);
    }

    public final int hashCode() {
        int iHashCode = this.f238178a.hashCode() * 31;
        t7g0 t7g0Var = this.f238179b;
        int iHashCode2 = (iHashCode + (t7g0Var == null ? 0 : t7g0Var.hashCode())) * 31;
        u7g0 u7g0Var = this.f238180c;
        return iHashCode2 + (u7g0Var != null ? u7g0Var.hashCode() : 0);
    }
}
