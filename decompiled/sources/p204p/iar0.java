package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class iar0 implements jar0 {

    /* JADX INFO: renamed from: a */
    public final ihb1 f100330a;

    /* JADX INFO: renamed from: b */
    public final kar0 f100331b;

    public iar0(ihb1 ihb1Var, kar0 kar0Var) {
        this.f100330a = ihb1Var;
        this.f100331b = kar0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iar0)) {
            return false;
        }
        iar0 iar0Var = (iar0) obj;
        return wj50.m88271j(this.f100330a, iar0Var.f100330a) && wj50.m88271j(this.f100331b, iar0Var.f100331b);
    }

    public final int hashCode() {
        int iHashCode = this.f100330a.hashCode() * 31;
        kar0 kar0Var = this.f100331b;
        return iHashCode + (kar0Var == null ? 0 : kar0Var.hashCode());
    }
}
