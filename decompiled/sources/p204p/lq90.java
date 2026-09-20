package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class lq90 extends sq90 {

    /* JADX INFO: renamed from: a */
    public final boolean f135990a;

    public lq90(boolean z) {
        this.f135990a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lq90) && this.f135990a == ((lq90) obj).f135990a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f135990a);
    }
}
