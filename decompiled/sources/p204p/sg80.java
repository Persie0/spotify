package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class sg80 extends xg80 {

    /* JADX INFO: renamed from: a */
    public final boolean f208768a;

    public sg80(boolean z) {
        this.f208768a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sg80) && this.f208768a == ((sg80) obj).f208768a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f208768a);
    }
}
