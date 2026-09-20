package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class j1c extends qe70 implements xh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f107720a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1947hm f107721b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j1c(C1947hm c1947hm, int i) {
        super(4);
        this.f107720a = i;
        this.f107721b = c1947hm;
    }

    @Override // p204p.xh00
    /* JADX INFO: renamed from: M */
    public final Object mo24818M(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f107720a) {
            case 0:
                i1c i1cVar = (i1c) obj;
                return ((l1c) this.f107721b.f92784d).mo28544g(((Number) obj3).intValue(), i1cVar.f97467d, i1cVar.f97471h, (st91) obj4);
            default:
                return ((l1c) this.f107721b.f92784d).mo28545h((g1c) obj4, ((i1c) obj2).f97467d);
        }
    }
}
