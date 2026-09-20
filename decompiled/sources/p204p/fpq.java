package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class fpq extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f71940a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ybn f71941b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fpq(ybn ybnVar, int i) {
        super(1);
        this.f71940a = i;
        this.f71941b = ybnVar;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f71940a) {
            case 0:
                ((Number) obj).intValue();
                return (st91) this.f71941b.f271220c;
            default:
                return new oq91(new fpq(this.f71941b, 0));
        }
    }
}
