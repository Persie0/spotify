package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class tac0 {

    /* JADX INFO: renamed from: a */
    public final boolean f218538a;

    /* JADX INFO: renamed from: b */
    public final eg7 f218539b;

    public tac0(boolean z, eg7 eg7Var) {
        this.f218538a = z;
        this.f218539b = eg7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tac0)) {
            return false;
        }
        tac0 tac0Var = (tac0) obj;
        return this.f218538a == tac0Var.f218538a && wj50.m88271j(this.f218539b, tac0Var.f218539b);
    }

    public final int hashCode() {
        return this.f218539b.hashCode() + (Boolean.hashCode(this.f218538a) * 31);
    }
}
