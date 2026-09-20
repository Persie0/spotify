package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class vqw0 implements rtr {

    /* JADX INFO: renamed from: a */
    public final ro0 f244013a;

    public vqw0(ro0 ro0Var) {
        this.f244013a = ro0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vqw0) && wj50.m88271j(this.f244013a, ((vqw0) obj).f244013a);
    }

    public final int hashCode() {
        return edb.m38547C(3) + (this.f244013a.hashCode() * 31);
    }
}
