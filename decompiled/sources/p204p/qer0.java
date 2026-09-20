package p204p;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class qer0 extends sz30 {

    /* JADX INFO: renamed from: b */
    public final String f188011b;

    /* JADX INFO: renamed from: c */
    public final byte[] f188012c;

    public qer0(String str, byte[] bArr) {
        super("PRIV");
        this.f188011b = str;
        this.f188012c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && qer0.class == obj.getClass()) {
            qer0 qer0Var = (qer0) obj;
            if (Objects.equals(this.f188011b, qer0Var.f188011b) && Arrays.equals(this.f188012c, qer0Var.f188012c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f188011b;
        return Arrays.hashCode(this.f188012c) + ((527 + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // p204p.sz30
    public final String toString() {
        return this.f215378a + ": owner=" + this.f188011b;
    }
}
