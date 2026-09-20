package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class kf50 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f122062a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ req f122063b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f122064c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kf50(req reqVar, String str, int i) {
        super(1);
        this.f122062a = i;
        this.f122063b = reqVar;
        this.f122064c = str;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f122062a) {
            case 0:
                req reqVar = this.f122063b;
                meq meqVar = reqVar.f198409f;
                meqVar.getClass();
                leq leqVar = new leq(meqVar);
                leqVar.m58812k(this.f122064c);
                reqVar.mo33116c(new meq(leqVar));
                break;
            default:
                req reqVar2 = this.f122063b;
                meq meqVar2 = reqVar2.f198409f;
                meqVar2.getClass();
                leq leqVar2 = new leq(meqVar2);
                leqVar2.m58813l(this.f122064c);
                reqVar2.mo33116c(new meq(leqVar2));
                break;
        }
        return w2a1.f247311a;
    }
}
