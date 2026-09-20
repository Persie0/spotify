package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class jnl0 {

    /* JADX INFO: renamed from: a */
    public final String f114130a;

    /* JADX INFO: renamed from: b */
    public final int f114131b;

    /* JADX INFO: renamed from: c */
    public final int f114132c;

    /* JADX INFO: renamed from: d */
    public final int f114133d;

    public jnl0(int i, int i2, int i3, String str) {
        this.f114130a = str;
        this.f114131b = i;
        this.f114132c = i2;
        this.f114133d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jnl0)) {
            return false;
        }
        jnl0 jnl0Var = (jnl0) obj;
        return this.f114130a.equals(jnl0Var.f114130a) && this.f114131b == jnl0Var.f114131b && this.f114132c == jnl0Var.f114132c && this.f114133d == jnl0Var.f114133d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f114133d) + mt60.m62800g(this.f114132c, f710.m40938f(this.f114131b, this.f114130a.hashCode() * 31, 31), 31);
    }
}
