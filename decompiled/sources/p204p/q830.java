package p204p;

import io.reactivex.rxjava3.functions.Consumer;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes7.dex */
public final class q830 implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f186225a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ lkp f186226b;

    public /* synthetic */ q830(lkp lkpVar, int i) {
        this.f186225a = i;
        this.f186226b = lkpVar;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        fx30 xw30Var;
        switch (this.f186225a) {
            case 0:
                this.f186226b.m59288a(new kw30(((i830) obj).f99685c));
                return;
            case 1:
                this.f186226b.m59288a(lw30.f137442c);
                return;
            case 2:
                this.f186226b.m59288a(new aw30(((t2k0) obj).f216581a));
                return;
            case 3:
                this.f186226b.m59288a(ax30.f20753c);
                return;
            case 4:
                this.f186226b.m59288a(bx30.f31774c);
                return;
            case 5:
                x2k0 x2k0Var = (x2k0) obj;
                this.f186226b.m59288a(new ww30(x2k0Var.f257515a, x2k0Var.f257516b));
                return;
            case 6:
                y2k0 y2k0Var = (y2k0) obj;
                boolean z = y2k0Var.f268633a;
                int iM38547C = edb.m38547C(y2k0Var.f268634b);
                if (iM38547C == 0) {
                    xw30Var = new xw30(z);
                } else {
                    if (iM38547C != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    xw30Var = new yw30(z);
                }
                this.f186226b.m59288a(xw30Var);
                return;
            case 7:
                d3k0 d3k0Var = (d3k0) obj;
                this.f186226b.m59288a(new ow30(d3k0Var.f44922a, d3k0Var.f44923b, d3k0Var.f44924c, d3k0Var.f44926e, d3k0Var.f44925d));
                return;
            case 8:
                uj60 uj60Var = ((e3k0) obj).f55822a;
                this.f186226b.m59288a(new rw30(uj60Var instanceof sj60, uj60Var.f230912a));
                return;
            case 9:
                f3k0 f3k0Var = (f3k0) obj;
                this.f186226b.m59288a(new zw30(f3k0Var.f65525b, f3k0Var.f65526c, f3k0Var.f65524a));
                return;
            default:
                g3k0 g3k0Var = (g3k0) obj;
                this.f186226b.m59288a(new ex30(g3k0Var.f76225a, g3k0Var.f76226b));
                return;
        }
    }
}
