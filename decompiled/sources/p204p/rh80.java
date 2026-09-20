package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class rh80 {

    /* JADX INFO: renamed from: a */
    public final boolean f199171a;

    public rh80(boolean z) {
        this.f199171a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rh80) && this.f199171a == ((rh80) obj).f199171a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f199171a);
    }
}
