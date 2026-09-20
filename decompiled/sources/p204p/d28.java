package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class d28 {

    /* JADX INFO: renamed from: a */
    public final long f44498a;

    /* JADX INFO: renamed from: b */
    public final long f44499b;

    /* JADX INFO: renamed from: c */
    public final long f44500c;

    public d28(long j, long j2, long j3) {
        this.f44498a = j;
        this.f44499b = j2;
        this.f44500c = j3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d28) {
            d28 d28Var = (d28) obj;
            if (this.f44498a == d28Var.f44498a && this.f44499b == d28Var.f44499b && this.f44500c == d28Var.f44500c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f44498a;
        long j2 = this.f44499b;
        int i = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        long j3 = this.f44500c;
        return i ^ ((int) ((j3 >>> 32) ^ j3));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StartupTime{epochMillis=");
        sb.append(this.f44498a);
        sb.append(", elapsedRealtime=");
        sb.append(this.f44499b);
        sb.append(", uptimeMillis=");
        return ikc0.m50938j(this.f44500c, "}", sb);
    }
}
