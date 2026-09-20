package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class b5i0 {

    /* JADX INFO: renamed from: a */
    public final List f23597a;

    /* JADX INFO: renamed from: b */
    public final int f23598b;

    public b5i0(int i, List list) {
        this.f23597a = list;
        this.f23598b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b5i0)) {
            return false;
        }
        b5i0 b5i0Var = (b5i0) obj;
        return wj50.m88271j(this.f23597a, b5i0Var.f23597a) && this.f23598b == b5i0Var.f23598b;
    }

    public final int hashCode() {
        return edb.m38547C(this.f23598b) + s571.m77245d(this.f23597a.hashCode() * 31, 31, false);
    }
}
