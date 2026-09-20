package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class rdl {

    /* JADX INFO: renamed from: a */
    public final List f198164a;

    /* JADX INFO: renamed from: b */
    public final eq31 f198165b;

    public rdl(ro80 ro80Var, eq31 eq31Var) {
        this.f198164a = ro80Var;
        this.f198165b = eq31Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rdl)) {
            return false;
        }
        rdl rdlVar = (rdl) obj;
        return wj50.m88271j(this.f198164a, rdlVar.f198164a) && wj50.m88271j(this.f198165b, rdlVar.f198165b);
    }

    public final int hashCode() {
        return this.f198165b.hashCode() + (this.f198164a.hashCode() * 31);
    }
}
