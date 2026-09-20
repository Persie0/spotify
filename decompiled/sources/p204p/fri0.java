package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class fri0 {

    /* JADX INFO: renamed from: a */
    public final boolean f72489a;

    public fri0(boolean z) {
        this.f72489a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fri0) && this.f72489a == ((fri0) obj).f72489a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f72489a);
    }
}
