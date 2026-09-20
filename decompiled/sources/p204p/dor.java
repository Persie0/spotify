package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class dor extends uor {

    /* JADX INFO: renamed from: a */
    public final boolean f51105a;

    public dor(boolean z) {
        this.f51105a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dor) && this.f51105a == ((dor) obj).f51105a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f51105a);
    }
}
