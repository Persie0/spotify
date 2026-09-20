package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class n4r implements q4r {

    /* JADX INFO: renamed from: a */
    public final dw50 f150404a;

    /* JADX INFO: renamed from: b */
    public final ibj f150405b;

    /* JADX INFO: renamed from: c */
    public final k980 f150406c;

    /* JADX INFO: renamed from: d */
    public final List f150407d;

    public n4r(dw50 dw50Var, ibj ibjVar, k980 k980Var, List list) {
        this.f150404a = dw50Var;
        this.f150405b = ibjVar;
        this.f150406c = k980Var;
        this.f150407d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n4r)) {
            return false;
        }
        n4r n4rVar = (n4r) obj;
        return wj50.m88271j(this.f150404a, n4rVar.f150404a) && wj50.m88271j(this.f150405b, n4rVar.f150405b) && wj50.m88271j(this.f150406c, n4rVar.f150406c) && wj50.m88271j(this.f150407d, n4rVar.f150407d);
    }

    public final int hashCode() {
        return this.f150407d.hashCode() + ((this.f150406c.hashCode() + ((this.f150405b.hashCode() + (this.f150404a.hashCode() * 31)) * 31)) * 31);
    }
}
