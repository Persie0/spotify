package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class e841 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f57067a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ x43 f57068b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e841(x43 x43Var, int i) {
        super(1);
        this.f57067a = i;
        this.f57068b = x43Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f57067a) {
            case 0:
                this.f57068b.f257958a = (l1p0) obj;
                break;
            case 1:
                jo70 jo70Var = (jo70) obj;
                ((yum0) this.f57068b.f257962e).setValue(Float.valueOf(Float.intBitsToFloat((int) (jo70Var.mo30006K(0L) & 4294967295L)) + ((int) (jo70Var.mo30018b() & 4294967295L))));
                break;
            default:
                ((yum0) this.f57068b.f257956Y).setValue(new ybs(((ybs) obj).f271238a));
                break;
        }
        return w2a1.f247311a;
    }
}
