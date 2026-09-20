package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class abj0 {

    /* JADX INFO: renamed from: a */
    public final boolean f14135a;

    public abj0(boolean z) {
        this.f14135a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof abj0) && this.f14135a == ((abj0) obj).f14135a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f14135a);
    }
}
