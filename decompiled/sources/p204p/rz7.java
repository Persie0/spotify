package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class rz7 extends p3l {

    /* JADX INFO: renamed from: a */
    public final long f204077a;

    /* JADX INFO: renamed from: b */
    public final long f204078b;

    /* JADX INFO: renamed from: c */
    public final String f204079c;

    /* JADX INFO: renamed from: d */
    public final String f204080d;

    public rz7(String str, long j, long j2, String str2) {
        this.f204077a = j;
        this.f204078b = j2;
        this.f204079c = str;
        this.f204080d = str2;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof p3l) {
            rz7 rz7Var = (rz7) ((p3l) obj);
            String str2 = rz7Var.f204080d;
            if (this.f204077a == rz7Var.f204077a && this.f204078b == rz7Var.f204078b && this.f204079c.equals(rz7Var.f204079c) && ((str = this.f204080d) != null ? str.equals(str2) : str2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f204077a;
        long j2 = this.f204078b;
        int iHashCode = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f204079c.hashCode()) * 1000003;
        String str = this.f204080d;
        return iHashCode ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BinaryImage{baseAddress=");
        sb.append(this.f204077a);
        sb.append(", size=");
        sb.append(this.f204078b);
        sb.append(", name=");
        sb.append(this.f204079c);
        sb.append(", uuid=");
        return dq60.m36616p(this.f204080d, "}", sb);
    }
}
