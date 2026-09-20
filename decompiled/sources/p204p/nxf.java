package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class nxf {

    /* JADX INFO: renamed from: a */
    public final ovf f159459a;

    /* JADX INFO: renamed from: b */
    public final int f159460b;

    /* JADX INFO: renamed from: c */
    public final Object f159461c;

    /* JADX INFO: renamed from: d */
    public final Object f159462d;

    public nxf(ovf ovfVar, int i, Object obj, Object obj2) {
        this.f159459a = ovfVar;
        this.f159460b = i;
        this.f159461c = obj;
        this.f159462d = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nxf)) {
            return false;
        }
        nxf nxfVar = (nxf) obj;
        return wj50.m88271j(this.f159459a, nxfVar.f159459a) && this.f159460b == nxfVar.f159460b && wj50.m88271j(this.f159461c, nxfVar.f159461c) && wj50.m88271j(this.f159462d, nxfVar.f159462d);
    }

    public final int hashCode() {
        return this.f159462d.hashCode() + dq60.m36604d(mt60.m62800g(this.f159460b, this.f159459a.hashCode() * 31, 31), 31, this.f159461c);
    }
}
