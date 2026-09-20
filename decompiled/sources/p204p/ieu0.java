package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ieu0 implements oeu0 {

    /* JADX INFO: renamed from: a */
    public final z650 f101549a;

    public ieu0(z650 z650Var) {
        this.f101549a = z650Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ieu0) && wj50.m88271j(this.f101549a, ((ieu0) obj).f101549a);
    }

    public final int hashCode() {
        z650 z650Var = this.f101549a;
        if (z650Var == null) {
            return 0;
        }
        return z650Var.f279709a.hashCode();
    }
}
