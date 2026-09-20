package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class j2y {

    /* JADX INFO: renamed from: a */
    public final boolean f108193a;

    public j2y(boolean z) {
        this.f108193a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j2y) && this.f108193a == ((j2y) obj).f108193a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f108193a);
    }
}
