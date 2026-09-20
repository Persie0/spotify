package p204p;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public final class vst0 {

    /* JADX INFO: renamed from: a */
    public final List f244491a;

    /* JADX INFO: renamed from: b */
    public final List f244492b;

    /* JADX INFO: renamed from: c */
    public final Map f244493c;

    public vst0(List list, List list2, Map map) {
        this.f244491a = list;
        this.f244492b = list2;
        this.f244493c = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vst0)) {
            return false;
        }
        vst0 vst0Var = (vst0) obj;
        return wj50.m88271j(this.f244491a, vst0Var.f244491a) && wj50.m88271j(this.f244492b, vst0Var.f244492b) && wj50.m88271j(this.f244493c, vst0Var.f244493c);
    }

    public final int hashCode() {
        return this.f244493c.hashCode() + s571.m77244c(this.f244491a.hashCode() * 31, 31, this.f244492b);
    }
}
