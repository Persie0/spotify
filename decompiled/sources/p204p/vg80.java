package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class vg80 extends xg80 {

    /* JADX INFO: renamed from: a */
    public final boolean f241179a;

    public vg80(boolean z) {
        this.f241179a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vg80) && this.f241179a == ((vg80) obj).f241179a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f241179a);
    }
}
