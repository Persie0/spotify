package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class hj2 {

    /* JADX INFO: renamed from: a */
    public final String f91941a;

    /* JADX INFO: renamed from: b */
    public final String f91942b;

    /* JADX INFO: renamed from: c */
    public final String f91943c;

    public hj2(String str, String str2, String str3) {
        this.f91941a = str;
        this.f91942b = str2;
        this.f91943c = str3;
    }

    /* JADX INFO: renamed from: a */
    public final String m47647a() {
        return this.f91941a;
    }

    /* JADX INFO: renamed from: b */
    public final String m47648b() {
        return this.f91943c;
    }

    /* JADX INFO: renamed from: c */
    public final String m47649c() {
        return this.f91942b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hj2)) {
            return false;
        }
        hj2 hj2Var = (hj2) obj;
        return wj50.m88271j(this.f91941a, hj2Var.f91941a) && wj50.m88271j(this.f91942b, hj2Var.f91942b) && wj50.m88271j(this.f91943c, hj2Var.f91943c);
    }

    public final int hashCode() {
        String str = this.f91941a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f91942b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f91943c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }
}
