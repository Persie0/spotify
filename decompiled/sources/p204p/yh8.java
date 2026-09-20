package p204p;

import java.util.Arrays;
import java.util.UUID;

/* JADX INFO: loaded from: classes5.dex */
public final class yh8 {

    /* JADX INFO: renamed from: a */
    public final UUID f272759a;

    /* JADX INFO: renamed from: b */
    public final h2a1 f272760b;

    /* JADX INFO: renamed from: c */
    public final byte[] f272761c;

    public yh8(UUID uuid, h2a1 h2a1Var, byte[] bArr) {
        this.f272759a = uuid;
        this.f272760b = h2a1Var;
        this.f272761c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yh8)) {
            return false;
        }
        yh8 yh8Var = (yh8) obj;
        return wj50.m88271j(this.f272759a, yh8Var.f272759a) && this.f272760b == yh8Var.f272760b && wj50.m88271j(this.f272761c, yh8Var.f272761c);
    }

    public final int hashCode() {
        int iHashCode = this.f272759a.hashCode() * 31;
        h2a1 h2a1Var = this.f272760b;
        return Arrays.hashCode(this.f272761c) + ((iHashCode + (h2a1Var == null ? 0 : h2a1Var.hashCode())) * 31);
    }
}
