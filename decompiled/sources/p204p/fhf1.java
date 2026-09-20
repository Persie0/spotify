package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class fhf1 extends lqf {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f69655f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ zif1 f69656g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fhf1(zif1 zif1Var, int i) {
        super(zif1Var);
        this.f69655f = i;
        this.f69656g = zif1Var;
    }

    @Override // p204p.lqf
    /* JADX INFO: renamed from: b */
    public final Object mo41666b(int i) {
        int i2 = this.f69655f;
        zif1 zif1Var = this.f69656g;
        switch (i2) {
            case 0:
                Object obj = zif1.f283154t;
                return zif1Var.m96205b()[i];
            case 1:
                return new hif1(zif1Var, i);
            default:
                Object obj2 = zif1.f283154t;
                return zif1Var.m96206c()[i];
        }
    }
}
