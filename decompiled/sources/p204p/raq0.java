package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class raq0 {

    /* JADX INFO: renamed from: a */
    public final int f197365a;

    /* JADX INFO: renamed from: b */
    public final boolean f197366b;

    /* JADX INFO: renamed from: c */
    public final boolean f197367c;

    /* JADX INFO: renamed from: d */
    public final boolean f197368d;

    /* JADX INFO: renamed from: e */
    public final boolean f197369e;

    /* JADX INFO: renamed from: f */
    public final boolean f197370f;

    /* JADX INFO: renamed from: g */
    public final int f197371g;

    public raq0(int i, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f197365a = i;
        this.f197366b = z;
        this.f197367c = z2;
        this.f197368d = z3;
        this.f197369e = true;
        this.f197370f = z4;
        this.f197371g = 1002;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof raq0)) {
            return false;
        }
        raq0 raq0Var = (raq0) obj;
        return this.f197365a == raq0Var.f197365a && this.f197366b == raq0Var.f197366b && this.f197367c == raq0Var.f197367c && this.f197368d == raq0Var.f197368d && this.f197369e == raq0Var.f197369e && this.f197370f == raq0Var.f197370f && this.f197371g == raq0Var.f197371g;
    }

    public final int hashCode() {
        return (s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(this.f197365a * 31, 31, this.f197366b), 31, this.f197367c), 31, this.f197368d), 31, this.f197369e), 31, this.f197370f) + this.f197371g) * 31;
    }

    public raq0(int i, boolean z, boolean z2, boolean z3) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? true : z2, (i & 4) != 0 ? true : z3, 1, (i & 8) != 0, false);
    }

    public raq0(int i, boolean z, boolean z2) {
        this(z, true, true, i, z2, false);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public raq0(boolean z, boolean z2, boolean z3, int i, boolean z4, boolean z5) {
        bns bnsVar = sm4.f210562a;
        int i2 = !z ? 262152 : 262144;
        i2 = i == 2 ? i2 | 8192 : i2;
        this(z4 ? i2 : i2 | 512, i == 1, z2, z3, z5);
    }
}
