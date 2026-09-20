package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class jjt implements xmt {

    /* JADX INFO: renamed from: a */
    public final String f113100a;

    /* JADX INFO: renamed from: b */
    public final String f113101b;

    public jjt(String str, String str2) {
        this.f113100a = str;
        this.f113101b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jjt)) {
            return false;
        }
        jjt jjtVar = (jjt) obj;
        if (!wj50.m88271j(this.f113100a, jjtVar.f113100a)) {
            return false;
        }
        String str = jjtVar.f113101b;
        wp6 wp6Var = xgn0.f261341b;
        return wj50.m88271j(this.f113101b, str);
    }

    public final int hashCode() {
        int iHashCode = this.f113100a.hashCode() * 31;
        wp6 wp6Var = xgn0.f261341b;
        return Long.hashCode(10000L) + s571.m77243b(iHashCode, 31, this.f113101b);
    }
}
