package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class z4v {

    /* JADX INFO: renamed from: a */
    public final z650 f279355a;

    public z4v(z650 z650Var) {
        this.f279355a = z650Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z4v) && wj50.m88271j(this.f279355a, ((z4v) obj).f279355a);
    }

    public final int hashCode() {
        z650 z650Var = this.f279355a;
        if (z650Var == null) {
            return 0;
        }
        return z650Var.f279709a.hashCode();
    }
}
