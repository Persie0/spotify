package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class ub0 {

    /* JADX INFO: renamed from: a */
    public final boolean f228589a;

    /* JADX INFO: renamed from: b */
    public final eh00 f228590b;

    /* JADX INFO: renamed from: c */
    public final List f228591c;

    public ub0(List list, eh00 eh00Var, boolean z) {
        this.f228589a = z;
        this.f228590b = eh00Var;
        this.f228591c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ub0)) {
            return false;
        }
        ub0 ub0Var = (ub0) obj;
        return this.f228589a == ub0Var.f228589a && wj50.m88271j(this.f228590b, ub0Var.f228590b) && wj50.m88271j(this.f228591c, ub0Var.f228591c);
    }

    public final int hashCode() {
        return this.f228591c.hashCode() + p1v.m68853j(Boolean.hashCode(this.f228589a) * 31, this.f228590b, 31);
    }
}
