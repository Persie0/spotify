package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class q59 implements p690 {

    /* JADX INFO: renamed from: a */
    public final p690 f185478a;

    /* JADX INFO: renamed from: b */
    public int f185479b = 0;

    /* JADX INFO: renamed from: c */
    public int f185480c = -1;

    /* JADX INFO: renamed from: d */
    public int f185481d = -1;

    /* JADX INFO: renamed from: e */
    public Object f185482e = null;

    public q59(p690 p690Var) {
        this.f185478a = p690Var;
    }

    @Override // p204p.p690
    /* JADX INFO: renamed from: a */
    public final void mo47102a(int i, int i2) {
        int i3;
        if (this.f185479b == 1 && i >= (i3 = this.f185480c)) {
            int i4 = this.f185481d;
            if (i <= i3 + i4) {
                this.f185481d = i4 + i2;
                this.f185480c = Math.min(i, i3);
                return;
            }
        }
        m72191b();
        this.f185480c = i;
        this.f185481d = i2;
        this.f185479b = 1;
    }

    /* JADX INFO: renamed from: b */
    public final void m72191b() {
        int i = this.f185479b;
        if (i == 0) {
            return;
        }
        p690 p690Var = this.f185478a;
        if (i == 1) {
            p690Var.mo47102a(this.f185480c, this.f185481d);
        } else if (i == 2) {
            p690Var.mo47104c(this.f185480c, this.f185481d);
        } else if (i == 3) {
            p690Var.mo47105d(this.f185480c, this.f185481d, this.f185482e);
        }
        this.f185482e = null;
        this.f185479b = 0;
    }

    @Override // p204p.p690
    /* JADX INFO: renamed from: c */
    public final void mo47104c(int i, int i2) {
        int i3;
        if (this.f185479b == 2 && (i3 = this.f185480c) >= i && i3 <= i + i2) {
            this.f185481d += i2;
            this.f185480c = i;
        } else {
            m72191b();
            this.f185480c = i;
            this.f185481d = i2;
            this.f185479b = 2;
        }
    }

    @Override // p204p.p690
    /* JADX INFO: renamed from: d */
    public final void mo47105d(int i, int i2, Object obj) {
        int i3;
        int i4;
        int i5;
        if (this.f185479b == 3 && i <= (i4 = this.f185481d + (i3 = this.f185480c)) && (i5 = i + i2) >= i3 && this.f185482e == obj) {
            this.f185480c = Math.min(i, i3);
            this.f185481d = Math.max(i4, i5) - this.f185480c;
            return;
        }
        m72191b();
        this.f185480c = i;
        this.f185481d = i2;
        this.f185482e = obj;
        this.f185479b = 3;
    }

    @Override // p204p.p690
    /* JADX INFO: renamed from: e */
    public final void mo47106e(int i, int i2) {
        m72191b();
        this.f185478a.mo47106e(i, i2);
    }
}
