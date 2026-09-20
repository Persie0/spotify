package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class x9k0 extends y9k0 {

    /* JADX INFO: renamed from: a */
    public final boolean f259394a;

    public x9k0(boolean z) {
        this.f259394a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x9k0) && this.f259394a == ((x9k0) obj).f259394a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f259394a);
    }
}
