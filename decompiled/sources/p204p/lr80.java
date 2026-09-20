package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class lr80 implements nr80 {

    /* JADX INFO: renamed from: a */
    public final ndl f136239a;

    public lr80(ndl ndlVar) {
        this.f136239a = ndlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lr80) && this.f136239a.equals(((lr80) obj).f136239a);
    }

    public final int hashCode() {
        return this.f136239a.f152799a.hashCode();
    }
}
