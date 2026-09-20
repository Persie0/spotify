package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class bsv {

    /* JADX INFO: renamed from: a */
    public final rhj f30399a;

    /* JADX INFO: renamed from: b */
    public final String f30400b;

    public bsv(rhj rhjVar, String str) {
        this.f30399a = rhjVar;
        this.f30400b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bsv)) {
            return false;
        }
        bsv bsvVar = (bsv) obj;
        return this.f30399a == bsvVar.f30399a && wj50.m88271j(this.f30400b, bsvVar.f30400b);
    }

    public final int hashCode() {
        rhj rhjVar = this.f30399a;
        int iHashCode = (rhjVar == null ? 0 : rhjVar.hashCode()) * 31;
        String str = this.f30400b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
