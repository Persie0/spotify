package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class kx4 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f127326a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ lx4 f127327b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kx4(lx4 lx4Var, int i) {
        super(1);
        this.f127326a = i;
        this.f127327b = lx4Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f127326a) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                lx4 lx4Var = this.f127327b;
                long j = iIntValue;
                return Integer.valueOf(((int) (lx4.m60164d(lx4Var) >> 32)) - ((int) (lx4Var.f137717b.mo66602a((j << 32) | (j & 4294967295L), lx4.m60164d(lx4Var), ko70.f124556a) >> 32)));
            case 1:
                int iIntValue2 = ((Number) obj).intValue();
                long j2 = iIntValue2;
                long j3 = (j2 << 32) | (j2 & 4294967295L);
                lx4 lx4Var2 = this.f127327b;
                return Integer.valueOf((-((int) (lx4Var2.f137717b.mo66602a(j3, lx4.m60164d(lx4Var2), ko70.f124556a) >> 32))) - iIntValue2);
            case 2:
                int iIntValue3 = ((Number) obj).intValue();
                lx4 lx4Var3 = this.f127327b;
                long j4 = iIntValue3;
                return Integer.valueOf(((int) (lx4.m60164d(lx4Var3) & 4294967295L)) - ((int) (lx4Var3.f137717b.mo66602a((j4 << 32) | (j4 & 4294967295L), lx4.m60164d(lx4Var3), ko70.f124556a) & 4294967295L)));
            case 3:
                int iIntValue4 = ((Number) obj).intValue();
                long j5 = iIntValue4;
                long j6 = (j5 << 32) | (j5 & 4294967295L);
                lx4 lx4Var4 = this.f127327b;
                return Integer.valueOf((-((int) (lx4Var4.f137717b.mo66602a(j6, lx4.m60164d(lx4Var4), ko70.f124556a) & 4294967295L))) - iIntValue4);
            case 4:
                int iIntValue5 = ((Number) obj).intValue();
                lx4 lx4Var5 = this.f127327b;
                rv41 rv41Var = (rv41) lx4Var5.f137720e.m33623g(lx4Var5.f137716a.f34830d.getValue());
                long j7 = rv41Var != null ? ((g450) rv41Var.getValue()).f76347a : 0L;
                long j8 = iIntValue5;
                return Integer.valueOf((-((int) (lx4Var5.f137717b.mo66602a((j8 << 32) | (j8 & 4294967295L), j7, ko70.f124556a) >> 32))) - iIntValue5);
            case 5:
                int iIntValue6 = ((Number) obj).intValue();
                lx4 lx4Var6 = this.f127327b;
                rv41 rv41Var2 = (rv41) lx4Var6.f137720e.m33623g(lx4Var6.f137716a.f34830d.getValue());
                long j9 = rv41Var2 != null ? ((g450) rv41Var2.getValue()).f76347a : 0L;
                long j10 = iIntValue6;
                return Integer.valueOf((-((int) (lx4Var6.f137717b.mo66602a((j10 << 32) | (j10 & 4294967295L), j9, ko70.f124556a) >> 32))) + ((int) (j9 >> 32)));
            case 6:
                int iIntValue7 = ((Number) obj).intValue();
                lx4 lx4Var7 = this.f127327b;
                rv41 rv41Var3 = (rv41) lx4Var7.f137720e.m33623g(lx4Var7.f137716a.f34830d.getValue());
                long j11 = rv41Var3 != null ? ((g450) rv41Var3.getValue()).f76347a : 0L;
                long j12 = iIntValue7;
                return Integer.valueOf((-((int) (lx4Var7.f137717b.mo66602a((j12 << 32) | (j12 & 4294967295L), j11, ko70.f124556a) & 4294967295L))) - iIntValue7);
            default:
                int iIntValue8 = ((Number) obj).intValue();
                lx4 lx4Var8 = this.f127327b;
                rv41 rv41Var4 = (rv41) lx4Var8.f137720e.m33623g(lx4Var8.f137716a.f34830d.getValue());
                long j13 = rv41Var4 != null ? ((g450) rv41Var4.getValue()).f76347a : 0L;
                long j14 = iIntValue8;
                return Integer.valueOf((-((int) (lx4Var8.f137717b.mo66602a((j14 << 32) | (j14 & 4294967295L), j13, ko70.f124556a) & 4294967295L))) + ((int) (j13 & 4294967295L)));
        }
    }
}
