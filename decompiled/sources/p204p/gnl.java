package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class gnl implements knl {

    /* JADX INFO: renamed from: a */
    public final String f82730a;

    /* JADX INFO: renamed from: b */
    public final String f82731b;

    /* JADX INFO: renamed from: c */
    public final String f82732c;

    public gnl(String str, String str2, String str3) {
        this.f82730a = str;
        this.f82731b = str2;
        this.f82732c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gnl)) {
            return false;
        }
        gnl gnlVar = (gnl) obj;
        return wj50.m88271j(this.f82730a, gnlVar.f82730a) && wj50.m88271j(this.f82731b, gnlVar.f82731b) && wj50.m88271j(this.f82732c, gnlVar.f82732c);
    }

    public final int hashCode() {
        int iHashCode = this.f82730a.hashCode() * 31;
        String str = this.f82731b;
        return this.f82732c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
