package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class yci0 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f271503a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ am81 f271504b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ kqi0 f271505c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yci0(am81 am81Var, kqi0 kqi0Var, int i) {
        super(0);
        this.f271503a = i;
        this.f271504b = am81Var;
        this.f271505c = kqi0Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        int i = this.f271503a;
        w2a1 w2a1Var = w2a1.f247311a;
        int i2 = 0;
        am81 am81Var = this.f271504b;
        kqi0 kqi0Var = this.f271505c;
        switch (i) {
            case 0:
                InterfaceC2392sx interfaceC2392sx = (InterfaceC2392sx) kqi0Var.getValue();
                long j = am81Var.f17060a;
                int i3 = gt61.f84099b;
                if (j > 0) {
                    long j2 = 15000;
                    i2 = (int) (((j + j2) - 1) / j2);
                }
                kqi0Var.setValue(gt61.m45675a(interfaceC2392sx, 1, i2));
                break;
            default:
                InterfaceC2392sx interfaceC2392sx2 = (InterfaceC2392sx) kqi0Var.getValue();
                long j3 = am81Var.f17061b - am81Var.f17060a;
                int i4 = gt61.f84099b;
                if (j3 > 0) {
                    long j4 = 15000;
                    i2 = (int) (((j3 + j4) - 1) / j4);
                }
                kqi0Var.setValue(gt61.m45675a(interfaceC2392sx2, 2, i2));
                break;
        }
        return w2a1Var;
    }
}
