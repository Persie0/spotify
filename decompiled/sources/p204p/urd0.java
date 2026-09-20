package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class urd0 implements jsd0, ksd0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f233330a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ psd0 f233331b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f233332c;

    public /* synthetic */ urd0(psd0 psd0Var, int i, int i2) {
        this.f233330a = i2;
        this.f233331b = psd0Var;
        this.f233332c = i;
    }

    @Override // p204p.ksd0
    /* JADX INFO: renamed from: a */
    public void mo57199a(pdp0 pdp0Var, tnd0 tnd0Var, List list) {
        switch (this.f233330a) {
            case 1:
                pdp0Var.mo43840I0(this.f233331b.m70782e2(tnd0Var, pdp0Var, this.f233332c), list);
                break;
            case 2:
                psd0 psd0Var = this.f233331b;
                psd0Var.getClass();
                int size = list.size();
                int i = this.f233332c;
                if (size != 1) {
                    pdp0Var.mo43829C(psd0Var.m70782e2(tnd0Var, pdp0Var, i), psd0Var.m70782e2(tnd0Var, pdp0Var, i + 1), list);
                } else {
                    pdp0Var.mo43902p0(psd0Var.m70782e2(tnd0Var, pdp0Var, i), (ufd0) list.get(0));
                }
                break;
            default:
                pdp0Var.mo43840I0(this.f233331b.m70782e2(tnd0Var, pdp0Var, this.f233332c), list);
                break;
        }
    }

    @Override // p204p.jsd0
    /* JADX INFO: renamed from: b */
    public void mo54226b(pdp0 pdp0Var, tnd0 tnd0Var) {
        switch (this.f233330a) {
            case 0:
                pdp0Var.mo43834E0(this.f233331b.m70782e2(tnd0Var, pdp0Var, this.f233332c));
                break;
            default:
                pdp0Var.mo43833E(this.f233331b.m70782e2(tnd0Var, pdp0Var, this.f233332c));
                break;
        }
    }
}
