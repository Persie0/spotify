package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class th11 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f220307a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ uh11 f220308b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ th11(uh11 uh11Var, int i) {
        super(0);
        this.f220307a = i;
        this.f220308b = uh11Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f220307a) {
            case 0:
                return new j5s0(this.f220308b.f230341d, 2);
            default:
                return (j5s0) this.f220308b.f230344g.getValue();
        }
    }
}
