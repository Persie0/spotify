package p204p;

import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class ou81 implements qu81 {

    /* JADX INFO: renamed from: a */
    public final UUID f170191a;

    /* JADX INFO: renamed from: b */
    public final long f170192b;

    /* JADX INFO: renamed from: c */
    public final s3x0 f170193c;

    public ou81(UUID uuid, long j, s3x0 s3x0Var) {
        this.f170191a = uuid;
        this.f170192b = j;
        this.f170193c = s3x0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ou81)) {
            return false;
        }
        ou81 ou81Var = (ou81) obj;
        return wj50.m88271j(this.f170191a, ou81Var.f170191a) && this.f170192b == ou81Var.f170192b && wj50.m88271j(this.f170193c, ou81Var.f170193c);
    }

    @Override // p204p.qu81
    public final UUID getId() {
        return this.f170191a;
    }

    @Override // p204p.qu81
    public final long getTimestamp() {
        return this.f170192b;
    }

    public final int hashCode() {
        return this.f170193c.hashCode() + dq60.m36605e(this.f170191a.hashCode() * 31, this.f170192b, 31);
    }
}
