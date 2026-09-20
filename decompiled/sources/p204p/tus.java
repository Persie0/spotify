package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class tus extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f223917a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vus f223918b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tus(vus vusVar, int i) {
        super(1);
        this.f223917a = i;
        this.f223918b = vusVar;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f223917a) {
            case 0:
                ((Number) obj).intValue();
                return this.f223918b.f245071f;
            default:
                return new oq91(new tus(this.f223918b, 0));
        }
    }
}
