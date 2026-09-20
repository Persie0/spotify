package p204p;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class x2i0 {

    /* JADX INFO: renamed from: a */
    public final Object f257508a;

    /* JADX INFO: renamed from: b */
    public final Map f257509b;

    public x2i0(List list, Map map) {
        this.f257508a = list;
        this.f257509b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x2i0)) {
            return false;
        }
        x2i0 x2i0Var = (x2i0) obj;
        return this.f257508a.equals(x2i0Var.f257508a) && wj50.m88271j(this.f257509b, x2i0Var.f257509b);
    }

    public final int hashCode() {
        return this.f257509b.hashCode() + (this.f257508a.hashCode() * 31);
    }
}
