package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class ocv extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f163993a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ pcv f163994b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ocv(pcv pcvVar, int i) {
        super(0);
        this.f163993a = i;
        this.f163994b = pcvVar;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f163993a) {
            case 0:
                return (ncv) g6f.m43747t0(0, this.f163994b.f176235a);
            case 1:
                return (ncv) g6f.m43747t0(3, this.f163994b.f176235a);
            case 2:
                return (ncv) g6f.m43747t0(1, this.f163994b.f176235a);
            default:
                return (ncv) g6f.m43747t0(2, this.f163994b.f176235a);
        }
    }
}
