package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class be71 {

    /* JADX INFO: renamed from: a */
    public final Set f26298a;

    /* JADX INFO: renamed from: b */
    public final Set f26299b;

    public be71(Set set, Set set2) {
        this.f26298a = set;
        this.f26299b = set2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof be71)) {
            return false;
        }
        be71 be71Var = (be71) obj;
        return wj50.m88271j(this.f26298a, be71Var.f26298a) && wj50.m88271j(this.f26299b, be71Var.f26299b);
    }

    public final int hashCode() {
        return this.f26299b.hashCode() + (this.f26298a.hashCode() * 31);
    }
}
