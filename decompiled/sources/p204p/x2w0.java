package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class x2w0 {

    /* JADX INFO: renamed from: a */
    public final b3w0 f257589a;

    /* JADX INFO: renamed from: b */
    public final nhl f257590b;

    /* JADX INFO: renamed from: c */
    public final v72 f257591c;

    public x2w0(b3w0 b3w0Var, nhl nhlVar, v72 v72Var) {
        this.f257589a = b3w0Var;
        this.f257590b = nhlVar;
        this.f257591c = v72Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x2w0)) {
            return false;
        }
        x2w0 x2w0Var = (x2w0) obj;
        return wj50.m88271j(this.f257589a, x2w0Var.f257589a) && wj50.m88271j(this.f257590b, x2w0Var.f257590b) && wj50.m88271j(this.f257591c, x2w0Var.f257591c);
    }

    public final int hashCode() {
        b3w0 b3w0Var = this.f257589a;
        int iHashCode = (this.f257590b.hashCode() + ((b3w0Var == null ? 0 : b3w0Var.hashCode()) * 31)) * 31;
        v72 v72Var = this.f257591c;
        return iHashCode + (v72Var != null ? v72Var.hashCode() : 0);
    }
}
