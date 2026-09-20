package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class x9f implements ina0 {

    /* JADX INFO: renamed from: a */
    public final String f259345a;

    /* JADX INFO: renamed from: b */
    public final String f259346b;

    /* JADX INFO: renamed from: c */
    public final String f259347c;

    /* JADX INFO: renamed from: d */
    public final String f259348d;

    /* JADX INFO: renamed from: e */
    public final cna0 f259349e;

    /* JADX INFO: renamed from: f */
    public final cna0 f259350f;

    /* JADX INFO: renamed from: g */
    public final cna0 f259351g;

    /* JADX INFO: renamed from: h */
    public final cna0 f259352h;

    public x9f(String str, String str2, String str3, String str4, cna0 cna0Var, cna0 cna0Var2, cna0 cna0Var3, cna0 cna0Var4) {
        this.f259345a = str;
        this.f259346b = str2;
        this.f259347c = str3;
        this.f259348d = str4;
        this.f259349e = cna0Var;
        this.f259350f = cna0Var2;
        this.f259351g = cna0Var3;
        this.f259352h = cna0Var4;
    }

    @Override // p204p.ina0
    /* JADX INFO: renamed from: a */
    public final String mo28603a() {
        return this.f259345a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x9f)) {
            return false;
        }
        x9f x9fVar = (x9f) obj;
        return wj50.m88271j(this.f259345a, x9fVar.f259345a) && wj50.m88271j(this.f259346b, x9fVar.f259346b) && wj50.m88271j(this.f259347c, x9fVar.f259347c) && wj50.m88271j(this.f259348d, x9fVar.f259348d) && wj50.m88271j(this.f259349e, x9fVar.f259349e) && wj50.m88271j(this.f259350f, x9fVar.f259350f) && wj50.m88271j(this.f259351g, x9fVar.f259351g) && wj50.m88271j(this.f259352h, x9fVar.f259352h);
    }

    public final int hashCode() {
        String str = this.f259345a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f259346b;
        int iHashCode2 = (this.f259349e.hashCode() + s571.m77243b(s571.m77243b((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f259347c), 31, this.f259348d)) * 31;
        cna0 cna0Var = this.f259350f;
        int iHashCode3 = (iHashCode2 + (cna0Var == null ? 0 : cna0Var.hashCode())) * 31;
        cna0 cna0Var2 = this.f259351g;
        int iHashCode4 = (iHashCode3 + (cna0Var2 == null ? 0 : cna0Var2.hashCode())) * 31;
        cna0 cna0Var3 = this.f259352h;
        return iHashCode4 + (cna0Var3 != null ? cna0Var3.hashCode() : 0);
    }
}
