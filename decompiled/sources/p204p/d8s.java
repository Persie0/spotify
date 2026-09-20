package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class d8s extends mb61 implements xh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f46507a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ boolean f46508b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ boolean f46509c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ boolean f46510d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d8s() {
        super(4, null);
        this.f46507a = 5;
    }

    @Override // p204p.xh00
    /* JADX INFO: renamed from: M */
    public final Object mo24818M(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.f46507a;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
        boolean zBooleanValue3 = ((Boolean) obj3).booleanValue();
        fbk fbkVar = (fbk) obj4;
        switch (i) {
            case 0:
                d8s d8sVar = new d8s(4, 0, fbkVar);
                d8sVar.f46508b = zBooleanValue;
                d8sVar.f46509c = zBooleanValue2;
                d8sVar.f46510d = zBooleanValue3;
                return d8sVar.invokeSuspend(w2a1.f247311a);
            case 1:
                d8s d8sVar2 = new d8s(4, 1, fbkVar);
                d8sVar2.f46508b = zBooleanValue;
                d8sVar2.f46509c = zBooleanValue2;
                d8sVar2.f46510d = zBooleanValue3;
                return d8sVar2.invokeSuspend(w2a1.f247311a);
            case 2:
                d8s d8sVar3 = new d8s(4, 2, fbkVar);
                d8sVar3.f46508b = zBooleanValue;
                d8sVar3.f46509c = zBooleanValue2;
                d8sVar3.f46510d = zBooleanValue3;
                return d8sVar3.invokeSuspend(w2a1.f247311a);
            case 3:
                d8s d8sVar4 = new d8s(4, 3, fbkVar);
                d8sVar4.f46508b = zBooleanValue;
                d8sVar4.f46509c = zBooleanValue2;
                d8sVar4.f46510d = zBooleanValue3;
                return d8sVar4.invokeSuspend(w2a1.f247311a);
            case 4:
                d8s d8sVar5 = new d8s(4, 4, fbkVar);
                d8sVar5.f46508b = zBooleanValue;
                d8sVar5.f46509c = zBooleanValue2;
                d8sVar5.f46510d = zBooleanValue3;
                return d8sVar5.invokeSuspend(w2a1.f247311a);
            default:
                d8s d8sVar6 = new d8s(4, 5, fbkVar);
                d8sVar6.f46508b = zBooleanValue;
                d8sVar6.f46509c = zBooleanValue2;
                d8sVar6.f46510d = zBooleanValue3;
                return d8sVar6.invokeSuspend(w2a1.f247311a);
        }
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        switch (this.f46507a) {
            case 0:
                boolean z = this.f46508b;
                boolean z2 = this.f46509c;
                boolean z3 = this.f46510d;
                bga.m29073P(obj);
                return Boolean.valueOf(z || z2 || z3);
            case 1:
                boolean z4 = this.f46508b;
                boolean z5 = this.f46509c;
                boolean z6 = this.f46510d;
                bga.m29073P(obj);
                return new ixz(z4, z6, z5);
            case 2:
                boolean z7 = this.f46508b;
                boolean z8 = this.f46509c;
                boolean z9 = this.f46510d;
                bga.m29073P(obj);
                return Boolean.valueOf(z7 || z8 || z9);
            case 3:
                boolean z10 = this.f46508b;
                boolean z11 = this.f46509c;
                boolean z12 = this.f46510d;
                bga.m29073P(obj);
                return new smn0(z10, z11, z12);
            case 4:
                boolean z13 = this.f46508b;
                boolean z14 = this.f46509c;
                boolean z15 = this.f46510d;
                bga.m29073P(obj);
                if (!z15) {
                    z13 = z14;
                }
                return new tf91(z13, z15 ? gf91.f79313e : if91.f101735e);
            default:
                boolean z16 = this.f46508b;
                boolean z17 = this.f46509c;
                boolean z18 = this.f46510d;
                bga.m29073P(obj);
                return new u3e1(z16, z17, z18);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d8s(int i, int i2, fbk fbkVar) {
        super(i, fbkVar);
        this.f46507a = i2;
    }
}
