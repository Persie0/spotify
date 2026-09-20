package p204p;

import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: classes4.dex */
public final class a41 implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f12109a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ c41 f12110b;

    public /* synthetic */ a41(c41 c41Var, int i) {
        this.f12109a = i;
        this.f12110b = c41Var;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        switch (this.f12109a) {
            case 0:
                this.f12110b.f33801f.mo47345e();
                break;
            case 1:
                this.f12110b.f33803h.mo35747a(((u31) obj).f226254b);
                break;
            default:
                v31 v31Var = (v31) obj;
                c41 c41Var = this.f12110b;
                c41Var.f33803h.mo35747a(C2663zu.m96956a(c41Var.f33797b, c41Var.f33802g, v31Var.f236748b, v31Var.f236749c, v31Var.f236750d));
                break;
        }
    }
}
