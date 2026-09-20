package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class ol01 implements sl01 {

    /* JADX INFO: renamed from: a */
    public final z650 f166726a;

    public ol01(z650 z650Var) {
        this.f166726a = z650Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ol01) && wj50.m88271j(this.f166726a, ((ol01) obj).f166726a);
    }

    public final int hashCode() {
        z650 z650Var = this.f166726a;
        if (z650Var == null) {
            return 0;
        }
        return z650Var.f279709a.hashCode();
    }
}
