package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class l020 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f128257a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vz41 f128258b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f128259c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l020(vz41 vz41Var, boolean z, int i) {
        super(1);
        this.f128257a = i;
        this.f128258b = vz41Var;
        this.f128259c = z;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f128257a) {
            case 0:
                mpz0 mpz0Var = (mpz0) obj;
                jpz0.m54000n(mpz0Var, this.f128258b.f246393f);
                if (this.f128259c) {
                    jpz0.m54007u(mpz0Var, 0);
                }
                break;
            default:
                mpz0 mpz0Var2 = (mpz0) obj;
                jpz0.m54000n(mpz0Var2, this.f128258b.f246393f);
                if (this.f128259c) {
                    jpz0.m54007u(mpz0Var2, 0);
                }
                break;
        }
        return w2a1.f247311a;
    }
}
