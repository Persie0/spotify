package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class kl01 implements sl01 {

    /* JADX INFO: renamed from: a */
    public final z650 f123766a;

    public kl01(z650 z650Var) {
        this.f123766a = z650Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kl01) && wj50.m88271j(this.f123766a, ((kl01) obj).f123766a);
    }

    public final int hashCode() {
        z650 z650Var = this.f123766a;
        if (z650Var == null) {
            return 0;
        }
        return z650Var.f279709a.hashCode();
    }
}
