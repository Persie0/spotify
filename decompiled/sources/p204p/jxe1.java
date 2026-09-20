package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class jxe1 {

    /* JADX INFO: renamed from: a */
    public final int f117119a;

    /* JADX INFO: renamed from: b */
    public final qsj0 f117120b;

    /* JADX INFO: renamed from: c */
    public final gh00 f117121c;

    public jxe1(int i, qsj0 qsj0Var, gh00 gh00Var) {
        this.f117119a = i;
        this.f117120b = qsj0Var;
        this.f117121c = gh00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jxe1)) {
            return false;
        }
        jxe1 jxe1Var = (jxe1) obj;
        return this.f117119a == jxe1Var.f117119a && wj50.m88271j(this.f117120b, jxe1Var.f117120b) && wj50.m88271j(this.f117121c, jxe1Var.f117121c);
    }

    public final int hashCode() {
        return this.f117121c.hashCode() + ((this.f117120b.hashCode() + (Integer.hashCode(this.f117119a) * 31)) * 31);
    }
}
