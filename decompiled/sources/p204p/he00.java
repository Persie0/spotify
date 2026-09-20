package p204p;

import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes8.dex */
public final class he00 {

    /* JADX INFO: renamed from: g */
    public static final float f90271g = 40;

    /* JADX INFO: renamed from: a */
    public final float f90272a;

    /* JADX INFO: renamed from: b */
    public final long f90273b;

    /* JADX INFO: renamed from: c */
    public final long f90274c;

    /* JADX INFO: renamed from: d */
    public final float f90275d;

    /* JADX INFO: renamed from: e */
    public final boolean f90276e;

    /* JADX INFO: renamed from: f */
    public final int f90277f;

    public he00(int i) {
        long j = n6f.f150871k;
        boolean z = (i & 16) != 0;
        this.f90272a = f90271g;
        this.f90273b = j;
        this.f90274c = j;
        this.f90275d = 1.0f;
        this.f90276e = z;
        this.f90277f = 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof he00)) {
            return false;
        }
        he00 he00Var = (he00) obj;
        if (!ybs.m93301b(this.f90272a, he00Var.f90272a)) {
            return false;
        }
        long j = he00Var.f90273b;
        int i = n6f.f150872l;
        return as91.m27074b(this.f90273b, j) && as91.m27074b(this.f90274c, he00Var.f90274c) && Float.compare(this.f90275d, he00Var.f90275d) == 0 && this.f90276e == he00Var.f90276e && this.f90277f == he00Var.f90277f;
    }

    public final int hashCode() {
        int iHashCode = Float.hashCode(this.f90272a) * 31;
        int i = n6f.f150872l;
        return edb.m38547C(this.f90277f) + s571.m77245d(AbstractC0000a.m8g(dq60.m36605e(dq60.m36605e(iHashCode, this.f90273b, 31), this.f90274c, 31), 31, this.f90275d), 31, this.f90276e);
    }
}
