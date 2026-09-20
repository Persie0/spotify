package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class p83 extends t83 {

    /* JADX INFO: renamed from: a */
    public final String f174849a;

    /* JADX INFO: renamed from: b */
    public final String f174850b;

    public p83(String str, String str2) {
        this.f174849a = str;
        this.f174850b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p83)) {
            return false;
        }
        p83 p83Var = (p83) obj;
        return wj50.m88271j(this.f174849a, p83Var.f174849a) && wj50.m88271j(this.f174850b, p83Var.f174850b);
    }

    public final int hashCode() {
        int iHashCode = this.f174849a.hashCode() * 31;
        String str = this.f174850b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
