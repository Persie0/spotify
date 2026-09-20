package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class ma20 implements e6y, ulv0 {

    /* JADX INFO: renamed from: a */
    public final xu41 f141432a;

    /* JADX INFO: renamed from: b */
    public int f141433b;

    /* JADX INFO: renamed from: c */
    public ka20 f141434c;

    /* JADX INFO: renamed from: d */
    public int f141435d = -1;

    /* JADX INFO: renamed from: e */
    public int f141436e = -1;

    /* JADX INFO: renamed from: f */
    public float f141437f = 0.0f;

    /* JADX INFO: renamed from: g */
    public String f141438g;

    public ma20(xu41 xu41Var) {
        this.f141432a = xu41Var;
    }

    @Override // p204p.ulv0
    /* JADX INFO: renamed from: a */
    public final void mo61241a(v7j v7jVar) {
        if (v7jVar instanceof ka20) {
            this.f141434c = (ka20) v7jVar;
        } else {
            this.f141434c = null;
        }
    }

    @Override // p204p.e6y
    public final void apply() {
        this.f141434c.m55865X(this.f141433b);
        int i = this.f141435d;
        if (i != -1) {
            ka20 ka20Var = this.f141434c;
            if (i <= -1) {
                ka20Var.getClass();
                return;
            }
            ka20Var.f120760u0 = -1.0f;
            ka20Var.f120761v0 = i;
            ka20Var.f120762w0 = -1;
            return;
        }
        int i2 = this.f141436e;
        if (i2 != -1) {
            ka20 ka20Var2 = this.f141434c;
            if (i2 <= -1) {
                ka20Var2.getClass();
                return;
            }
            ka20Var2.f120760u0 = -1.0f;
            ka20Var2.f120761v0 = -1;
            ka20Var2.f120762w0 = i2;
            return;
        }
        ka20 ka20Var3 = this.f141434c;
        float f = this.f141437f;
        if (f <= -1.0f) {
            ka20Var3.getClass();
            return;
        }
        ka20Var3.f120760u0 = f;
        ka20Var3.f120761v0 = -1;
        ka20Var3.f120762w0 = -1;
    }

    @Override // p204p.ulv0
    /* JADX INFO: renamed from: b */
    public final v7j mo48198b() {
        if (this.f141434c == null) {
            this.f141434c = new ka20();
        }
        return this.f141434c;
    }

    @Override // p204p.ulv0
    /* JADX INFO: renamed from: c */
    public final e6y mo61242c() {
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final void m61243d(Float f) {
        this.f141435d = -1;
        this.f141436e = this.f141432a.m92122c(f);
        this.f141437f = 0.0f;
    }

    /* JADX INFO: renamed from: e */
    public final void m61244e(float f) {
        this.f141435d = -1;
        this.f141436e = -1;
        this.f141437f = f;
    }

    /* JADX INFO: renamed from: f */
    public final void m61245f(Float f) {
        this.f141435d = this.f141432a.m92122c(f);
        this.f141436e = -1;
        this.f141437f = 0.0f;
    }

    @Override // p204p.ulv0
    public final Object getKey() {
        return this.f141438g;
    }
}
