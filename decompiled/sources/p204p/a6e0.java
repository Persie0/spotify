package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class a6e0 extends qe70 implements th00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f12780a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ b6e0 f12781b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ f220 f12782c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ofx f12783d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a6e0(b6e0 b6e0Var, f220 f220Var, ofx ofxVar, int i) {
        super(2);
        this.f12780a = i;
        this.f12781b = b6e0Var;
        this.f12782c = f220Var;
        this.f12783d = ofxVar;
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f12780a) {
            case 0:
                return b6e0.m28296b(this.f12781b, new cw41((xv41) obj), this.f12782c.f65091a, this.f12783d);
            default:
                return b6e0.m28296b(this.f12781b, new cw41((xv41) obj), this.f12782c.f65091a, this.f12783d);
        }
    }
}
