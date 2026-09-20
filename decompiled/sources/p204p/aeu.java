package p204p;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class aeu {

    /* JADX INFO: renamed from: a */
    public final keu f14958a;

    /* JADX INFO: renamed from: b */
    public final byte[] f14959b;

    public aeu(keu keuVar, byte[] bArr) {
        if (keuVar == null) {
            throw new NullPointerException("encoding is null");
        }
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        }
        this.f14958a = keuVar;
        this.f14959b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aeu)) {
            return false;
        }
        aeu aeuVar = (aeu) obj;
        if (this.f14958a.equals(aeuVar.f14958a)) {
            return Arrays.equals(this.f14959b, aeuVar.f14959b);
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f14958a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f14959b);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.f14958a + ", bytes=[...]}";
    }
}
