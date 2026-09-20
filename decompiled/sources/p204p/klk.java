package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class klk implements nlk {

    /* JADX INFO: renamed from: a */
    public final String f123909a;

    /* JADX INFO: renamed from: b */
    public final String f123910b;

    /* JADX INFO: renamed from: c */
    public final qf40 f123911c;

    /* JADX INFO: renamed from: d */
    public final gkk f123912d;

    /* JADX INFO: renamed from: e */
    public final Integer f123913e;

    /* JADX INFO: renamed from: f */
    public final String f123914f;

    /* JADX INFO: renamed from: g */
    public final boolean f123915g;

    /* JADX INFO: renamed from: h */
    public final n6f f123916h;

    public klk(String str, String str2, qf40 qf40Var, gkk gkkVar, Integer num, String str3, boolean z, n6f n6fVar) {
        this.f123909a = str;
        this.f123910b = str2;
        this.f123911c = qf40Var;
        this.f123912d = gkkVar;
        this.f123913e = num;
        this.f123914f = str3;
        this.f123915g = z;
        this.f123916h = n6fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof klk)) {
            return false;
        }
        klk klkVar = (klk) obj;
        return wj50.m88271j(this.f123909a, klkVar.f123909a) && wj50.m88271j(this.f123910b, klkVar.f123910b) && wj50.m88271j(this.f123911c, klkVar.f123911c) && this.f123912d == klkVar.f123912d && wj50.m88271j(this.f123913e, klkVar.f123913e) && wj50.m88271j(this.f123914f, klkVar.f123914f) && this.f123915g == klkVar.f123915g && wj50.m88271j(this.f123916h, klkVar.f123916h);
    }

    public final int hashCode() {
        int iM42461e = fr0.m42461e(this.f123911c, s571.m77243b(this.f123909a.hashCode() * 31, 31, this.f123910b), 31);
        gkk gkkVar = this.f123912d;
        int iHashCode = (iM42461e + (gkkVar == null ? 0 : gkkVar.hashCode())) * 31;
        Integer num = this.f123913e;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.f123914f;
        int iM77245d = s571.m77245d((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f123915g);
        n6f n6fVar = this.f123916h;
        return iM77245d + (n6fVar != null ? Long.hashCode(n6fVar.f150873a) : 0);
    }
}
