package p204p;

import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class pu81 implements qu81 {

    /* JADX INFO: renamed from: a */
    public final UUID f181385a;

    /* JADX INFO: renamed from: b */
    public final long f181386b;

    /* JADX INFO: renamed from: c */
    public final String f181387c;

    public pu81(UUID uuid, String str, long j) {
        this.f181385a = uuid;
        this.f181386b = j;
        this.f181387c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pu81)) {
            return false;
        }
        pu81 pu81Var = (pu81) obj;
        return wj50.m88271j(this.f181385a, pu81Var.f181385a) && this.f181386b == pu81Var.f181386b && wj50.m88271j(this.f181387c, pu81Var.f181387c);
    }

    @Override // p204p.qu81
    public final UUID getId() {
        return this.f181385a;
    }

    @Override // p204p.qu81
    public final long getTimestamp() {
        return this.f181386b;
    }

    public final int hashCode() {
        return this.f181387c.hashCode() + dq60.m36605e(this.f181385a.hashCode() * 31, this.f181386b, 31);
    }
}
