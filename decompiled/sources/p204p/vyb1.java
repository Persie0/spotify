package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class vyb1 {

    /* JADX INFO: renamed from: a */
    public final daj f246037a;

    /* JADX INFO: renamed from: b */
    public final String f246038b;

    public vyb1(daj dajVar, String str) {
        this.f246037a = dajVar;
        this.f246038b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vyb1)) {
            return false;
        }
        vyb1 vyb1Var = (vyb1) obj;
        return wj50.m88271j(this.f246037a, vyb1Var.f246037a) && wj50.m88271j(this.f246038b, vyb1Var.f246038b);
    }

    public final int hashCode() {
        daj dajVar = this.f246037a;
        int iHashCode = (dajVar == null ? 0 : dajVar.hashCode()) * 31;
        String str = this.f246038b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
