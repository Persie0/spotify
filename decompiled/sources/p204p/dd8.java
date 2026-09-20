package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class dd8 {

    /* JADX INFO: renamed from: a */
    public final te8 f47740a;

    /* JADX INFO: renamed from: b */
    public final Map f47741b;

    /* JADX INFO: renamed from: c */
    public final Map f47742c;

    public dd8(te8 te8Var, Map map, Map map2) {
        this.f47740a = te8Var;
        this.f47741b = map;
        this.f47742c = map2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dd8)) {
            return false;
        }
        dd8 dd8Var = (dd8) obj;
        return wj50.m88271j(this.f47740a, dd8Var.f47740a) && wj50.m88271j(this.f47741b, dd8Var.f47741b) && wj50.m88271j(this.f47742c, dd8Var.f47742c);
    }

    public final int hashCode() {
        te8 te8Var = this.f47740a;
        return this.f47742c.hashCode() + edb.m38557f((te8Var == null ? 0 : te8Var.hashCode()) * 31, 31, this.f47741b);
    }
}
