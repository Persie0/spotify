package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class stc0 implements huc0 {

    /* JADX INFO: renamed from: a */
    public final boolean f213885a;

    public stc0(boolean z) {
        this.f213885a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof stc0) && this.f213885a == ((stc0) obj).f213885a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f213885a);
    }
}
