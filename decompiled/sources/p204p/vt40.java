package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class vt40 {

    /* JADX INFO: renamed from: a */
    public final String f244548a;

    /* JADX INFO: renamed from: b */
    public final String f244549b;

    /* JADX INFO: renamed from: c */
    public final String f244550c;

    /* JADX INFO: renamed from: d */
    public final String f244551d;

    /* JADX INFO: renamed from: e */
    public final edc1 f244552e;

    /* JADX INFO: renamed from: f */
    public final String f244553f;

    public vt40(String str, String str2, String str3, String str4, edc1 edc1Var, String str5) {
        this.f244548a = str;
        this.f244549b = str2;
        this.f244550c = str3;
        this.f244551d = str4;
        this.f244552e = edc1Var;
        this.f244553f = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vt40)) {
            return false;
        }
        vt40 vt40Var = (vt40) obj;
        return wj50.m88271j(this.f244548a, vt40Var.f244548a) && wj50.m88271j(this.f244549b, vt40Var.f244549b) && wj50.m88271j(this.f244550c, vt40Var.f244550c) && wj50.m88271j(this.f244551d, vt40Var.f244551d) && wj50.m88271j(this.f244552e, vt40Var.f244552e) && wj50.m88271j(this.f244553f, vt40Var.f244553f);
    }

    public final int hashCode() {
        return this.f244553f.hashCode() + ((this.f244552e.hashCode() + s571.m77243b(s571.m77243b(s571.m77243b(this.f244548a.hashCode() * 31, 31, this.f244549b), 31, this.f244550c), 31, this.f244551d)) * 31);
    }
}
