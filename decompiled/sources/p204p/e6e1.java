package p204p;

import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public final class e6e1 implements l6e1 {

    /* JADX INFO: renamed from: a */
    public final byte[] f56626a;

    /* JADX INFO: renamed from: b */
    public final String f56627b;

    public e6e1(String str, byte[] bArr) {
        this.f56626a = bArr;
        this.f56627b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e6e1)) {
            return false;
        }
        e6e1 e6e1Var = (e6e1) obj;
        return Arrays.equals(this.f56626a, e6e1Var.f56626a) && wj50.m88271j(this.f56627b, e6e1Var.f56627b);
    }

    public final int hashCode() {
        return this.f56627b.hashCode() + (Arrays.hashCode(this.f56626a) * 31);
    }
}
