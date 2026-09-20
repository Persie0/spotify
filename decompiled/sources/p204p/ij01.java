package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class ij01 {

    /* JADX INFO: renamed from: a */
    public final String f102664a;

    /* JADX INFO: renamed from: b */
    public final List f102665b;

    public ij01(String str, List list) {
        this.f102664a = str;
        this.f102665b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ij01)) {
            return false;
        }
        ij01 ij01Var = (ij01) obj;
        return wj50.m88271j(this.f102664a, ij01Var.f102664a) && wj50.m88271j(this.f102665b, ij01Var.f102665b);
    }

    public final int hashCode() {
        return this.f102665b.hashCode() + (this.f102664a.hashCode() * 31);
    }
}
