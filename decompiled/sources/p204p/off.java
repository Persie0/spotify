package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class off extends sff {

    /* JADX INFO: renamed from: a */
    public final boolean f164749a;

    public off(boolean z) {
        this.f164749a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof off) && this.f164749a == ((off) obj).f164749a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f164749a);
    }
}
