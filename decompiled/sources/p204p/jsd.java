package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class jsd extends mb61 implements vh00 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ boolean f115478a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ boolean f115479b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f115480c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jsd(boolean z, fbk fbkVar) {
        super(3, fbkVar);
        this.f115480c = z;
    }

    @Override // p204p.vh00
    /* JADX INFO: renamed from: D0 */
    public final Object mo24510D0(Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
        jsd jsdVar = new jsd(this.f115480c, (fbk) obj3);
        jsdVar.f115478a = zBooleanValue;
        jsdVar.f115479b = zBooleanValue2;
        return jsdVar.invokeSuspend(w2a1.f247311a);
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        boolean z = this.f115478a;
        boolean z2 = this.f115479b;
        bga.m29073P(obj);
        return new isd(z, this.f115480c, z2);
    }
}
