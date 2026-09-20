package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class ikk {

    /* JADX INFO: renamed from: a */
    public final v140 f103130a;

    /* JADX INFO: renamed from: b */
    public final v140 f103131b;

    /* JADX INFO: renamed from: c */
    public final qho f103132c;

    /* JADX INFO: renamed from: d */
    public final qho f103133d;

    /* JADX INFO: renamed from: e */
    public final List f103134e;

    /* JADX INFO: renamed from: f */
    public final List f103135f;

    public ikk(v140 v140Var, v140 v140Var2, qho qhoVar, qho qhoVar2, List list, List list2) {
        this.f103130a = v140Var;
        this.f103131b = v140Var2;
        this.f103132c = qhoVar;
        this.f103133d = qhoVar2;
        this.f103134e = list;
        this.f103135f = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ikk)) {
            return false;
        }
        ikk ikkVar = (ikk) obj;
        return wj50.m88271j(this.f103130a, ikkVar.f103130a) && wj50.m88271j(this.f103131b, ikkVar.f103131b) && wj50.m88271j(this.f103132c, ikkVar.f103132c) && wj50.m88271j(this.f103133d, ikkVar.f103133d) && wj50.m88271j(this.f103134e, ikkVar.f103134e) && wj50.m88271j(this.f103135f, ikkVar.f103135f);
    }

    public final int hashCode() {
        v140 v140Var = this.f103130a;
        int iHashCode = (v140Var == null ? 0 : v140Var.hashCode()) * 31;
        v140 v140Var2 = this.f103131b;
        int iHashCode2 = (this.f103133d.hashCode() + ((this.f103132c.hashCode() + ((iHashCode + (v140Var2 == null ? 0 : v140Var2.hashCode())) * 31)) * 31)) * 31;
        List list = this.f103134e;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f103135f;
        return iHashCode3 + (list2 != null ? list2.hashCode() : 0);
    }
}
