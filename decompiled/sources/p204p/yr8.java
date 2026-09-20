package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class yr8 {

    /* JADX INFO: renamed from: a */
    public final boolean f275421a;

    public yr8(boolean z) {
        this.f275421a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yr8) && this.f275421a == ((yr8) obj).f275421a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f275421a);
    }
}
