package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class niv {

    /* JADX INFO: renamed from: a */
    public final miv f154358a;

    /* JADX INFO: renamed from: b */
    public final Boolean f154359b;

    public niv(miv mivVar, int i) {
        Boolean bool = (i & 4) != 0 ? null : Boolean.TRUE;
        this.f154358a = mivVar;
        this.f154359b = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof niv)) {
            return false;
        }
        niv nivVar = (niv) obj;
        return this.f154358a.equals(nivVar.f154358a) && wj50.m88271j(this.f154359b, nivVar.f154359b);
    }

    public final int hashCode() {
        int iHashCode = this.f154358a.hashCode() * 961;
        Boolean bool = this.f154359b;
        return iHashCode + (bool == null ? 0 : bool.hashCode());
    }
}
