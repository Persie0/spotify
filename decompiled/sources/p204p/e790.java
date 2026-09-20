package p204p;

import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class e790 {

    /* JADX INFO: renamed from: a */
    public final List f56871a;

    /* JADX INFO: renamed from: b */
    public final Set f56872b;

    public e790(List list, Set set) {
        this.f56871a = list;
        this.f56872b = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e790)) {
            return false;
        }
        e790 e790Var = (e790) obj;
        return wj50.m88271j(this.f56871a, e790Var.f56871a) && wj50.m88271j(this.f56872b, e790Var.f56872b);
    }

    public final int hashCode() {
        return this.f56872b.hashCode() + (this.f56871a.hashCode() * 31);
    }
}
