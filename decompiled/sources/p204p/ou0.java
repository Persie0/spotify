package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ou0 {

    /* JADX INFO: renamed from: a */
    public final nu0 f170125a;

    /* JADX INFO: renamed from: b */
    public final boolean f170126b;

    public ou0(nu0 nu0Var, boolean z) {
        this.f170125a = nu0Var;
        this.f170126b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ou0)) {
            return false;
        }
        ou0 ou0Var = (ou0) obj;
        return wj50.m88271j(this.f170125a, ou0Var.f170125a) && this.f170126b == ou0Var.f170126b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f170126b) + (this.f170125a.hashCode() * 31);
    }
}
