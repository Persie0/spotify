package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class zz7 extends s3l {

    /* JADX INFO: renamed from: a */
    public final long f287900a;

    /* JADX INFO: renamed from: b */
    public final String f287901b;

    /* JADX INFO: renamed from: c */
    public final String f287902c;

    /* JADX INFO: renamed from: d */
    public final long f287903d;

    /* JADX INFO: renamed from: e */
    public final int f287904e;

    public zz7(long j, String str, String str2, long j2, int i) {
        this.f287900a = j;
        this.f287901b = str;
        this.f287902c = str2;
        this.f287903d = j2;
        this.f287904e = i;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof s3l) {
            zz7 zz7Var = (zz7) ((s3l) obj);
            String str2 = zz7Var.f287902c;
            if (this.f287900a == zz7Var.f287900a && this.f287901b.equals(zz7Var.f287901b) && ((str = this.f287902c) != null ? str.equals(str2) : str2 == null) && this.f287903d == zz7Var.f287903d && this.f287904e == zz7Var.f287904e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f287900a;
        int iHashCode = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f287901b.hashCode()) * 1000003;
        String str = this.f287902c;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j2 = this.f287903d;
        return ((iHashCode2 ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f287904e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Frame{pc=");
        sb.append(this.f287900a);
        sb.append(", symbol=");
        sb.append(this.f287901b);
        sb.append(", file=");
        sb.append(this.f287902c);
        sb.append(", offset=");
        sb.append(this.f287903d);
        sb.append(", importance=");
        return klh.m56832d(this.f287904e, "}", sb);
    }
}
