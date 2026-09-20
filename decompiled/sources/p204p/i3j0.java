package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class i3j0 {

    /* JADX INFO: renamed from: a */
    public final List f98190a;

    /* JADX INFO: renamed from: b */
    public final f3j0 f98191b;

    public i3j0(List list, f3j0 f3j0Var) {
        this.f98190a = list;
        this.f98191b = f3j0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i3j0)) {
            return false;
        }
        i3j0 i3j0Var = (i3j0) obj;
        return wj50.m88271j(this.f98190a, i3j0Var.f98190a) && wj50.m88271j(this.f98191b, i3j0Var.f98191b);
    }

    public final int hashCode() {
        return this.f98191b.hashCode() + (this.f98190a.hashCode() * 31);
    }
}
