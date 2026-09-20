package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class w001 implements z001 {

    /* JADX INFO: renamed from: a */
    public final vbc f246612a;

    /* JADX INFO: renamed from: b */
    public final int f246613b;

    public w001(vbc vbcVar, int i) {
        this.f246612a = vbcVar;
        this.f246613b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w001)) {
            return false;
        }
        w001 w001Var = (w001) obj;
        return wj50.m88271j(this.f246612a, w001Var.f246612a) && this.f246613b == w001Var.f246613b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f246613b) + (this.f246612a.hashCode() * 31);
    }
}
