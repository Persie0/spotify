package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class lgy {

    /* JADX INFO: renamed from: a */
    public final String f133313a;

    /* JADX INFO: renamed from: b */
    public final String f133314b;

    /* JADX INFO: renamed from: c */
    public final scd0 f133315c;

    /* JADX INFO: renamed from: d */
    public final String f133316d;

    /* JADX INFO: renamed from: e */
    public final miz f133317e;

    /* JADX INFO: renamed from: f */
    public final String f133318f;

    /* JADX INFO: renamed from: g */
    public final boolean f133319g;

    /* JADX INFO: renamed from: h */
    public final String f133320h;

    /* JADX INFO: renamed from: i */
    public final String f133321i;

    /* JADX INFO: renamed from: j */
    public final String f133322j;

    public lgy(String str, String str2, scd0 scd0Var, String str3, miz mizVar, String str4, boolean z, String str5, String str6, String str7) {
        this.f133313a = str;
        this.f133314b = str2;
        this.f133315c = scd0Var;
        this.f133316d = str3;
        this.f133317e = mizVar;
        this.f133318f = str4;
        this.f133319g = z;
        this.f133320h = str5;
        this.f133321i = str6;
        this.f133322j = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lgy)) {
            return false;
        }
        lgy lgyVar = (lgy) obj;
        return wj50.m88271j(this.f133313a, lgyVar.f133313a) && wj50.m88271j(this.f133314b, lgyVar.f133314b) && wj50.m88271j(this.f133315c, lgyVar.f133315c) && wj50.m88271j(this.f133316d, lgyVar.f133316d) && wj50.m88271j(this.f133317e, lgyVar.f133317e) && wj50.m88271j(this.f133318f, lgyVar.f133318f) && this.f133319g == lgyVar.f133319g && wj50.m88271j(this.f133320h, lgyVar.f133320h) && wj50.m88271j(this.f133321i, lgyVar.f133321i) && wj50.m88271j(this.f133322j, lgyVar.f133322j);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b((this.f133315c.hashCode() + s571.m77243b(this.f133313a.hashCode() * 31, 31, this.f133314b)) * 31, 31, this.f133316d);
        miz mizVar = this.f133317e;
        return this.f133322j.hashCode() + s571.m77243b(s571.m77243b(s571.m77245d(s571.m77243b((iM77243b + (mizVar == null ? 0 : mizVar.hashCode())) * 31, 31, this.f133318f), 31, this.f133319g), 31, this.f133320h), 31, this.f133321i);
    }
}
