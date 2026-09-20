package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class bnr extends pnr {

    /* JADX INFO: renamed from: a */
    public final boolean f28916a;

    public bnr(boolean z) {
        this.f28916a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bnr) && this.f28916a == ((bnr) obj).f28916a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f28916a);
    }
}
