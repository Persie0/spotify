package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class qut extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f192802a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ sut f192803b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qut(sut sutVar, int i) {
        super(1);
        this.f192802a = i;
        this.f192803b = sutVar;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f192802a) {
            case 0:
                this.f192803b.f214214b.add((gh00) obj);
                break;
            default:
                this.f192803b.f214215c.add((gh00) obj);
                break;
        }
        return w2a1.f247311a;
    }
}
