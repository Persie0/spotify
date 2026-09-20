package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class x5c extends qe70 implements xh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f258372a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ a6c f258373b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x5c(a6c a6cVar, int i) {
        super(4);
        this.f258372a = i;
        this.f258373b = a6cVar;
    }

    @Override // p204p.xh00
    /* JADX INFO: renamed from: M */
    public final Object mo24818M(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f258372a) {
            case 0:
                ((Number) obj3).intValue();
                return this.f258373b.mo24863d((st91) obj4);
            default:
                return this.f258373b.mo24864e((k5c) obj4);
        }
    }
}
