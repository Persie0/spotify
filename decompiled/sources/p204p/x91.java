package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class x91 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f259255a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gh00 f259256b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ t91 f259257c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x91(int i, t91 t91Var, gh00 gh00Var) {
        super(0);
        this.f259255a = i;
        this.f259256b = gh00Var;
        this.f259257c = t91Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f259255a) {
            case 0:
                this.f259256b.invoke(new g91(this.f259257c.f218170b.f35362a));
                break;
            default:
                this.f259256b.invoke(new g91(this.f259257c.f218170b.f35362a));
                break;
        }
        return w2a1.f247311a;
    }
}
