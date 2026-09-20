package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class rm31 {

    /* JADX INFO: renamed from: a */
    public final sm31 f200428a;

    /* JADX INFO: renamed from: b */
    public final int f200429b;

    public rm31(sm31 sm31Var, int i) {
        this.f200428a = sm31Var;
        this.f200429b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rm31)) {
            return false;
        }
        rm31 rm31Var = (rm31) obj;
        return wj50.m88271j(this.f200428a, rm31Var.f200428a) && this.f200429b == rm31Var.f200429b;
    }

    public final int hashCode() {
        sm31 sm31Var = this.f200428a;
        return Integer.hashCode(this.f200429b) + ((sm31Var == null ? 0 : sm31Var.hashCode()) * 31);
    }
}
