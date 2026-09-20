package p204p;

import java.util.Arrays;

/* JADX INFO: loaded from: classes11.dex */
public final class j0d1 {

    /* JADX INFO: renamed from: a */
    public final byte[] f107428a;

    /* JADX INFO: renamed from: b */
    public final String f107429b;

    /* JADX INFO: renamed from: c */
    public final String f107430c;

    /* JADX INFO: renamed from: d */
    public final String f107431d;

    /* JADX INFO: renamed from: e */
    public final String f107432e;

    public j0d1(byte[] bArr, String str, String str2, String str3, String str4) {
        this.f107428a = bArr;
        this.f107429b = str;
        this.f107430c = str2;
        this.f107431d = str3;
        this.f107432e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0d1)) {
            return false;
        }
        j0d1 j0d1Var = (j0d1) obj;
        return wj50.m88271j(this.f107428a, j0d1Var.f107428a) && wj50.m88271j(this.f107429b, j0d1Var.f107429b) && wj50.m88271j(this.f107430c, j0d1Var.f107430c) && wj50.m88271j(this.f107431d, j0d1Var.f107431d) && wj50.m88271j(this.f107432e, j0d1Var.f107432e);
    }

    public final int hashCode() {
        return this.f107432e.hashCode() + s571.m77243b(s571.m77243b(s571.m77243b(Arrays.hashCode(this.f107428a) * 31, 31, this.f107429b), 31, this.f107430c), 31, this.f107431d);
    }
}
