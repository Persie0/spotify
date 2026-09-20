package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class hzp0 {

    /* JADX INFO: renamed from: a */
    public final boolean f96994a;

    public hzp0(boolean z) {
        this.f96994a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hzp0) && this.f96994a == ((hzp0) obj).f96994a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f96994a);
    }
}
