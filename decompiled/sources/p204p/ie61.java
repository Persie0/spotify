package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ie61 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f101333a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gh00 f101334b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f101335c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ie61(gh00 gh00Var, boolean z, int i) {
        super(0);
        this.f101333a = i;
        this.f101334b = gh00Var;
        this.f101335c = z;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f101333a) {
            case 0:
                this.f101334b.invoke(new ye61(!this.f101335c));
                break;
            case 1:
                this.f101334b.invoke(Boolean.valueOf(!this.f101335c));
                break;
            default:
                this.f101334b.invoke(this.f101335c ? kae1.f120886a : lae1.f131335a);
                break;
        }
        return w2a1.f247311a;
    }
}
