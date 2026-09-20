package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class vhi implements rtr {

    /* JADX INFO: renamed from: a */
    public final ro0 f241525a;

    public vhi(ro0 ro0Var) {
        this.f241525a = ro0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vhi) && wj50.m88271j(this.f241525a, ((vhi) obj).f241525a);
    }

    public final int hashCode() {
        return this.f241525a.hashCode();
    }
}
