package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class bcu extends qe70 implements xh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f25942a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ hog0 f25943b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bcu(hog0 hog0Var, int i) {
        super(4);
        this.f25942a = i;
        this.f25943b = hog0Var;
    }

    @Override // p204p.xh00
    /* JADX INFO: renamed from: M */
    public final Object mo24818M(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f25942a) {
            case 0:
                ((Number) obj3).intValue();
                return new lqg0(this.f25943b, 2);
            case 1:
                ((Number) obj3).intValue();
                return new mqg0(this.f25943b);
            default:
                ((Number) obj3).intValue();
                return new nqg0(this.f25943b);
        }
    }
}
