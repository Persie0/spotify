package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class zjp {

    /* JADX INFO: renamed from: a */
    public final String f283511a;

    /* JADX INFO: renamed from: b */
    public final String f283512b;

    /* JADX INFO: renamed from: c */
    public final String f283513c;

    public zjp(String str, String str2, String str3) {
        this.f283511a = str;
        this.f283512b = str2;
        this.f283513c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zjp)) {
            return false;
        }
        zjp zjpVar = (zjp) obj;
        return wj50.m88271j(this.f283511a, zjpVar.f283511a) && wj50.m88271j(this.f283512b, zjpVar.f283512b) && wj50.m88271j(this.f283513c, zjpVar.f283513c);
    }

    public final int hashCode() {
        int iHashCode = this.f283511a.hashCode() * 31;
        String str = this.f283512b;
        return this.f283513c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
