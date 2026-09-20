package p204p;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class mz51 {

    /* JADX INFO: renamed from: a */
    public final boolean f148624a;

    /* JADX INFO: renamed from: b */
    public final List f148625b;

    /* JADX INFO: renamed from: c */
    public final Map f148626c;

    public mz51(List list, Map map, boolean z) {
        this.f148624a = z;
        this.f148625b = list;
        this.f148626c = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mz51)) {
            return false;
        }
        mz51 mz51Var = (mz51) obj;
        return this.f148624a == mz51Var.f148624a && wj50.m88271j(this.f148625b, mz51Var.f148625b) && wj50.m88271j(this.f148626c, mz51Var.f148626c);
    }

    public final int hashCode() {
        return this.f148626c.hashCode() + s571.m77244c(Boolean.hashCode(this.f148624a) * 31, 31, this.f148625b);
    }
}
