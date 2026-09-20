package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class zmr extends pnr {

    /* JADX INFO: renamed from: a */
    public final boolean f284333a;

    public zmr(boolean z) {
        this.f284333a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zmr) && this.f284333a == ((zmr) obj).f284333a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f284333a);
    }
}
