package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class qrd0 implements jsd0, ksd0, v8j {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ psd0 f191821a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f191822b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f191823c;

    public /* synthetic */ qrd0(psd0 psd0Var, int i, int i2) {
        this.f191821a = psd0Var;
        this.f191822b = i;
        this.f191823c = i2;
    }

    @Override // p204p.ksd0
    /* JADX INFO: renamed from: a */
    public void mo57199a(pdp0 pdp0Var, tnd0 tnd0Var, List list) {
        psd0 psd0Var = this.f191821a;
        pdp0Var.mo43829C(psd0Var.m70782e2(tnd0Var, pdp0Var, this.f191822b), psd0Var.m70782e2(tnd0Var, pdp0Var, this.f191823c), list);
    }

    @Override // p204p.v8j
    public void accept(Object obj) {
        psd0 psd0Var = this.f191821a;
        ((rpd0) psd0Var.f180819l.get()).getClass();
        nsd0 nsd0Var = psd0Var.f180830w;
        if (nsd0Var != null) {
            nsd0Var.setFixedSize(this.f191822b, this.f191823c);
        }
    }

    @Override // p204p.jsd0
    /* JADX INFO: renamed from: b */
    public void mo54226b(pdp0 pdp0Var, tnd0 tnd0Var) {
        psd0 psd0Var = this.f191821a;
        pdp0Var.mo43836G(psd0Var.m70782e2(tnd0Var, pdp0Var, this.f191822b), psd0Var.m70782e2(tnd0Var, pdp0Var, this.f191823c));
    }
}
