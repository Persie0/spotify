package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class cvz implements dvz {

    /* JADX INFO: renamed from: a */
    public final boolean f42581a;

    public cvz(boolean z) {
        this.f42581a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cvz) && this.f42581a == ((cvz) obj).f42581a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f42581a);
    }
}
