package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class bif0 {

    /* JADX INFO: renamed from: a */
    public final int f27426a;

    /* JADX INFO: renamed from: b */
    public final boolean f27427b;

    /* JADX INFO: renamed from: c */
    public final boolean f27428c;

    /* JADX INFO: renamed from: d */
    public final boolean f27429d;

    /* JADX INFO: renamed from: e */
    public final boolean f27430e;

    /* JADX INFO: renamed from: f */
    public final i490 f27431f;

    /* JADX INFO: renamed from: g */
    public final boolean f27432g;

    /* JADX INFO: renamed from: h */
    public final boolean f27433h;

    /* JADX INFO: renamed from: i */
    public final onc0 f27434i;

    /* JADX INFO: renamed from: j */
    public final boolean f27435j;

    /* JADX INFO: renamed from: k */
    public final boolean f27436k;

    /* JADX INFO: renamed from: l */
    public final boolean f27437l;

    /* JADX INFO: renamed from: m */
    public final boolean f27438m;

    public bif0(int i, boolean z, boolean z2, boolean z3, boolean z4, i490 i490Var, boolean z5, boolean z6, onc0 onc0Var, boolean z7, boolean z8, boolean z9, boolean z10) {
        this.f27426a = i;
        this.f27427b = z;
        this.f27428c = z2;
        this.f27429d = z3;
        this.f27430e = z4;
        this.f27431f = i490Var;
        this.f27432g = z5;
        this.f27433h = z6;
        this.f27434i = onc0Var;
        this.f27435j = z7;
        this.f27436k = z8;
        this.f27437l = z9;
        this.f27438m = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bif0)) {
            return false;
        }
        bif0 bif0Var = (bif0) obj;
        return this.f27426a == bif0Var.f27426a && this.f27427b == bif0Var.f27427b && this.f27428c == bif0Var.f27428c && this.f27429d == bif0Var.f27429d && this.f27430e == bif0Var.f27430e && wj50.m88271j(this.f27431f, bif0Var.f27431f) && this.f27432g == bif0Var.f27432g && this.f27433h == bif0Var.f27433h && this.f27434i == bif0Var.f27434i && this.f27435j == bif0Var.f27435j && this.f27436k == bif0Var.f27436k && this.f27437l == bif0Var.f27437l && this.f27438m == bif0Var.f27438m;
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(Integer.hashCode(this.f27426a) * 31, 31, this.f27427b), 31, this.f27428c), 31, this.f27429d), 31, this.f27430e);
        i490 i490Var = this.f27431f;
        return Boolean.hashCode(this.f27438m) + s571.m77245d(s571.m77245d(s571.m77245d((this.f27434i.hashCode() + s571.m77245d(s571.m77245d((iM77245d + (i490Var == null ? 0 : i490Var.hashCode())) * 31, 31, this.f27432g), 31, this.f27433h)) * 31, 31, this.f27435j), 31, this.f27436k), 31, this.f27437l);
    }
}
