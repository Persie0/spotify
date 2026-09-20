package p204p;

import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class cn1 implements sn1 {

    /* JADX INFO: renamed from: a */
    public final Set f39861a;

    /* JADX INFO: renamed from: b */
    public final Set f39862b;

    /* JADX INFO: renamed from: c */
    public final Set f39863c;

    /* JADX INFO: renamed from: d */
    public final Map f39864d;

    public cn1(Set set, Set set2, Set set3, Map map) {
        this.f39861a = set;
        this.f39862b = set2;
        this.f39863c = set3;
        this.f39864d = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cn1)) {
            return false;
        }
        cn1 cn1Var = (cn1) obj;
        return wj50.m88271j(this.f39861a, cn1Var.f39861a) && wj50.m88271j(this.f39862b, cn1Var.f39862b) && wj50.m88271j(this.f39863c, cn1Var.f39863c) && wj50.m88271j(this.f39864d, cn1Var.f39864d);
    }

    public final int hashCode() {
        return this.f39864d.hashCode() + klh.m56830b(klh.m56830b(this.f39861a.hashCode() * 31, 31, this.f39862b), 31, this.f39863c);
    }
}
