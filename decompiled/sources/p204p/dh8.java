package p204p;

import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: classes5.dex */
public final class dh8 implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f49012a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ rzo f49013b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ wzo f49014c;

    public /* synthetic */ dh8(rzo rzoVar, wzo wzoVar, int i) {
        this.f49012a = i;
        this.f49013b = rzoVar;
        this.f49014c = wzoVar;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        Object value;
        pzo pzoVar;
        Object value2;
        pzo pzoVar2;
        switch (this.f49012a) {
            case 0:
                rg8 rg8Var = (rg8) obj;
                rzo rzoVar = this.f49013b;
                if (rzoVar.f204192b.isEnabled()) {
                    zv41 zv41Var = rzoVar.f204193c;
                    do {
                        value = zv41Var.getValue();
                        pzoVar = (pzo) value;
                    } while (!zv41Var.m97089k(value, pzo.m71758a(pzoVar, pzoVar.f183747b + 1, 0, 0, 0, 0, 0, 509)));
                }
                this.f49014c.f256637e.onNext(new rc8(rg8Var.f198887a, rg8Var.f198888b, rg8Var.f198889c));
                break;
            default:
                tg8 tg8Var = (tg8) obj;
                rzo rzoVar2 = this.f49013b;
                if (rzoVar2.f204192b.isEnabled()) {
                    zv41 zv41Var2 = rzoVar2.f204193c;
                    do {
                        value2 = zv41Var2.getValue();
                        pzoVar2 = (pzo) value2;
                    } while (!zv41Var2.m97089k(value2, pzo.m71758a(pzoVar2, 0, 0, pzoVar2.f183749d + 1, 0, 0, 0, 503)));
                }
                this.f49014c.f256637e.onNext(new uc8(tg8Var.f220137a, tg8Var.f220138b));
                break;
        }
    }
}
