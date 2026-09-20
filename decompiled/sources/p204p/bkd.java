package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class bkd implements ykd {

    /* JADX INFO: renamed from: a */
    public final String f27904a;

    /* JADX INFO: renamed from: b */
    public final z650 f27905b;

    public bkd(String str, z650 z650Var) {
        this.f27904a = str;
        this.f27905b = z650Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bkd)) {
            return false;
        }
        bkd bkdVar = (bkd) obj;
        return wj50.m88271j(this.f27904a, bkdVar.f27904a) && wj50.m88271j(this.f27905b, bkdVar.f27905b);
    }

    public final int hashCode() {
        int iHashCode = this.f27904a.hashCode() * 31;
        z650 z650Var = this.f27905b;
        return iHashCode + (z650Var == null ? 0 : z650Var.f279709a.hashCode());
    }
}
