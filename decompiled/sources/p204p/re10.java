package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class re10 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f198250a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ri00 f198251b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public re10(int i, eh00 eh00Var) {
        super(0);
        this.f198250a = i;
        switch (i) {
            case 1:
                this.f198251b = (ri00) eh00Var;
                super(0);
                break;
            default:
                this.f198251b = (ri00) eh00Var;
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [p.eh00, p.ri00] */
    /* JADX WARN: Type inference failed for: r0v3, types: [p.eh00, p.ri00] */
    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f198250a) {
            case 0:
                return this.f198251b.invoke();
            default:
                this.f198251b.invoke();
                return w2a1.f247311a;
        }
    }
}
