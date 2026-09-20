package p204p;

import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class wyp0 extends zyp0 {

    /* JADX INFO: renamed from: a */
    public final String f256332a;

    /* JADX INFO: renamed from: b */
    public final List f256333b;

    /* JADX INFO: renamed from: c */
    public final Set f256334c;

    public wyp0(String str, List list, Set set) {
        this.f256332a = str;
        this.f256333b = list;
        this.f256334c = set;
    }

    @Override // p204p.zyp0
    /* JADX INFO: renamed from: a */
    public final String mo89382a() {
        return this.f256332a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wyp0)) {
            return false;
        }
        wyp0 wyp0Var = (wyp0) obj;
        return wj50.m88271j(this.f256332a, wyp0Var.f256332a) && wj50.m88271j(this.f256333b, wyp0Var.f256333b) && wj50.m88271j(this.f256334c, wyp0Var.f256334c);
    }

    public final int hashCode() {
        return this.f256334c.hashCode() + s571.m77244c(this.f256332a.hashCode() * 31, 31, this.f256333b);
    }
}
