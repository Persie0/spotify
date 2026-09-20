package p204p;

import java.util.Arrays;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class lc8 implements oc8 {

    /* JADX INFO: renamed from: a */
    public final UUID f131871a;

    /* JADX INFO: renamed from: b */
    public final byte[] f131872b;

    public lc8(UUID uuid, byte[] bArr) {
        this.f131871a = uuid;
        this.f131872b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!lc8.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        lc8 lc8Var = (lc8) obj;
        byte[] bArr = lc8Var.f131872b;
        if (!wj50.m88271j(this.f131871a, lc8Var.f131871a)) {
            return false;
        }
        byte[] bArr2 = this.f131872b;
        if (bArr2 != null) {
            if (bArr == null || !Arrays.equals(bArr2, bArr)) {
                return false;
            }
        } else if (bArr != null) {
            return false;
        }
        return true;
    }

    @Override // p204p.oc8
    public final UUID getUuid() {
        return this.f131871a;
    }

    public final int hashCode() {
        int iHashCode = this.f131871a.hashCode() * 31;
        byte[] bArr = this.f131872b;
        return iHashCode + (bArr != null ? Arrays.hashCode(bArr) : 0);
    }
}
