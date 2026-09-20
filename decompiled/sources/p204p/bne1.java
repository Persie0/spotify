package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class bne1 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f28815a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ cne1 f28816b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bne1(cne1 cne1Var, int i) {
        super(0);
        this.f28815a = i;
        this.f28816b = cne1Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f28815a) {
            case 0:
                this.f28816b.m83052i1(false, false);
                return w2a1.f247311a;
            default:
                return this.f28816b.m49702X0();
        }
    }
}
