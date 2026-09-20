package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class f5e extends mb61 implements vh00 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ boolean f66028a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ boolean f66029b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f66030c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f5e(int i, fbk fbkVar) {
        super(3, fbkVar);
        this.f66030c = i;
    }

    @Override // p204p.vh00
    /* JADX INFO: renamed from: D0 */
    public final Object mo24510D0(Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
        f5e f5eVar = new f5e(this.f66030c, (fbk) obj3);
        f5eVar.f66028a = zBooleanValue;
        f5eVar.f66029b = zBooleanValue2;
        return f5eVar.invokeSuspend(w2a1.f247311a);
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        boolean z = this.f66028a;
        boolean z2 = this.f66029b;
        bga.m29073P(obj);
        return new e5e(this.f66030c, z, z2);
    }
}
