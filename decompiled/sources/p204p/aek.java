package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class aek {

    /* JADX INFO: renamed from: a */
    public final List f14891a;

    /* JADX INFO: renamed from: b */
    public final List f14892b;

    /* JADX INFO: renamed from: c */
    public final rl71 f14893c;

    public aek(List list, List list2, rl71 rl71Var, int i) {
        list2 = (i & 2) != 0 ? lau.f131415a : list2;
        rl71Var = (i & 4) != 0 ? null : rl71Var;
        this.f14891a = list;
        this.f14892b = list2;
        this.f14893c = rl71Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aek)) {
            return false;
        }
        aek aekVar = (aek) obj;
        return wj50.m88271j(this.f14891a, aekVar.f14891a) && wj50.m88271j(this.f14892b, aekVar.f14892b) && wj50.m88271j(this.f14893c, aekVar.f14893c);
    }

    public final int hashCode() {
        int iM77244c = s571.m77244c(this.f14891a.hashCode() * 31, 31, this.f14892b);
        rl71 rl71Var = this.f14893c;
        return iM77244c + (rl71Var == null ? 0 : rl71Var.hashCode());
    }
}
