package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class srp0 extends yrp0 {

    /* JADX INFO: renamed from: a */
    public final z650 f213369a;

    public srp0(z650 z650Var) {
        this.f213369a = z650Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof srp0) && wj50.m88271j(this.f213369a, ((srp0) obj).f213369a);
    }

    public final int hashCode() {
        z650 z650Var = this.f213369a;
        if (z650Var == null) {
            return 0;
        }
        return z650Var.f279709a.hashCode();
    }
}
