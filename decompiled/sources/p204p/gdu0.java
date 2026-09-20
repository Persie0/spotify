package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class gdu0 extends mb61 implements vh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f78949a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ boolean f78950b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ int f78951c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gdu0(int i, int i2, fbk fbkVar) {
        super(i, fbkVar);
        this.f78949a = i2;
    }

    @Override // p204p.vh00
    /* JADX INFO: renamed from: D0 */
    public final Object mo24510D0(Object obj, Object obj2, Object obj3) {
        int i = this.f78949a;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int iIntValue = ((Number) obj2).intValue();
        fbk fbkVar = (fbk) obj3;
        switch (i) {
            case 0:
                gdu0 gdu0Var = new gdu0(3, 0, fbkVar);
                gdu0Var.f78950b = zBooleanValue;
                gdu0Var.f78951c = iIntValue;
                return gdu0Var.invokeSuspend(w2a1.f247311a);
            default:
                gdu0 gdu0Var2 = new gdu0(3, 1, fbkVar);
                gdu0Var2.f78950b = zBooleanValue;
                gdu0Var2.f78951c = iIntValue;
                return gdu0Var2.invokeSuspend(w2a1.f247311a);
        }
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        switch (this.f78949a) {
            case 0:
                boolean z = this.f78950b;
                int i = this.f78951c;
                bga.m29073P(obj);
                return Boolean.valueOf(i >= 2 && z);
            default:
                boolean z2 = this.f78950b;
                int i2 = this.f78951c;
                bga.m29073P(obj);
                return new pqm0(Boolean.valueOf(z2), new Integer(i2));
        }
    }
}
