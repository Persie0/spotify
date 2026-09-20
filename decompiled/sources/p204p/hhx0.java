package p204p;

import java.util.Arrays;

/* JADX INFO: loaded from: classes10.dex */
public final class hhx0 {

    /* JADX INFO: renamed from: a */
    public final String f91611a;

    /* JADX INFO: renamed from: b */
    public final byte[] f91612b;

    public hhx0(String str, byte[] bArr) {
        this.f91611a = str;
        this.f91612b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hhx0)) {
            return false;
        }
        hhx0 hhx0Var = (hhx0) obj;
        return wj50.m88271j(this.f91611a, hhx0Var.f91611a) && wj50.m88271j(this.f91612b, hhx0Var.f91612b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f91612b) + (this.f91611a.hashCode() * 31);
    }
}
