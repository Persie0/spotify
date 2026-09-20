package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class jf6 implements of6 {

    /* JADX INFO: renamed from: a */
    public final AbstractC1961i f111828a;

    /* JADX INFO: renamed from: b */
    public final d850 f111829b;

    public jf6(AbstractC1961i abstractC1961i, d850 d850Var) {
        this.f111828a = abstractC1961i;
        this.f111829b = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jf6)) {
            return false;
        }
        jf6 jf6Var = (jf6) obj;
        return wj50.m88271j(this.f111828a, jf6Var.f111828a) && wj50.m88271j(this.f111829b, jf6Var.f111829b);
    }

    public final int hashCode() {
        return this.f111829b.hashCode() + (this.f111828a.hashCode() * 31);
    }
}
