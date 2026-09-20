package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class xct extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f260283a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ wct f260284b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gh00 f260285c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xct(wct wctVar, gh00 gh00Var, int i) {
        super(1);
        this.f260283a = i;
        this.f260284b = wctVar;
        this.f260285c = gh00Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f260283a) {
            case 0:
                this.f260284b.m87761b((String) obj);
                this.f260285c.invoke(edt.f58589a);
                break;
            default:
                this.f260284b.m87762c((String) obj);
                this.f260285c.invoke(fdt.f68561a);
                break;
        }
        return w2a1.f247311a;
    }
}
