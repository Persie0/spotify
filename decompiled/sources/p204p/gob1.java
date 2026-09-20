package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class gob1 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f82928a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ mzx0 f82929b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gob1(mzx0 mzx0Var, int i) {
        super(0);
        this.f82928a = i;
        this.f82929b = mzx0Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f82928a) {
            case 0:
                this.f82929b.resumeWith(dob1.f51007c);
                break;
            case 1:
                this.f82929b.resumeWith(dob1.f51006b);
                break;
            default:
                this.f82929b.resumeWith(dob1.f51005a);
                break;
        }
        return w2a1.f247311a;
    }
}
