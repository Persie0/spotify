package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class hsq0 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f94784a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gh00 f94785b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ csq0 f94786c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hsq0(gh00 gh00Var, csq0 csq0Var, int i) {
        super(0);
        this.f94784a = i;
        this.f94785b = gh00Var;
        this.f94786c = csq0Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f94784a) {
            case 0:
                this.f94785b.invoke(new zrq0(this.f94786c.f41679d));
                break;
            default:
                this.f94785b.invoke(new asq0(this.f94786c, 2));
                break;
        }
        return w2a1.f247311a;
    }
}
