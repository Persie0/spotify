package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class h6e1 implements l6e1 {

    /* JADX INFO: renamed from: a */
    public final x3p0 f88077a;

    /* JADX INFO: renamed from: b */
    public final ie81 f88078b;

    public h6e1(x3p0 x3p0Var, ie81 ie81Var) {
        this.f88077a = x3p0Var;
        this.f88078b = ie81Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h6e1)) {
            return false;
        }
        h6e1 h6e1Var = (h6e1) obj;
        return wj50.m88271j(this.f88077a, h6e1Var.f88077a) && wj50.m88271j(this.f88078b, h6e1Var.f88078b);
    }

    public final int hashCode() {
        return this.f88078b.hashCode() + (this.f88077a.hashCode() * 31);
    }
}
