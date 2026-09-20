package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class pi3 {

    /* JADX INFO: renamed from: a */
    public final boolean f177822a;

    public pi3(boolean z) {
        this.f177822a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pi3) && this.f177822a == ((pi3) obj).f177822a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f177822a);
    }
}
