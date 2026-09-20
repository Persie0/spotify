package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class o4r implements q4r {

    /* JADX INFO: renamed from: a */
    public final dw50 f161732a;

    /* JADX INFO: renamed from: b */
    public final hs61 f161733b;

    /* JADX INFO: renamed from: c */
    public final ibj f161734c;

    /* JADX INFO: renamed from: d */
    public final List f161735d;

    public o4r(dw50 dw50Var, hs61 hs61Var, ibj ibjVar, List list) {
        this.f161732a = dw50Var;
        this.f161733b = hs61Var;
        this.f161734c = ibjVar;
        this.f161735d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o4r)) {
            return false;
        }
        o4r o4rVar = (o4r) obj;
        return wj50.m88271j(this.f161732a, o4rVar.f161732a) && wj50.m88271j(this.f161733b, o4rVar.f161733b) && wj50.m88271j(this.f161734c, o4rVar.f161734c) && wj50.m88271j(this.f161735d, o4rVar.f161735d);
    }

    public final int hashCode() {
        return this.f161735d.hashCode() + ((this.f161734c.hashCode() + ((this.f161733b.hashCode() + (this.f161732a.hashCode() * 31)) * 31)) * 31);
    }
}
