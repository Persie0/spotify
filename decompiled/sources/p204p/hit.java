package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class hit implements rmt {

    /* JADX INFO: renamed from: a */
    public final z650 f91869a;

    public hit(z650 z650Var) {
        this.f91869a = z650Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hit) && wj50.m88271j(this.f91869a, ((hit) obj).f91869a);
    }

    public final int hashCode() {
        z650 z650Var = this.f91869a;
        if (z650Var == null) {
            return 0;
        }
        return z650Var.f279709a.hashCode();
    }
}
