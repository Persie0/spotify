package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class f50 {

    /* JADX INFO: renamed from: a */
    public final String f65875a;

    /* JADX INFO: renamed from: b */
    public final String f65876b;

    /* JADX INFO: renamed from: c */
    public final boolean f65877c;

    /* JADX INFO: renamed from: d */
    public final String f65878d;

    /* JADX INFO: renamed from: e */
    public final boolean f65879e;

    /* JADX INFO: renamed from: f */
    public final oub f65880f;

    public f50(String str, String str2, oub oubVar, int i) {
        String str3 = (i & 2) != 0 ? null : "1";
        boolean z = (i & 4) == 0;
        boolean z2 = (i & 16) == 0;
        oubVar = (i & 32) != 0 ? null : oubVar;
        this.f65875a = str;
        this.f65876b = str3;
        this.f65877c = z;
        this.f65878d = str2;
        this.f65879e = z2;
        this.f65880f = oubVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f50)) {
            return false;
        }
        f50 f50Var = (f50) obj;
        return wj50.m88271j(this.f65875a, f50Var.f65875a) && wj50.m88271j(this.f65876b, f50Var.f65876b) && this.f65877c == f50Var.f65877c && wj50.m88271j(this.f65878d, f50Var.f65878d) && this.f65879e == f50Var.f65879e && this.f65880f == f50Var.f65880f;
    }

    public final int hashCode() {
        String str = this.f65875a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f65876b;
        int iM77245d = s571.m77245d(s571.m77243b(s571.m77245d((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f65877c), 31, this.f65878d), 31, this.f65879e);
        oub oubVar = this.f65880f;
        return (iM77245d + (oubVar != null ? oubVar.hashCode() : 0)) * 31;
    }
}
