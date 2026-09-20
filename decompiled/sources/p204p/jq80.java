package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class jq80 {

    /* JADX INFO: renamed from: a */
    public final Set f114845a;

    /* JADX INFO: renamed from: b */
    public final Set f114846b;

    public jq80(Set set, Set set2) {
        this.f114845a = set;
        this.f114846b = set2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jq80)) {
            return false;
        }
        jq80 jq80Var = (jq80) obj;
        return wj50.m88271j(this.f114845a, jq80Var.f114845a) && wj50.m88271j(this.f114846b, jq80Var.f114846b);
    }

    public final int hashCode() {
        return this.f114846b.hashCode() + (this.f114845a.hashCode() * 31);
    }
}
