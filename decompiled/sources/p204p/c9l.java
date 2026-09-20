package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class c9l extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f35582a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ f9l f35583b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c9l(f9l f9lVar, int i) {
        super(1);
        this.f35582a = i;
        this.f35583b = f9lVar;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        boolean z;
        switch (this.f35582a) {
            case 0:
                f9l f9lVar = this.f35583b;
                f9lVar.f67292f.f110193a.m97090l(null);
                return new C1865fm(f9lVar, 26);
            case 1:
                if (((olm0) obj) instanceof io3) {
                    this.f35583b.f67287a.mo47345e();
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                this.f35583b.f67292f.f110193a.m97090l((Float) obj);
                return w2a1.f247311a;
        }
    }
}
