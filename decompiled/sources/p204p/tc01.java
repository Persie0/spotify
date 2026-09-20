package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class tc01 {

    /* JADX INFO: renamed from: a */
    public final boolean f218979a;

    public tc01(boolean z) {
        this.f218979a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tc01) && this.f218979a == ((tc01) obj).f218979a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f218979a);
    }
}
