package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class eg50 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f59223a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zpa1 f59224b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ eh00 f59225c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eg50(zpa1 zpa1Var, eh00 eh00Var, int i) {
        super(0);
        this.f59223a = i;
        this.f59224b = zpa1Var;
        this.f59225c = eh00Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f59223a) {
            case 0:
                this.f59224b.m96682i(this.f59225c);
                break;
            case 1:
                this.f59224b.m96682i(this.f59225c);
                break;
            default:
                this.f59224b.f285063f.m70547a();
                this.f59225c.invoke();
                break;
        }
        return w2a1.f247311a;
    }
}
