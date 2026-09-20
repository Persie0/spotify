package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class xcs0 {

    /* JADX INFO: renamed from: a */
    public final String f260281a;

    /* JADX INFO: renamed from: b */
    public final String f260282b;

    public xcs0(String str, String str2) {
        this.f260281a = str;
        this.f260282b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xcs0)) {
            return false;
        }
        xcs0 xcs0Var = (xcs0) obj;
        return wj50.m88271j(this.f260281a, xcs0Var.f260281a) && wj50.m88271j(this.f260282b, xcs0Var.f260282b);
    }

    public final int hashCode() {
        String str = this.f260281a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f260282b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
