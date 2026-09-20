package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class p4r implements q4r {

    /* JADX INFO: renamed from: a */
    public final dw50 f173997a;

    /* JADX INFO: renamed from: b */
    public final hs61 f173998b;

    /* JADX INFO: renamed from: c */
    public final ibj f173999c;

    /* JADX INFO: renamed from: d */
    public final List f174000d;

    public p4r(dw50 dw50Var, hs61 hs61Var, ibj ibjVar, List list) {
        this.f173997a = dw50Var;
        this.f173998b = hs61Var;
        this.f173999c = ibjVar;
        this.f174000d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p4r)) {
            return false;
        }
        p4r p4rVar = (p4r) obj;
        return wj50.m88271j(this.f173997a, p4rVar.f173997a) && wj50.m88271j(this.f173998b, p4rVar.f173998b) && wj50.m88271j(this.f173999c, p4rVar.f173999c) && wj50.m88271j(this.f174000d, p4rVar.f174000d);
    }

    public final int hashCode() {
        return this.f174000d.hashCode() + ((this.f173999c.hashCode() + ((this.f173998b.hashCode() + (this.f173997a.hashCode() * 31)) * 31)) * 31);
    }
}
