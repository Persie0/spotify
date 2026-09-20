package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class v7p extends mb61 implements xh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f238288a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ boolean f238289b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Boolean f238290c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ boolean f238291d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v7p(int i, int i2, fbk fbkVar) {
        super(i, fbkVar);
        this.f238288a = i2;
    }

    @Override // p204p.xh00
    /* JADX INFO: renamed from: M */
    public final Object mo24818M(Object obj, Object obj2, Object obj3, Object obj4) {
        Boolean bool = (Boolean) obj;
        switch (this.f238288a) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
                v7p v7pVar = new v7p(4, 0, (fbk) obj4);
                v7pVar.f238290c = bool;
                v7pVar.f238289b = zBooleanValue;
                v7pVar.f238291d = zBooleanValue2;
                return v7pVar.invokeSuspend(w2a1.f247311a);
            default:
                boolean zBooleanValue3 = bool.booleanValue();
                boolean zBooleanValue4 = ((Boolean) obj3).booleanValue();
                v7p v7pVar2 = new v7p(4, 1, (fbk) obj4);
                v7pVar2.f238289b = zBooleanValue3;
                v7pVar2.f238290c = (Boolean) obj2;
                v7pVar2.f238291d = zBooleanValue4;
                return v7pVar2.invokeSuspend(w2a1.f247311a);
        }
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        switch (this.f238288a) {
            case 0:
                Boolean bool = this.f238290c;
                boolean z = this.f238289b;
                boolean z2 = this.f238291d;
                bga.m29073P(obj);
                return Boolean.valueOf(bool.booleanValue() || !(z2 || z));
            default:
                boolean z3 = this.f238289b;
                Boolean bool2 = this.f238290c;
                boolean z4 = this.f238291d;
                bga.m29073P(obj);
                return Boolean.valueOf(z3 && bool2.booleanValue() && z4);
        }
    }
}
