package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class fiv implements giv {

    /* JADX INFO: renamed from: a */
    public final Float f69995a;

    public fiv(Float f) {
        this.f69995a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fiv) && wj50.m88271j(this.f69995a, ((fiv) obj).f69995a);
    }

    public final int hashCode() {
        Float f = this.f69995a;
        if (f == null) {
            return 0;
        }
        return f.hashCode();
    }
}
