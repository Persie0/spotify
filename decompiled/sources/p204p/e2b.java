package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class e2b implements g2b {

    /* JADX INFO: renamed from: a */
    public final ndl f55417a;

    public e2b(ndl ndlVar) {
        this.f55417a = ndlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e2b) && this.f55417a.equals(((e2b) obj).f55417a);
    }

    public final int hashCode() {
        return this.f55417a.f152799a.hashCode();
    }
}
