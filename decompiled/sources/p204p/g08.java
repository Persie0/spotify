package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class g08 extends a4l {

    /* JADX INFO: renamed from: a */
    public final z3l f75305a;

    /* JADX INFO: renamed from: b */
    public final String f75306b;

    /* JADX INFO: renamed from: c */
    public final String f75307c;

    /* JADX INFO: renamed from: d */
    public final long f75308d;

    public g08(h08 h08Var, String str, String str2, long j) {
        this.f75305a = h08Var;
        this.f75306b = str;
        this.f75307c = str2;
        this.f75308d = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a4l) {
            g08 g08Var = (g08) ((a4l) obj);
            if (this.f75305a.equals(g08Var.f75305a) && this.f75306b.equals(g08Var.f75306b) && this.f75307c.equals(g08Var.f75307c) && this.f75308d == g08Var.f75308d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((this.f75305a.hashCode() ^ 1000003) * 1000003) ^ this.f75306b.hashCode()) * 1000003) ^ this.f75307c.hashCode()) * 1000003;
        long j = this.f75308d;
        return iHashCode ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RolloutAssignment{rolloutVariant=");
        sb.append(this.f75305a);
        sb.append(", parameterKey=");
        sb.append(this.f75306b);
        sb.append(", parameterValue=");
        sb.append(this.f75307c);
        sb.append(", templateVersion=");
        return ikc0.m50938j(this.f75308d, "}", sb);
    }
}
