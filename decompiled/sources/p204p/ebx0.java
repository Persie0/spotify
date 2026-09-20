package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class ebx0 implements jbx0 {

    /* JADX INFO: renamed from: a */
    public final List f58155a;

    /* JADX INFO: renamed from: b */
    public final eq31 f58156b;

    public ebx0(List list, eq31 eq31Var) {
        this.f58155a = list;
        this.f58156b = eq31Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ebx0)) {
            return false;
        }
        ebx0 ebx0Var = (ebx0) obj;
        return wj50.m88271j(this.f58155a, ebx0Var.f58155a) && wj50.m88271j(this.f58156b, ebx0Var.f58156b);
    }

    public final int hashCode() {
        return this.f58156b.hashCode() + (this.f58155a.hashCode() * 31);
    }
}
