package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ifr0 implements jfr0 {

    /* JADX INFO: renamed from: a */
    public final boolean f101813a;

    public ifr0(boolean z) {
        this.f101813a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ifr0) && this.f101813a == ((ifr0) obj).f101813a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f101813a);
    }
}
