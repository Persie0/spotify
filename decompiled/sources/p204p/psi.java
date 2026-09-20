package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class psi implements rsi {

    /* JADX INFO: renamed from: a */
    public final yx61 f180866a;

    public psi(yx61 yx61Var) {
        this.f180866a = yx61Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof psi) && this.f180866a == ((psi) obj).f180866a;
    }

    public final int hashCode() {
        yx61 yx61Var = this.f180866a;
        if (yx61Var == null) {
            return 0;
        }
        return yx61Var.hashCode();
    }
}
