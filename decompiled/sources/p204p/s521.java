package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class s521 extends a621 {

    /* JADX INFO: renamed from: a */
    public final boolean f205691a;

    public s521(boolean z) {
        this.f205691a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s521) && this.f205691a == ((s521) obj).f205691a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f205691a);
    }
}
