package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class j100 implements k100 {

    /* JADX INFO: renamed from: a */
    public final boolean f107583a;

    public j100(boolean z) {
        this.f107583a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j100) && this.f107583a == ((j100) obj).f107583a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f107583a);
    }
}
