package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class hhl0 implements shl0 {

    /* JADX INFO: renamed from: a */
    public final String f91414a;

    /* JADX INFO: renamed from: b */
    public final f5r f91415b;

    public hhl0(String str, f5r f5rVar) {
        this.f91414a = str;
        this.f91415b = f5rVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hhl0)) {
            return false;
        }
        hhl0 hhl0Var = (hhl0) obj;
        return wj50.m88271j(this.f91414a, hhl0Var.f91414a) && wj50.m88271j(this.f91415b, hhl0Var.f91415b);
    }

    public final int hashCode() {
        return this.f91415b.hashCode() + (this.f91414a.hashCode() * 31);
    }
}
