package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class rui {

    /* JADX INFO: renamed from: a */
    public final String f202859a;

    /* JADX INFO: renamed from: b */
    public final String f202860b;

    public rui(String str, String str2) {
        this.f202859a = str;
        this.f202860b = str2;
    }

    /* JADX INFO: renamed from: a */
    public final String m76451a() {
        return this.f202859a;
    }

    /* JADX INFO: renamed from: b */
    public final String m76452b() {
        return this.f202860b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rui)) {
            return false;
        }
        rui ruiVar = (rui) obj;
        return wj50.m88271j(this.f202859a, ruiVar.f202859a) && wj50.m88271j(this.f202860b, ruiVar.f202860b);
    }

    public final int hashCode() {
        int iHashCode = this.f202859a.hashCode() * 31;
        String str = this.f202860b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
