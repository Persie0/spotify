package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class ao21 extends mb61 implements zh00 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ long f17545a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ long f17546b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ String f17547c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ it91 f17548d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Long f17549e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ao21(Long l, fbk fbkVar) {
        super(5, fbkVar);
        this.f17549e = l;
    }

    @Override // p204p.zh00
    /* JADX INFO: renamed from: e1 */
    public final Object mo25195e1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        long jLongValue = ((Number) obj).longValue();
        long jLongValue2 = ((Number) obj2).longValue();
        ao21 ao21Var = new ao21(this.f17549e, (fbk) obj5);
        ao21Var.f17545a = jLongValue;
        ao21Var.f17546b = jLongValue2;
        ao21Var.f17547c = (String) obj3;
        ao21Var.f17548d = (it91) obj4;
        return ao21Var.invokeSuspend(w2a1.f247311a);
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        long j = this.f17545a;
        long j2 = this.f17546b;
        String str = this.f17547c;
        it91 it91Var = this.f17548d;
        bga.m29073P(obj);
        Long l = this.f17549e;
        long jLongValue = l.longValue() - j2;
        return jLongValue <= 0 ? new xn21(str, j2, j, it91Var) : new yn21(jLongValue, jLongValue / l.longValue(), it91Var);
    }
}
