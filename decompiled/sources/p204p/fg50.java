package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class fg50 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f69226a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gh00 f69227b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zpa1 f69228c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ eh00 f69229d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fg50(gh00 gh00Var, zpa1 zpa1Var, eh00 eh00Var, int i) {
        super(0);
        this.f69226a = i;
        this.f69227b = gh00Var;
        this.f69228c = zpa1Var;
        this.f69229d = eh00Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f69226a) {
            case 0:
                this.f69227b.invoke(new eg50(this.f69228c, this.f69229d, 0));
                break;
            default:
                this.f69227b.invoke(new eg50(this.f69228c, this.f69229d, 1));
                break;
        }
        return w2a1.f247311a;
    }
}
