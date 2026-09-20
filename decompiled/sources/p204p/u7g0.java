package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class u7g0 {

    /* JADX INFO: renamed from: a */
    public final gh71 f227630a;

    /* JADX INFO: renamed from: b */
    public final gh71 f227631b;

    public u7g0(gh71 gh71Var, gh71 gh71Var2) {
        this.f227630a = gh71Var;
        this.f227631b = gh71Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u7g0)) {
            return false;
        }
        u7g0 u7g0Var = (u7g0) obj;
        return wj50.m88271j(this.f227630a, u7g0Var.f227630a) && wj50.m88271j(this.f227631b, u7g0Var.f227631b);
    }

    public final int hashCode() {
        gh71 gh71Var = this.f227630a;
        int iHashCode = (gh71Var == null ? 0 : gh71Var.hashCode()) * 31;
        gh71 gh71Var2 = this.f227631b;
        return iHashCode + (gh71Var2 != null ? gh71Var2.hashCode() : 0);
    }
}
