package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class gf20 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f79250a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ jf20 f79251b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gf20(jf20 jf20Var, int i) {
        super(1);
        this.f79250a = i;
        this.f79251b = jf20Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f79250a) {
            case 0:
                ((Number) obj).intValue();
                return this.f79251b.f111799c;
            default:
                return new oq91(new gf20(this.f79251b, 0));
        }
    }
}
