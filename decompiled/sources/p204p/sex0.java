package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class sex0 implements zex0 {

    /* JADX INFO: renamed from: a */
    public final z650 f208398a;

    public sex0(z650 z650Var) {
        this.f208398a = z650Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sex0) && wj50.m88271j(this.f208398a, ((sex0) obj).f208398a);
    }

    public final int hashCode() {
        z650 z650Var = this.f208398a;
        if (z650Var == null) {
            return 0;
        }
        return z650Var.f279709a.hashCode();
    }
}
