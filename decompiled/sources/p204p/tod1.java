package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class tod1 {

    /* JADX INFO: renamed from: a */
    public final o6j0 f222234a;

    public tod1(n6j0 n6j0Var) {
        this.f222234a = n6j0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tod1) && wj50.m88271j(this.f222234a, ((tod1) obj).f222234a);
    }

    public final int hashCode() {
        o6j0 o6j0Var = this.f222234a;
        if (o6j0Var == null) {
            return 0;
        }
        return o6j0Var.hashCode();
    }
}
