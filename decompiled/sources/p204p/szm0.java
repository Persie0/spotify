package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class szm0 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f215618a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ pzm0 f215619b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gh00 f215620c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ szm0(pzm0 pzm0Var, gh00 gh00Var, int i) {
        super(1);
        this.f215618a = i;
        this.f215619b = pzm0Var;
        this.f215620c = gh00Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f215618a) {
            case 0:
                this.f215619b.m71757b("https://support.spotify.com/article/managed-accounts-for-premium-family/plain/");
                this.f215620c.invoke(new f270((String) obj));
                break;
            default:
                this.f215619b.m71757b("https://support.spotify.com/article/managed-accounts/plain/");
                this.f215620c.invoke(new f270((String) obj));
                break;
        }
        return w2a1.f247311a;
    }
}
