package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class b08 extends v3l {

    /* JADX INFO: renamed from: a */
    public final String f21793a;

    /* JADX INFO: renamed from: b */
    public final int f21794b;

    /* JADX INFO: renamed from: c */
    public final int f21795c;

    /* JADX INFO: renamed from: d */
    public final boolean f21796d;

    public b08(String str, int i, int i2, boolean z) {
        this.f21793a = str;
        this.f21794b = i;
        this.f21795c = i2;
        this.f21796d = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v3l) {
            b08 b08Var = (b08) ((v3l) obj);
            if (this.f21793a.equals(b08Var.f21793a) && this.f21794b == b08Var.f21794b && this.f21795c == b08Var.f21795c && this.f21796d == b08Var.f21796d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f21793a.hashCode() ^ 1000003) * 1000003) ^ this.f21794b) * 1000003) ^ this.f21795c) * 1000003) ^ (this.f21796d ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProcessDetails{processName=");
        sb.append(this.f21793a);
        sb.append(", pid=");
        sb.append(this.f21794b);
        sb.append(", importance=");
        sb.append(this.f21795c);
        sb.append(", defaultProcess=");
        return edb.m38570s(sb, this.f21796d, "}");
    }
}
