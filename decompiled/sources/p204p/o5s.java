package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class o5s extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f162059a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f162060b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f162061c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o5s(boolean z, Object obj, int i) {
        super(1);
        this.f162059a = i;
        this.f162060b = z;
        this.f162061c = obj;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f162059a) {
            case 0:
                alg0 alg0Var = (alg0) obj;
                d0w d0wVar = (d0w) this.f162061c;
                boolean z = this.f162060b;
                String strM34568g = d0wVar.m34568g();
                return z ? alg0Var.m26345h(strM34568g) : alg0Var.m26344e(strM34568g);
            default:
                ((fdx0) obj).m41384f(!this.f162060b && ((Boolean) ((eh00) this.f162061c).invoke()).booleanValue());
                return w2a1.f247311a;
        }
    }
}
