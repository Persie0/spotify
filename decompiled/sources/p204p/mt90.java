package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class mt90 {

    /* JADX INFO: renamed from: a */
    public final String f146989a;

    /* JADX INFO: renamed from: b */
    public final String f146990b;

    /* JADX INFO: renamed from: c */
    public final pol f146991c;

    public mt90(String str, String str2, pol polVar) {
        this.f146989a = str;
        this.f146990b = str2;
        this.f146991c = polVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mt90)) {
            return false;
        }
        mt90 mt90Var = (mt90) obj;
        return wj50.m88271j(this.f146989a, mt90Var.f146989a) && wj50.m88271j(this.f146990b, mt90Var.f146990b) && wj50.m88271j(this.f146991c, mt90Var.f146991c);
    }

    public final int hashCode() {
        int iHashCode = this.f146989a.hashCode() * 31;
        String str = this.f146990b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        pol polVar = this.f146991c;
        return iHashCode2 + (polVar != null ? polVar.hashCode() : 0);
    }
}
