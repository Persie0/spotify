package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class gmt implements pmt {

    /* JADX INFO: renamed from: a */
    public final String f81473a;

    /* JADX INFO: renamed from: b */
    public final String f81474b;

    /* JADX INFO: renamed from: c */
    public final String f81475c;

    public gmt(String str, String str2, String str3) {
        this.f81473a = str;
        this.f81474b = str2;
        this.f81475c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gmt)) {
            return false;
        }
        gmt gmtVar = (gmt) obj;
        return wj50.m88271j(this.f81473a, gmtVar.f81473a) && wj50.m88271j(this.f81474b, gmtVar.f81474b) && wj50.m88271j(this.f81475c, gmtVar.f81475c);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f81473a.hashCode() * 31, 31, this.f81474b);
        String str = this.f81475c;
        return iM77243b + (str == null ? 0 : str.hashCode());
    }
}
