package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class d8w {

    /* JADX INFO: renamed from: a */
    public final String f46540a;

    /* JADX INFO: renamed from: b */
    public final String f46541b;

    /* JADX INFO: renamed from: c */
    public final String f46542c;

    public d8w(String str, String str2, String str3) {
        this.f46540a = str;
        this.f46541b = str2;
        this.f46542c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d8w)) {
            return false;
        }
        d8w d8wVar = (d8w) obj;
        return wj50.m88271j(this.f46540a, d8wVar.f46540a) && wj50.m88271j(this.f46541b, d8wVar.f46541b) && wj50.m88271j(this.f46542c, d8wVar.f46542c);
    }

    public final int hashCode() {
        int iHashCode = this.f46540a.hashCode() * 31;
        String str = this.f46541b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f46542c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
