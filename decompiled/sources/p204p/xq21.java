package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class xq21 {

    /* JADX INFO: renamed from: a */
    public final qe70 f264854a;

    /* JADX INFO: renamed from: b */
    public final w9z f264855b;

    /* JADX WARN: Multi-variable type inference failed */
    public xq21(w9z w9zVar, gh00 gh00Var) {
        this.f264854a = (qe70) gh00Var;
        this.f264855b = w9zVar;
    }

    /* JADX INFO: renamed from: a */
    public final w9z m91809a() {
        return this.f264855b;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [p.gh00, p.qe70] */
    /* JADX INFO: renamed from: b */
    public final gh00 m91810b() {
        return this.f264854a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xq21)) {
            return false;
        }
        xq21 xq21Var = (xq21) obj;
        return this.f264854a.equals(xq21Var.f264854a) && wj50.m88271j(this.f264855b, xq21Var.f264855b);
    }

    public final int hashCode() {
        return this.f264855b.hashCode() + (this.f264854a.hashCode() * 31);
    }

    public final String toString() {
        return "Slide(slideOffset=" + this.f264854a + ", animationSpec=" + this.f264855b + ')';
    }
}
