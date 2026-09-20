package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class s821 implements b921 {

    /* JADX INFO: renamed from: a */
    public final z650 f206528a;

    public s821(z650 z650Var) {
        this.f206528a = z650Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s821) && wj50.m88271j(this.f206528a, ((s821) obj).f206528a);
    }

    public final int hashCode() {
        z650 z650Var = this.f206528a;
        if (z650Var == null) {
            return 0;
        }
        return z650Var.f279709a.hashCode();
    }
}
