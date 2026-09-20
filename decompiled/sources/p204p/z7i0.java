package p204p;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class z7i0 implements a8i0 {

    /* JADX INFO: renamed from: a */
    public final List f280237a;

    /* JADX INFO: renamed from: b */
    public final List f280238b;

    /* JADX INFO: renamed from: c */
    public final List f280239c;

    /* JADX INFO: renamed from: d */
    public final Map f280240d;

    public z7i0(List list, List list2, List list3, Map map) {
        this.f280237a = list;
        this.f280238b = list2;
        this.f280239c = list3;
        this.f280240d = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z7i0)) {
            return false;
        }
        z7i0 z7i0Var = (z7i0) obj;
        return wj50.m88271j(this.f280237a, z7i0Var.f280237a) && wj50.m88271j(this.f280238b, z7i0Var.f280238b) && wj50.m88271j(this.f280239c, z7i0Var.f280239c) && wj50.m88271j(this.f280240d, z7i0Var.f280240d);
    }

    public final int hashCode() {
        return this.f280240d.hashCode() + s571.m77244c(s571.m77244c(this.f280237a.hashCode() * 31, 31, this.f280238b), 31, this.f280239c);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ z7i0(List list, List list2, List list3, Map map, int i) {
        int i2 = i & 1;
        lau lauVar = lau.f131415a;
        this(i2 != 0 ? lauVar : list, (i & 2) != 0 ? lauVar : list2, (i & 4) != 0 ? lauVar : list3, (i & 8) != 0 ? nau.f152117a : map);
    }
}
