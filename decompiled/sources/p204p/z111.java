package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class z111 extends d211 {

    /* JADX INFO: renamed from: a */
    public final ri00 f278210a;

    /* JADX INFO: renamed from: b */
    public final c211 f278211b;

    /* JADX INFO: renamed from: c */
    public final d211 f278212c;

    /* JADX WARN: Multi-variable type inference failed */
    public z111(th00 th00Var, c211 c211Var, d211 d211Var) {
        this.f278210a = (ri00) th00Var;
        this.f278211b = c211Var;
        this.f278212c = d211Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z111)) {
            return false;
        }
        z111 z111Var = (z111) obj;
        return this.f278210a.equals(z111Var.f278210a) && this.f278211b.equals(z111Var.f278211b) && this.f278212c.equals(z111Var.f278212c);
    }

    public final int hashCode() {
        return this.f278212c.hashCode() + ((this.f278211b.f33268a.hashCode() + (this.f278210a.hashCode() * 31)) * 31);
    }
}
