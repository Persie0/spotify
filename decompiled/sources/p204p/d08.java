package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class d08 extends x3l {

    /* JADX INFO: renamed from: a */
    public final Double f43798a;

    /* JADX INFO: renamed from: b */
    public final int f43799b;

    /* JADX INFO: renamed from: c */
    public final boolean f43800c;

    /* JADX INFO: renamed from: d */
    public final int f43801d;

    /* JADX INFO: renamed from: e */
    public final long f43802e;

    /* JADX INFO: renamed from: f */
    public final long f43803f;

    public d08(Double d, int i, boolean z, int i2, long j, long j2) {
        this.f43798a = d;
        this.f43799b = i;
        this.f43800c = z;
        this.f43801d = i2;
        this.f43802e = j;
        this.f43803f = j2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof x3l) {
            x3l x3lVar = (x3l) obj;
            Double d = this.f43798a;
            if (d != null ? d.equals(((d08) x3lVar).f43798a) : ((d08) x3lVar).f43798a == null) {
                d08 d08Var = (d08) x3lVar;
                if (this.f43799b == d08Var.f43799b && this.f43800c == d08Var.f43800c && this.f43801d == d08Var.f43801d && this.f43802e == d08Var.f43802e && this.f43803f == d08Var.f43803f) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Double d = this.f43798a;
        int iHashCode = ((((((((d == null ? 0 : d.hashCode()) ^ 1000003) * 1000003) ^ this.f43799b) * 1000003) ^ (this.f43800c ? 1231 : 1237)) * 1000003) ^ this.f43801d) * 1000003;
        long j = this.f43802e;
        long j2 = this.f43803f;
        return ((iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Device{batteryLevel=");
        sb.append(this.f43798a);
        sb.append(", batteryVelocity=");
        sb.append(this.f43799b);
        sb.append(", proximityOn=");
        sb.append(this.f43800c);
        sb.append(", orientation=");
        sb.append(this.f43801d);
        sb.append(", ramUsed=");
        sb.append(this.f43802e);
        sb.append(", diskUsed=");
        return ikc0.m50938j(this.f43803f, "}", sb);
    }
}
