package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class rd1 implements td1 {

    /* JADX INFO: renamed from: a */
    public final String f198005a;

    /* JADX INFO: renamed from: b */
    public final String f198006b;

    /* JADX INFO: renamed from: c */
    public final String f198007c;

    public rd1(String str, String str2, String str3) {
        this.f198005a = str;
        this.f198006b = str2;
        this.f198007c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rd1)) {
            return false;
        }
        rd1 rd1Var = (rd1) obj;
        return wj50.m88271j(this.f198005a, rd1Var.f198005a) && wj50.m88271j(this.f198006b, rd1Var.f198006b) && wj50.m88271j(this.f198007c, rd1Var.f198007c);
    }

    public final int hashCode() {
        return this.f198007c.hashCode() + s571.m77243b(this.f198005a.hashCode() * 31, 31, this.f198006b);
    }
}
