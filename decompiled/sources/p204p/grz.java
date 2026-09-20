package p204p;

import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: classes11.dex */
public final class grz implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f83852a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ hrz f83853b;

    public /* synthetic */ grz(hrz hrzVar, int i) {
        this.f83852a = i;
        this.f83853b = hrzVar;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        switch (this.f83852a) {
            case 0:
                sd3 sd3Var = (sd3) obj;
                k8y0 k8y0Var = this.f83853b.f94558a;
                wr31 wr31Var = sd3Var.f207869j;
                ns31 ns31Var = sd3Var.f207870k;
                k8y0Var.mo40826c(wr31Var, ns31Var.f157657a, ns31Var.f157658b);
                break;
            case 1:
                this.f83853b.f94558a.mo40825b(((td3) obj).f219219j);
                break;
            default:
                this.f83853b.f94560c.m78113b(((wd3) obj).f250197j);
                break;
        }
    }
}
