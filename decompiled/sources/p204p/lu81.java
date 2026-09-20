package p204p;

import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class lu81 implements qu81 {

    /* JADX INFO: renamed from: a */
    public final UUID f137028a;

    /* JADX INFO: renamed from: b */
    public final long f137029b;

    /* JADX INFO: renamed from: c */
    public final nvw0 f137030c;

    /* JADX INFO: renamed from: d */
    public final String f137031d;

    /* JADX INFO: renamed from: e */
    public final int f137032e;

    /* JADX INFO: renamed from: f */
    public final iu81 f137033f;

    public lu81(UUID uuid, long j, nvw0 nvw0Var, String str, int i, iu81 iu81Var) {
        this.f137028a = uuid;
        this.f137029b = j;
        this.f137030c = nvw0Var;
        this.f137031d = str;
        this.f137032e = i;
        this.f137033f = iu81Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lu81)) {
            return false;
        }
        lu81 lu81Var = (lu81) obj;
        return this.f137028a.equals(lu81Var.f137028a) && this.f137029b == lu81Var.f137029b && this.f137030c.equals(lu81Var.f137030c) && wj50.m88271j(this.f137031d, lu81Var.f137031d) && this.f137032e == lu81Var.f137032e && wj50.m88271j(this.f137033f, lu81Var.f137033f);
    }

    @Override // p204p.qu81
    public final UUID getId() {
        return this.f137028a;
    }

    @Override // p204p.qu81
    public final long getTimestamp() {
        return this.f137029b;
    }

    public final int hashCode() {
        int iM40938f = f710.m40938f(this.f137032e, s571.m77243b((this.f137030c.hashCode() + dq60.m36605e(this.f137028a.hashCode() * 31, this.f137029b, 31)) * 31, 31, this.f137031d), 31);
        iu81 iu81Var = this.f137033f;
        return iM40938f + (iu81Var == null ? 0 : iu81Var.hashCode());
    }
}
