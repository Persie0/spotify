package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class bid0 implements iid0 {

    /* JADX INFO: renamed from: a */
    public final boolean f27402a;

    public bid0(boolean z) {
        this.f27402a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bid0) && this.f27402a == ((bid0) obj).f27402a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f27402a);
    }
}
