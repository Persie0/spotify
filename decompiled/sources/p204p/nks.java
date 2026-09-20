package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class nks {

    /* JADX INFO: renamed from: a */
    public final lks f154934a;

    /* JADX INFO: renamed from: b */
    public final y6s0 f154935b;

    public nks(lks lksVar, y6s0 y6s0Var) {
        this.f154934a = lksVar;
        this.f154935b = y6s0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nks)) {
            return false;
        }
        nks nksVar = (nks) obj;
        return wj50.m88271j(this.f154934a, nksVar.f154934a) && wj50.m88271j(this.f154935b, nksVar.f154935b);
    }

    public final int hashCode() {
        return this.f154935b.hashCode() + (this.f154934a.f134441a.hashCode() * 31);
    }
}
