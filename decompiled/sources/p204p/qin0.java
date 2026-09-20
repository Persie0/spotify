package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class qin0 {

    /* JADX INFO: renamed from: a */
    public final String f189039a;

    /* JADX INFO: renamed from: b */
    public final String f189040b;

    /* JADX INFO: renamed from: c */
    public final String f189041c;

    public qin0(String str, String str2, String str3) {
        this.f189039a = str;
        this.f189040b = str2;
        this.f189041c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qin0)) {
            return false;
        }
        qin0 qin0Var = (qin0) obj;
        return wj50.m88271j(this.f189039a, qin0Var.f189039a) && wj50.m88271j(this.f189040b, qin0Var.f189040b) && wj50.m88271j(this.f189041c, qin0Var.f189041c);
    }

    public final int hashCode() {
        int iHashCode = this.f189039a.hashCode() * 31;
        String str = this.f189040b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f189041c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
