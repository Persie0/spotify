package p204p;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
@rtz0(with = b2w.class)
public final class a2w {
    public static final z1w Companion = new z1w();

    /* JADX INFO: renamed from: a */
    public final av60 f11731a;

    /* JADX INFO: renamed from: b */
    public final List f11732b;

    /* JADX INFO: renamed from: c */
    public final Map f11733c;

    public a2w(av60 av60Var, List list, Map map) {
        this.f11731a = av60Var;
        this.f11732b = list;
        this.f11733c = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a2w)) {
            return false;
        }
        a2w a2wVar = (a2w) obj;
        return wj50.m88271j(this.f11731a, a2wVar.f11731a) && wj50.m88271j(this.f11732b, a2wVar.f11732b) && wj50.m88271j(this.f11733c, a2wVar.f11733c);
    }

    public final int hashCode() {
        av60 av60Var = this.f11731a;
        int iHashCode = (av60Var == null ? 0 : av60Var.f20109a.hashCode()) * 31;
        List list = this.f11732b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        Map map = this.f11733c;
        return iHashCode2 + (map != null ? map.hashCode() : 0);
    }
}
