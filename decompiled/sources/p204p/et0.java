package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class et0 {

    /* JADX INFO: renamed from: a */
    public final yzo0 f62535a;

    /* JADX INFO: renamed from: b */
    public final noo0 f62536b;

    /* JADX INFO: renamed from: c */
    public final ujx f62537c;

    public et0(yzo0 yzo0Var, noo0 noo0Var, ujx ujxVar) {
        this.f62535a = yzo0Var;
        this.f62536b = noo0Var;
        this.f62537c = ujxVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof et0)) {
            return false;
        }
        et0 et0Var = (et0) obj;
        return wj50.m88271j(this.f62535a, et0Var.f62535a) && wj50.m88271j(this.f62536b, et0Var.f62536b) && wj50.m88271j(this.f62537c, et0Var.f62537c);
    }

    public final int hashCode() {
        return this.f62537c.hashCode() + ((this.f62536b.hashCode() + (this.f62535a.hashCode() * 31)) * 31);
    }
}
