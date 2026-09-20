package p204p;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class ah8 implements bh8 {

    /* JADX INFO: renamed from: a */
    public final String f15635a;

    /* JADX INFO: renamed from: b */
    public final oc8 f15636b;

    /* JADX INFO: renamed from: c */
    public final byte[] f15637c;

    public ah8(String str, oc8 oc8Var, byte[] bArr) {
        this.f15635a = str;
        this.f15636b = oc8Var;
        this.f15637c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!ah8.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        ah8 ah8Var = (ah8) obj;
        return wj50.m88271j(this.f15635a, ah8Var.f15635a) && wj50.m88271j(this.f15636b, ah8Var.f15636b) && Arrays.equals(this.f15637c, ah8Var.f15637c);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f15637c) + ((this.f15636b.hashCode() + (this.f15635a.hashCode() * 31)) * 31);
    }
}
