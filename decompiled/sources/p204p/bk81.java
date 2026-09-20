package p204p;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class bk81 {

    /* JADX INFO: renamed from: a */
    public final int f27861a;

    /* JADX INFO: renamed from: b */
    public final byte[] f27862b;

    /* JADX INFO: renamed from: c */
    public final int f27863c;

    /* JADX INFO: renamed from: d */
    public final int f27864d;

    public bk81(int i, byte[] bArr, int i2, int i3) {
        this.f27861a = i;
        this.f27862b = bArr;
        this.f27863c = i2;
        this.f27864d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && bk81.class == obj.getClass()) {
            bk81 bk81Var = (bk81) obj;
            if (this.f27861a == bk81Var.f27861a && this.f27863c == bk81Var.f27863c && this.f27864d == bk81Var.f27864d && Arrays.equals(this.f27862b, bk81Var.f27862b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((tfe.m80647e(this.f27861a * 31, this.f27862b, 31) + this.f27863c) * 31) + this.f27864d;
    }
}
