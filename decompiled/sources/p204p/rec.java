package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class rec {

    /* JADX INFO: renamed from: a */
    public final String f198337a;

    /* JADX INFO: renamed from: b */
    public final String f198338b;

    /* JADX INFO: renamed from: c */
    public final int f198339c;

    /* JADX INFO: renamed from: d */
    public final String f198340d;

    /* JADX INFO: renamed from: e */
    public final oec f198341e;

    public rec(String str, String str2, int i, String str3, oec oecVar) {
        this.f198337a = str;
        this.f198338b = str2;
        this.f198339c = i;
        this.f198340d = str3;
        this.f198341e = oecVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rec)) {
            return false;
        }
        rec recVar = (rec) obj;
        return wj50.m88271j(this.f198337a, recVar.f198337a) && wj50.m88271j(this.f198338b, recVar.f198338b) && this.f198339c == recVar.f198339c && wj50.m88271j(this.f198340d, recVar.f198340d) && wj50.m88271j(this.f198341e, recVar.f198341e);
    }

    public final int hashCode() {
        int iM40938f = f710.m40938f(this.f198339c, s571.m77243b(this.f198337a.hashCode() * 31, 31, this.f198338b), 31);
        String str = this.f198340d;
        int iHashCode = (iM40938f + (str == null ? 0 : str.hashCode())) * 31;
        oec oecVar = this.f198341e;
        return iHashCode + (oecVar != null ? oecVar.hashCode() : 0);
    }
}
