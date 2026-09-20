package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class pdk implements sdk {

    /* JADX INFO: renamed from: a */
    public final pla1 f176474a;

    /* JADX INFO: renamed from: b */
    public final sxd f176475b;

    /* JADX INFO: renamed from: c */
    public final hdj f176476c;

    public pdk(pla1 pla1Var, sxd sxdVar, hdj hdjVar) {
        this.f176474a = pla1Var;
        this.f176475b = sxdVar;
        this.f176476c = hdjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pdk)) {
            return false;
        }
        pdk pdkVar = (pdk) obj;
        return wj50.m88271j(this.f176474a, pdkVar.f176474a) && wj50.m88271j(this.f176475b, pdkVar.f176475b) && wj50.m88271j(this.f176476c, pdkVar.f176476c);
    }

    public final int hashCode() {
        return this.f176476c.hashCode() + ((this.f176475b.hashCode() + (this.f176474a.hashCode() * 31)) * 31);
    }
}
