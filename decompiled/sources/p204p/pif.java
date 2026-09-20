package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class pif {

    /* JADX INFO: renamed from: a */
    public final qf40 f177930a;

    /* JADX INFO: renamed from: b */
    public final String f177931b;

    public pif(String str, qf40 qf40Var) {
        this.f177930a = qf40Var;
        this.f177931b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pif)) {
            return false;
        }
        pif pifVar = (pif) obj;
        return wj50.m88271j(this.f177930a, pifVar.f177930a) && wj50.m88271j(this.f177931b, pifVar.f177931b);
    }

    public final int hashCode() {
        int iHashCode = this.f177930a.hashCode() * 31;
        String str = this.f177931b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
