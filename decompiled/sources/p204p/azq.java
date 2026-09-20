package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class azq implements k0r {

    /* JADX INFO: renamed from: a */
    public final String f21669a;

    /* JADX INFO: renamed from: b */
    public final boolean f21670b;

    public azq(String str, boolean z, int i) {
        str = (i & 1) != 0 ? null : str;
        z = (i & 8) != 0 ? false : z;
        this.f21669a = str;
        this.f21670b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof azq)) {
            return false;
        }
        azq azqVar = (azq) obj;
        return wj50.m88271j(this.f21669a, azqVar.f21669a) && this.f21670b == azqVar.f21670b;
    }

    public final int hashCode() {
        String str = this.f21669a;
        return Boolean.hashCode(this.f21670b) + s571.m77245d((str == null ? 0 : str.hashCode()) * 31, 961, false);
    }
}
