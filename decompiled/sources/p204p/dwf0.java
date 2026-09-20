package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class dwf0 extends mb61 implements zh00 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ boolean f53688a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ boolean f53689b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ boolean f53690c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ uvf0 f53691d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ zvf0 f53692e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dwf0(zvf0 zvf0Var, fbk fbkVar) {
        super(5, fbkVar);
        this.f53692e = zvf0Var;
    }

    @Override // p204p.zh00
    /* JADX INFO: renamed from: e1 */
    public final Object mo25195e1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
        boolean zBooleanValue3 = ((Boolean) obj3).booleanValue();
        dwf0 dwf0Var = new dwf0(this.f53692e, (fbk) obj5);
        dwf0Var.f53688a = zBooleanValue;
        dwf0Var.f53689b = zBooleanValue2;
        dwf0Var.f53690c = zBooleanValue3;
        dwf0Var.f53691d = (uvf0) obj4;
        return dwf0Var.invokeSuspend(w2a1.f247311a);
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        boolean z = this.f53688a;
        boolean z2 = this.f53689b;
        boolean z3 = this.f53690c;
        uvf0 uvf0Var = this.f53691d;
        bga.m29073P(obj);
        return new bwf0(this.f53692e, z, z2, uvf0Var.m84055a() && this.f53692e.m97092a(), z3);
    }
}
