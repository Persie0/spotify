package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class w9r {

    /* JADX INFO: renamed from: a */
    public final String f249247a;

    /* JADX INFO: renamed from: b */
    public final hg8 f249248b;

    /* JADX INFO: renamed from: c */
    public final fg8 f249249c;

    /* JADX INFO: renamed from: d */
    public final Set f249250d;

    public w9r(String str, hg8 hg8Var, fg8 fg8Var, Set set) {
        this.f249247a = str;
        this.f249248b = hg8Var;
        this.f249249c = fg8Var;
        this.f249250d = set;
    }

    /* JADX INFO: renamed from: a */
    public final String m87530a() {
        return this.f249247a;
    }

    /* JADX INFO: renamed from: b */
    public final Set m87531b() {
        return this.f249250d;
    }

    /* JADX INFO: renamed from: c */
    public final hg8 m87532c() {
        return this.f249248b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w9r)) {
            return false;
        }
        w9r w9rVar = (w9r) obj;
        return wj50.m88271j(this.f249247a, w9rVar.f249247a) && this.f249248b == w9rVar.f249248b && this.f249249c == w9rVar.f249249c && wj50.m88271j(this.f249250d, w9rVar.f249250d);
    }

    public final int hashCode() {
        return this.f249250d.hashCode() + ((this.f249249c.hashCode() + ((this.f249248b.hashCode() + (this.f249247a.hashCode() * 31)) * 31)) * 31);
    }
}
