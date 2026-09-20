package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class z16 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f278239a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ wf11 f278240b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ eh00 f278241c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ kqi0 f278242d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z16(wf11 wf11Var, eh00 eh00Var, kqi0 kqi0Var, int i) {
        super(1);
        this.f278239a = i;
        this.f278240b = wf11Var;
        this.f278241c = eh00Var;
        this.f278242d = kqi0Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f278239a) {
            case 0:
                if (!this.f278240b.m87927i()) {
                    this.f278242d.setValue(Boolean.FALSE);
                }
                this.f278241c.invoke();
                break;
            default:
                if (!this.f278240b.m87927i()) {
                    this.f278242d.setValue(Boolean.FALSE);
                }
                this.f278241c.invoke();
                break;
        }
        return w2a1.f247311a;
    }
}
