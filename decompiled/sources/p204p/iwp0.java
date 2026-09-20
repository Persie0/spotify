package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class iwp0 {

    /* JADX INFO: renamed from: a */
    public final boolean f106491a;

    public iwp0(boolean z) {
        this.f106491a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iwp0) && this.f106491a == ((iwp0) obj).f106491a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f106491a);
    }
}
