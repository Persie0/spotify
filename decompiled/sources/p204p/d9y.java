package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class d9y extends mb61 implements xh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f46930a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ boolean f46931b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ boolean f46932c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f46933d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f46934e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d9y(Object obj, fbk fbkVar, int i) {
        super(4, fbkVar);
        this.f46930a = i;
        this.f46934e = obj;
    }

    @Override // p204p.xh00
    /* JADX INFO: renamed from: M */
    public final Object mo24818M(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f46930a) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
                d9y d9yVar = new d9y((skp) this.f46934e, (fbk) obj4, 0);
                d9yVar.f46933d = (b8l0) obj;
                d9yVar.f46931b = zBooleanValue;
                d9yVar.f46932c = zBooleanValue2;
                return d9yVar.invokeSuspend(w2a1.f247311a);
            default:
                boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                boolean zBooleanValue4 = ((Boolean) obj2).booleanValue();
                d9y d9yVar2 = new d9y((avb1) this.f46934e, (fbk) obj4, 1);
                d9yVar2.f46931b = zBooleanValue3;
                d9yVar2.f46932c = zBooleanValue4;
                d9yVar2.f46933d = (sub1) obj3;
                return d9yVar2.invokeSuspend(w2a1.f247311a);
        }
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        switch (this.f46930a) {
            case 0:
                b8l0 b8l0Var = (b8l0) this.f46933d;
                boolean z = this.f46931b;
                boolean z2 = this.f46932c;
                bga.m29073P(obj);
                if (z || b8l0Var == b8l0.f24607d || z2) {
                    return l190.f128657c;
                }
                return b8l0Var == b8l0.f24606c ? l190.f128656b : l190.f128655a;
            default:
                boolean z3 = this.f46931b;
                boolean z4 = this.f46932c;
                sub1 sub1Var = (sub1) this.f46933d;
                bga.m29073P(obj);
                if ((!z3 && z4) || (z3 && z4 && (sub1Var.f214048b || sub1Var.f214047a))) {
                    return rub1.f202795d;
                }
                if (z3 && z4) {
                    return rub1.f202793b;
                }
                return (!z3 || z4) ? rub1.f202792a : rub1.f202794c;
        }
    }
}
