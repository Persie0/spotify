package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class pyy implements tyy {

    /* JADX INFO: renamed from: a */
    public final List f183538a;

    /* JADX INFO: renamed from: b */
    public final nr31 f183539b;

    public pyy(List list, nr31 nr31Var) {
        this.f183538a = list;
        this.f183539b = nr31Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pyy)) {
            return false;
        }
        pyy pyyVar = (pyy) obj;
        return wj50.m88271j(this.f183538a, pyyVar.f183538a) && wj50.m88271j(this.f183539b, pyyVar.f183539b);
    }

    public final int hashCode() {
        return this.f183539b.hashCode() + (this.f183538a.hashCode() * 31);
    }
}
