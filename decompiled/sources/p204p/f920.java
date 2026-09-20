package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class f920 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f67155a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gh00 f67156b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ yqx0 f67157c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f920(gh00 gh00Var, yqx0 yqx0Var, int i) {
        super(0);
        this.f67155a = i;
        this.f67156b = gh00Var;
        this.f67157c = yqx0Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f67155a) {
            case 0:
                this.f67156b.invoke(new c620(this.f67157c));
                break;
            case 1:
                this.f67156b.invoke(new a620(this.f67157c));
                break;
            default:
                this.f67156b.invoke(new b620(this.f67157c));
                break;
        }
        return w2a1.f247311a;
    }
}
