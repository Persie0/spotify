package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class u031 {

    /* JADX INFO: renamed from: a */
    public final n031 f225377a;

    /* JADX INFO: renamed from: b */
    public final List f225378b;

    public u031(n031 n031Var, List list) {
        this.f225377a = n031Var;
        this.f225378b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u031)) {
            return false;
        }
        u031 u031Var = (u031) obj;
        return wj50.m88271j(this.f225377a, u031Var.f225377a) && wj50.m88271j(this.f225378b, u031Var.f225378b);
    }

    public final int hashCode() {
        return this.f225378b.hashCode() + (this.f225377a.hashCode() * 31);
    }
}
