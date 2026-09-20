package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class brm0 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f30114a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gh00 f30115b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ z00 f30116c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ tbo0 f30117d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ brm0(gh00 gh00Var, z00 z00Var, tbo0 tbo0Var, int i) {
        super(1);
        this.f30114a = i;
        this.f30115b = gh00Var;
        this.f30116c = z00Var;
        this.f30117d = tbo0Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f30114a) {
            case 0:
                int iOrdinal = ((h9i0) obj).ordinal();
                gh00 gh00Var = this.f30115b;
                if (iOrdinal == 1) {
                    z00 z00Var = this.f30116c;
                    gh00Var.invoke(new fbo0(z00Var != null ? z00Var.f277928e : null, null));
                } else if (iOrdinal == 2) {
                    z00 z00Var2 = (z00) this.f30117d.f218912c.get(k70.f119892t);
                    gh00Var.invoke(new sao0(z00Var2 != null ? z00Var2.f277928e : null));
                }
                break;
            case 1:
                int iOrdinal2 = ((rh21) obj).ordinal();
                gh00 gh00Var2 = this.f30115b;
                if (iOrdinal2 == 1) {
                    z00 z00Var3 = this.f30116c;
                    gh00Var2.invoke(new fbo0(z00Var3 != null ? z00Var3.f277928e : null, null));
                } else if (iOrdinal2 == 2) {
                    z00 z00Var4 = (z00) this.f30117d.f218912c.get(k70.f119892t);
                    gh00Var2.invoke(new sao0(z00Var4 != null ? z00Var4.f277928e : null));
                }
                break;
            case 2:
                int iOrdinal3 = ((nh21) obj).ordinal();
                gh00 gh00Var3 = this.f30115b;
                if (iOrdinal3 == 1) {
                    z00 z00Var5 = this.f30116c;
                    gh00Var3.invoke(new fbo0(z00Var5 != null ? z00Var5.f277928e : null, null));
                } else if (iOrdinal3 == 2) {
                    z00 z00Var6 = (z00) this.f30117d.f218912c.get(k70.f119892t);
                    gh00Var3.invoke(new sao0(z00Var6 != null ? z00Var6.f277928e : null));
                }
                break;
            default:
                int iOrdinal4 = ((ph21) obj).ordinal();
                gh00 gh00Var4 = this.f30115b;
                if (iOrdinal4 == 1) {
                    z00 z00Var7 = this.f30116c;
                    gh00Var4.invoke(new fbo0(z00Var7 != null ? z00Var7.f277928e : null, null));
                } else if (iOrdinal4 == 2) {
                    z00 z00Var8 = (z00) this.f30117d.f218912c.get(k70.f119892t);
                    gh00Var4.invoke(new sao0(z00Var8 != null ? z00Var8.f277928e : null));
                }
                break;
        }
        return w2a1.f247311a;
    }
}
