package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class z9e0 extends gae0 {

    /* JADX INFO: renamed from: a */
    public final boolean f280757a;

    public z9e0(boolean z) {
        this.f280757a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z9e0) && this.f280757a == ((z9e0) obj).f280757a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f280757a);
    }
}
