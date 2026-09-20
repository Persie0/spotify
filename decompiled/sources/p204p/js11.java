package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class js11 {

    /* JADX INFO: renamed from: a */
    public final String f115360a;

    /* JADX INFO: renamed from: b */
    public final String f115361b;

    /* JADX INFO: renamed from: c */
    public final String f115362c;

    public js11(String str, String str2, String str3) {
        this.f115360a = str;
        this.f115361b = str2;
        this.f115362c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof js11)) {
            return false;
        }
        js11 js11Var = (js11) obj;
        return wj50.m88271j(this.f115360a, js11Var.f115360a) && wj50.m88271j(this.f115361b, js11Var.f115361b) && wj50.m88271j(this.f115362c, js11Var.f115362c);
    }

    public final int hashCode() {
        int iHashCode = this.f115360a.hashCode() * 31;
        String str = this.f115361b;
        return this.f115362c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
