package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class mkd implements ykd {

    /* JADX INFO: renamed from: a */
    public final String f144554a;

    /* JADX INFO: renamed from: b */
    public final z650 f144555b;

    public mkd(String str, z650 z650Var) {
        this.f144554a = str;
        this.f144555b = z650Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mkd)) {
            return false;
        }
        mkd mkdVar = (mkd) obj;
        return wj50.m88271j(this.f144554a, mkdVar.f144554a) && wj50.m88271j(this.f144555b, mkdVar.f144555b);
    }

    public final int hashCode() {
        int iHashCode = this.f144554a.hashCode() * 31;
        z650 z650Var = this.f144555b;
        return iHashCode + (z650Var == null ? 0 : z650Var.f279709a.hashCode());
    }
}
