package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class u001 implements z001 {

    /* JADX INFO: renamed from: a */
    public final vbc f225341a;

    /* JADX INFO: renamed from: b */
    public final String f225342b;

    public u001(vbc vbcVar, String str) {
        this.f225341a = vbcVar;
        this.f225342b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u001)) {
            return false;
        }
        u001 u001Var = (u001) obj;
        return wj50.m88271j(this.f225341a, u001Var.f225341a) && wj50.m88271j(this.f225342b, u001Var.f225342b);
    }

    public final int hashCode() {
        int iHashCode = this.f225341a.hashCode() * 31;
        String str = this.f225342b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
