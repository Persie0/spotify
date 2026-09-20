package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class umo {

    /* JADX INFO: renamed from: a */
    public final pmo f231925a;

    /* JADX INFO: renamed from: b */
    public final pmo f231926b;

    /* JADX INFO: renamed from: c */
    public final yie1 f231927c;

    public umo(pmo pmoVar, pmo pmoVar2, yie1 yie1Var) {
        this.f231925a = pmoVar;
        this.f231926b = pmoVar2;
        this.f231927c = yie1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof umo)) {
            return false;
        }
        umo umoVar = (umo) obj;
        return wj50.m88271j(this.f231925a, umoVar.f231925a) && wj50.m88271j(this.f231926b, umoVar.f231926b) && wj50.m88271j(this.f231927c, umoVar.f231927c);
    }

    public final int hashCode() {
        return this.f231927c.hashCode() + ((this.f231926b.hashCode() + (this.f231925a.hashCode() * 31)) * 31);
    }
}
