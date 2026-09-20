package p204p;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class rg8 implements bh8 {

    /* JADX INFO: renamed from: a */
    public final String f198887a;

    /* JADX INFO: renamed from: b */
    public final lc8 f198888b;

    /* JADX INFO: renamed from: c */
    public final byte[] f198889c;

    public rg8(String str, lc8 lc8Var, byte[] bArr) {
        this.f198887a = str;
        this.f198888b = lc8Var;
        this.f198889c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!rg8.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        rg8 rg8Var = (rg8) obj;
        return wj50.m88271j(this.f198887a, rg8Var.f198887a) && wj50.m88271j(this.f198888b, rg8Var.f198888b) && Arrays.equals(this.f198889c, rg8Var.f198889c);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f198889c) + ((this.f198888b.hashCode() + (this.f198887a.hashCode() * 31)) * 31);
    }
}
