package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class gsz implements yzy, xvm0 {

    /* JADX INFO: renamed from: a */
    public String f84051a;

    @Override // p204p.yzy
    /* JADX INFO: renamed from: a */
    public final void mo45668a(String str) {
        this.f84051a = str;
    }

    @Override // p204p.xvm0
    /* JADX INFO: renamed from: b */
    public final st91 mo36745b() {
        return m45669c().mo24361d();
    }

    /* JADX INFO: renamed from: c */
    public final pkh0 m45669c() {
        return new pkh0(this.f84051a, 0);
    }

    /* JADX INFO: renamed from: d */
    public final qih0 m45670d() {
        return new qih0(m45669c());
    }

    /* JADX INFO: renamed from: e */
    public final qih0 m45671e() {
        return new qih0(new qih0(m45669c()), (byte) 0);
    }
}
