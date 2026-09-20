package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class dw00 implements th00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f53573a;

    /* JADX INFO: renamed from: b */
    public final sm2 f53574b;

    public /* synthetic */ dw00(sm2 sm2Var, int i) {
        this.f53573a = i;
        this.f53574b = sm2Var;
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f53573a) {
            case 0:
                return this.f53574b.m78512e((duc0) obj, (fbk) obj2);
            case 1:
                return this.f53574b.m78509b(((qtc0) obj).f192359a, (fbk) obj2);
            default:
                return this.f53574b.m78511d((cuc0) obj, (fbk) obj2);
        }
    }
}
