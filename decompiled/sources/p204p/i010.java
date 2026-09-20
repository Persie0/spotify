package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class i010 implements m010 {

    /* JADX INFO: renamed from: a */
    public final boolean f97089a;

    public i010(boolean z) {
        this.f97089a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i010) && this.f97089a == ((i010) obj).f97089a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f97089a);
    }
}
