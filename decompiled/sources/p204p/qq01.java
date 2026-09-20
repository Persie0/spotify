package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class qq01 implements sq01 {

    /* JADX INFO: renamed from: a */
    public final String f191412a;

    /* JADX INFO: renamed from: b */
    public final String f191413b;

    /* JADX INFO: renamed from: c */
    public final String f191414c;

    public qq01(String str, String str2, String str3) {
        this.f191412a = str;
        this.f191413b = str2;
        this.f191414c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qq01)) {
            return false;
        }
        qq01 qq01Var = (qq01) obj;
        return wj50.m88271j(this.f191412a, qq01Var.f191412a) && wj50.m88271j(this.f191413b, qq01Var.f191413b) && this.f191414c.equals(qq01Var.f191414c);
    }

    @Override // p204p.sq01
    public final boolean getEnabled() {
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + s571.m77243b(s571.m77243b(this.f191412a.hashCode() * 31, 31, this.f191413b), 31, this.f191414c);
    }
}
