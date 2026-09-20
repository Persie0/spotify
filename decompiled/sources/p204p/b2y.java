package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class b2y {

    /* JADX INFO: renamed from: a */
    public final boolean f22738a;

    /* JADX INFO: renamed from: b */
    public final boolean f22739b;

    public b2y(boolean z, boolean z2) {
        this.f22738a = z;
        this.f22739b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b2y)) {
            return false;
        }
        b2y b2yVar = (b2y) obj;
        return this.f22738a == b2yVar.f22738a && this.f22739b == b2yVar.f22739b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f22739b) + (Boolean.hashCode(this.f22738a) * 31);
    }
}
