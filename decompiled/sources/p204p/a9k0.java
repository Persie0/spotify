package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class a9k0 extends e9k0 {

    /* JADX INFO: renamed from: a */
    public final z650 f13591a;

    public a9k0(z650 z650Var) {
        this.f13591a = z650Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a9k0) && wj50.m88271j(this.f13591a, ((a9k0) obj).f13591a);
    }

    public final int hashCode() {
        z650 z650Var = this.f13591a;
        if (z650Var == null) {
            return 0;
        }
        return z650Var.f279709a.hashCode();
    }
}
