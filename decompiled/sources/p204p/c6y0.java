package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class c6y0 extends l6y0 {

    /* JADX INFO: renamed from: a */
    public final boolean f34645a;

    public c6y0(boolean z) {
        this.f34645a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c6y0) && this.f34645a == ((c6y0) obj).f34645a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f34645a);
    }
}
