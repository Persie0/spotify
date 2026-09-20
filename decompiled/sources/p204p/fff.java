package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class fff {

    /* JADX INFO: renamed from: a */
    public final v140 f68997a;

    /* JADX INFO: renamed from: b */
    public final erc1 f68998b;

    /* JADX INFO: renamed from: c */
    public final List f68999c;

    public fff(List list, v140 v140Var, erc1 erc1Var) {
        this.f68997a = v140Var;
        this.f68998b = erc1Var;
        this.f68999c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fff)) {
            return false;
        }
        fff fffVar = (fff) obj;
        return wj50.m88271j(this.f68997a, fffVar.f68997a) && wj50.m88271j(this.f68998b, fffVar.f68998b) && wj50.m88271j(this.f68999c, fffVar.f68999c);
    }

    public final int hashCode() {
        v140 v140Var = this.f68997a;
        int iHashCode = (v140Var == null ? 0 : v140Var.hashCode()) * 31;
        erc1 erc1Var = this.f68998b;
        return this.f68999c.hashCode() + ((iHashCode + (erc1Var != null ? erc1Var.hashCode() : 0)) * 31);
    }
}
