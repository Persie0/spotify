package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class n9t0 implements t9t0 {

    /* JADX INFO: renamed from: a */
    public final boolean f151858a;

    public n9t0(boolean z) {
        this.f151858a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n9t0) && this.f151858a == ((n9t0) obj).f151858a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f151858a);
    }
}
