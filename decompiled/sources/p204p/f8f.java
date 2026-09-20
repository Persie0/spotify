package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class f8f {

    /* JADX INFO: renamed from: a */
    public final v670 f66967a;

    public f8f(v670 v670Var) {
        this.f66967a = v670Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f8f) && wj50.m88271j(this.f66967a, ((f8f) obj).f66967a);
    }

    public final int hashCode() {
        v670 v670Var = this.f66967a;
        if (v670Var == null) {
            return 0;
        }
        return v670Var.hashCode();
    }
}
