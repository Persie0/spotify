package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class wrs {

    /* JADX INFO: renamed from: a */
    public final String f254410a;

    /* JADX INFO: renamed from: b */
    public final cg9 f254411b;

    /* JADX INFO: renamed from: c */
    public final qf40 f254412c;

    public wrs(String str, cg9 cg9Var, qf40 qf40Var) {
        this.f254410a = str;
        this.f254411b = cg9Var;
        this.f254412c = qf40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wrs)) {
            return false;
        }
        wrs wrsVar = (wrs) obj;
        return wj50.m88271j(this.f254410a, wrsVar.f254410a) && this.f254411b == wrsVar.f254411b && wj50.m88271j(this.f254412c, wrsVar.f254412c);
    }

    public final int hashCode() {
        return this.f254412c.hashCode() + ((this.f254411b.hashCode() + (this.f254410a.hashCode() * 31)) * 31);
    }
}
