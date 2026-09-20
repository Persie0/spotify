package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class zjd implements ykd {

    /* JADX INFO: renamed from: a */
    public final boolean f283422a;

    public zjd(boolean z) {
        this.f283422a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zjd) && this.f283422a == ((zjd) obj).f283422a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f283422a);
    }
}
