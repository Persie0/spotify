package p204p;

import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class nu81 implements qu81 {

    /* JADX INFO: renamed from: a */
    public final UUID f158534a;

    /* JADX INFO: renamed from: b */
    public final long f158535b;

    /* JADX INFO: renamed from: c */
    public final nvw0 f158536c;

    /* JADX INFO: renamed from: d */
    public final yxi f158537d;

    public nu81(UUID uuid, long j, nvw0 nvw0Var, yxi yxiVar) {
        this.f158534a = uuid;
        this.f158535b = j;
        this.f158536c = nvw0Var;
        this.f158537d = yxiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nu81)) {
            return false;
        }
        nu81 nu81Var = (nu81) obj;
        return wj50.m88271j(this.f158534a, nu81Var.f158534a) && this.f158535b == nu81Var.f158535b && wj50.m88271j(this.f158536c, nu81Var.f158536c) && wj50.m88271j(this.f158537d, nu81Var.f158537d);
    }

    @Override // p204p.qu81
    public final UUID getId() {
        return this.f158534a;
    }

    @Override // p204p.qu81
    public final long getTimestamp() {
        return this.f158535b;
    }

    public final int hashCode() {
        return this.f158537d.f277257a.hashCode() + ((this.f158536c.hashCode() + dq60.m36605e(this.f158534a.hashCode() * 31, this.f158535b, 31)) * 31);
    }
}
