package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class oit implements rmt {

    /* JADX INFO: renamed from: a */
    public final String f165886a;

    /* JADX INFO: renamed from: b */
    public final String f165887b;

    /* JADX INFO: renamed from: c */
    public final d850 f165888c;

    public oit(String str, String str2, d850 d850Var) {
        this.f165886a = str;
        this.f165887b = str2;
        this.f165888c = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oit)) {
            return false;
        }
        oit oitVar = (oit) obj;
        return wj50.m88271j(this.f165886a, oitVar.f165886a) && wj50.m88271j(this.f165887b, oitVar.f165887b) && wj50.m88271j(this.f165888c, oitVar.f165888c);
    }

    public final int hashCode() {
        int iHashCode = this.f165886a.hashCode() * 31;
        String str = this.f165887b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        d850 d850Var = this.f165888c;
        return iHashCode2 + (d850Var != null ? d850Var.hashCode() : 0);
    }
}
