package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class t9q0 extends mb61 implements zh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f218342a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ n5c f218343b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ r5c f218344c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ k5c f218345d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ cvt f218346e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ w5c f218347f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t9q0(w5c w5cVar, fbk fbkVar, int i) {
        super(5, fbkVar);
        this.f218342a = i;
        this.f218347f = w5cVar;
    }

    @Override // p204p.zh00
    /* JADX INFO: renamed from: e1 */
    public final Object mo25195e1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        n5c n5cVar = (n5c) obj;
        r5c r5cVar = (r5c) obj2;
        k5c k5cVar = (k5c) obj3;
        cvt cvtVar = (cvt) obj4;
        fbk fbkVar = (fbk) obj5;
        switch (this.f218342a) {
            case 0:
                t9q0 t9q0Var = new t9q0(this.f218347f, fbkVar, 0);
                t9q0Var.f218343b = n5cVar;
                t9q0Var.f218344c = r5cVar;
                t9q0Var.f218345d = k5cVar;
                t9q0Var.f218346e = cvtVar;
                w2a1 w2a1Var = w2a1.f247311a;
                t9q0Var.invokeSuspend(w2a1Var);
                return w2a1Var;
            default:
                t9q0 t9q0Var2 = new t9q0(this.f218347f, fbkVar, 1);
                t9q0Var2.f218343b = n5cVar;
                t9q0Var2.f218344c = r5cVar;
                t9q0Var2.f218345d = k5cVar;
                t9q0Var2.f218346e = cvtVar;
                w2a1 w2a1Var2 = w2a1.f247311a;
                t9q0Var2.invokeSuspend(w2a1Var2);
                return w2a1Var2;
        }
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        switch (this.f218342a) {
            case 0:
                n5c n5cVar = this.f218343b;
                r5c r5cVar = this.f218344c;
                k5c k5cVar = this.f218345d;
                cvt cvtVar = this.f218346e;
                bga.m29073P(obj);
                this.f218347f.mo24818M(n5cVar, r5cVar, k5cVar, cvtVar);
                break;
            default:
                n5c n5cVar2 = this.f218343b;
                r5c r5cVar2 = this.f218344c;
                k5c k5cVar2 = this.f218345d;
                cvt cvtVar2 = this.f218346e;
                bga.m29073P(obj);
                this.f218347f.mo24818M(n5cVar2, r5cVar2, k5cVar2, cvtVar2);
                break;
        }
        return w2a1.f247311a;
    }
}
