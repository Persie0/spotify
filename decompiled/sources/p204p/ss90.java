package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class ss90 implements ktx {

    /* JADX INFO: renamed from: a */
    public final ps90 f213548a;

    /* JADX INFO: renamed from: b */
    public final os90 f213549b;

    public ss90(ps90 ps90Var, os90 os90Var) {
        this.f213548a = ps90Var;
        this.f213549b = os90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ss90)) {
            return false;
        }
        ss90 ss90Var = (ss90) obj;
        return wj50.m88271j(this.f213548a, ss90Var.f213548a) && wj50.m88271j(this.f213549b, ss90Var.f213549b);
    }

    public final int hashCode() {
        ps90 ps90Var = this.f213548a;
        int iHashCode = (ps90Var == null ? 0 : ps90Var.hashCode()) * 31;
        os90 os90Var = this.f213549b;
        return iHashCode + (os90Var != null ? os90Var.hashCode() : 0);
    }
}
