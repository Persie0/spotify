package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class c4t extends izg1 {

    /* JADX INFO: renamed from: b */
    public final boolean f34004b;

    public c4t(boolean z) {
        this.f34004b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c4t) && this.f34004b == ((c4t) obj).f34004b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f34004b);
    }
}
