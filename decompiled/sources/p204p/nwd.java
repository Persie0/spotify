package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class nwd implements rwd {

    /* JADX INFO: renamed from: a */
    public final pla1 f159097a;

    /* JADX INFO: renamed from: b */
    public final bo2 f159098b;

    public nwd(pla1 pla1Var, bo2 bo2Var) {
        this.f159097a = pla1Var;
        this.f159098b = bo2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nwd)) {
            return false;
        }
        nwd nwdVar = (nwd) obj;
        return wj50.m88271j(this.f159097a, nwdVar.f159097a) && wj50.m88271j(this.f159098b, nwdVar.f159098b);
    }

    public final int hashCode() {
        return this.f159098b.hashCode() + (this.f159097a.hashCode() * 31);
    }
}
