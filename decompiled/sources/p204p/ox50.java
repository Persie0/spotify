package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ox50 {

    /* JADX INFO: renamed from: a */
    public final String f170890a;

    /* JADX INFO: renamed from: b */
    public final String f170891b;

    /* JADX INFO: renamed from: c */
    public final String f170892c;

    public ox50(String str, String str2, String str3) {
        this.f170890a = str;
        this.f170891b = str2;
        this.f170892c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ox50)) {
            return false;
        }
        ox50 ox50Var = (ox50) obj;
        return wj50.m88271j(this.f170890a, ox50Var.f170890a) && wj50.m88271j(this.f170891b, ox50Var.f170891b) && wj50.m88271j(this.f170892c, ox50Var.f170892c);
    }

    public final int hashCode() {
        String str = this.f170890a;
        int iM77243b = s571.m77243b((str == null ? 0 : str.hashCode()) * 31, 31, this.f170891b);
        String str2 = this.f170892c;
        return iM77243b + (str2 != null ? str2.hashCode() : 0);
    }
}
