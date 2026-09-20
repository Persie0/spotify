package p204p;

import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class cw31 {

    /* JADX INFO: renamed from: a */
    public final UUID f42621a;

    /* JADX INFO: renamed from: b */
    public final String f42622b;

    /* JADX INFO: renamed from: c */
    public final long f42623c;

    /* JADX INFO: renamed from: d */
    public final long f42624d;

    /* JADX INFO: renamed from: e */
    public final ConcurrentHashMap f42625e;

    public cw31(UUID uuid, String str, long j, long j2, ConcurrentHashMap concurrentHashMap) {
        this.f42621a = uuid;
        this.f42622b = str;
        this.f42623c = j;
        this.f42624d = j2;
        this.f42625e = concurrentHashMap;
    }

    /* JADX INFO: renamed from: a */
    public static cw31 m34082a(cw31 cw31Var, long j) {
        UUID uuid = cw31Var.f42621a;
        String str = cw31Var.f42622b;
        long j2 = cw31Var.f42623c;
        ConcurrentHashMap concurrentHashMap = cw31Var.f42625e;
        cw31Var.getClass();
        return new cw31(uuid, str, j2, j, concurrentHashMap);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cw31)) {
            return false;
        }
        cw31 cw31Var = (cw31) obj;
        return wj50.m88271j(this.f42621a, cw31Var.f42621a) && wj50.m88271j(this.f42622b, cw31Var.f42622b) && this.f42623c == cw31Var.f42623c && this.f42624d == cw31Var.f42624d && wj50.m88271j(this.f42625e, cw31Var.f42625e);
    }

    public final int hashCode() {
        return this.f42625e.hashCode() + dq60.m36605e(dq60.m36605e(s571.m77243b(this.f42621a.hashCode() * 31, 31, this.f42622b), this.f42623c, 31), this.f42624d, 31);
    }
}
