package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class bqb1 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f29774a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gh00 f29775b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ npb1 f29776c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bqb1(gh00 gh00Var, npb1 npb1Var, int i) {
        super(0);
        this.f29774a = i;
        this.f29775b = gh00Var;
        this.f29776c = npb1Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f29774a) {
            case 0:
                npb1 npb1Var = this.f29776c;
                this.f29775b.invoke(new gpb1(npb1Var.f156913e, npb1Var.f156918j, npb1Var.f156920l));
                break;
            case 1:
                npb1 npb1Var2 = this.f29776c;
                this.f29775b.invoke(new ipb1(npb1Var2.f156913e, npb1Var2.f156925q));
                break;
            default:
                npb1 npb1Var3 = this.f29776c;
                this.f29775b.invoke(new hpb1(npb1Var3.f156913e, npb1Var3.f156921m, npb1Var3.f156927s));
                break;
        }
        return w2a1.f247311a;
    }
}
