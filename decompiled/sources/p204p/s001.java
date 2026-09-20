package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class s001 implements z001 {

    /* JADX INFO: renamed from: a */
    public final vbc f204278a;

    /* JADX INFO: renamed from: b */
    public final String f204279b;

    public s001(vbc vbcVar, String str) {
        this.f204278a = vbcVar;
        this.f204279b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s001)) {
            return false;
        }
        s001 s001Var = (s001) obj;
        return wj50.m88271j(this.f204278a, s001Var.f204278a) && wj50.m88271j(this.f204279b, s001Var.f204279b);
    }

    public final int hashCode() {
        int iHashCode = this.f204278a.hashCode() * 31;
        String str = this.f204279b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
