package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class igv extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f102074a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ yhq f102075b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ igv(yhq yhqVar, int i) {
        super(1);
        this.f102074a = i;
        this.f102075b = yhqVar;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f102074a) {
            case 0:
                return new hgv(this.f102075b, 0);
            default:
                return new hgv(this.f102075b, 1);
        }
    }
}
