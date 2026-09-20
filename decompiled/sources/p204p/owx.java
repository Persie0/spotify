package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class owx implements pwx {

    /* JADX INFO: renamed from: a */
    public final wdj f170797a;

    public owx(wdj wdjVar) {
        this.f170797a = wdjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof owx) && this.f170797a.equals(((owx) obj).f170797a);
    }

    public final int hashCode() {
        return this.f170797a.hashCode();
    }
}
