package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class pot0 extends vpt0 {

    /* JADX INFO: renamed from: a */
    public final boolean f179784a;

    public pot0(boolean z) {
        this.f179784a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pot0) && this.f179784a == ((pot0) obj).f179784a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f179784a);
    }
}
