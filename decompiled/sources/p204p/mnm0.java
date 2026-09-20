package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class mnm0 extends nlp {

    /* JADX INFO: renamed from: b */
    public final kiz f145446b;

    /* JADX INFO: renamed from: c */
    public final h6p0 f145447c;

    public mnm0(kiz kizVar, h6p0 h6p0Var) {
        super(u6j0.f227373f);
        this.f145446b = kizVar;
        this.f145447c = h6p0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mnm0)) {
            return false;
        }
        mnm0 mnm0Var = (mnm0) obj;
        return this.f145446b.equals(mnm0Var.f145446b) && this.f145447c == mnm0Var.f145447c;
    }

    public final int hashCode() {
        return this.f145447c.hashCode() + (this.f145446b.hashCode() * 31);
    }
}
