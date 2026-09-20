package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class em70 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f60839a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gh00 f60840b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ am70 f60841c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ em70(gh00 gh00Var, am70 am70Var, int i) {
        super(0);
        this.f60839a = i;
        this.f60840b = gh00Var;
        this.f60841c = am70Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f60839a) {
            case 0:
                this.f60840b.invoke(new vl70(this.f60841c));
                break;
            default:
                this.f60840b.invoke(new wl70(this.f60841c));
                break;
        }
        return w2a1.f247311a;
    }
}
