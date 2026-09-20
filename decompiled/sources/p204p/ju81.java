package p204p;

import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class ju81 implements qu81 {

    /* JADX INFO: renamed from: a */
    public final UUID f116049a;

    /* JADX INFO: renamed from: b */
    public final long f116050b;

    /* JADX INFO: renamed from: c */
    public final long f116051c;

    public ju81(UUID uuid, long j, long j2) {
        this.f116049a = uuid;
        this.f116050b = j;
        this.f116051c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ju81)) {
            return false;
        }
        ju81 ju81Var = (ju81) obj;
        return wj50.m88271j(this.f116049a, ju81Var.f116049a) && this.f116050b == ju81Var.f116050b && this.f116051c == ju81Var.f116051c;
    }

    @Override // p204p.qu81
    public final UUID getId() {
        return this.f116049a;
    }

    @Override // p204p.qu81
    public final long getTimestamp() {
        return this.f116050b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f116051c) + dq60.m36605e(this.f116049a.hashCode() * 31, this.f116050b, 31);
    }
}
