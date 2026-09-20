package p204p;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class rc8 extends sc8 {

    /* JADX INFO: renamed from: c */
    public final String f197787c;

    /* JADX INFO: renamed from: d */
    public final lc8 f197788d;

    /* JADX INFO: renamed from: e */
    public final byte[] f197789e;

    public rc8(String str, lc8 lc8Var, byte[] bArr) {
        this.f197787c = str;
        this.f197788d = lc8Var;
        this.f197789e = bArr;
    }

    @Override // p204p.sc8
    /* JADX INFO: renamed from: D */
    public final lc8 mo72524D() {
        return this.f197788d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!rc8.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        rc8 rc8Var = (rc8) obj;
        return wj50.m88271j(this.f197787c, rc8Var.f197787c) && wj50.m88271j(this.f197788d, rc8Var.f197788d) && Arrays.equals(this.f197789e, rc8Var.f197789e);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f197789e) + ((this.f197788d.hashCode() + (this.f197787c.hashCode() * 31)) * 31);
    }
}
