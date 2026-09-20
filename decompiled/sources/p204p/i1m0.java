package p204p;

import java.util.UUID;

/* JADX INFO: loaded from: classes8.dex */
public final class i1m0 {

    /* JADX INFO: renamed from: a */
    public final UUID f97550a;

    /* JADX INFO: renamed from: b */
    public final Object f97551b;

    public i1m0(UUID uuid, Object obj) {
        this.f97550a = uuid;
        this.f97551b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i1m0)) {
            return false;
        }
        i1m0 i1m0Var = (i1m0) obj;
        return wj50.m88271j(this.f97550a, i1m0Var.f97550a) && wj50.m88271j(this.f97551b, i1m0Var.f97551b);
    }

    public final int hashCode() {
        int iHashCode = this.f97550a.hashCode() * 31;
        Object obj = this.f97551b;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }
}
