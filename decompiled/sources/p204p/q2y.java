package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class q2y {

    /* JADX INFO: renamed from: a */
    public final boolean f184725a;

    public q2y(boolean z) {
        this.f184725a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q2y) && this.f184725a == ((q2y) obj).f184725a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f184725a);
    }
}
