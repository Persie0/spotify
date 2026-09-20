package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class gv2 implements hv2 {

    /* JADX INFO: renamed from: a */
    public final String f84594a;

    /* JADX INFO: renamed from: b */
    public final String f84595b;

    /* JADX INFO: renamed from: c */
    public final String f84596c;

    public gv2(String str, String str2, String str3) {
        this.f84594a = str;
        this.f84595b = str2;
        this.f84596c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gv2)) {
            return false;
        }
        gv2 gv2Var = (gv2) obj;
        return wj50.m88271j(this.f84594a, gv2Var.f84594a) && wj50.m88271j(this.f84595b, gv2Var.f84595b) && wj50.m88271j(this.f84596c, gv2Var.f84596c);
    }

    public final int hashCode() {
        int iHashCode = this.f84594a.hashCode() * 31;
        String str = this.f84595b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f84596c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
