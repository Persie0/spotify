package p204p;

import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public final class yb8 implements bc8 {

    /* JADX INFO: renamed from: a */
    public final String f271096a;

    /* JADX INFO: renamed from: b */
    public final oc8 f271097b;

    /* JADX INFO: renamed from: c */
    public final byte[] f271098c;

    public yb8(String str, oc8 oc8Var, byte[] bArr) {
        this.f271096a = str;
        this.f271097b = oc8Var;
        this.f271098c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!yb8.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        yb8 yb8Var = (yb8) obj;
        return wj50.m88271j(this.f271096a, yb8Var.f271096a) && wj50.m88271j(this.f271097b, yb8Var.f271097b) && Arrays.equals(this.f271098c, yb8Var.f271098c);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f271098c) + ((this.f271097b.hashCode() + (this.f271096a.hashCode() * 31)) * 31);
    }
}
