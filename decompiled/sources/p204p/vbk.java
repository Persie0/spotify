package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class vbk {

    /* JADX INFO: renamed from: a */
    public final boolean f239516a;

    /* JADX INFO: renamed from: b */
    public final boolean f239517b;

    /* JADX INFO: renamed from: c */
    public final boolean f239518c;

    /* JADX INFO: renamed from: d */
    public final long f239519d;

    public vbk(boolean z, boolean z2, boolean z3, long j) {
        this.f239516a = z;
        this.f239517b = z2;
        this.f239518c = z3;
        this.f239519d = j;
    }

    /* JADX INFO: renamed from: a */
    public static vbk m85165a(vbk vbkVar, boolean z, boolean z2, boolean z3, long j, int i) {
        if ((i & 1) != 0) {
            z = vbkVar.f239516a;
        }
        boolean z4 = z;
        if ((i & 2) != 0) {
            z2 = vbkVar.f239517b;
        }
        boolean z5 = z2;
        if ((i & 4) != 0) {
            z3 = vbkVar.f239518c;
        }
        vbkVar.getClass();
        return new vbk(z4, z5, z3, j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vbk)) {
            return false;
        }
        vbk vbkVar = (vbk) obj;
        return this.f239516a == vbkVar.f239516a && this.f239517b == vbkVar.f239517b && this.f239518c == vbkVar.f239518c && this.f239519d == vbkVar.f239519d;
    }

    public final int hashCode() {
        return Long.hashCode(this.f239519d) + s571.m77245d(s571.m77245d(Boolean.hashCode(this.f239516a) * 31, 31, this.f239517b), 31, this.f239518c);
    }
}
