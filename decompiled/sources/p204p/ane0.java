package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class ane0 implements ene0 {

    /* JADX INFO: renamed from: a */
    public final z650 f17424a;

    public ane0(z650 z650Var) {
        this.f17424a = z650Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ane0) && wj50.m88271j(this.f17424a, ((ane0) obj).f17424a);
    }

    public final int hashCode() {
        z650 z650Var = this.f17424a;
        if (z650Var == null) {
            return 0;
        }
        return z650Var.f279709a.hashCode();
    }
}
