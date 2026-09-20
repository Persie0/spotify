package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class xpp0 extends qe70 implements vh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f264703a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ dqp0 f264704b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xpp0(dqp0 dqp0Var, int i) {
        super(3);
        this.f264703a = i;
        this.f264704b = dqp0Var;
    }

    @Override // p204p.vh00
    /* JADX INFO: renamed from: D0 */
    public final Object mo24510D0(Object obj, Object obj2, Object obj3) {
        switch (this.f264703a) {
            case 0:
                ((Number) obj3).intValue();
                float f = 16;
                dqp0.m36671o(this.f264704b, f, f, (xq00) obj2, 0);
                break;
            case 1:
                ((Number) obj3).intValue();
                float f2 = 48;
                dqp0.m36671o(this.f264704b, f2, f2, (xq00) obj2, 0);
                break;
            case 2:
                ((Number) obj3).intValue();
                dqp0.m36671o(this.f264704b, 80, 16, (xq00) obj2, 0);
                break;
            default:
                ((Number) obj3).intValue();
                dqp0.m36671o(this.f264704b, 200, 20, (xq00) obj2, 0);
                break;
        }
        return w2a1.f247311a;
    }
}
