package p204p;

import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: classes3.dex */
public final class x3z0 implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f257919a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ z3z0 f257920b;

    public /* synthetic */ x3z0(z3z0 z3z0Var, int i) {
        this.f257919a = i;
        this.f257920b = z3z0Var;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        switch (this.f257919a) {
            case 0:
                xoi0 xoi0Var = this.f257920b.f279075j;
                mnc1 mnc1Var = (mnc1) xoi0Var.mo33098e();
                if (mnc1Var != null && mnc1Var.f145401e) {
                    mnc1 mnc1Var2 = (mnc1) xoi0Var.mo33098e();
                    xoi0Var.mo33104m(mnc1Var2 != null ? mnc1.m62355a(mnc1Var2, null, null, null, 215) : null);
                    break;
                }
                break;
            case 1:
                this.f257920b.f279075j.m33101j((mnc1) obj);
                break;
            default:
                this.f257920b.f279075j.m33101j((mnc1) obj);
                break;
        }
    }
}
