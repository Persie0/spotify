package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class lx5 extends mb61 implements zh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f137724a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ boolean f137725b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ boolean f137726c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ boolean f137727d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ boolean f137728e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lx5(int i, int i2, fbk fbkVar) {
        super(i, fbkVar);
        this.f137724a = i2;
    }

    @Override // p204p.zh00
    /* JADX INFO: renamed from: e1 */
    public final Object mo25195e1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i = this.f137724a;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
        boolean zBooleanValue3 = ((Boolean) obj3).booleanValue();
        boolean zBooleanValue4 = ((Boolean) obj4).booleanValue();
        fbk fbkVar = (fbk) obj5;
        switch (i) {
            case 0:
                lx5 lx5Var = new lx5(5, 0, fbkVar);
                lx5Var.f137725b = zBooleanValue;
                lx5Var.f137726c = zBooleanValue2;
                lx5Var.f137727d = zBooleanValue3;
                lx5Var.f137728e = zBooleanValue4;
                return lx5Var.invokeSuspend(w2a1.f247311a);
            case 1:
                lx5 lx5Var2 = new lx5(5, 1, fbkVar);
                lx5Var2.f137725b = zBooleanValue;
                lx5Var2.f137726c = zBooleanValue2;
                lx5Var2.f137727d = zBooleanValue3;
                lx5Var2.f137728e = zBooleanValue4;
                return lx5Var2.invokeSuspend(w2a1.f247311a);
            case 2:
                lx5 lx5Var3 = new lx5(5, 2, fbkVar);
                lx5Var3.f137725b = zBooleanValue;
                lx5Var3.f137726c = zBooleanValue2;
                lx5Var3.f137727d = zBooleanValue3;
                lx5Var3.f137728e = zBooleanValue4;
                return lx5Var3.invokeSuspend(w2a1.f247311a);
            case 3:
                lx5 lx5Var4 = new lx5(5, 3, fbkVar);
                lx5Var4.f137725b = zBooleanValue;
                lx5Var4.f137726c = zBooleanValue2;
                lx5Var4.f137727d = zBooleanValue3;
                lx5Var4.f137728e = zBooleanValue4;
                return lx5Var4.invokeSuspend(w2a1.f247311a);
            case 4:
                lx5 lx5Var5 = new lx5(5, 4, fbkVar);
                lx5Var5.f137725b = zBooleanValue;
                lx5Var5.f137726c = zBooleanValue2;
                lx5Var5.f137727d = zBooleanValue3;
                lx5Var5.f137728e = zBooleanValue4;
                return lx5Var5.invokeSuspend(w2a1.f247311a);
            case 5:
                lx5 lx5Var6 = new lx5(5, 5, fbkVar);
                lx5Var6.f137725b = zBooleanValue;
                lx5Var6.f137726c = zBooleanValue2;
                lx5Var6.f137727d = zBooleanValue3;
                lx5Var6.f137728e = zBooleanValue4;
                return lx5Var6.invokeSuspend(w2a1.f247311a);
            default:
                lx5 lx5Var7 = new lx5(5, 6, fbkVar);
                lx5Var7.f137725b = zBooleanValue;
                lx5Var7.f137726c = zBooleanValue2;
                lx5Var7.f137727d = zBooleanValue3;
                lx5Var7.f137728e = zBooleanValue4;
                return lx5Var7.invokeSuspend(w2a1.f247311a);
        }
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        switch (this.f137724a) {
            case 0:
                boolean z = this.f137725b;
                boolean z2 = this.f137726c;
                boolean z3 = this.f137727d;
                boolean z4 = this.f137728e;
                bga.m29073P(obj);
                if (!z) {
                    z3 = z2 ? z4 : false;
                }
                return Boolean.valueOf(z3);
            case 1:
                boolean z5 = this.f137725b;
                boolean z6 = this.f137726c;
                boolean z7 = this.f137727d;
                boolean z8 = this.f137728e;
                bga.m29073P(obj);
                return Boolean.valueOf((z5 || z6 || z7) && z8);
            case 2:
                boolean z9 = this.f137725b;
                boolean z10 = this.f137726c;
                boolean z11 = this.f137727d;
                boolean z12 = this.f137728e;
                bga.m29073P(obj);
                return Boolean.valueOf((z9 || z10 || z11 || z12) ? false : true);
            case 3:
                boolean z13 = this.f137725b;
                boolean z14 = this.f137726c;
                boolean z15 = this.f137727d;
                boolean z16 = this.f137728e;
                bga.m29073P(obj);
                return Boolean.valueOf(!z13 && z14 && z15 && !z16);
            case 4:
                boolean z17 = this.f137725b;
                boolean z18 = this.f137726c;
                boolean z19 = this.f137727d;
                boolean z20 = this.f137728e;
                bga.m29073P(obj);
                return new cyk0(z17, z18, z19, z20);
            case 5:
                boolean z21 = this.f137725b;
                boolean z22 = this.f137726c;
                boolean z23 = this.f137727d;
                boolean z24 = this.f137728e;
                bga.m29073P(obj);
                return new rsr0(z23, z24, z21, z22);
            default:
                boolean z25 = this.f137725b;
                boolean z26 = this.f137726c;
                boolean z27 = this.f137727d;
                boolean z28 = this.f137728e;
                bga.m29073P(obj);
                return Boolean.valueOf(z25 && (z26 || z27 || z28));
        }
    }
}
