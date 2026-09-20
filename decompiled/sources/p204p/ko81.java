package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class ko81 {

    /* JADX INFO: renamed from: a */
    public final v140 f124559a;

    /* JADX INFO: renamed from: b */
    public final List f124560b;

    /* JADX INFO: renamed from: c */
    public final Long f124561c;

    public ko81(v140 v140Var, List list, Long l) {
        this.f124559a = v140Var;
        this.f124560b = list;
        this.f124561c = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ko81)) {
            return false;
        }
        ko81 ko81Var = (ko81) obj;
        return wj50.m88271j(this.f124559a, ko81Var.f124559a) && wj50.m88271j(this.f124560b, ko81Var.f124560b) && wj50.m88271j(this.f124561c, ko81Var.f124561c);
    }

    public final int hashCode() {
        v140 v140Var = this.f124559a;
        int iHashCode = (v140Var == null ? 0 : v140Var.hashCode()) * 31;
        List list = this.f124560b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        Long l = this.f124561c;
        return iHashCode2 + (l != null ? l.hashCode() : 0);
    }
}
