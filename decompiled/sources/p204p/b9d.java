package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class b9d implements lad {

    /* JADX INFO: renamed from: a */
    public final boolean f24838a;

    public b9d(boolean z) {
        this.f24838a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b9d) && this.f24838a == ((b9d) obj).f24838a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f24838a);
    }
}
