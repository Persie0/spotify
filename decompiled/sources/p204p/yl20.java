package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class yl20 {

    /* JADX INFO: renamed from: a */
    public final Object f273882a;

    /* JADX INFO: renamed from: b */
    public final AbstractC1806e9 f273883b;

    public yl20(eh00 eh00Var, AbstractC1806e9 abstractC1806e9) {
        this.f273882a = eh00Var;
        this.f273883b = abstractC1806e9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yl20)) {
            return false;
        }
        yl20 yl20Var = (yl20) obj;
        return this.f273882a.equals(yl20Var.f273882a) && this.f273883b.equals(yl20Var.f273883b);
    }

    public final int hashCode() {
        return this.f273883b.hashCode() + (this.f273882a.hashCode() * 31);
    }
}
