package p204p;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes8.dex */
public final class d9j0 implements f9j0 {

    /* JADX INFO: renamed from: a */
    public final UUID f46845a;

    /* JADX INFO: renamed from: b */
    public final p9j0 f46846b;

    /* JADX INFO: renamed from: c */
    public final List f46847c;

    /* JADX INFO: renamed from: d */
    public final Map f46848d;

    public d9j0(UUID uuid, p9j0 p9j0Var, List list, Map map) {
        this.f46845a = uuid;
        this.f46846b = p9j0Var;
        this.f46847c = list;
        this.f46848d = map;
    }

    /* JADX INFO: renamed from: a */
    public static d9j0 m35374a(d9j0 d9j0Var, ArrayList arrayList, Map map, int i) {
        UUID uuid = d9j0Var.f46845a;
        p9j0 p9j0Var = d9j0Var.f46846b;
        List list = arrayList;
        if ((i & 4) != 0) {
            list = d9j0Var.f46847c;
        }
        if ((i & 8) != 0) {
            map = d9j0Var.f46848d;
        }
        d9j0Var.getClass();
        return new d9j0(uuid, p9j0Var, list, map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d9j0)) {
            return false;
        }
        d9j0 d9j0Var = (d9j0) obj;
        return wj50.m88271j(this.f46845a, d9j0Var.f46845a) && wj50.m88271j(this.f46846b, d9j0Var.f46846b) && wj50.m88271j(this.f46847c, d9j0Var.f46847c) && wj50.m88271j(this.f46848d, d9j0Var.f46848d);
    }

    public final int hashCode() {
        return this.f46848d.hashCode() + s571.m77244c((this.f46846b.hashCode() + (this.f46845a.hashCode() * 31)) * 31, 31, this.f46847c);
    }
}
