package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class e63 {

    /* JADX INFO: renamed from: a */
    public final d63 f56528a;

    /* JADX INFO: renamed from: b */
    public final boolean f56529b;

    public e63(d63 d63Var, boolean z) {
        this.f56528a = d63Var;
        this.f56529b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e63)) {
            return false;
        }
        e63 e63Var = (e63) obj;
        return wj50.m88271j(this.f56528a, e63Var.f56528a) && this.f56529b == e63Var.f56529b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f56529b) + (this.f56528a.hashCode() * 31);
    }
}
