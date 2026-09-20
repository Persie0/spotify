package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class c7m0 {

    /* JADX INFO: renamed from: a */
    public final int f34948a;

    /* JADX INFO: renamed from: b */
    public final List f34949b;

    public c7m0(int i, List list) {
        this.f34948a = i;
        this.f34949b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c7m0)) {
            return false;
        }
        c7m0 c7m0Var = (c7m0) obj;
        return this.f34948a == c7m0Var.f34948a && wj50.m88271j(this.f34949b, c7m0Var.f34949b);
    }

    public final int hashCode() {
        return this.f34949b.hashCode() + (edb.m38547C(this.f34948a) * 31);
    }
}
