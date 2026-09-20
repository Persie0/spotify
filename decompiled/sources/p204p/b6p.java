package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class b6p extends mb61 implements vh00 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ rqi f23999a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ boolean f24000b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ lqi f24001c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ e6p f24002d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b6p(lqi lqiVar, e6p e6pVar, fbk fbkVar) {
        super(3, fbkVar);
        this.f24001c = lqiVar;
        this.f24002d = e6pVar;
    }

    @Override // p204p.vh00
    /* JADX INFO: renamed from: D0 */
    public final Object mo24510D0(Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        b6p b6pVar = new b6p(this.f24001c, this.f24002d, (fbk) obj3);
        b6pVar.f23999a = (rqi) obj;
        b6pVar.f24000b = zBooleanValue;
        return b6pVar.invokeSuspend(w2a1.f247311a);
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        rqi rqiVar = this.f23999a;
        boolean z = this.f24000b;
        bga.m29073P(obj);
        lqi lqiVar = this.f24001c;
        return new mqi(rqiVar, z, lqiVar.m59765a(), lqiVar.m59767c(), lqiVar.m59768d(), lqiVar.m59766b(), this.f24002d.f56679d.m47391a());
    }
}
