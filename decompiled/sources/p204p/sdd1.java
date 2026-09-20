package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class sdd1 extends udd1 {

    /* JADX INFO: renamed from: a */
    public final boolean f207995a;

    public sdd1(boolean z) {
        this.f207995a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sdd1) && this.f207995a == ((sdd1) obj).f207995a;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + s571.m77245d(Boolean.hashCode(this.f207995a) * 31, 31, false);
    }
}
