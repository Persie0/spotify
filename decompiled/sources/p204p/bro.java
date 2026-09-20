package p204p;

import java.util.Arrays;

/* JADX INFO: loaded from: classes10.dex */
public final class bro {

    /* JADX INFO: renamed from: a */
    public final byte[] f30122a;

    /* JADX INFO: renamed from: b */
    public final yau0 f30123b;

    public bro(byte[] bArr, yau0 yau0Var) {
        this.f30122a = bArr;
        this.f30123b = yau0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bro)) {
            return false;
        }
        bro broVar = (bro) obj;
        return wj50.m88271j(this.f30122a, broVar.f30122a) && wj50.m88271j(this.f30123b, broVar.f30123b);
    }

    public final int hashCode() {
        return this.f30123b.hashCode() + (Arrays.hashCode(this.f30122a) * 31);
    }
}
