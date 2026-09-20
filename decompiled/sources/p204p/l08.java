package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class l08 extends d4l {

    /* JADX INFO: renamed from: a */
    public final int f128309a;

    /* JADX INFO: renamed from: b */
    public final String f128310b;

    /* JADX INFO: renamed from: c */
    public final String f128311c;

    /* JADX INFO: renamed from: d */
    public final boolean f128312d;

    public l08(String str, int i, String str2, boolean z) {
        this.f128309a = i;
        this.f128310b = str;
        this.f128311c = str2;
        this.f128312d = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d4l) {
            l08 l08Var = (l08) ((d4l) obj);
            if (this.f128309a == l08Var.f128309a && this.f128310b.equals(l08Var.f128310b) && this.f128311c.equals(l08Var.f128311c) && this.f128312d == l08Var.f128312d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f128309a ^ 1000003) * 1000003) ^ this.f128310b.hashCode()) * 1000003) ^ this.f128311c.hashCode()) * 1000003) ^ (this.f128312d ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OperatingSystem{platform=");
        sb.append(this.f128309a);
        sb.append(", version=");
        sb.append(this.f128310b);
        sb.append(", buildVersion=");
        sb.append(this.f128311c);
        sb.append(", jailbroken=");
        return edb.m38570s(sb, this.f128312d, "}");
    }
}
