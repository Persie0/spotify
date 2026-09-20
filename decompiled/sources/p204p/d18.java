package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class d18 {

    /* JADX INFO: renamed from: a */
    public final String f44183a;

    /* JADX INFO: renamed from: b */
    public final String f44184b;

    /* JADX INFO: renamed from: c */
    public final String f44185c;

    public d18(String str, String str2, String str3) {
        if (str == null) {
            throw new NullPointerException("Null crashlyticsInstallId");
        }
        this.f44183a = str;
        this.f44184b = str2;
        this.f44185c = str3;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof d18) {
            d18 d18Var = (d18) obj;
            String str3 = d18Var.f44185c;
            String str4 = d18Var.f44184b;
            if (this.f44183a.equals(d18Var.f44183a) && ((str = this.f44184b) != null ? str.equals(str4) : str4 == null) && ((str2 = this.f44185c) != null ? str2.equals(str3) : str3 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f44183a.hashCode() ^ 1000003) * 1000003;
        String str = this.f44184b;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f44185c;
        return iHashCode2 ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstallIds{crashlyticsInstallId=");
        sb.append(this.f44183a);
        sb.append(", firebaseInstallationId=");
        sb.append(this.f44184b);
        sb.append(", firebaseAuthenticationToken=");
        return dq60.m36616p(this.f44185c, "}", sb);
    }
}
