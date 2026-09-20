package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class d9k0 extends e9k0 {

    /* JADX INFO: renamed from: a */
    public final boolean f46850a;

    public d9k0(boolean z) {
        this.f46850a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d9k0) && this.f46850a == ((d9k0) obj).f46850a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f46850a);
    }
}
