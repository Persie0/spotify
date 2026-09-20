package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class vra implements ck81 {

    /* JADX INFO: renamed from: a */
    public final int f244117a;

    /* JADX INFO: renamed from: b */
    public final r300 f244118b;

    /* JADX INFO: renamed from: c */
    public final nlr f244119c = new nlr();

    /* JADX INFO: renamed from: d */
    public final wra f244120d;

    /* JADX INFO: renamed from: e */
    public r300 f244121e;

    /* JADX INFO: renamed from: f */
    public ck81 f244122f;

    /* JADX INFO: renamed from: g */
    public long f244123g;

    public vra(int i, int i2, r300 r300Var, wra wraVar) {
        this.f244117a = i2;
        this.f244118b = r300Var;
        this.f244120d = wraVar;
    }

    @Override // p204p.ck81
    /* JADX INFO: renamed from: a */
    public final void mo33087a(r300 r300Var) {
        this.f244120d.getClass();
        r300 r300Var2 = this.f244118b;
        if (r300Var2 != null) {
            r300Var = r300Var.m74568f(r300Var2);
        }
        this.f244121e = r300Var;
        ck81 ck81Var = this.f244122f;
        String str = h0b1.f86200a;
        ck81Var.mo33087a(r300Var);
    }

    @Override // p204p.ck81
    /* JADX INFO: renamed from: b */
    public final void mo33088b(long j, int i, int i2, int i3, bk81 bk81Var) {
        long j2 = this.f244123g;
        if (j2 != -9223372036854775807L && j >= j2) {
            this.f244122f = this.f244119c;
        }
        ck81 ck81Var = this.f244122f;
        String str = h0b1.f86200a;
        ck81Var.mo33088b(j, i, i2, i3, bk81Var);
    }

    @Override // p204p.ck81
    /* JADX INFO: renamed from: c */
    public final void mo33089c(l2n0 l2n0Var, int i, int i2) {
        ck81 ck81Var = this.f244122f;
        String str = h0b1.f86200a;
        ck81Var.mo33092f(i, l2n0Var);
    }

    @Override // p204p.ck81
    /* JADX INFO: renamed from: d */
    public final int mo33090d(fho fhoVar, int i, boolean z) {
        ck81 ck81Var = this.f244122f;
        String str = h0b1.f86200a;
        return ck81Var.mo33091e(fhoVar, i, z);
    }
}
