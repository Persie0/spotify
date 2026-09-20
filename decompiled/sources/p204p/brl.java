package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class brl {

    /* JADX INFO: renamed from: a */
    public final String f30106a;

    /* JADX INFO: renamed from: b */
    public final String f30107b;

    /* JADX INFO: renamed from: c */
    public final String f30108c;

    public brl(String str, String str2, String str3) {
        this.f30106a = str;
        this.f30107b = str2;
        this.f30108c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof brl)) {
            return false;
        }
        brl brlVar = (brl) obj;
        return wj50.m88271j(this.f30106a, brlVar.f30106a) && wj50.m88271j(this.f30107b, brlVar.f30107b) && wj50.m88271j(this.f30108c, brlVar.f30108c);
    }

    public final int hashCode() {
        int iHashCode = this.f30106a.hashCode() * 961;
        String str = this.f30107b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f30108c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
