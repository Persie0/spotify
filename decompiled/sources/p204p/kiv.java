package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class kiv implements miv {

    /* JADX INFO: renamed from: a */
    public final boolean f123099a;

    public kiv(boolean z) {
        this.f123099a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kiv) && this.f123099a == ((kiv) obj).f123099a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f123099a);
    }
}
