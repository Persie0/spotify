package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class wex0 implements zex0 {

    /* JADX INFO: renamed from: a */
    public final z650 f250641a;

    public wex0(z650 z650Var) {
        this.f250641a = z650Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wex0) && wj50.m88271j(this.f250641a, ((wex0) obj).f250641a);
    }

    public final int hashCode() {
        z650 z650Var = this.f250641a;
        if (z650Var == null) {
            return 0;
        }
        return z650Var.f279709a.hashCode();
    }
}
