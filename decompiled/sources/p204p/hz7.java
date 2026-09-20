package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class hz7 extends n3l {

    /* JADX INFO: renamed from: a */
    public final String f96799a;

    /* JADX INFO: renamed from: b */
    public final String f96800b;

    /* JADX INFO: renamed from: c */
    public final String f96801c;

    /* JADX INFO: renamed from: d */
    public final String f96802d;

    /* JADX INFO: renamed from: e */
    public final String f96803e;

    /* JADX INFO: renamed from: f */
    public final String f96804f;

    public hz7(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f96799a = str;
        this.f96800b = str2;
        this.f96801c = str3;
        this.f96802d = str4;
        this.f96803e = str5;
        this.f96804f = str6;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        if (obj == this) {
            return true;
        }
        if (obj instanceof n3l) {
            hz7 hz7Var = (hz7) ((n3l) obj);
            String str5 = hz7Var.f96804f;
            String str6 = hz7Var.f96803e;
            String str7 = hz7Var.f96802d;
            String str8 = hz7Var.f96801c;
            if (this.f96799a.equals(hz7Var.f96799a) && this.f96800b.equals(hz7Var.f96800b) && ((str = this.f96801c) != null ? str.equals(str8) : str8 == null) && ((str2 = this.f96802d) != null ? str2.equals(str7) : str7 == null) && ((str3 = this.f96803e) != null ? str3.equals(str6) : str6 == null) && ((str4 = this.f96804f) != null ? str4.equals(str5) : str5 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((this.f96799a.hashCode() ^ 1000003) * 1000003) ^ this.f96800b.hashCode()) * 1000003;
        String str = this.f96801c;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * (-721379959);
        String str2 = this.f96802d;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f96803e;
        int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f96804f;
        return iHashCode4 ^ (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Application{identifier=");
        sb.append(this.f96799a);
        sb.append(", version=");
        sb.append(this.f96800b);
        sb.append(", displayVersion=");
        sb.append(this.f96801c);
        sb.append(", organization=null, installationUuid=");
        sb.append(this.f96802d);
        sb.append(", developmentPlatform=");
        sb.append(this.f96803e);
        sb.append(", developmentPlatformVersion=");
        return dq60.m36616p(this.f96804f, "}", sb);
    }
}
