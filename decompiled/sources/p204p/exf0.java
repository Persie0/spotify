package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public final class exf0 {

    /* JADX INFO: renamed from: a */
    public final dxf0 f63756a;

    /* JADX INFO: renamed from: b */
    public final Map f63757b;

    /* JADX INFO: renamed from: c */
    public final yjj0 f63758c;

    public exf0(dxf0 dxf0Var, Map map, yjj0 yjj0Var) {
        this.f63756a = dxf0Var;
        this.f63757b = map;
        this.f63758c = yjj0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof exf0)) {
            return false;
        }
        exf0 exf0Var = (exf0) obj;
        return wj50.m88271j(this.f63756a, exf0Var.f63756a) && wj50.m88271j(this.f63757b, exf0Var.f63757b) && this.f63758c == exf0Var.f63758c;
    }

    public final int hashCode() {
        int iHashCode = this.f63756a.hashCode() * 31;
        Map map = this.f63757b;
        return this.f63758c.hashCode() + ((iHashCode + (map == null ? 0 : map.hashCode())) * 31);
    }
}
