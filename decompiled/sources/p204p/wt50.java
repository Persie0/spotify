package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class wt50 {

    /* JADX INFO: renamed from: a */
    public final String f254855a;

    /* JADX INFO: renamed from: b */
    public final vxf f254856b;

    public wt50(String str, vxf vxfVar) {
        this.f254855a = str;
        this.f254856b = vxfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wt50)) {
            return false;
        }
        wt50 wt50Var = (wt50) obj;
        return wj50.m88271j(this.f254855a, wt50Var.f254855a) && wj50.m88271j(this.f254856b, wt50Var.f254856b);
    }

    public final int hashCode() {
        return this.f254856b.hashCode() + (this.f254855a.hashCode() * 31);
    }
}
