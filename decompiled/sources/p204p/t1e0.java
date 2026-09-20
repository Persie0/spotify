package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class t1e0 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f216256a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ sf20 f216257b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t1e0(sf20 sf20Var, int i) {
        super(1);
        this.f216256a = i;
        this.f216257b = sf20Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f216256a) {
            case 0:
                String str = ((ezs0) obj).f64461c;
                if (((m1e0) this.f216257b.f208449f).f138951c) {
                    return str;
                }
                return null;
            default:
                String str2 = ((ezs0) obj).f64461c;
                if (((m1e0) this.f216257b.f208449f).f138949a) {
                    return str2;
                }
                return null;
        }
    }
}
