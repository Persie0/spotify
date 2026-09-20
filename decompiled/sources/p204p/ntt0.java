package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class ntt0 {

    /* JADX INFO: renamed from: a */
    public final zke0 f158148a;

    /* JADX INFO: renamed from: b */
    public final qe70 f158149b;

    /* JADX WARN: Multi-variable type inference failed */
    public ntt0(zke0 zke0Var, gh00 gh00Var) {
        this.f158148a = zke0Var;
        this.f158149b = (qe70) gh00Var;
    }

    /* JADX INFO: renamed from: a */
    public final zke0 m65639a() {
        return this.f158148a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ntt0)) {
            return false;
        }
        ntt0 ntt0Var = (ntt0) obj;
        return this.f158148a.equals(ntt0Var.f158148a) && this.f158149b.equals(ntt0Var.f158149b);
    }

    public final int hashCode() {
        return this.f158149b.hashCode() + (this.f158148a.hashCode() * 31);
    }
}
