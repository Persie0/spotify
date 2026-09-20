package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class an1 implements sn1 {

    /* JADX INFO: renamed from: a */
    public final Set f17240a;

    /* JADX INFO: renamed from: b */
    public final Set f17241b;

    /* JADX INFO: renamed from: c */
    public final Set f17242c;

    public an1(Set set, Set set2, Set set3) {
        this.f17240a = set;
        this.f17241b = set2;
        this.f17242c = set3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof an1)) {
            return false;
        }
        an1 an1Var = (an1) obj;
        return wj50.m88271j(this.f17240a, an1Var.f17240a) && wj50.m88271j(this.f17241b, an1Var.f17241b) && wj50.m88271j(this.f17242c, an1Var.f17242c);
    }

    public final int hashCode() {
        return this.f17242c.hashCode() + klh.m56830b(this.f17240a.hashCode() * 31, 31, this.f17241b);
    }
}
