package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class j0r implements k0r {

    /* JADX INFO: renamed from: a */
    public final boolean f107540a;

    public j0r(boolean z) {
        this.f107540a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j0r) && this.f107540a == ((j0r) obj).f107540a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f107540a);
    }
}
