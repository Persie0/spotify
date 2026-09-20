package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class rbd implements sbd {

    /* JADX INFO: renamed from: a */
    public final String f197555a;

    /* JADX INFO: renamed from: b */
    public final String f197556b;

    /* JADX INFO: renamed from: c */
    public final String f197557c;

    /* JADX INFO: renamed from: d */
    public final pbd f197558d;

    /* JADX INFO: renamed from: e */
    public final nmn0 f197559e;

    public rbd(String str, String str2, String str3, pbd pbdVar, nmn0 nmn0Var) {
        this.f197555a = str;
        this.f197556b = str2;
        this.f197557c = str3;
        this.f197558d = pbdVar;
        this.f197559e = nmn0Var;
    }

    @Override // p204p.sbd
    /* JADX INFO: renamed from: a */
    public final String mo72492a() {
        return this.f197556b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rbd)) {
            return false;
        }
        rbd rbdVar = (rbd) obj;
        return wj50.m88271j(this.f197555a, rbdVar.f197555a) && wj50.m88271j(this.f197556b, rbdVar.f197556b) && wj50.m88271j(this.f197557c, rbdVar.f197557c) && wj50.m88271j(this.f197558d, rbdVar.f197558d) && wj50.m88271j(this.f197559e, rbdVar.f197559e);
    }

    public final int hashCode() {
        return this.f197559e.hashCode() + ((this.f197558d.hashCode() + s571.m77243b(s571.m77243b(this.f197555a.hashCode() * 31, 31, this.f197556b), 31, this.f197557c)) * 31);
    }
}
