package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class l4r implements q4r {

    /* JADX INFO: renamed from: a */
    public final dw50 f129743a;

    /* JADX INFO: renamed from: b */
    public final ibj f129744b;

    /* JADX INFO: renamed from: c */
    public final List f129745c;

    public l4r(dw50 dw50Var, ibj ibjVar, List list) {
        this.f129743a = dw50Var;
        this.f129744b = ibjVar;
        this.f129745c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l4r)) {
            return false;
        }
        l4r l4rVar = (l4r) obj;
        return wj50.m88271j(this.f129743a, l4rVar.f129743a) && wj50.m88271j(this.f129744b, l4rVar.f129744b) && wj50.m88271j(this.f129745c, l4rVar.f129745c);
    }

    public final int hashCode() {
        return this.f129745c.hashCode() + ((this.f129744b.hashCode() + (this.f129743a.hashCode() * 31)) * 31);
    }
}
