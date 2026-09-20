package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class jb90 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f110714a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ cpa f110715b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jb90(cpa cpaVar, int i) {
        super(1);
        this.f110714a = i;
        this.f110715b = cpaVar;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f110714a) {
            case 0:
                return ((zw20) this.f110715b.f40504c).f286891b;
            default:
                return new ib90(((Boolean) ((zw20) this.f110715b.f40504c).f286891b.f158717a.getValue()).booleanValue());
        }
    }
}
