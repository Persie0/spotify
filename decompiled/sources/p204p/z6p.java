package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class z6p extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f279967a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ a7p f279968b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f279969c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ qe70 f279970d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public z6p(a7p a7pVar, String str, gh00 gh00Var, int i) {
        super(1);
        this.f279967a = i;
        switch (i) {
            case 1:
                this.f279968b = a7pVar;
                this.f279969c = str;
                this.f279970d = (qe70) gh00Var;
                super(1);
                break;
            default:
                this.f279968b = a7pVar;
                this.f279969c = str;
                this.f279970d = (qe70) gh00Var;
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r7v4, types: [p.gh00, p.qe70] */
    /* JADX WARN: Type inference failed for: r7v9, types: [p.gh00, p.qe70] */
    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f279967a) {
            case 0:
                double dDoubleValue = ((Number) obj).doubleValue();
                this.f279968b.f13112e.onNext(new ywi(true, this.f279969c, Double.valueOf(dDoubleValue)));
                this.f279970d.invoke(Double.valueOf(dDoubleValue));
                break;
            default:
                double dDoubleValue2 = ((Number) obj).doubleValue();
                this.f279968b.f13112e.onNext(new ywi(true, this.f279969c, Double.valueOf(dDoubleValue2)));
                this.f279970d.invoke(Double.valueOf(dDoubleValue2));
                break;
        }
        return w2a1.f247311a;
    }
}
