package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class fd81 {

    /* JADX INFO: renamed from: a */
    public final hte f68399a;

    /* JADX INFO: renamed from: b */
    public final dn40 f68400b;

    /* JADX INFO: renamed from: c */
    public final hte f68401c;

    public fd81(hte hteVar, dn40 dn40Var, hte hteVar2) {
        this.f68399a = hteVar;
        this.f68400b = dn40Var;
        this.f68401c = hteVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fd81)) {
            return false;
        }
        fd81 fd81Var = (fd81) obj;
        return wj50.m88271j(this.f68399a, fd81Var.f68399a) && wj50.m88271j(this.f68400b, fd81Var.f68400b) && wj50.m88271j(this.f68401c, fd81Var.f68401c);
    }

    public final int hashCode() {
        int iHashCode = this.f68399a.hashCode() * 31;
        dn40 dn40Var = this.f68400b;
        int iHashCode2 = (iHashCode + (dn40Var == null ? 0 : dn40Var.hashCode())) * 31;
        hte hteVar = this.f68401c;
        return iHashCode2 + (hteVar != null ? hteVar.hashCode() : 0);
    }

    public /* synthetic */ fd81(hte hteVar, hte hteVar2, int i) {
        this((i & 1) != 0 ? new hte(0, 0, "", false, false, false, lau.f131415a) : hteVar, (dn40) null, (i & 4) != 0 ? null : hteVar2);
    }
}
