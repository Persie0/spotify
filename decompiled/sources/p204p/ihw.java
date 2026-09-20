package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class ihw {

    /* JADX INFO: renamed from: a */
    public final boolean f102373a;

    public ihw(boolean z) {
        this.f102373a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ihw) && this.f102373a == ((ihw) obj).f102373a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f102373a);
    }
}
