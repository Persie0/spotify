package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class zmr0 {

    /* JADX INFO: renamed from: a */
    public final boolean f284334a;

    public zmr0(boolean z) {
        this.f284334a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zmr0) && this.f284334a == ((zmr0) obj).f284334a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f284334a);
    }
}
