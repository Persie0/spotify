package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class kxd implements lxd {

    /* JADX INFO: renamed from: a */
    public final List f127454a;

    public kxd(qf40 qf40Var) {
        this.f127454a = qf40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kxd) && wj50.m88271j(this.f127454a, ((kxd) obj).f127454a);
    }

    public final int hashCode() {
        return this.f127454a.hashCode();
    }
}
