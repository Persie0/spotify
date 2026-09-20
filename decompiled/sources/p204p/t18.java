package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class t18 {

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ int f216170h = 0;

    /* JADX INFO: renamed from: a */
    public final String f216171a;

    /* JADX INFO: renamed from: b */
    public final int f216172b;

    /* JADX INFO: renamed from: c */
    public final String f216173c;

    /* JADX INFO: renamed from: d */
    public final String f216174d;

    /* JADX INFO: renamed from: e */
    public final long f216175e;

    /* JADX INFO: renamed from: f */
    public final long f216176f;

    /* JADX INFO: renamed from: g */
    public final String f216177g;

    static {
        s18 s18Var = new s18();
        s18Var.m76930m(0L);
        s18Var.m76929l(1);
        s18Var.m76925h(0L);
        s18Var.m76920c();
    }

    public t18(int i, long j, long j2, String str, String str2, String str3, String str4) {
        this.f216171a = str;
        this.f216172b = i;
        this.f216173c = str2;
        this.f216174d = str3;
        this.f216175e = j;
        this.f216176f = j2;
        this.f216177g = str4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof t18)) {
            return false;
        }
        t18 t18Var = (t18) obj;
        String str = t18Var.f216177g;
        String str2 = t18Var.f216174d;
        String str3 = t18Var.f216173c;
        String str4 = t18Var.f216171a;
        String str5 = this.f216171a;
        if (str5 == null) {
            if (str4 != null) {
                return false;
            }
        } else if (!str5.equals(str4)) {
            return false;
        }
        if (!edb.m38554c(this.f216172b, t18Var.f216172b)) {
            return false;
        }
        String str6 = this.f216173c;
        if (str6 == null) {
            if (str3 != null) {
                return false;
            }
        } else if (!str6.equals(str3)) {
            return false;
        }
        String str7 = this.f216174d;
        if (str7 == null) {
            if (str2 != null) {
                return false;
            }
        } else if (!str7.equals(str2)) {
            return false;
        }
        if (this.f216175e != t18Var.f216175e || this.f216176f != t18Var.f216176f) {
            return false;
        }
        String str8 = this.f216177g;
        if (str8 == null) {
            return str == null;
        }
        return str8.equals(str);
    }

    public final int hashCode() {
        String str = this.f216171a;
        int iHashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ edb.m38547C(this.f216172b)) * 1000003;
        String str2 = this.f216173c;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f216174d;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        long j = this.f216175e;
        int i = (iHashCode3 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.f216176f;
        int i2 = (i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        String str4 = this.f216177g;
        return (str4 != null ? str4.hashCode() : 0) ^ i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PersistedInstallationEntry{firebaseInstallationId=");
        sb.append(this.f216171a);
        sb.append(", registrationStatus=");
        sb.append(p3n0.m69078i(this.f216172b));
        sb.append(", authToken=");
        sb.append(this.f216173c);
        sb.append(", refreshToken=");
        sb.append(this.f216174d);
        sb.append(", expiresInSecs=");
        sb.append(this.f216175e);
        sb.append(", tokenCreationEpochInSecs=");
        sb.append(this.f216176f);
        sb.append(", fisError=");
        return dq60.m36616p(this.f216177g, "}", sb);
    }
}
