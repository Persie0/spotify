package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class nnr extends pnr {

    /* JADX INFO: renamed from: a */
    public final boolean f156475a;

    public nnr(boolean z) {
        this.f156475a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nnr) && this.f156475a == ((nnr) obj).f156475a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f156475a);
    }
}
