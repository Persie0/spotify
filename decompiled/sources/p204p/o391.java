package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class o391 {

    /* JADX INFO: renamed from: a */
    public final String f161328a;

    /* JADX INFO: renamed from: b */
    public final String f161329b;

    public o391(String str, String str2) {
        this.f161328a = str;
        this.f161329b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o391)) {
            return false;
        }
        o391 o391Var = (o391) obj;
        return wj50.m88271j(this.f161328a, o391Var.f161328a) && wj50.m88271j(this.f161329b, o391Var.f161329b);
    }

    public final int hashCode() {
        String str = this.f161328a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f161329b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
