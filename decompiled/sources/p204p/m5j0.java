package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class m5j0 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f140241a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ o5j0 f140242b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ c700 f140243c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m5j0(o5j0 o5j0Var, c700 c700Var, int i) {
        super(1);
        this.f140241a = i;
        this.f140242b = o5j0Var;
        this.f140243c = c700Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f140241a) {
            case 0:
                o5j0.m66284a((k5j0) obj, this.f140242b.f162018c, this.f140243c);
                break;
            default:
                o5j0.m66284a((k5j0) obj, this.f140242b.f162017b, this.f140243c);
                break;
        }
        return w2a1.f247311a;
    }
}
