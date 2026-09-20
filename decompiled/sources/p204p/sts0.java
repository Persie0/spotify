package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class sts0 {

    /* JADX INFO: renamed from: a */
    public final kts0 f213948a;

    public sts0(kts0 kts0Var) {
        this.f213948a = kts0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sts0) && wj50.m88271j(this.f213948a, ((sts0) obj).f213948a);
    }

    public final int hashCode() {
        kts0 kts0Var = this.f213948a;
        if (kts0Var == null) {
            return 0;
        }
        return kts0Var.hashCode();
    }
}
