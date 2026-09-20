package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class vt41 extends zu41 {

    /* JADX INFO: renamed from: a */
    public final String f244554a;

    /* JADX INFO: renamed from: b */
    public final un20 f244555b;

    public vt41(String str, un20 un20Var) {
        this.f244554a = str;
        this.f244555b = un20Var;
    }

    @Override // p204p.zu41
    /* JADX INFO: renamed from: a */
    public final un20 mo54269a() {
        return this.f244555b;
    }

    @Override // p204p.zu41
    /* JADX INFO: renamed from: b */
    public final String mo54270b() {
        return this.f244554a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vt41)) {
            return false;
        }
        vt41 vt41Var = (vt41) obj;
        return wj50.m88271j(this.f244554a, vt41Var.f244554a) && wj50.m88271j(this.f244555b, vt41Var.f244555b);
    }

    public final int hashCode() {
        int iHashCode = this.f244554a.hashCode() * 31;
        un20 un20Var = this.f244555b;
        return iHashCode + (un20Var == null ? 0 : un20Var.hashCode());
    }
}
