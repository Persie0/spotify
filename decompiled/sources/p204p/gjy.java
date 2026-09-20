package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class gjy {

    /* JADX INFO: renamed from: a */
    public final boolean f80649a;

    public gjy(boolean z) {
        this.f80649a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gjy) && this.f80649a == ((gjy) obj).f80649a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f80649a);
    }
}
