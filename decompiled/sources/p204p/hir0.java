package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class hir0 {

    /* JADX INFO: renamed from: a */
    public final boolean f91865a;

    public hir0(boolean z) {
        this.f91865a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hir0) && this.f91865a == ((hir0) obj).f91865a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f91865a) * 31;
    }
}
