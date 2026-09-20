package p204p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes9.dex */
public final class y4g0 extends qe70 implements th00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f269140a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gh00 f269141b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y4g0(int i, gh00 gh00Var) {
        super(2);
        this.f269140a = i;
        this.f269141b = gh00Var;
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f269140a) {
            case 0:
                this.f269141b.invoke(new n4g0((hg60) obj, ((Number) obj2).intValue()));
                return w2a1.f247311a;
            case 1:
                this.f269141b.invoke(new o4g0((h4b0) obj, ((Number) obj2).intValue()));
                return w2a1.f247311a;
            case 2:
                this.f269141b.invoke(new p4g0((mzc1) obj, ((Number) obj2).intValue()));
                return w2a1.f247311a;
            case 3:
                this.f269141b.invoke(new vyh0(((zyh0) ((azh0) obj)).f287590a, ((Number) obj2).intValue()));
                return w2a1.f247311a;
            case 4:
                this.f269141b.invoke(new wyh0(((zyh0) ((azh0) obj)).f287590a, ((Number) obj2).intValue()));
                return w2a1.f247311a;
            case 5:
                azh0 azh0Var = (azh0) obj;
                int iIntValue = ((Number) obj2).intValue();
                boolean z = azh0Var instanceof yyh0;
                gh00 gh00Var = this.f269141b;
                if (z) {
                    gh00Var.invoke(new uyh0(((yyh0) azh0Var).f277512a, iIntValue));
                } else {
                    if (!(azh0Var instanceof zyh0)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    gh00Var.invoke(new vyh0(((zyh0) azh0Var).f287590a, iIntValue));
                }
                return w2a1.f247311a;
            case 6:
                ((Number) obj2).intValue();
                slm0.m78502a(this.f269141b, (xq00) obj, fyg1.m43076B(1));
                return w2a1.f247311a;
            case 7:
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                int iOrdinal = ((wzm0) obj).ordinal();
                gh00 gh00Var2 = this.f269141b;
                if (iOrdinal == 0) {
                    gh00Var2.invoke(new e270(zBooleanValue));
                } else {
                    if (iOrdinal != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    gh00Var2.invoke(new g270(zBooleanValue));
                }
                return w2a1.f247311a;
            case 8:
                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                int iOrdinal2 = ((a0n0) obj).ordinal();
                gh00 gh00Var3 = this.f269141b;
                if (iOrdinal2 == 0) {
                    gh00Var3.invoke(new e270(zBooleanValue2));
                } else {
                    if (iOrdinal2 != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    gh00Var3.invoke(new g270(zBooleanValue2));
                }
                return w2a1.f247311a;
            case 9:
                this.f269141b.invoke(new ekn0(((Number) obj).intValue(), (String) obj2));
                return w2a1.f247311a;
            case 10:
                this.f269141b.invoke(new xxn0(((Number) obj).intValue(), (String) obj2));
                return w2a1.f247311a;
            case 11:
                ((Number) obj2).intValue();
                glg1.m45150a(this.f269141b, (xq00) obj, fyg1.m43076B(1));
                return w2a1.f247311a;
            case 12:
                ((Number) obj2).intValue();
                this.f269141b.invoke((whu0) obj);
                return w2a1.f247311a;
            case 13:
                ((Number) obj2).intValue();
                this.f269141b.invoke((whu0) obj);
                return w2a1.f247311a;
            case 14:
                xq00 xq00Var = (xq00) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (xq00Var.m91752Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    tgu tguVar = new tgu(4);
                    gh00 gh00Var4 = this.f269141b;
                    boolean zM91766g = xq00Var.m91766g(gh00Var4);
                    Object objM91750T = xq00Var.m91750T();
                    if (zM91766g || objM91750T == t6x0.f217647t) {
                        objM91750T = new pmu0(12, gh00Var4);
                        xq00Var.m91793t0(objM91750T);
                    }
                    dyu.m37371c(new peu(u40.f226523c, (eh00) objM91750T), tguVar, null, null, null, null, null, null, null, null, v3h.f236887a, xq00Var, 0, 48, 2044);
                } else {
                    xq00Var.m91757b0();
                }
                return w2a1.f247311a;
            case 15:
                xq00 xq00Var2 = (xq00) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                if (xq00Var2.m91752Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    tgu tguVar2 = new tgu(13);
                    gh00 gh00Var5 = this.f269141b;
                    boolean zM91766g2 = xq00Var2.m91766g(gh00Var5);
                    Object objM91750T2 = xq00Var2.m91750T();
                    if (zM91766g2 || objM91750T2 == t6x0.f217647t) {
                        objM91750T2 = new pbv0(17, gh00Var5);
                        xq00Var2.m91793t0(objM91750T2);
                    }
                    dyu.m37371c(new peu(u40.f226523c, (eh00) objM91750T2), tguVar2, null, null, null, null, null, null, null, null, t4h.f217001b, xq00Var2, 0, 48, 2044);
                } else {
                    xq00Var2.m91757b0();
                }
                return w2a1.f247311a;
            case 16:
                this.f269141b.invoke(new mow0((xdj) obj, ((Number) obj2).longValue()));
                return w2a1.f247311a;
            case 17:
                int iOrdinal3 = ((o3y0) obj).ordinal();
                gh00 gh00Var6 = this.f269141b;
                if (iOrdinal3 == 0) {
                    gh00Var6.invoke(c0t.f32856a);
                } else {
                    if (iOrdinal3 != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    gh00Var6.invoke(d0t.f44049a);
                }
                return w2a1.f247311a;
            case 18:
                xq00 xq00Var3 = (xq00) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                if (xq00Var3.m91752Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    bwy0.m30728c(this.f269141b, xq00Var3, 0);
                } else {
                    xq00Var3.m91757b0();
                }
                return w2a1.f247311a;
            case 19:
                this.f269141b.invoke(new fu01(((Number) obj).longValue(), ((Number) obj2).longValue()));
                return w2a1.f247311a;
            case 20:
                r511 r511Var = (r511) obj2;
                this.f269141b.invoke(new q211(((Number) obj).intValue(), r511Var.f195929b, r511Var.f195928a));
                return w2a1.f247311a;
            case 21:
                this.f269141b.invoke(new t211(((Number) obj).intValue(), (u511) obj2));
                return w2a1.f247311a;
            case 22:
                this.f269141b.invoke(new v211(((Number) obj).intValue(), (u511) obj2));
                return w2a1.f247311a;
            case 23:
                this.f269141b.invoke(new x161((mzn0) obj, (d850) obj2));
                return w2a1.f247311a;
            case 24:
                this.f269141b.invoke(new sc61(((Number) obj).intValue(), (gc61) obj2));
                return w2a1.f247311a;
            case 25:
                float fFloatValue = ((Number) obj2).floatValue();
                ((k6q0) obj).m55602a();
                this.f269141b.invoke(new r00(-fFloatValue));
                return w2a1.f247311a;
            case 26:
                this.f269141b.invoke(new f581(((Number) obj).intValue(), (String) obj2));
                return w2a1.f247311a;
            case 27:
                this.f269141b.invoke(new g581(((Number) obj).intValue(), (String) obj2));
                return w2a1.f247311a;
            case 28:
                xq00 xq00Var4 = (xq00) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                if (xq00Var4.m91752Y(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    gh00 gh00Var7 = this.f269141b;
                    boolean zM91766g3 = xq00Var4.m91766g(gh00Var7);
                    Object objM91750T3 = xq00Var4.m91750T();
                    if (zM91766g3 || objM91750T3 == t6x0.f217647t) {
                        objM91750T3 = new vs71(18, gh00Var7);
                        xq00Var4.m91793t0(objM91750T3);
                    }
                    dyu.m37373e(new peu(u40.f226523c, (eh00) objM91750T3), null, null, null, null, null, null, ceh.f37128c, xq00Var4, 12582912, 126);
                } else {
                    xq00Var4.m91757b0();
                }
                return w2a1.f247311a;
            default:
                xq00 xq00Var5 = (xq00) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                if (xq00Var5.m91752Y(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    gh00 gh00Var8 = this.f269141b;
                    boolean zM91766g4 = xq00Var5.m91766g(gh00Var8);
                    Object objM91750T4 = xq00Var5.m91750T();
                    if (zM91766g4 || objM91750T4 == t6x0.f217647t) {
                        objM91750T4 = new q9b1(7, gh00Var8);
                        xq00Var5.m91793t0(objM91750T4);
                    }
                    l5h1.m58225i((eh00) objM91750T4, null, null, xq00Var5, 0, 6);
                } else {
                    xq00Var5.m91757b0();
                }
                return w2a1.f247311a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y4g0(gh00 gh00Var, int i, int i2) {
        super(2);
        this.f269140a = i2;
        this.f269141b = gh00Var;
    }
}
