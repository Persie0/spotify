package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class jvq0 extends uvq0 {

    /* JADX INFO: renamed from: a */
    public final int f116449a;

    /* JADX INFO: renamed from: b */
    public final d850 f116450b;

    public jvq0(int i, d850 d850Var) {
        this.f116449a = i;
        this.f116450b = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jvq0)) {
            return false;
        }
        jvq0 jvq0Var = (jvq0) obj;
        return this.f116449a == jvq0Var.f116449a && wj50.m88271j(this.f116450b, jvq0Var.f116450b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f116449a) * 31;
        d850 d850Var = this.f116450b;
        return iHashCode + (d850Var == null ? 0 : d850Var.hashCode());
    }
}
