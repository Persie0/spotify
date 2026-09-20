package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class i4m extends sjf1 {

    /* JADX INFO: renamed from: e */
    public final ae50 f98543e;

    public i4m(ae50 ae50Var) {
        super(4);
        this.f98543e = ae50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i4m) && this.f98543e.equals(((i4m) obj).f98543e);
    }

    public final int hashCode() {
        return this.f98543e.hashCode();
    }
}
