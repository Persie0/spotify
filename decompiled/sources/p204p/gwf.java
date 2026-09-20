package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class gwf {

    /* JADX INFO: renamed from: a */
    public final boolean f84992a;

    /* JADX INFO: renamed from: b */
    public final boolean f84993b;

    public /* synthetic */ gwf(boolean z, int i) {
        this((i & 1) != 0 ? false : z, true);
    }

    /* JADX INFO: renamed from: a */
    public static gwf m45925a(gwf gwfVar, int i) {
        return new gwf((i & 1) != 0 ? gwfVar.f84992a : true, (i & 2) != 0 ? gwfVar.f84993b : false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gwf)) {
            return false;
        }
        gwf gwfVar = (gwf) obj;
        return this.f84992a == gwfVar.f84992a && this.f84993b == gwfVar.f84993b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f84993b) + (Boolean.hashCode(this.f84992a) * 31);
    }

    public gwf(boolean z, boolean z2) {
        this.f84992a = z;
        this.f84993b = z2;
    }
}
