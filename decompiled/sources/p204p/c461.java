package p204p;

import java.util.Arrays;

/* JADX INFO: loaded from: classes10.dex */
public final class c461 {

    /* JADX INFO: renamed from: a */
    public final byte[] f33856a;

    /* JADX INFO: renamed from: b */
    public final byte[] f33857b;

    /* JADX INFO: renamed from: c */
    public final String f33858c;

    public c461(String str, byte[] bArr, byte[] bArr2) {
        this.f33856a = bArr;
        this.f33857b = bArr2;
        this.f33858c = str;
    }

    /* JADX INFO: renamed from: a */
    public final byte[] m31428a() {
        return this.f33856a;
    }

    /* JADX INFO: renamed from: b */
    public final byte[] m31429b() {
        return this.f33857b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c461)) {
            return false;
        }
        c461 c461Var = (c461) obj;
        return Arrays.equals(this.f33856a, c461Var.f33856a) && Arrays.equals(this.f33857b, c461Var.f33857b) && wj50.m88271j(this.f33858c, c461Var.f33858c);
    }

    public final int hashCode() {
        return this.f33858c.hashCode() + tfe.m80647e(Arrays.hashCode(this.f33856a) * 31, this.f33857b, 31);
    }
}
