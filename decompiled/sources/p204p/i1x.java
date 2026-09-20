package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class i1x implements k3x {

    /* JADX INFO: renamed from: a */
    public final ae50 f97615a;

    public i1x(ae50 ae50Var) {
        this.f97615a = ae50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i1x) && this.f97615a.equals(((i1x) obj).f97615a);
    }

    public final int hashCode() {
        return this.f97615a.hashCode();
    }
}
