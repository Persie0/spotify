package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class rt4 {

    /* JADX INFO: renamed from: a */
    public final boolean f202489a;

    public rt4(boolean z) {
        this.f202489a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rt4) && this.f202489a == ((rt4) obj).f202489a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f202489a);
    }
}
