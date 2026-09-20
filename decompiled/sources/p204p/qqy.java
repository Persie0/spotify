package p204p;

import java.util.Set;
import java.util.UUID;

/* JADX INFO: loaded from: classes7.dex */
public final class qqy {

    /* JADX INFO: renamed from: a */
    public final UUID f191674a;

    /* JADX INFO: renamed from: b */
    public final long f191675b;

    /* JADX INFO: renamed from: c */
    public final Set f191676c;

    public qqy(UUID uuid, long j, Set set) {
        this.f191674a = uuid;
        this.f191675b = j;
        this.f191676c = set;
    }

    /* JADX INFO: renamed from: a */
    public final Set m73581a() {
        return this.f191676c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qqy)) {
            return false;
        }
        qqy qqyVar = (qqy) obj;
        return wj50.m88271j(this.f191674a, qqyVar.f191674a) && this.f191675b == qqyVar.f191675b && wj50.m88271j(this.f191676c, qqyVar.f191676c);
    }

    public final int hashCode() {
        return this.f191676c.hashCode() + dq60.m36605e(this.f191674a.hashCode() * 31, this.f191675b, 31);
    }
}
