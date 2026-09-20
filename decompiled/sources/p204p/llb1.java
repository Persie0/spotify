package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class llb1 {

    /* JADX INFO: renamed from: a */
    public final klb1 f134609a;

    /* JADX INFO: renamed from: b */
    public final hc80 f134610b;

    /* JADX INFO: renamed from: c */
    public final pa9 f134611c;

    /* JADX INFO: renamed from: d */
    public final lt0 f134612d;

    public llb1(klb1 klb1Var, hc80 hc80Var, pa9 pa9Var, lt0 lt0Var) {
        this.f134609a = klb1Var;
        this.f134610b = hc80Var;
        this.f134611c = pa9Var;
        this.f134612d = lt0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof llb1)) {
            return false;
        }
        llb1 llb1Var = (llb1) obj;
        return this.f134609a.equals(llb1Var.f134609a) && wj50.m88271j(this.f134610b, llb1Var.f134610b) && wj50.m88271j(this.f134611c, llb1Var.f134611c) && wj50.m88271j(this.f134612d, llb1Var.f134612d);
    }

    public final int hashCode() {
        int iHashCode = (this.f134610b.hashCode() + ((this.f134609a.hashCode() + ((elb1.f60679a.hashCode() + s571.m77245d(325012899, 31, true)) * 31)) * 31)) * 31;
        pa9 pa9Var = this.f134611c;
        int iHashCode2 = (iHashCode + (pa9Var == null ? 0 : pa9Var.hashCode())) * 31;
        lt0 lt0Var = this.f134612d;
        return iHashCode2 + (lt0Var != null ? lt0Var.hashCode() : 0);
    }
}
