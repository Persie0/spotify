package p204p;

import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: classes10.dex */
public final class xp11 implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f264408a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ jy21 f264409b;

    public /* synthetic */ xp11(jy21 jy21Var, int i) {
        this.f264408a = i;
        this.f264409b = jy21Var;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        switch (this.f264408a) {
            case 0:
                wy21 wy21Var = (wy21) obj;
                rje rjeVarM54773a = this.f264409b.m54773a(wy21Var.f256178a);
                if (rjeVarM54773a != null) {
                    rjeVarM54773a.f199799c.onNext(new p031(wy21Var.f256179b));
                }
                break;
            case 1:
                yy21 yy21Var = (yy21) obj;
                rje rjeVarM54773a2 = this.f264409b.m54773a(yy21Var.f277385a);
                if (rjeVarM54773a2 != null) {
                    rjeVarM54773a2.f199799c.onNext(new r031(yy21Var.f277386b, yy21Var.f277387c));
                }
                break;
            default:
                zy21 zy21Var = (zy21) obj;
                rje rjeVarM54773a3 = this.f264409b.m54773a(zy21Var.f287477a);
                if (rjeVarM54773a3 != null) {
                    rjeVarM54773a3.f199799c.onNext(new s031(zy21Var.f287478b));
                }
                break;
        }
    }
}
