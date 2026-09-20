package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class ays extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f21352a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ u7n f21353b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ays(u7n u7nVar, int i) {
        super(1);
        this.f21352a = i;
        this.f21353b = u7nVar;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f21352a) {
            case 0:
                ((Number) obj).intValue();
                return (st91) this.f21353b.f227728c;
            default:
                return new oq91(new ays(this.f21353b, 0));
        }
    }
}
