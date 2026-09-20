package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class kur {

    /* JADX INFO: renamed from: a */
    public final String f126662a;

    /* JADX INFO: renamed from: b */
    public final String f126663b;

    /* JADX INFO: renamed from: c */
    public final String f126664c;

    public kur(String str, String str2, String str3) {
        this.f126662a = str;
        this.f126663b = str2;
        this.f126664c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kur)) {
            return false;
        }
        kur kurVar = (kur) obj;
        return wj50.m88271j(this.f126662a, kurVar.f126662a) && wj50.m88271j(this.f126663b, kurVar.f126663b) && wj50.m88271j(this.f126664c, kurVar.f126664c);
    }

    public final int hashCode() {
        int iHashCode = this.f126662a.hashCode() * 31;
        String str = this.f126663b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f126664c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
