package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class vw61 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f245422a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ww61 f245423b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vw61(ww61 ww61Var, int i) {
        super(0);
        this.f245422a = i;
        this.f245423b = ww61Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f245422a) {
            case 0:
                woy woyVar = this.f245423b.f255711e;
                woyVar.f253615e.m97090l(null);
                woyVar.f253619i.m97090l(null);
                zv41 zv41Var = woyVar.f253617g;
                zv41Var.m97091m(null, Integer.valueOf(((Number) zv41Var.getValue()).intValue() + 1));
                break;
            default:
                woy woyVar2 = this.f245423b.f255711e;
                zv41 zv41Var2 = woyVar2.f253615e;
                zv41 zv41Var3 = woyVar2.f253614d;
                uoy uoyVar = (uoy) zv41Var2.getValue();
                if (uoyVar != null) {
                    zv41Var2.m97090l(null);
                    Boolean bool = Boolean.FALSE;
                    zv41Var3.getClass();
                    zv41Var3.m97091m(null, bool);
                    woyVar2.f253611a.m97090l(uoyVar.f232540b);
                    zv41Var3.getClass();
                    zv41Var3.m97091m(null, bool);
                    zv41 zv41Var4 = woyVar2.f253617g;
                    zv41Var4.m97091m(null, Integer.valueOf(((Number) zv41Var4.getValue()).intValue() + 1));
                }
                break;
        }
        return w2a1.f247311a;
    }
}
