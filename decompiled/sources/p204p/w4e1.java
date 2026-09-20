package p204p;

import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public final class w4e1 implements a5e1 {

    /* JADX INFO: renamed from: a */
    public final byte[] f247799a;

    /* JADX INFO: renamed from: b */
    public final String f247800b;

    public w4e1(String str, byte[] bArr) {
        this.f247799a = bArr;
        this.f247800b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w4e1)) {
            return false;
        }
        w4e1 w4e1Var = (w4e1) obj;
        return Arrays.equals(this.f247799a, w4e1Var.f247799a) && wj50.m88271j(this.f247800b, w4e1Var.f247800b);
    }

    public final int hashCode() {
        return this.f247800b.hashCode() + (Arrays.hashCode(this.f247799a) * 31);
    }
}
