package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class zoq0 {

    /* JADX INFO: renamed from: a */
    public final jmq0 f284861a;

    /* JADX INFO: renamed from: b */
    public final int f284862b;

    public zoq0(jmq0 jmq0Var, int i) {
        this.f284861a = jmq0Var;
        this.f284862b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zoq0)) {
            return false;
        }
        zoq0 zoq0Var = (zoq0) obj;
        return wj50.m88271j(this.f284861a, zoq0Var.f284861a) && this.f284862b == zoq0Var.f284862b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f284862b) + (this.f284861a.hashCode() * 31);
    }
}
