package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ksr0 extends usr0 {

    /* JADX INFO: renamed from: a */
    public final boolean f125999a;

    public ksr0(boolean z) {
        this.f125999a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ksr0) && this.f125999a == ((ksr0) obj).f125999a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f125999a);
    }
}
