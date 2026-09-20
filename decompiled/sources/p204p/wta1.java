package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class wta1 {

    /* JADX INFO: renamed from: a */
    public final rta1 f254902a;

    /* JADX INFO: renamed from: b */
    public final vta1 f254903b;

    public wta1(rta1 rta1Var, vta1 vta1Var) {
        this.f254902a = rta1Var;
        this.f254903b = vta1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wta1)) {
            return false;
        }
        wta1 wta1Var = (wta1) obj;
        return wj50.m88271j(this.f254902a, wta1Var.f254902a) && wj50.m88271j(this.f254903b, wta1Var.f254903b);
    }

    public final int hashCode() {
        return this.f254903b.hashCode() + (this.f254902a.hashCode() * 31);
    }
}
