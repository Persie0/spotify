package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class y641 {

    /* JADX INFO: renamed from: a */
    public final f2m0 f269690a;

    /* JADX INFO: renamed from: b */
    public final f2m0 f269691b;

    public y641(f2m0 f2m0Var, f2m0 f2m0Var2) {
        this.f269690a = f2m0Var;
        this.f269691b = f2m0Var2;
    }

    /* JADX INFO: renamed from: a */
    public final hc80 m92945a() {
        return this.f269691b;
    }

    /* JADX INFO: renamed from: b */
    public final hc80 m92946b() {
        return this.f269690a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y641)) {
            return false;
        }
        y641 y641Var = (y641) obj;
        return this.f269690a.equals(y641Var.f269690a) && this.f269691b.equals(y641Var.f269691b);
    }

    public final int hashCode() {
        return this.f269691b.hashCode() + (this.f269690a.hashCode() * 31);
    }
}
