package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class fp4 {

    /* JADX INFO: renamed from: a */
    public final boolean f71727a;

    public fp4(boolean z) {
        this.f71727a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fp4) && this.f71727a == ((fp4) obj).f71727a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f71727a);
    }
}
