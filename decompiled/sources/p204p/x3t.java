package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class x3t extends izg1 {

    /* JADX INFO: renamed from: b */
    public final boolean f257873b;

    public x3t(boolean z) {
        this.f257873b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x3t) && this.f257873b == ((x3t) obj).f257873b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f257873b);
    }
}
