package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class a94 {

    /* JADX INFO: renamed from: a */
    public final boolean f13463a;

    public a94(boolean z) {
        this.f13463a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a94) && this.f13463a == ((a94) obj).f13463a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f13463a);
    }
}
