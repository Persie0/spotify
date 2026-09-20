package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class ufj implements wfj {

    /* JADX INFO: renamed from: a */
    public final xfj f229823a;

    public ufj(xfj xfjVar) {
        this.f229823a = xfjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ufj) && wj50.m88271j(this.f229823a, ((ufj) obj).f229823a);
    }

    public final int hashCode() {
        xfj xfjVar = this.f229823a;
        if (xfjVar == null) {
            return 0;
        }
        return xfjVar.hashCode();
    }
}
