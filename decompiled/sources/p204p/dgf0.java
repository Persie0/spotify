package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class dgf0 implements egf0 {

    /* JADX INFO: renamed from: a */
    public final eqj0 f48791a;

    public dgf0(eqj0 eqj0Var) {
        this.f48791a = eqj0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dgf0) && this.f48791a == ((dgf0) obj).f48791a;
    }

    public final int hashCode() {
        eqj0 eqj0Var = this.f48791a;
        if (eqj0Var == null) {
            return 0;
        }
        return eqj0Var.hashCode();
    }
}
