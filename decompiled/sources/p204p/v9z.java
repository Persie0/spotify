package p204p;

import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public final class v9z {

    /* JADX INFO: renamed from: a */
    public final UUID f239067a;

    /* JADX INFO: renamed from: b */
    public final String f239068b;

    /* JADX INFO: renamed from: c */
    public final long f239069c;

    /* JADX INFO: renamed from: d */
    public final m221 f239070d;

    public v9z(UUID uuid, String str, long j, m221 m221Var) {
        this.f239067a = uuid;
        this.f239068b = str;
        this.f239069c = j;
        this.f239070d = m221Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v9z)) {
            return false;
        }
        v9z v9zVar = (v9z) obj;
        return wj50.m88271j(this.f239067a, v9zVar.f239067a) && wj50.m88271j(this.f239068b, v9zVar.f239068b) && this.f239069c == v9zVar.f239069c && this.f239070d == v9zVar.f239070d;
    }

    public final int hashCode() {
        return this.f239070d.hashCode() + dq60.m36605e(s571.m77243b(this.f239067a.hashCode() * 31, 31, this.f239068b), this.f239069c, 31);
    }
}
