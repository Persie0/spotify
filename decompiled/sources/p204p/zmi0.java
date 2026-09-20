package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class zmi0 extends qe70 implements vh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f284298a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ smi0 f284299b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zmi0(smi0 smi0Var, int i) {
        super(3);
        this.f284298a = i;
        this.f284299b = smi0Var;
    }

    @Override // p204p.vh00
    /* JADX INFO: renamed from: D0 */
    public final Object mo24510D0(Object obj, Object obj2, Object obj3) {
        switch (this.f284298a) {
            case 0:
                ((Number) obj3).intValue();
                jag1.m52830o((rmi0) this.f284299b, (xq00) obj2, 0);
                break;
            default:
                ((Number) obj3).intValue();
                jag1.m52832q(0, ((rmi0) this.f284299b).f200557a, (xq00) obj2);
                break;
        }
        return w2a1.f247311a;
    }
}
