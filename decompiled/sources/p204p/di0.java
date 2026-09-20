package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class di0 {

    /* JADX INFO: renamed from: a */
    public final String f49194a;

    /* JADX INFO: renamed from: b */
    public final String f49195b;

    /* JADX INFO: renamed from: c */
    public final String f49196c;

    public di0(String str, String str2, String str3) {
        this.f49194a = str;
        this.f49195b = str2;
        this.f49196c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof di0)) {
            return false;
        }
        di0 di0Var = (di0) obj;
        return wj50.m88271j(this.f49194a, di0Var.f49194a) && wj50.m88271j(this.f49195b, di0Var.f49195b) && wj50.m88271j(this.f49196c, di0Var.f49196c);
    }

    public final int hashCode() {
        int iHashCode = this.f49194a.hashCode() * 31;
        String str = this.f49195b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f49196c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
