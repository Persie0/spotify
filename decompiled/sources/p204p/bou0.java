package p204p;

import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: classes10.dex */
public final class bou0 implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f29253a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ cou0 f29254b;

    public /* synthetic */ bou0(cou0 cou0Var, int i) {
        this.f29253a = i;
        this.f29254b = cou0Var;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        switch (this.f29253a) {
            case 0:
                this.f29254b.f40342a.m75424a(true);
                break;
            case 1:
                this.f29254b.f40342a.m75424a(false);
                break;
            default:
                u191 u191Var = (u191) obj;
                ue71 ue71Var = this.f29254b.f40344c;
                int i = u191Var.f225728a;
                int i2 = u191Var.f225729b;
                zv41 zv41Var = ue71Var.f229453a;
                Integer numValueOf = Integer.valueOf(i);
                zv41Var.getClass();
                zv41Var.m97091m(null, numValueOf);
                zv41 zv41Var2 = ue71Var.f229455c;
                Integer numValueOf2 = Integer.valueOf(i2);
                zv41Var2.getClass();
                zv41Var2.m97091m(null, numValueOf2);
                break;
        }
    }
}
