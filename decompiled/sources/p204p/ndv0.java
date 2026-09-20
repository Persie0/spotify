package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ndv0 implements udv0 {

    /* JADX INFO: renamed from: a */
    public final boolean f152848a;

    public ndv0(boolean z) {
        this.f152848a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ndv0) && this.f152848a == ((ndv0) obj).f152848a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f152848a);
    }
}
