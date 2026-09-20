package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class bx81 implements ex81 {

    /* JADX INFO: renamed from: a */
    public final m140 f31803a;

    /* JADX INFO: renamed from: b */
    public final d6w0 f31804b;

    public bx81(m140 m140Var, d6w0 d6w0Var) {
        this.f31803a = m140Var;
        this.f31804b = d6w0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bx81)) {
            return false;
        }
        bx81 bx81Var = (bx81) obj;
        return wj50.m88271j(this.f31803a, bx81Var.f31803a) && wj50.m88271j(this.f31804b, bx81Var.f31804b);
    }

    public final int hashCode() {
        m140 m140Var = this.f31803a;
        return this.f31804b.hashCode() + ((m140Var == null ? 0 : m140Var.hashCode()) * 31);
    }
}
