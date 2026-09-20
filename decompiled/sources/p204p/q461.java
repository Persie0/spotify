package p204p;

import java.util.Arrays;

/* JADX INFO: loaded from: classes10.dex */
public final class q461 {

    /* JADX INFO: renamed from: a */
    public final byte[] f185087a;

    /* JADX INFO: renamed from: b */
    public final String f185088b;

    public q461(String str, byte[] bArr) {
        this.f185087a = bArr;
        this.f185088b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q461)) {
            return false;
        }
        q461 q461Var = (q461) obj;
        return Arrays.equals(this.f185087a, q461Var.f185087a) && wj50.m88271j(this.f185088b, q461Var.f185088b);
    }

    public final int hashCode() {
        return this.f185088b.hashCode() + (Arrays.hashCode(this.f185087a) * 31);
    }
}
