package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class u730 {

    /* JADX INFO: renamed from: a */
    public final String f227488a;

    /* JADX INFO: renamed from: b */
    public final String f227489b;

    /* JADX INFO: renamed from: c */
    public final String f227490c;

    public u730(String str, String str2, String str3) {
        this.f227488a = str;
        this.f227489b = str2;
        this.f227490c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u730)) {
            return false;
        }
        u730 u730Var = (u730) obj;
        return wj50.m88271j(this.f227488a, u730Var.f227488a) && wj50.m88271j(this.f227489b, u730Var.f227489b) && wj50.m88271j(this.f227490c, u730Var.f227490c);
    }

    public final int hashCode() {
        int iHashCode = this.f227488a.hashCode() * 31;
        String str = this.f227489b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f227490c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
