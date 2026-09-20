package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class u7v0 {

    /* JADX INFO: renamed from: a */
    public final hz80 f227760a;

    /* JADX INFO: renamed from: b */
    public final List f227761b;

    public u7v0(List list, hz80 hz80Var) {
        this.f227760a = hz80Var;
        this.f227761b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u7v0)) {
            return false;
        }
        u7v0 u7v0Var = (u7v0) obj;
        return wj50.m88271j(this.f227760a, u7v0Var.f227760a) && wj50.m88271j(this.f227761b, u7v0Var.f227761b);
    }

    public final int hashCode() {
        return this.f227761b.hashCode() + (this.f227760a.hashCode() * 31);
    }
}
