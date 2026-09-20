package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class wd6 {

    /* JADX INFO: renamed from: a */
    public final List f250210a;

    /* JADX INFO: renamed from: b */
    public final z650 f250211b;

    public wd6(List list, z650 z650Var) {
        this.f250210a = list;
        this.f250211b = z650Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wd6)) {
            return false;
        }
        wd6 wd6Var = (wd6) obj;
        return wj50.m88271j(this.f250210a, wd6Var.f250210a) && wj50.m88271j(this.f250211b, wd6Var.f250211b);
    }

    public final int hashCode() {
        return this.f250211b.f279709a.hashCode() + (this.f250210a.hashCode() * 31);
    }
}
