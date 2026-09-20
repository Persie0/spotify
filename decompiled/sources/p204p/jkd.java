package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class jkd implements ykd {

    /* JADX INFO: renamed from: a */
    public final z650 f113285a;

    public jkd(z650 z650Var) {
        this.f113285a = z650Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jkd) && wj50.m88271j(this.f113285a, ((jkd) obj).f113285a);
    }

    public final int hashCode() {
        z650 z650Var = this.f113285a;
        if (z650Var == null) {
            return 0;
        }
        return z650Var.f279709a.hashCode();
    }
}
