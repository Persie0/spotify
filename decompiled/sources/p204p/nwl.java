package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class nwl extends xwl {

    /* JADX INFO: renamed from: a */
    public final nx2 f159234a;

    public nwl(nx2 nx2Var) {
        this.f159234a = nx2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nwl) && wj50.m88271j(this.f159234a, ((nwl) obj).f159234a);
    }

    public final int hashCode() {
        return this.f159234a.hashCode();
    }
}
