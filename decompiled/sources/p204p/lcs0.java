package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class lcs0 extends ncs0 {

    /* JADX INFO: renamed from: a */
    public final boolean f131985a;

    public lcs0(boolean z) {
        this.f131985a = z;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m58713a() {
        return this.f131985a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lcs0) && this.f131985a == ((lcs0) obj).f131985a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f131985a);
    }
}
