package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class d591 implements e591 {

    /* JADX INFO: renamed from: a */
    public final String f45372a;

    /* JADX INFO: renamed from: b */
    public final String f45373b;

    public d591(String str, String str2) {
        this.f45372a = str;
        this.f45373b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d591)) {
            return false;
        }
        d591 d591Var = (d591) obj;
        return wj50.m88271j(this.f45372a, d591Var.f45372a) && wj50.m88271j(this.f45373b, d591Var.f45373b);
    }

    public final int hashCode() {
        int iHashCode = this.f45372a.hashCode() * 31;
        String str = this.f45373b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
