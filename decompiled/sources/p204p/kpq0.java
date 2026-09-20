package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class kpq0 implements lpq0 {

    /* JADX INFO: renamed from: a */
    public final boolean f125109a;

    public kpq0(boolean z) {
        this.f125109a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kpq0) && this.f125109a == ((kpq0) obj).f125109a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f125109a);
    }
}
