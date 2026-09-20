package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class v7r extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f238297a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ w7r f238298b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ rmm0 f238299c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v7r(w7r w7rVar, rmm0 rmm0Var, int i) {
        super(1);
        this.f238297a = i;
        this.f238298b = w7rVar;
        this.f238299c = rmm0Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f238297a) {
            case 0:
                this.f238298b.m87400e(((Boolean) obj).booleanValue() ? c8r.f35305a : c8r.f35306b, this.f238299c);
                break;
            case 1:
                this.f238298b.m87399d(((Boolean) obj).booleanValue(), this.f238299c);
                break;
            default:
                this.f238298b.m87399d(((Boolean) obj).booleanValue(), this.f238299c);
                break;
        }
        return w2a1.f247311a;
    }
}
