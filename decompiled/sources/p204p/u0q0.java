package p204p;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class u0q0 {

    /* JADX INFO: renamed from: a */
    public final Boolean f225576a;

    /* JADX INFO: renamed from: b */
    public final Map f225577b;

    /* JADX INFO: renamed from: c */
    public final Map f225578c;

    /* JADX INFO: renamed from: d */
    public final Map f225579d;

    /* JADX INFO: renamed from: e */
    public final List f225580e;

    /* JADX INFO: renamed from: f */
    public final List f225581f;

    public u0q0(Map map, Map map2, Map map3, List list, List list2, int i) {
        Boolean bool = Boolean.TRUE;
        int i2 = i & 8;
        nau nauVar = nau.f152117a;
        map = i2 != 0 ? nauVar : map;
        map2 = (i & 16) != 0 ? nauVar : map2;
        map3 = (i & 32) != 0 ? nauVar : map3;
        int i3 = i & 64;
        lau lauVar = lau.f131415a;
        list = i3 != 0 ? lauVar : list;
        list2 = (i & 128) != 0 ? lauVar : list2;
        this.f225576a = bool;
        this.f225577b = map;
        this.f225578c = map2;
        this.f225579d = map3;
        this.f225580e = list;
        this.f225581f = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u0q0)) {
            return false;
        }
        u0q0 u0q0Var = (u0q0) obj;
        return wj50.m88271j(this.f225576a, u0q0Var.f225576a) && wj50.m88271j(this.f225577b, u0q0Var.f225577b) && wj50.m88271j(this.f225578c, u0q0Var.f225578c) && wj50.m88271j(this.f225579d, u0q0Var.f225579d) && wj50.m88271j(this.f225580e, u0q0Var.f225580e) && wj50.m88271j(this.f225581f, u0q0Var.f225581f);
    }

    public final int hashCode() {
        Boolean bool = this.f225576a;
        return this.f225581f.hashCode() + s571.m77244c(edb.m38557f(edb.m38557f(edb.m38557f((bool == null ? 0 : bool.hashCode()) * 961, 31, this.f225577b), 31, this.f225578c), 31, this.f225579d), 31, this.f225580e);
    }
}
