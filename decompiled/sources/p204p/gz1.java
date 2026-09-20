package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class gz1 implements kra0 {

    /* JADX INFO: renamed from: a */
    public final fz1 f85801a;

    /* JADX INFO: renamed from: b */
    public final c730 f85802b;

    public gz1(fz1 fz1Var, wek0 wek0Var) {
        this.f85801a = fz1Var;
        this.f85802b = new c730(wek0Var, 5);
    }

    @Override // p204p.kra0
    /* JADX INFO: renamed from: a */
    public final void mo43760a() {
        this.f85801a.f74882c = null;
    }

    @Override // p204p.kra0
    /* JADX INFO: renamed from: b */
    public final void mo43761b() {
        c730 c730Var = this.f85802b;
        fz1 fz1Var = this.f85801a;
        fz1Var.f74882c = c730Var;
        fz1Var.m43121a();
    }
}
