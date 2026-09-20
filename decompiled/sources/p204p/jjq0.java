package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class jjq0 {

    /* JADX INFO: renamed from: a */
    public final ljq0 f113083a;

    /* JADX INFO: renamed from: b */
    public final int f113084b;

    public jjq0(ljq0 ljq0Var, int i) {
        this.f113083a = ljq0Var;
        this.f113084b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jjq0)) {
            return false;
        }
        jjq0 jjq0Var = (jjq0) obj;
        return wj50.m88271j(this.f113083a, jjq0Var.f113083a) && this.f113084b == jjq0Var.f113084b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f113084b) + (this.f113083a.hashCode() * 31);
    }
}
