package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class pdb1 {

    /* JADX INFO: renamed from: a */
    public final kr8 f176410a;

    /* JADX INFO: renamed from: b */
    public final cd00 f176411b;

    /* JADX INFO: renamed from: c */
    public final List f176412c;

    public pdb1(kr8 kr8Var, cd00 cd00Var, List list) {
        this.f176410a = kr8Var;
        this.f176411b = cd00Var;
        this.f176412c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pdb1)) {
            return false;
        }
        pdb1 pdb1Var = (pdb1) obj;
        return wj50.m88271j(this.f176410a, pdb1Var.f176410a) && wj50.m88271j(this.f176411b, pdb1Var.f176411b) && wj50.m88271j(this.f176412c, pdb1Var.f176412c);
    }

    public final int hashCode() {
        int iHashCode = this.f176410a.hashCode() * 31;
        cd00 cd00Var = this.f176411b;
        return this.f176412c.hashCode() + ((iHashCode + (cd00Var == null ? 0 : cd00Var.f36700a.hashCode())) * 31);
    }

    public /* synthetic */ pdb1(kr8 kr8Var, List list, int i) {
        this((i & 1) != 0 ? hr8.f94372a : kr8Var, (cd00) null, (i & 4) != 0 ? lau.f131415a : list);
    }
}
