package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class m4g0 implements q4g0 {

    /* JADX INFO: renamed from: a */
    public final pk00 f139960a;

    /* JADX INFO: renamed from: b */
    public final int f139961b;

    public m4g0(pk00 pk00Var, int i) {
        this.f139960a = pk00Var;
        this.f139961b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m4g0)) {
            return false;
        }
        m4g0 m4g0Var = (m4g0) obj;
        return this.f139960a == m4g0Var.f139960a && this.f139961b == m4g0Var.f139961b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f139961b) + (this.f139960a.hashCode() * 31);
    }
}
