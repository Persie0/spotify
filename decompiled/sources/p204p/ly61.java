package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class ly61 implements kk31 {

    /* JADX INFO: renamed from: b */
    public final boolean f137975b;

    /* JADX INFO: renamed from: c */
    public final er70 f137976c;

    /* JADX INFO: renamed from: d */
    public final er70 f137977d;

    public ly61(boolean z, er70 er70Var, er70 er70Var2) {
        this.f137975b = z;
        this.f137976c = er70Var;
        this.f137977d = er70Var2;
    }

    @Override // p204p.kk31
    /* JADX INFO: renamed from: a */
    public final void mo53581a(Throwable th) {
        if (this.f137975b) {
            ((gy61) this.f137977d.get()).m46121a();
            ((ky61) this.f137976c.get()).mo53809c(th);
        }
    }
}
