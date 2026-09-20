package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class lqw0 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f136153a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f136154b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gh00 f136155c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ lpy f136156d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ kqi0 f136157e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lqw0(int i, gh00 gh00Var, lpy lpyVar, kqi0 kqi0Var, int i2) {
        super(0);
        this.f136153a = i2;
        this.f136154b = i;
        this.f136155c = gh00Var;
        this.f136156d = lpyVar;
        this.f136157e = kqi0Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f136153a) {
            case 0:
                this.f136157e.setValue(Integer.valueOf(this.f136154b));
                this.f136155c.invoke(this.f136156d.f135859a);
                break;
            default:
                this.f136157e.setValue(Integer.valueOf(this.f136154b));
                this.f136155c.invoke(this.f136156d.f135859a);
                break;
        }
        return w2a1.f247311a;
    }
}
