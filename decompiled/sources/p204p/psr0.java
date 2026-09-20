package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class psr0 extends usr0 {

    /* JADX INFO: renamed from: a */
    public final boolean f180913a;

    public psr0(boolean z) {
        this.f180913a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof psr0) && this.f180913a == ((psr0) obj).f180913a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f180913a);
    }
}
