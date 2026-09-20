package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class b0x0 {

    /* JADX INFO: renamed from: a */
    public final String f22119a;

    /* JADX INFO: renamed from: b */
    public final String f22120b;

    /* JADX INFO: renamed from: c */
    public final rsp0 f22121c;

    public b0x0(String str, String str2, rsp0 rsp0Var) {
        this.f22119a = str;
        this.f22120b = str2;
        this.f22121c = rsp0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0x0)) {
            return false;
        }
        b0x0 b0x0Var = (b0x0) obj;
        return wj50.m88271j(this.f22119a, b0x0Var.f22119a) && wj50.m88271j(this.f22120b, b0x0Var.f22120b) && wj50.m88271j(this.f22121c, b0x0Var.f22121c);
    }

    public final int hashCode() {
        String str = this.f22119a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f22120b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        rsp0 rsp0Var = this.f22121c;
        return iHashCode2 + (rsp0Var != null ? rsp0Var.hashCode() : 0);
    }
}
