package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class gcb1 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f78533a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ st91 f78534b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gcb1(st91 st91Var, int i) {
        super(1);
        this.f78533a = i;
        this.f78534b = st91Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f78533a) {
            case 0:
                ((Number) obj).intValue();
                return this.f78534b;
            case 1:
                return new oq91(new gcb1(this.f78534b, 0));
            default:
                ((Number) obj).intValue();
                return this.f78534b;
        }
    }
}
