package p204p;

import java.util.UUID;

/* JADX INFO: loaded from: classes10.dex */
public final class its0 {

    /* JADX INFO: renamed from: a */
    public final UUID f105731a;

    /* JADX INFO: renamed from: b */
    public final kts0 f105732b;

    /* JADX INFO: renamed from: c */
    public final boolean f105733c;

    /* JADX INFO: renamed from: d */
    public final UUID f105734d;

    /* JADX INFO: renamed from: e */
    public final tf60 f105735e;

    public its0(UUID uuid, kts0 kts0Var, boolean z, UUID uuid2, tf60 tf60Var) {
        this.f105731a = uuid;
        this.f105732b = kts0Var;
        this.f105733c = z;
        this.f105734d = uuid2;
        this.f105735e = tf60Var;
    }

    /* JADX INFO: renamed from: a */
    public static its0 m51639a(its0 its0Var, kts0 kts0Var, boolean z, UUID uuid, di41 di41Var, int i) {
        kts0 kts0Var2 = kts0Var;
        UUID uuid2 = its0Var.f105731a;
        if ((i & 2) != 0) {
            kts0Var2 = its0Var.f105732b;
        }
        if ((i & 4) != 0) {
            z = its0Var.f105733c;
        }
        if ((i & 8) != 0) {
            uuid = its0Var.f105734d;
        }
        tf60 tf60Var = di41Var;
        if ((i & 16) != 0) {
            tf60Var = its0Var.f105735e;
        }
        tf60 tf60Var2 = tf60Var;
        its0Var.getClass();
        UUID uuid3 = uuid;
        return new its0(uuid2, kts0Var2, z, uuid3, tf60Var2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof its0)) {
            return false;
        }
        its0 its0Var = (its0) obj;
        return wj50.m88271j(this.f105731a, its0Var.f105731a) && wj50.m88271j(this.f105732b, its0Var.f105732b) && this.f105733c == its0Var.f105733c && wj50.m88271j(this.f105734d, its0Var.f105734d) && wj50.m88271j(this.f105735e, its0Var.f105735e);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d((this.f105732b.hashCode() + (this.f105731a.hashCode() * 31)) * 31, 31, this.f105733c);
        UUID uuid = this.f105734d;
        int iHashCode = (iM77245d + (uuid == null ? 0 : uuid.hashCode())) * 31;
        tf60 tf60Var = this.f105735e;
        return iHashCode + (tf60Var != null ? tf60Var.hashCode() : 0);
    }
}
