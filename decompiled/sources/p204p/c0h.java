package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class c0h extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f32778a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gh00 f32779b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ sco0 f32780c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0h(gh00 gh00Var, sco0 sco0Var, int i) {
        super(0);
        this.f32778a = i;
        this.f32779b = gh00Var;
        this.f32780c = sco0Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f32778a) {
            case 0:
                sco0 sco0Var = this.f32780c;
                this.f32779b.invoke(new tte1(sco0Var.f207780g, sco0Var.f207779f));
                break;
            default:
                this.f32779b.invoke(this.f32780c.f207779f);
                break;
        }
        return w2a1.f247311a;
    }
}
