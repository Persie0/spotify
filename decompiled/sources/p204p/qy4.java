package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class qy4 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f193798a = 1;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ th00 f193799b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f193800c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f193801d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qy4(th00 th00Var, int i, String str) {
        super(0);
        this.f193799b = th00Var;
        this.f193800c = i;
        this.f193801d = str;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f193798a) {
            case 0:
                this.f193799b.invoke(this.f193801d, Integer.valueOf(this.f193800c));
                break;
            default:
                this.f193799b.invoke(Integer.valueOf(this.f193800c), this.f193801d);
                break;
        }
        return w2a1.f247311a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qy4(th00 th00Var, String str, int i) {
        super(0);
        this.f193799b = th00Var;
        this.f193801d = str;
        this.f193800c = i;
    }
}
