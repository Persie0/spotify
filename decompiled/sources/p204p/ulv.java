package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class ulv {

    /* JADX INFO: renamed from: a */
    public final t66 f231651a;

    /* JADX INFO: renamed from: b */
    public final vlv f231652b;

    /* JADX INFO: renamed from: c */
    public final boolean f231653c;

    /* JADX INFO: renamed from: d */
    public final tlv f231654d;

    public ulv(t66 t66Var, vlv vlvVar, boolean z, tlv tlvVar) {
        this.f231651a = t66Var;
        this.f231652b = vlvVar;
        this.f231653c = z;
        this.f231654d = tlvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ulv)) {
            return false;
        }
        ulv ulvVar = (ulv) obj;
        return this.f231651a.equals(ulvVar.f231651a) && wj50.m88271j(this.f231652b, ulvVar.f231652b) && this.f231653c == ulvVar.f231653c && this.f231654d.equals(ulvVar.f231654d);
    }

    public final int hashCode() {
        int iHashCode = this.f231651a.hashCode() * 31;
        vlv vlvVar = this.f231652b;
        return this.f231654d.hashCode() + s571.m77245d((iHashCode + (vlvVar == null ? 0 : vlvVar.f242608a.hashCode())) * 31, 31, this.f231653c);
    }
}
