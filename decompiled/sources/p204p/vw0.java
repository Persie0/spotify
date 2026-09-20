package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class vw0 extends mb61 implements vh00 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ long f245367a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ long f245368b;

    @Override // p204p.vh00
    /* JADX INFO: renamed from: D0 */
    public final Object mo24510D0(Object obj, Object obj2, Object obj3) {
        long jLongValue = ((Number) obj).longValue();
        long jLongValue2 = ((Number) obj2).longValue();
        vw0 vw0Var = new vw0(3, (fbk) obj3);
        vw0Var.f245367a = jLongValue;
        vw0Var.f245368b = jLongValue2;
        return vw0Var.invokeSuspend(w2a1.f247311a);
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        long j = this.f245367a;
        long j2 = this.f245368b;
        bga.m29073P(obj);
        return new bm81(j, j2);
    }
}
