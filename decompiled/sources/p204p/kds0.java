package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class kds0 extends qe70 implements th00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f121733a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ lds0 f121734b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ f220 f121735c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ofx f121736d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kds0(lds0 lds0Var, f220 f220Var, ofx ofxVar, int i) {
        super(2);
        this.f121733a = i;
        this.f121734b = lds0Var;
        this.f121735c = f220Var;
        this.f121736d = ofxVar;
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f121733a) {
            case 0:
                return lds0.m58759b(this.f121734b, new cw41((xv41) obj), this.f121735c.f65091a, this.f121736d);
            default:
                return lds0.m58759b(this.f121734b, new cw41((xv41) obj), this.f121735c.f65091a, this.f121736d);
        }
    }
}
