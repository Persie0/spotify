package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class xce implements zce {

    /* JADX INFO: renamed from: a */
    public final boolean f260211a;

    public xce(boolean z) {
        this.f260211a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xce) && this.f260211a == ((xce) obj).f260211a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f260211a);
    }
}
