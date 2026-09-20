package p204p;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class pk01 implements ktx {

    /* JADX INFO: renamed from: a */
    public final String f178359a;

    /* JADX INFO: renamed from: b */
    public final String f178360b;

    /* JADX INFO: renamed from: c */
    public final byte[] f178361c;

    public pk01(String str, String str2, byte[] bArr) {
        this.f178359a = str;
        this.f178360b = str2;
        this.f178361c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pk01)) {
            return false;
        }
        pk01 pk01Var = (pk01) obj;
        return wj50.m88271j(this.f178359a, pk01Var.f178359a) && wj50.m88271j(this.f178360b, pk01Var.f178360b) && Arrays.equals(this.f178361c, pk01Var.f178361c);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f178361c) + s571.m77243b(this.f178359a.hashCode() * 31, 31, this.f178360b);
    }
}
