package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class n650 extends mag1 {

    /* JADX INFO: renamed from: d */
    public final qug0 f150700d;

    /* JADX INFO: renamed from: e */
    public final int f150701e;

    public n650(qug0 qug0Var, int i) {
        this.f150700d = qug0Var;
        this.f150701e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n650)) {
            return false;
        }
        n650 n650Var = (n650) obj;
        return this.f150700d == n650Var.f150700d && this.f150701e == n650Var.f150701e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f150701e) + (this.f150700d.hashCode() * 31);
    }
}
