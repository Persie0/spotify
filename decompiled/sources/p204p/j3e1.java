package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class j3e1 {

    /* JADX INFO: renamed from: a */
    public final hz80 f108366a;

    /* JADX INFO: renamed from: b */
    public final boolean f108367b;

    public j3e1(hz80 hz80Var, boolean z) {
        this.f108366a = hz80Var;
        this.f108367b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j3e1)) {
            return false;
        }
        j3e1 j3e1Var = (j3e1) obj;
        return wj50.m88271j(this.f108366a, j3e1Var.f108366a) && this.f108367b == j3e1Var.f108367b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f108367b) + (this.f108366a.hashCode() * 31);
    }
}
