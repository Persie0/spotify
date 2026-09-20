package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class ahd1 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f15674a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ bhd1 f15675b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ahd1(bhd1 bhd1Var, int i) {
        super(0);
        this.f15674a = i;
        this.f15675b = bhd1Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f15674a) {
            case 0:
                return Float.valueOf(this.f15675b.getResources().getDisplayMetrics().density * 1.8f);
            case 1:
                return Integer.valueOf(((int) this.f15675b.getResources().getDisplayMetrics().density) * 3);
            case 2:
                return Float.valueOf(this.f15675b.getResources().getDisplayMetrics().density * 24.0f);
            default:
                return Integer.valueOf((int) (this.f15675b.getResources().getDisplayMetrics().density * 2.0f));
        }
    }
}
