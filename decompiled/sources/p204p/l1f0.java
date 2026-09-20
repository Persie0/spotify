package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class l1f0 {

    /* JADX INFO: renamed from: a */
    public final boolean f128711a;

    public l1f0(boolean z) {
        this.f128711a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l1f0) && this.f128711a == ((l1f0) obj).f128711a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f128711a);
    }
}
