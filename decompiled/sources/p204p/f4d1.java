package p204p;

import java.util.Arrays;

/* JADX INFO: loaded from: classes10.dex */
public final class f4d1 extends b5d1 {

    /* JADX INFO: renamed from: a */
    public final int f65760a;

    /* JADX INFO: renamed from: b */
    public final String f65761b;

    /* JADX INFO: renamed from: c */
    public final String f65762c;

    /* JADX INFO: renamed from: d */
    public final String f65763d;

    /* JADX INFO: renamed from: e */
    public final String[] f65764e;

    public f4d1(int i, String str, String str2, String str3, String[] strArr) {
        this.f65760a = i;
        this.f65761b = str;
        this.f65762c = str2;
        this.f65763d = str3;
        this.f65764e = strArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f4d1)) {
            return false;
        }
        f4d1 f4d1Var = (f4d1) obj;
        return this.f65760a == f4d1Var.f65760a && wj50.m88271j(this.f65761b, f4d1Var.f65761b) && wj50.m88271j(this.f65762c, f4d1Var.f65762c) && wj50.m88271j(this.f65763d, f4d1Var.f65763d) && wj50.m88271j(this.f65764e, f4d1Var.f65764e);
    }

    public final int hashCode() {
        return s571.m77243b(s571.m77243b(s571.m77243b(Integer.hashCode(this.f65760a) * 31, 31, this.f65761b), 31, this.f65762c), 31, this.f65763d) + Arrays.hashCode(this.f65764e);
    }
}
