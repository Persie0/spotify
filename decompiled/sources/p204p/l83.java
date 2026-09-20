package p204p;

import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: classes9.dex */
public final class l83 implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f130791a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ n83 f130792b;

    public /* synthetic */ l83(n83 n83Var, int i) {
        this.f130791a = i;
        this.f130792b = n83Var;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        switch (this.f130791a) {
            case 0:
                i83 i83Var = i83.f99683d;
                n83 n83Var = this.f130792b;
                n83Var.f151319X1 = i83Var;
                n83Var.m63827u1();
                break;
            case 1:
                if (((t83) obj) instanceof r83) {
                    n83 n83Var2 = this.f130792b;
                    n83Var2.f151320Y1 = true;
                    n83Var2.f151319X1 = i83.f99681b;
                    n83Var2.m63827u1();
                }
                break;
            default:
                i83 i83Var2 = i83.f99683d;
                n83 n83Var3 = this.f130792b;
                n83Var3.f151319X1 = i83Var2;
                n83Var3.m63827u1();
                break;
        }
    }
}
