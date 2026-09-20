package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class g28 {

    /* JADX INFO: renamed from: a */
    public final String f75864a;

    /* JADX INFO: renamed from: b */
    public final String f75865b;

    /* JADX INFO: renamed from: c */
    public final String f75866c;

    /* JADX INFO: renamed from: d */
    public final String f75867d;

    /* JADX INFO: renamed from: e */
    public final int f75868e;

    /* JADX INFO: renamed from: f */
    public final n95 f75869f;

    public g28(String str, String str2, String str3, String str4, int i, n95 n95Var) {
        if (str == null) {
            throw new NullPointerException("Null appIdentifier");
        }
        this.f75864a = str;
        if (str2 == null) {
            throw new NullPointerException("Null versionCode");
        }
        this.f75865b = str2;
        if (str3 == null) {
            throw new NullPointerException("Null versionName");
        }
        this.f75866c = str3;
        if (str4 == null) {
            throw new NullPointerException("Null installUuid");
        }
        this.f75867d = str4;
        this.f75868e = i;
        this.f75869f = n95Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g28) {
            g28 g28Var = (g28) obj;
            if (this.f75864a.equals(g28Var.f75864a) && this.f75865b.equals(g28Var.f75865b) && this.f75866c.equals(g28Var.f75866c) && this.f75867d.equals(g28Var.f75867d) && this.f75868e == g28Var.f75868e && this.f75869f.equals(g28Var.f75869f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((this.f75864a.hashCode() ^ 1000003) * 1000003) ^ this.f75865b.hashCode()) * 1000003) ^ this.f75866c.hashCode()) * 1000003) ^ this.f75867d.hashCode()) * 1000003) ^ this.f75868e) * 1000003) ^ this.f75869f.hashCode();
    }

    public final String toString() {
        return "AppData{appIdentifier=" + this.f75864a + ", versionCode=" + this.f75865b + ", versionName=" + this.f75866c + ", installUuid=" + this.f75867d + ", deliveryMechanism=" + this.f75868e + ", developmentPlatformProvider=" + this.f75869f + "}";
    }
}
