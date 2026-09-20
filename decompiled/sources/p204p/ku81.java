package p204p;

import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class ku81 implements qu81 {

    /* JADX INFO: renamed from: a */
    public final UUID f126482a;

    /* JADX INFO: renamed from: b */
    public final long f126483b;

    /* JADX INFO: renamed from: c */
    public final long f126484c;

    public ku81(UUID uuid, long j, long j2) {
        this.f126482a = uuid;
        this.f126483b = j;
        this.f126484c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ku81)) {
            return false;
        }
        ku81 ku81Var = (ku81) obj;
        return wj50.m88271j(this.f126482a, ku81Var.f126482a) && this.f126483b == ku81Var.f126483b && this.f126484c == ku81Var.f126484c;
    }

    @Override // p204p.qu81
    public final UUID getId() {
        return this.f126482a;
    }

    @Override // p204p.qu81
    public final long getTimestamp() {
        return this.f126483b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f126484c) + dq60.m36605e(this.f126482a.hashCode() * 31, this.f126483b, 31);
    }
}
