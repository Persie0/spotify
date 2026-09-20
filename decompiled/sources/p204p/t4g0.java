package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public final class t4g0 {

    /* JADX INFO: renamed from: a */
    public final Map f216998a;

    /* JADX INFO: renamed from: b */
    public final yjj0 f216999b;

    public t4g0(Map map, yjj0 yjj0Var) {
        this.f216998a = map;
        this.f216999b = yjj0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t4g0)) {
            return false;
        }
        t4g0 t4g0Var = (t4g0) obj;
        return wj50.m88271j(this.f216998a, t4g0Var.f216998a) && this.f216999b == t4g0Var.f216999b;
    }

    public final int hashCode() {
        return this.f216999b.hashCode() + (this.f216998a.hashCode() * 31);
    }
}
