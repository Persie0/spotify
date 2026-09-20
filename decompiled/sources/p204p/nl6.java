package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class nl6 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f155010a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ovf f155011b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nl6(ovf ovfVar, int i) {
        super(1);
        this.f155010a = i;
        this.f155011b = ovfVar;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f155010a) {
            case 0:
                return this.f155011b.getView();
            default:
                return this.f155011b;
        }
    }
}
