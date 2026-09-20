package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class ymr extends pnr {

    /* JADX INFO: renamed from: a */
    public final boolean f274321a;

    public ymr(boolean z) {
        this.f274321a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ymr) && this.f274321a == ((ymr) obj).f274321a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f274321a);
    }
}
