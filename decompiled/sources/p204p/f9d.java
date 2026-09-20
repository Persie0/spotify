package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class f9d implements lad {

    /* JADX INFO: renamed from: a */
    public final z650 f67221a;

    public f9d(z650 z650Var) {
        this.f67221a = z650Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f9d) && wj50.m88271j(this.f67221a, ((f9d) obj).f67221a);
    }

    public final int hashCode() {
        z650 z650Var = this.f67221a;
        if (z650Var == null) {
            return 0;
        }
        return z650Var.f279709a.hashCode();
    }
}
