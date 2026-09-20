package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class qo5 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f190787a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ to5 f190788b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gh00 f190789c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qo5(to5 to5Var, gh00 gh00Var, int i) {
        super(0);
        this.f190787a = i;
        this.f190788b = to5Var;
        this.f190789c = gh00Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f190787a) {
            case 0:
                this.f190788b.f222176e.mo33827h();
                this.f190789c.invoke(rn5.f200729a);
                break;
            default:
                this.f190788b.f222176e.mo33825c();
                this.f190789c.invoke(sn5.f210804a);
                break;
        }
        return w2a1.f247311a;
    }
}
