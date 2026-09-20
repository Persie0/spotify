package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class uol {

    /* JADX INFO: renamed from: a */
    public final String f232484a;

    /* JADX INFO: renamed from: b */
    public final qol f232485b;

    /* JADX INFO: renamed from: c */
    public final sol f232486c;

    public uol(String str, qol qolVar, sol solVar) {
        this.f232484a = str;
        this.f232485b = qolVar;
        this.f232486c = solVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uol)) {
            return false;
        }
        uol uolVar = (uol) obj;
        return wj50.m88271j(this.f232484a, uolVar.f232484a) && wj50.m88271j(this.f232485b, uolVar.f232485b) && wj50.m88271j(this.f232486c, uolVar.f232486c);
    }

    public final int hashCode() {
        String str = this.f232484a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        qol qolVar = this.f232485b;
        int iHashCode2 = (iHashCode + (qolVar == null ? 0 : qolVar.hashCode())) * 31;
        sol solVar = this.f232486c;
        return iHashCode2 + (solVar != null ? solVar.hashCode() : 0);
    }
}
