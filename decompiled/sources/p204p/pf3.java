package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class pf3 extends rf3 {

    /* JADX INFO: renamed from: a */
    public final kvl0 f176951a;

    /* JADX INFO: renamed from: b */
    public final List f176952b;

    public pf3(kvl0 kvl0Var, List list) {
        this.f176951a = kvl0Var;
        this.f176952b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pf3)) {
            return false;
        }
        pf3 pf3Var = (pf3) obj;
        return wj50.m88271j(this.f176951a, pf3Var.f176951a) && wj50.m88271j(this.f176952b, pf3Var.f176952b);
    }

    public final int hashCode() {
        return this.f176952b.hashCode() + (this.f176951a.hashCode() * 31);
    }
}
