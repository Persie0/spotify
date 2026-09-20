package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class s28 {

    /* JADX INFO: renamed from: a */
    public final String f204924a;

    /* JADX INFO: renamed from: b */
    public final long f204925b;

    /* JADX INFO: renamed from: c */
    public final int f204926c;

    public s28(long j, int i, String str) {
        this.f204924a = str;
        this.f204925b = j;
        this.f204926c = i;
    }

    /* JADX INFO: renamed from: a */
    public static zk1 m77044a() {
        zk1 zk1Var = new zk1(5, (byte) 0);
        zk1Var.f283581d = 0L;
        return zk1Var;
    }

    /* JADX INFO: renamed from: b */
    public final int m77045b() {
        return this.f204926c;
    }

    /* JADX INFO: renamed from: c */
    public final String m77046c() {
        return this.f204924a;
    }

    /* JADX INFO: renamed from: d */
    public final long m77047d() {
        return this.f204925b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s28)) {
            return false;
        }
        s28 s28Var = (s28) obj;
        int i = s28Var.f204926c;
        String str = s28Var.f204924a;
        String str2 = this.f204924a;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        if (this.f204925b != s28Var.f204925b) {
            return false;
        }
        int i2 = this.f204926c;
        if (i2 == 0) {
            return i == 0;
        }
        return edb.m38554c(i2, i);
    }

    public final int hashCode() {
        String str = this.f204924a;
        int iHashCode = str == null ? 0 : str.hashCode();
        long j = this.f204925b;
        int i = (((iHashCode ^ 1000003) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003;
        int i2 = this.f204926c;
        return (i2 != 0 ? edb.m38547C(i2) : 0) ^ i;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("TokenResult{token=");
        sb.append(this.f204924a);
        sb.append(", tokenExpirationTimestamp=");
        sb.append(this.f204925b);
        sb.append(", responseCode=");
        int i = this.f204926c;
        if (i == 1) {
            str = "OK";
        } else if (i != 2) {
            str = i != 3 ? "null" : "AUTH_ERROR";
        } else {
            str = "BAD_CONFIG";
        }
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
