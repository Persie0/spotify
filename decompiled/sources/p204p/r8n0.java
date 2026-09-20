package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class r8n0 extends mb61 implements vh00 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ boolean f196821a;

    @Override // p204p.vh00
    /* JADX INFO: renamed from: D0 */
    public final Object mo24510D0(Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        r8n0 r8n0Var = new r8n0(3, (fbk) obj3);
        r8n0Var.f196821a = zBooleanValue;
        return r8n0Var.invokeSuspend(w2a1.f247311a);
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        boolean z = this.f196821a;
        bga.m29073P(obj);
        return new tou0(z ? 1 : 3);
    }
}
