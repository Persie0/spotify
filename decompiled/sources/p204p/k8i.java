package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class k8i extends w8i {

    /* JADX INFO: renamed from: a */
    public final w4i0 f120373a;

    public k8i(w4i0 w4i0Var) {
        this.f120373a = w4i0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k8i) && this.f120373a.equals(((k8i) obj).f120373a);
    }

    public final int hashCode() {
        return this.f120373a.hashCode() * 31;
    }
}
