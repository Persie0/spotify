package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class asf implements dsf {

    /* JADX INFO: renamed from: a */
    public final String f19411a;

    /* JADX INFO: renamed from: b */
    public final String f19412b;

    public asf(String str, String str2) {
        this.f19411a = str;
        this.f19412b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof asf)) {
            return false;
        }
        asf asfVar = (asf) obj;
        return wj50.m88271j(this.f19411a, asfVar.f19411a) && wj50.m88271j(this.f19412b, asfVar.f19412b);
    }

    public final int hashCode() {
        int iHashCode = this.f19411a.hashCode() * 31;
        String str = this.f19412b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
