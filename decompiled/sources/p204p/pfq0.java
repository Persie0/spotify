package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class pfq0 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f177129a;

    /* JADX INFO: renamed from: b */
    public final String f177130b;

    /* JADX INFO: renamed from: c */
    public final String f177131c;

    public /* synthetic */ pfq0(String str, String str2, int i) {
        this.f177129a = i;
        this.f177130b = str;
        this.f177131c = str2;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        v221 v221Var = (v221) obj;
        switch (this.f177129a) {
            case 0:
                de60 de60Var = rfq0.f198717b;
                String str = this.f177130b;
                v221Var.m84492a(str, de60Var);
                de60 de60Var2 = rfq0.f198716a;
                v221Var.m84492a(this.f177131c, de60Var, de60Var, de60Var2, de60Var2);
                v221Var.m84493b(str, de60Var2);
                break;
            case 1:
                de60 de60Var3 = rfq0.f198717b;
                String str2 = this.f177130b;
                v221Var.m84492a(str2, de60Var3);
                v221Var.m84492a(this.f177131c, de60Var3, de60Var3, de60Var3);
                v221Var.m84493b(str2, de60Var3);
                break;
            case 2:
                de60 de60Var4 = rfq0.f198717b;
                String str3 = this.f177130b;
                v221Var.m84492a(str3, de60Var4);
                de60 de60Var5 = rfq0.f198718c;
                de60 de60Var6 = rfq0.f198716a;
                v221Var.m84492a(this.f177131c, de60Var4, de60Var4, de60Var5, de60Var6);
                v221Var.m84493b(str3, de60Var6);
                break;
            case 3:
                de60 de60Var7 = rfq0.f198717b;
                String str4 = this.f177130b;
                v221Var.m84492a(str4, de60Var7);
                de60 de60Var8 = rfq0.f198718c;
                v221Var.m84492a(str4, de60Var8);
                de60 de60Var9 = rfq0.f198716a;
                v221Var.m84492a(this.f177131c, de60Var7, de60Var8, de60Var8, de60Var9);
                v221Var.m84493b(str4, de60Var9);
                break;
            case 4:
                de60 de60Var10 = rfq0.f198718c;
                v221Var.m84492a(this.f177130b, de60Var10);
                v221Var.m84493b(this.f177131c, rfq0.f198717b, de60Var10);
                break;
            default:
                v221Var.m84492a(this.f177130b, rfq0.f198716a);
                v221Var.m84493b(this.f177131c, rfq0.f198717b, rfq0.f198718c);
                break;
        }
        return w2a1.f247311a;
    }
}
