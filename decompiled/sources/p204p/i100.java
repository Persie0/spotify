package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class i100 implements k100 {

    /* JADX INFO: renamed from: a */
    public final boolean f97347a;

    public i100(boolean z) {
        this.f97347a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i100) && this.f97347a == ((i100) obj).f97347a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f97347a);
    }
}
