package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public final class fxf0 {

    /* JADX INFO: renamed from: a */
    public final Map f74362a;

    /* JADX INFO: renamed from: b */
    public final yjj0 f74363b;

    public fxf0(Map map, yjj0 yjj0Var) {
        this.f74362a = map;
        this.f74363b = yjj0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fxf0)) {
            return false;
        }
        fxf0 fxf0Var = (fxf0) obj;
        return wj50.m88271j(this.f74362a, fxf0Var.f74362a) && this.f74363b == fxf0Var.f74363b;
    }

    public final int hashCode() {
        return this.f74363b.hashCode() + (this.f74362a.hashCode() * 31);
    }
}
