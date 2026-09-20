package p204p;

import java.util.UUID;

/* JADX INFO: loaded from: classes8.dex */
public final class fh41 {

    /* JADX INFO: renamed from: a */
    public final UUID f69574a;

    /* JADX INFO: renamed from: b */
    public final Object f69575b;

    public fh41(UUID uuid, Object obj) {
        this.f69574a = uuid;
        this.f69575b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fh41)) {
            return false;
        }
        fh41 fh41Var = (fh41) obj;
        return wj50.m88271j(this.f69574a, fh41Var.f69574a) && wj50.m88271j(this.f69575b, fh41Var.f69575b);
    }

    public final int hashCode() {
        int iHashCode = this.f69574a.hashCode() * 31;
        Object obj = this.f69575b;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }
}
