package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class e18 {

    /* JADX INFO: renamed from: a */
    public final String f55132a;

    /* JADX INFO: renamed from: b */
    public final String f55133b;

    /* JADX INFO: renamed from: c */
    public final String f55134c;

    /* JADX INFO: renamed from: d */
    public final s28 f55135d;

    /* JADX INFO: renamed from: e */
    public final int f55136e;

    public e18(String str, String str2, String str3, s28 s28Var, int i) {
        this.f55132a = str;
        this.f55133b = str2;
        this.f55134c = str3;
        this.f55135d = s28Var;
        this.f55136e = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e18)) {
            return false;
        }
        e18 e18Var = (e18) obj;
        int i = e18Var.f55136e;
        s28 s28Var = e18Var.f55135d;
        String str = e18Var.f55134c;
        String str2 = e18Var.f55133b;
        String str3 = e18Var.f55132a;
        String str4 = this.f55132a;
        if (str4 == null) {
            if (str3 != null) {
                return false;
            }
        } else if (!str4.equals(str3)) {
            return false;
        }
        String str5 = this.f55133b;
        if (str5 == null) {
            if (str2 != null) {
                return false;
            }
        } else if (!str5.equals(str2)) {
            return false;
        }
        String str6 = this.f55134c;
        if (str6 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str6.equals(str)) {
            return false;
        }
        s28 s28Var2 = this.f55135d;
        if (s28Var2 == null) {
            if (s28Var != null) {
                return false;
            }
        } else if (!s28Var2.equals(s28Var)) {
            return false;
        }
        int i2 = this.f55136e;
        if (i2 == 0) {
            return i == 0;
        }
        return edb.m38554c(i2, i);
    }

    public final int hashCode() {
        String str = this.f55132a;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f55133b;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f55134c;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        s28 s28Var = this.f55135d;
        int iHashCode4 = (iHashCode3 ^ (s28Var == null ? 0 : s28Var.hashCode())) * 1000003;
        int i = this.f55136e;
        return (i != 0 ? edb.m38547C(i) : 0) ^ iHashCode4;
    }

    public final String toString() {
        return "InstallationResponse{uri=" + this.f55132a + ", fid=" + this.f55133b + ", refreshToken=" + this.f55134c + ", authToken=" + this.f55135d + ", responseCode=" + oq40.m67604w(this.f55136e) + "}";
    }
}
