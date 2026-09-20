package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class ejo {

    /* JADX INFO: renamed from: a */
    public final boolean f60254a;

    /* JADX INFO: renamed from: b */
    public final Boolean f60255b;

    /* JADX INFO: renamed from: c */
    public final boolean f60256c;

    /* JADX INFO: renamed from: d */
    public final ot80 f60257d;

    /* JADX INFO: renamed from: e */
    public final boolean f60258e;

    /* JADX INFO: renamed from: f */
    public final djo f60259f;

    /* JADX INFO: renamed from: g */
    public final Set f60260g;

    public ejo(boolean z, Boolean bool, boolean z2, ot80 ot80Var, boolean z3, djo djoVar, Set set) {
        this.f60254a = z;
        this.f60255b = bool;
        this.f60256c = z2;
        this.f60257d = ot80Var;
        this.f60258e = z3;
        this.f60259f = djoVar;
        this.f60260g = set;
    }

    /* JADX INFO: renamed from: a */
    public static ejo m39237a(ejo ejoVar, djo djoVar, Set set, int i) {
        Boolean bool = Boolean.FALSE;
        boolean z = ejoVar.f60254a;
        if ((i & 2) != 0) {
            bool = ejoVar.f60255b;
        }
        Boolean bool2 = bool;
        boolean z2 = (i & 4) != 0 ? ejoVar.f60256c : true;
        ot80 ot80Var = (i & 8) != 0 ? ejoVar.f60257d : ot80.f168997a;
        boolean z3 = (i & 16) != 0 ? ejoVar.f60258e : false;
        if ((i & 32) != 0) {
            djoVar = ejoVar.f60259f;
        }
        djo djoVar2 = djoVar;
        if ((i & 64) != 0) {
            set = ejoVar.f60260g;
        }
        ejoVar.getClass();
        return new ejo(z, bool2, z2, ot80Var, z3, djoVar2, set);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ejo)) {
            return false;
        }
        ejo ejoVar = (ejo) obj;
        return this.f60254a == ejoVar.f60254a && wj50.m88271j(this.f60255b, ejoVar.f60255b) && this.f60256c == ejoVar.f60256c && this.f60257d == ejoVar.f60257d && this.f60258e == ejoVar.f60258e && wj50.m88271j(this.f60259f, ejoVar.f60259f) && wj50.m88271j(this.f60260g, ejoVar.f60260g);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f60254a) * 31;
        Boolean bool = this.f60255b;
        int iM77245d = s571.m77245d((this.f60257d.hashCode() + s571.m77245d((iHashCode + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.f60256c)) * 31, 31, this.f60258e);
        djo djoVar = this.f60259f;
        return this.f60260g.hashCode() + ((iM77245d + (djoVar != null ? djoVar.hashCode() : 0)) * 31);
    }
}
