package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class np20 {

    /* JADX INFO: renamed from: a */
    public final boolean f156851a;

    /* JADX INFO: renamed from: b */
    public final String f156852b;

    /* JADX INFO: renamed from: c */
    public final String f156853c;

    /* JADX INFO: renamed from: d */
    public final String f156854d;

    public np20(String str, String str2, String str3, boolean z) {
        this.f156851a = z;
        this.f156852b = str;
        this.f156853c = str2;
        this.f156854d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof np20)) {
            return false;
        }
        np20 np20Var = (np20) obj;
        return this.f156851a == np20Var.f156851a && wj50.m88271j(this.f156852b, np20Var.f156852b) && wj50.m88271j(this.f156853c, np20Var.f156853c) && wj50.m88271j(this.f156854d, np20Var.f156854d);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f156851a) * 31;
        String str = this.f156852b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f156853c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f156854d;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }
}
