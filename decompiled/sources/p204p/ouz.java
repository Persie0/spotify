package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class ouz extends mb61 implements vh00 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ boolean f170372a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ boolean f170373b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ vtz f170374c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ouz(vtz vtzVar, fbk fbkVar) {
        super(3, fbkVar);
        this.f170374c = vtzVar;
    }

    @Override // p204p.vh00
    /* JADX INFO: renamed from: D0 */
    public final Object mo24510D0(Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
        ouz ouzVar = new ouz(this.f170374c, (fbk) obj3);
        ouzVar.f170372a = zBooleanValue;
        ouzVar.f170373b = zBooleanValue2;
        return ouzVar.invokeSuspend(w2a1.f247311a);
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        boolean z = this.f170372a;
        boolean z2 = this.f170373b;
        bga.m29073P(obj);
        vtz vtzVar = this.f170374c;
        if (z2) {
            return new cuz(vtzVar.m86403a(), null);
        }
        return z ? new euz(vtzVar.m86404b()) : new fuz(vtzVar.m86404b());
    }
}
