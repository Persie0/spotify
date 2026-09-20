package p204p;

import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes9.dex */
public final class ihn0 {

    /* JADX INFO: renamed from: a */
    public final boolean f102325a;

    /* JADX INFO: renamed from: b */
    public final float f102326b;

    /* JADX INFO: renamed from: c */
    public final boolean f102327c;

    /* JADX INFO: renamed from: d */
    public final int f102328d;

    public ihn0(float f, int i, boolean z, boolean z2) {
        this.f102325a = z;
        this.f102326b = f;
        this.f102327c = z2;
        this.f102328d = i;
    }

    /* JADX INFO: renamed from: a */
    public static ihn0 m50667a(ihn0 ihn0Var, int i) {
        float f = ihn0Var.f102326b;
        boolean z = (i & 4) != 0 ? ihn0Var.f102327c : true;
        int i2 = ihn0Var.f102328d;
        ihn0Var.getClass();
        return new ihn0(f, i2, true, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ihn0)) {
            return false;
        }
        ihn0 ihn0Var = (ihn0) obj;
        return this.f102325a == ihn0Var.f102325a && Float.compare(this.f102326b, ihn0Var.f102326b) == 0 && this.f102327c == ihn0Var.f102327c && this.f102328d == ihn0Var.f102328d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f102328d) + s571.m77245d(AbstractC0000a.m8g(Boolean.hashCode(this.f102325a) * 31, 31, this.f102326b), 31, this.f102327c);
    }
}
