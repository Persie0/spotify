package p204p;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class anz {

    /* JADX INFO: renamed from: a */
    public final Map f17525a;

    /* JADX INFO: renamed from: b */
    public final List f17526b;

    /* JADX INFO: renamed from: c */
    public final boolean f17527c;

    public anz(List list, Map map, boolean z) {
        this.f17525a = map;
        this.f17526b = list;
        this.f17527c = z;
    }

    /* JADX INFO: renamed from: a */
    public static anz m26539a(anz anzVar, Map map, List list, boolean z, int i) {
        if ((i & 1) != 0) {
            map = anzVar.f17525a;
        }
        if ((i & 2) != 0) {
            list = anzVar.f17526b;
        }
        if ((i & 4) != 0) {
            z = anzVar.f17527c;
        }
        anzVar.getClass();
        return new anz(list, map, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof anz)) {
            return false;
        }
        anz anzVar = (anz) obj;
        return wj50.m88271j(this.f17525a, anzVar.f17525a) && wj50.m88271j(this.f17526b, anzVar.f17526b) && this.f17527c == anzVar.f17527c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f17527c) + s571.m77244c(this.f17525a.hashCode() * 31, 31, this.f17526b);
    }
}
