package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class ecd extends qe70 implements th00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f58307a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ fyf f58308b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f58309c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ecd(fyf fyfVar, int i, int i2) {
        super(2);
        this.f58307a = i2;
        switch (i2) {
            case 2:
                this.f58308b = fyfVar;
                this.f58309c = i;
                super(2);
                break;
            default:
                this.f58308b = fyfVar;
                this.f58309c = i;
                break;
        }
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f58307a) {
            case 0:
                ((Number) obj2).intValue();
                mhf1.m61758b(this.f58308b, (xq00) obj, fyg1.m43076B(this.f58309c | 1));
                break;
            case 1:
                xq00 xq00Var = (xq00) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (xq00Var.m91752Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    this.f58308b.mo24510D0(Integer.valueOf(this.f58309c), xq00Var, 0);
                } else {
                    xq00Var.m91757b0();
                }
                break;
            case 2:
                ((Number) obj2).intValue();
                wdg1.m87831e(this.f58308b, (xq00) obj, fyg1.m43076B(this.f58309c | 1));
                break;
            case 3:
                ((Number) obj2).intValue();
                dwg1.m37161e(this.f58308b, (xq00) obj, fyg1.m43076B(this.f58309c | 1));
                break;
            default:
                ((Number) obj2).intValue();
                rkk.m75755g(this.f58308b, (xq00) obj, fyg1.m43076B(this.f58309c | 1));
                break;
        }
        return w2a1.f247311a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ecd(boolean z, int i, fyf fyfVar, int i2) {
        super(2);
        this.f58307a = i2;
        this.f58308b = fyfVar;
        this.f58309c = i;
    }
}
