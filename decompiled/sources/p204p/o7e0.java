package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class o7e0 {

    /* JADX INFO: renamed from: a */
    public final String f162519a;

    /* JADX INFO: renamed from: b */
    public final String f162520b;

    /* JADX INFO: renamed from: c */
    public final String f162521c;

    /* JADX INFO: renamed from: d */
    public final String f162522d;

    /* JADX INFO: renamed from: e */
    public final String f162523e;

    /* JADX INFO: renamed from: f */
    public final f5u f162524f;

    public o7e0(String str, String str2, String str3, String str4, String str5, f5u f5uVar) {
        this.f162519a = str;
        this.f162520b = str2;
        this.f162521c = str3;
        this.f162522d = str4;
        this.f162523e = str5;
        this.f162524f = f5uVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o7e0)) {
            return false;
        }
        o7e0 o7e0Var = (o7e0) obj;
        return wj50.m88271j(this.f162519a, o7e0Var.f162519a) && wj50.m88271j(this.f162520b, o7e0Var.f162520b) && wj50.m88271j(this.f162521c, o7e0Var.f162521c) && wj50.m88271j(this.f162522d, o7e0Var.f162522d) && wj50.m88271j(this.f162523e, o7e0Var.f162523e) && wj50.m88271j(this.f162524f, o7e0Var.f162524f);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(s571.m77243b(this.f162519a.hashCode() * 31, 31, this.f162520b), 31, this.f162521c), 31, this.f162522d);
        String str = this.f162523e;
        int iHashCode = (iM77243b + (str == null ? 0 : str.hashCode())) * 31;
        f5u f5uVar = this.f162524f;
        return iHashCode + (f5uVar != null ? f5uVar.hashCode() : 0);
    }
}
