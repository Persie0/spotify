package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class s8k0 extends nsg1 {

    /* JADX INFO: renamed from: b */
    public final z650 f206675b;

    public s8k0(z650 z650Var) {
        this.f206675b = z650Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s8k0) && wj50.m88271j(this.f206675b, ((s8k0) obj).f206675b);
    }

    public final int hashCode() {
        z650 z650Var = this.f206675b;
        if (z650Var == null) {
            return 0;
        }
        return z650Var.f279709a.hashCode();
    }
}
