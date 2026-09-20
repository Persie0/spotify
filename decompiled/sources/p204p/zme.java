package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class zme {

    /* JADX INFO: renamed from: a */
    public final String f284253a;

    /* JADX INFO: renamed from: b */
    public final String f284254b;

    /* JADX INFO: renamed from: c */
    public final String f284255c;

    /* JADX INFO: renamed from: d */
    public final yme f284256d;

    /* JADX INFO: renamed from: e */
    public final h66 f284257e;

    /* JADX INFO: renamed from: f */
    public final h66 f284258f;

    public zme(String str, String str2, String str3, yme ymeVar, h66 h66Var, h66 h66Var2) {
        this.f284253a = str;
        this.f284254b = str2;
        this.f284255c = str3;
        this.f284256d = ymeVar;
        this.f284257e = h66Var;
        this.f284258f = h66Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zme)) {
            return false;
        }
        zme zmeVar = (zme) obj;
        return wj50.m88271j(this.f284253a, zmeVar.f284253a) && wj50.m88271j(this.f284254b, zmeVar.f284254b) && wj50.m88271j(this.f284255c, zmeVar.f284255c) && this.f284256d == zmeVar.f284256d && wj50.m88271j(this.f284257e, zmeVar.f284257e) && wj50.m88271j(this.f284258f, zmeVar.f284258f);
    }

    public final int hashCode() {
        return this.f284258f.hashCode() + ((this.f284257e.hashCode() + ((this.f284256d.hashCode() + s571.m77243b(s571.m77243b(this.f284253a.hashCode() * 31, 31, this.f284254b), 31, this.f284255c)) * 31)) * 31);
    }
}
