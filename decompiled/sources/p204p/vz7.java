package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class vz7 extends r3l {

    /* JADX INFO: renamed from: a */
    public final String f246404a;

    /* JADX INFO: renamed from: b */
    public final String f246405b;

    /* JADX INFO: renamed from: c */
    public final long f246406c;

    public vz7(String str, String str2, long j) {
        this.f246404a = str;
        this.f246405b = str2;
        this.f246406c = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r3l) {
            vz7 vz7Var = (vz7) ((r3l) obj);
            if (this.f246404a.equals(vz7Var.f246404a) && this.f246405b.equals(vz7Var.f246405b) && this.f246406c == vz7Var.f246406c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((this.f246404a.hashCode() ^ 1000003) * 1000003) ^ this.f246405b.hashCode()) * 1000003;
        long j = this.f246406c;
        return iHashCode ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Signal{name=");
        sb.append(this.f246404a);
        sb.append(", code=");
        sb.append(this.f246405b);
        sb.append(", address=");
        return ikc0.m50938j(this.f246406c, "}", sb);
    }
}
