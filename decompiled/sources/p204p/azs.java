package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class azs {

    /* JADX INFO: renamed from: a */
    public final boolean f21674a;

    public azs(boolean z) {
        this.f21674a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof azs) && this.f21674a == ((azs) obj).f21674a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f21674a);
    }
}
