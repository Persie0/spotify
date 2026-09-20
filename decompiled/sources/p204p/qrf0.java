package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class qrf0 {

    /* JADX INFO: renamed from: a */
    public final prf0 f191830a;

    /* JADX INFO: renamed from: b */
    public final boolean f191831b;

    public qrf0(prf0 prf0Var, boolean z) {
        this.f191830a = prf0Var;
        this.f191831b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qrf0)) {
            return false;
        }
        qrf0 qrf0Var = (qrf0) obj;
        return wj50.m88271j(this.f191830a, qrf0Var.f191830a) && this.f191831b == qrf0Var.f191831b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f191831b) + (this.f191830a.hashCode() * 31);
    }
}
