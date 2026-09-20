package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class bji0 extends qe70 implements th00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f27704a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ cji0 f27705b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ofx f27706c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bji0(cji0 cji0Var, ofx ofxVar, int i) {
        super(2);
        this.f27704a = i;
        this.f27705b = cji0Var;
        this.f27706c = ofxVar;
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f27704a) {
            case 0:
                return cji0.m32989b(this.f27705b, new cw41((xv41) obj), this.f27706c);
            default:
                return cji0.m32989b(this.f27705b, new cw41((xv41) obj), this.f27706c);
        }
    }
}
