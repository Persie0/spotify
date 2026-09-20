package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class ars0 {

    /* JADX INFO: renamed from: a */
    public final d850 f19138a;

    /* JADX INFO: renamed from: b */
    public final Set f19139b;

    /* JADX INFO: renamed from: c */
    public final i490 f19140c;

    public ars0(d850 d850Var, Set set, i490 i490Var) {
        this.f19138a = d850Var;
        this.f19139b = set;
        this.f19140c = i490Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ars0)) {
            return false;
        }
        ars0 ars0Var = (ars0) obj;
        return wj50.m88271j(this.f19138a, ars0Var.f19138a) && wj50.m88271j(this.f19139b, ars0Var.f19139b) && wj50.m88271j(this.f19140c, ars0Var.f19140c);
    }

    public final int hashCode() {
        int iM56830b = klh.m56830b(this.f19138a.hashCode() * 31, 31, this.f19139b);
        i490 i490Var = this.f19140c;
        return iM56830b + (i490Var == null ? 0 : i490Var.hashCode());
    }
}
