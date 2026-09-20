package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class t1y {

    /* JADX INFO: renamed from: a */
    public final boolean f216380a;

    public t1y(boolean z) {
        this.f216380a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t1y) && this.f216380a == ((t1y) obj).f216380a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f216380a);
    }
}
