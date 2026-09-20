package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class rhr0 {

    /* JADX INFO: renamed from: a */
    public final String f199322a;

    /* JADX INFO: renamed from: b */
    public final int f199323b;

    /* JADX INFO: renamed from: c */
    public final int f199324c;

    /* JADX INFO: renamed from: d */
    public final boolean f199325d;

    public rhr0(String str, int i, int i2, boolean z) {
        this.f199322a = str;
        this.f199323b = i;
        this.f199324c = i2;
        this.f199325d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rhr0)) {
            return false;
        }
        rhr0 rhr0Var = (rhr0) obj;
        return wj50.m88271j(this.f199322a, rhr0Var.f199322a) && this.f199323b == rhr0Var.f199323b && this.f199324c == rhr0Var.f199324c && this.f199325d == rhr0Var.f199325d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    public final int hashCode() {
        int iM62800g = mt60.m62800g(this.f199324c, mt60.m62800g(this.f199323b, this.f199322a.hashCode() * 31, 31), 31);
        boolean z = this.f199325d;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return iM62800g + r1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProcessDetails(processName=");
        sb.append(this.f199322a);
        sb.append(", pid=");
        sb.append(this.f199323b);
        sb.append(", importance=");
        sb.append(this.f199324c);
        sb.append(", isDefaultProcess=");
        return s571.m77253l(sb, this.f199325d, ')');
    }
}
