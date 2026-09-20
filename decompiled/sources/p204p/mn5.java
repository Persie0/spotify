package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class mn5 implements xn5 {

    /* JADX INFO: renamed from: a */
    public final boolean f145312a;

    /* JADX INFO: renamed from: b */
    public final xu00 f145313b;

    public mn5(xu00 xu00Var, boolean z) {
        this.f145312a = z;
        this.f145313b = xu00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mn5)) {
            return false;
        }
        mn5 mn5Var = (mn5) obj;
        return this.f145312a == mn5Var.f145312a && wj50.m88271j(this.f145313b, mn5Var.f145313b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f145312a) * 31;
        xu00 xu00Var = this.f145313b;
        return iHashCode + (xu00Var == null ? 0 : xu00Var.hashCode());
    }
}
