package p204p;

import com.spotify.music.R;
import com.spotify.searchview.proto.Entity;
import java.util.WeakHashMap;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes7.dex */
public final class u7g extends qe70 implements th00 {

    /* JADX INFO: renamed from: L0 */
    public static final u7g f227599L0;

    /* JADX INFO: renamed from: M0 */
    public static final u7g f227600M0;

    /* JADX INFO: renamed from: N0 */
    public static final u7g f227601N0;

    /* JADX INFO: renamed from: O0 */
    public static final u7g f227602O0;

    /* JADX INFO: renamed from: P0 */
    public static final u7g f227603P0;

    /* JADX INFO: renamed from: Q0 */
    public static final u7g f227604Q0;

    /* JADX INFO: renamed from: R0 */
    public static final u7g f227605R0;

    /* JADX INFO: renamed from: S0 */
    public static final u7g f227606S0;

    /* JADX INFO: renamed from: T0 */
    public static final u7g f227607T0;

    /* JADX INFO: renamed from: U0 */
    public static final u7g f227608U0;

    /* JADX INFO: renamed from: V0 */
    public static final u7g f227609V0;

    /* JADX INFO: renamed from: W0 */
    public static final u7g f227610W0;

    /* JADX INFO: renamed from: X */
    public static final u7g f227611X;

    /* JADX INFO: renamed from: X0 */
    public static final u7g f227612X0;

    /* JADX INFO: renamed from: Y */
    public static final u7g f227613Y;

    /* JADX INFO: renamed from: Y0 */
    public static final u7g f227614Y0;

    /* JADX INFO: renamed from: Z */
    public static final u7g f227615Z;

    /* JADX INFO: renamed from: Z0 */
    public static final u7g f227616Z0;

    /* JADX INFO: renamed from: a1 */
    public static final u7g f227617a1;

    /* JADX INFO: renamed from: b */
    public static final u7g f227618b;

    /* JADX INFO: renamed from: b1 */
    public static final u7g f227619b1;

    /* JADX INFO: renamed from: c */
    public static final u7g f227620c;

    /* JADX INFO: renamed from: c1 */
    public static final u7g f227621c1;

    /* JADX INFO: renamed from: d */
    public static final u7g f227622d;

    /* JADX INFO: renamed from: e */
    public static final u7g f227623e;

    /* JADX INFO: renamed from: f */
    public static final u7g f227624f;

    /* JADX INFO: renamed from: g */
    public static final u7g f227625g;

    /* JADX INFO: renamed from: h */
    public static final u7g f227626h;

    /* JADX INFO: renamed from: i */
    public static final u7g f227627i;

    /* JADX INFO: renamed from: t */
    public static final u7g f227628t;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f227629a;

    static {
        int i = 2;
        f227618b = new u7g(i, 0);
        f227620c = new u7g(i, 1);
        f227622d = new u7g(i, 2);
        f227623e = new u7g(i, 3);
        f227624f = new u7g(i, 4);
        f227625g = new u7g(i, 5);
        f227626h = new u7g(i, 6);
        f227627i = new u7g(i, 7);
        f227628t = new u7g(i, 8);
        f227611X = new u7g(i, 9);
        f227613Y = new u7g(i, 10);
        f227615Z = new u7g(i, 11);
        f227599L0 = new u7g(i, 12);
        f227600M0 = new u7g(i, 13);
        f227601N0 = new u7g(i, 14);
        f227602O0 = new u7g(i, 15);
        f227603P0 = new u7g(i, 16);
        f227604Q0 = new u7g(i, 17);
        f227605R0 = new u7g(i, 18);
        f227606S0 = new u7g(i, 19);
        f227607T0 = new u7g(i, 20);
        f227608U0 = new u7g(i, 21);
        f227609V0 = new u7g(i, 22);
        f227610W0 = new u7g(i, 23);
        f227612X0 = new u7g(i, 24);
        f227614Y0 = new u7g(i, 25);
        f227616Z0 = new u7g(i, 26);
        f227617a1 = new u7g(i, 27);
        f227619b1 = new u7g(i, 28);
        f227621c1 = new u7g(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u7g(int i, int i2) {
        super(i);
        this.f227629a = i2;
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f227629a;
        cxh0 cxh0Var = cxh0.f43038a;
        w2a1 w2a1Var = w2a1.f247311a;
        switch (i) {
            case 0:
                xq00 xq00Var = (xq00) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (xq00Var.m91752Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ahf1.m25932d(k0e1.m54977L(R.string.standard_header_edit_button_text, xq00Var), null, null, 0L, null, null, 0, false, null, 0, null, xq00Var, 0, 0, Entity.AUTOCOMPLETE_FIELD_NUMBER);
                } else {
                    xq00Var.m91757b0();
                }
                return w2a1Var;
            case 1:
                xq00 xq00Var2 = (xq00) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (xq00Var2.m91752Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    psh.m70859c(0, xq00Var2);
                } else {
                    xq00Var2.m91757b0();
                }
                return w2a1Var;
            case 2:
                xq00 xq00Var3 = (xq00) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                if (xq00Var3.m91752Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    y85.m93057b(kou.f124911c, qgj.f188480a, mi21.m61834r(leu.m58816b(xq00Var3).f117235g.f159605c, cxh0Var), 0L, 0L, false, xq00Var3, kou.f124912d | 48, 56);
                } else {
                    xq00Var3.m91757b0();
                }
                return w2a1Var;
            case 3:
                xq00 xq00Var4 = (xq00) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                if (xq00Var4.m91752Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    y85.m93057b(uuu.f234260c, qgj.f188480a, mi21.m61834r(leu.m58816b(xq00Var4).f117235g.f159605c, cxh0Var), 0L, 0L, false, xq00Var4, uuu.f234261d | 48, 56);
                } else {
                    xq00Var4.m91757b0();
                }
                return w2a1Var;
            case 4:
                xq00 xq00Var5 = (xq00) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                if (xq00Var5.m91752Y(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    y85.m93057b(cqu.f40993c, qgj.f188480a, mi21.m61834r(leu.m58816b(xq00Var5).f117235g.f159605c, cxh0Var), 0L, 0L, false, xq00Var5, cqu.f40994d | 48, 56);
                } else {
                    xq00Var5.m91757b0();
                }
                return w2a1Var;
            case 5:
                xq00 xq00Var6 = (xq00) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                if (xq00Var6.m91752Y(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    ahf1.m25932d(k0e1.m54977L(R.string.cancel_cta, xq00Var6), null, null, 0L, null, null, 0, false, null, 0, null, xq00Var6, 0, 0, Entity.AUTOCOMPLETE_FIELD_NUMBER);
                } else {
                    xq00Var6.m91757b0();
                }
                return w2a1Var;
            case 6:
                xq00 xq00Var7 = (xq00) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                if (xq00Var7.m91752Y(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    y85.m93057b(bsu.f30386c, qgj.f188480a, null, leu.m58815a(xq00Var7).f112824b.f138758b, 0L, false, xq00Var7, bsu.f30387d | 48, 52);
                } else {
                    xq00Var7.m91757b0();
                }
                return w2a1Var;
            case 7:
                xq00 xq00Var8 = (xq00) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                if (xq00Var8.m91752Y(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    y85.m93057b(uuu.f234260c, qgj.f188480a, null, leu.m58815a(xq00Var8).f112824b.f138758b, 0L, false, xq00Var8, uuu.f234261d | 48, 52);
                } else {
                    xq00Var8.m91757b0();
                }
                return w2a1Var;
            case 8:
                xq00 xq00Var9 = (xq00) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                if (!xq00Var9.m91752Y(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    xq00Var9.m91757b0();
                }
                return w2a1Var;
            case 9:
                xq00 xq00Var10 = (xq00) obj;
                int iIntValue10 = ((Number) obj2).intValue();
                if (!xq00Var10.m91752Y(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    xq00Var10.m91757b0();
                }
                return w2a1Var;
            case 10:
                xq00 xq00Var11 = (xq00) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                boolean zM91752Y = xq00Var11.m91752Y(iIntValue11 & 1, (iIntValue11 & 3) != 2);
                ug5 ug5Var = xq00Var11.f264811a;
                if (zM91752Y) {
                    fxh0 fxh0VarM61822f = mi21.m61822f(1.0f, cxh0Var);
                    irx0 irx0VarM36744a = drx0.m36744a(bj5.f27616g, d7f0.f46142M0, xq00Var11, 0);
                    int iHashCode = Long.hashCode(xq00Var11.f264809T);
                    wpn0 wpn0VarM91778m = xq00Var11.m91778m();
                    fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var11, fxh0VarM61822f);
                    soh.f211194A.getClass();
                    C2087le c2087le = roh.f201257b;
                    if (ug5Var == null) {
                        pmg1.m70360s();
                        throw null;
                    }
                    xq00Var11.m91779m0();
                    if (xq00Var11.f264808S) {
                        xq00Var11.m91776l(c2087le);
                    } else {
                        xq00Var11.m91799w0();
                    }
                    yhh yhhVar = roh.f201262g;
                    zsf1.m96835F(irx0VarM36744a, yhhVar, xq00Var11);
                    yhh yhhVar2 = roh.f201261f;
                    zsf1.m96835F(wpn0VarM91778m, yhhVar2, xq00Var11);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    yhh yhhVar3 = roh.f201265j;
                    zsf1.m96835F(numValueOf, yhhVar3, xq00Var11);
                    vlh vlhVar = roh.f201266k;
                    zsf1.m96833D(vlhVar, xq00Var11);
                    yhh yhhVar4 = roh.f201259d;
                    zsf1.m96835F(fxh0VarM48286s, yhhVar4, xq00Var11);
                    aaf aafVarM87496a = w9f.m87496a(bj5.m29370g(leu.m58816b(xq00Var11).f117230b.f224759b), d7f0.f46144O0, xq00Var11, 0);
                    int iHashCode2 = Long.hashCode(xq00Var11.f264809T);
                    wpn0 wpn0VarM91778m2 = xq00Var11.m91778m();
                    fxh0 fxh0VarM48286s2 = hqg1.m48286s(xq00Var11, cxh0Var);
                    xq00Var11.m91779m0();
                    if (xq00Var11.f264808S) {
                        xq00Var11.m91776l(c2087le);
                    } else {
                        xq00Var11.m91799w0();
                    }
                    zsf1.m96835F(aafVarM87496a, yhhVar, xq00Var11);
                    zsf1.m96835F(wpn0VarM91778m2, yhhVar2, xq00Var11);
                    AbstractC0000a.m20s(iHashCode2, xq00Var11, yhhVar3, xq00Var11, vlhVar);
                    zsf1.m96835F(fxh0VarM48286s2, yhhVar4, xq00Var11);
                    drg1.m36721i(90, 12, null, null, xq00Var11, 0, 12);
                    drg1.m36721i(70, 14, null, null, xq00Var11, 0, 12);
                    xq00Var11.m91788r(true);
                    drg1.m36721i(100, 32, null, hmx0.m47993b(16), xq00Var11, 0, 4);
                    xq00Var11.m91788r(true);
                } else {
                    xq00Var11.m91757b0();
                }
                return w2a1Var;
            case 11:
                xq00 xq00Var12 = (xq00) obj;
                int iIntValue12 = ((Number) obj2).intValue();
                boolean zM91752Y2 = xq00Var12.m91752Y(iIntValue12 & 1, (iIntValue12 & 3) != 2);
                ug5 ug5Var2 = xq00Var12.f264811a;
                if (zM91752Y2) {
                    float f = 14;
                    drg1.m36721i(100, f, null, null, xq00Var12, 0, 12);
                    fxh0 fxh0VarM61822f2 = mi21.m61822f(1.0f, cxh0Var);
                    vb9 vb9Var = d7f0.f46142M0;
                    zi5 zi5Var = bj5.f27610a;
                    irx0 irx0VarM36744a2 = drx0.m36744a(bj5.m29370g(leu.m58816b(xq00Var12).f117230b.f224761d), vb9Var, xq00Var12, 0);
                    int iHashCode3 = Long.hashCode(xq00Var12.f264809T);
                    wpn0 wpn0VarM91778m3 = xq00Var12.m91778m();
                    fxh0 fxh0VarM48286s3 = hqg1.m48286s(xq00Var12, fxh0VarM61822f2);
                    soh.f211194A.getClass();
                    C2087le c2087le2 = roh.f201257b;
                    if (ug5Var2 == null) {
                        pmg1.m70360s();
                        throw null;
                    }
                    xq00Var12.m91779m0();
                    if (xq00Var12.f264808S) {
                        xq00Var12.m91776l(c2087le2);
                    } else {
                        xq00Var12.m91799w0();
                    }
                    yhh yhhVar5 = roh.f201262g;
                    zsf1.m96835F(irx0VarM36744a2, yhhVar5, xq00Var12);
                    yhh yhhVar6 = roh.f201261f;
                    zsf1.m96835F(wpn0VarM91778m3, yhhVar6, xq00Var12);
                    Integer numValueOf2 = Integer.valueOf(iHashCode3);
                    yhh yhhVar7 = roh.f201265j;
                    zsf1.m96835F(numValueOf2, yhhVar7, xq00Var12);
                    vlh vlhVar2 = roh.f201266k;
                    zsf1.m96833D(vlhVar2, xq00Var12);
                    yhh yhhVar8 = roh.f201259d;
                    zsf1.m96835F(fxh0VarM48286s3, yhhVar8, xq00Var12);
                    float f2 = l0i.f128429a;
                    drg1.m36724l(null, xq00Var12, 6);
                    aaf aafVarM87496a2 = w9f.m87496a(bj5.m29370g(leu.m58816b(xq00Var12).f117230b.f224761d), d7f0.f46144O0, xq00Var12, 0);
                    int iHashCode4 = Long.hashCode(xq00Var12.f264809T);
                    wpn0 wpn0VarM91778m4 = xq00Var12.m91778m();
                    fxh0 fxh0VarM48286s4 = hqg1.m48286s(xq00Var12, cxh0Var);
                    xq00Var12.m91779m0();
                    if (xq00Var12.f264808S) {
                        xq00Var12.m91776l(c2087le2);
                    } else {
                        xq00Var12.m91799w0();
                    }
                    zsf1.m96835F(aafVarM87496a2, yhhVar5, xq00Var12);
                    zsf1.m96835F(wpn0VarM91778m4, yhhVar6, xq00Var12);
                    AbstractC0000a.m20s(iHashCode4, xq00Var12, yhhVar7, xq00Var12, vlhVar2);
                    zsf1.m96835F(fxh0VarM48286s4, yhhVar8, xq00Var12);
                    drg1.m36721i(160, 20, null, null, xq00Var12, 0, 12);
                    drg1.m36721i(120, f, null, null, xq00Var12, 0, 12);
                    xq00Var12.m91788r(true);
                    xq00Var12.m91788r(true);
                } else {
                    xq00Var12.m91757b0();
                }
                return w2a1Var;
            case 12:
                xq00 xq00Var13 = (xq00) obj;
                int iIntValue13 = ((Number) obj2).intValue();
                if (xq00Var13.m91752Y(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    xhf1.m90972c(0, 1, xq00Var13, null);
                } else {
                    xq00Var13.m91757b0();
                }
                return w2a1Var;
            case 13:
                xq00 xq00Var14 = (xq00) obj;
                int iIntValue14 = ((Number) obj2).intValue();
                if (xq00Var14.m91752Y(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    xhf1.m90972c(0, 1, xq00Var14, null);
                } else {
                    xq00Var14.m91757b0();
                }
                return w2a1Var;
            case 14:
                xq00 xq00Var15 = (xq00) obj;
                int iIntValue15 = ((Number) obj2).intValue();
                if (xq00Var15.m91752Y(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    xhf1.m90972c(0, 1, xq00Var15, null);
                } else {
                    xq00Var15.m91757b0();
                }
                return w2a1Var;
            case 15:
                xq00 xq00Var16 = (xq00) obj;
                int iIntValue16 = ((Number) obj2).intValue();
                if (xq00Var16.m91752Y(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    xhf1.m90972c(0, 1, xq00Var16, null);
                } else {
                    xq00Var16.m91757b0();
                }
                return w2a1Var;
            case 16:
                xq00 xq00Var17 = (xq00) obj;
                int iIntValue17 = ((Number) obj2).intValue();
                if (xq00Var17.m91752Y(iIntValue17 & 1, (iIntValue17 & 3) != 2)) {
                    y85.m93057b(zru.f285750c, qgj.f188480a, null, n6f.f150866f, 0L, false, xq00Var17, zru.f285751d | 48, 52);
                } else {
                    xq00Var17.m91757b0();
                }
                return w2a1Var;
            case 17:
                xq00 xq00Var18 = (xq00) obj;
                int iIntValue18 = ((Number) obj2).intValue();
                if (xq00Var18.m91752Y(iIntValue18 & 1, (iIntValue18 & 3) != 2)) {
                    y85.m93057b(knu.f124473c, qgj.f188480a, null, n6f.f150862b, 0L, false, xq00Var18, knu.f124474d | 48, 52);
                } else {
                    xq00Var18.m91757b0();
                }
                return w2a1Var;
            case 18:
                xq00 xq00Var19 = (xq00) obj;
                int iIntValue19 = ((Number) obj2).intValue();
                if (xq00Var19.m91752Y(iIntValue19 & 1, (iIntValue19 & 3) != 2)) {
                    ahf1.m25932d(k0e1.m54977L(R.string.configuration_loading_failed_retry_button, xq00Var19), null, leu.m58818d(xq00Var19).f64972h, 0L, null, null, 0, false, null, 0, null, xq00Var19, 0, 0, 2042);
                } else {
                    xq00Var19.m91757b0();
                }
                return w2a1Var;
            case 19:
                xq00 xq00Var20 = (xq00) obj;
                int iIntValue20 = ((Number) obj2).intValue();
                if (xq00Var20.m91752Y(iIntValue20 & 1, (iIntValue20 & 3) != 2)) {
                    fxh0 fxh0VarM61820d = mi21.m61820d(1.0f, cxh0Var);
                    WeakHashMap weakHashMap = cxd1.f42984x;
                    fxh0 fxh0VarM90478H = xfg1.m90478H(fxh0VarM61820d, bxd1.m30815d(xq00Var20).f42989e);
                    m6d0 m6d0VarM36007d = dha.m36007d(d7f0.f46174i, false);
                    int iHashCode5 = Long.hashCode(xq00Var20.f264809T);
                    wpn0 wpn0VarM91778m5 = xq00Var20.m91778m();
                    fxh0 fxh0VarM48286s5 = hqg1.m48286s(xq00Var20, fxh0VarM90478H);
                    soh.f211194A.getClass();
                    C2087le c2087le3 = roh.f201257b;
                    if (xq00Var20.f264811a == null) {
                        pmg1.m70360s();
                        throw null;
                    }
                    xq00Var20.m91779m0();
                    if (xq00Var20.f264808S) {
                        xq00Var20.m91776l(c2087le3);
                    } else {
                        xq00Var20.m91799w0();
                    }
                    zsf1.m96835F(m6d0VarM36007d, roh.f201262g, xq00Var20);
                    zsf1.m96835F(wpn0VarM91778m5, roh.f201261f, xq00Var20);
                    zsf1.m96835F(Integer.valueOf(iHashCode5), roh.f201265j, xq00Var20);
                    zsf1.m96833D(roh.f201266k, xq00Var20);
                    zsf1.m96835F(fxh0VarM48286s5, roh.f201259d, xq00Var20);
                    p271.m68899b(null, 6, 0L, 0L, xq00Var20, 48, 13);
                    xq00Var20.m91788r(true);
                } else {
                    xq00Var20.m91757b0();
                }
                return w2a1Var;
            case 20:
                xq00 xq00Var21 = (xq00) obj;
                int iIntValue21 = ((Number) obj2).intValue();
                if (xq00Var21.m91752Y(iIntValue21 & 1, (iIntValue21 & 3) != 2)) {
                    y85.m93057b(muu.f147437c, qgj.f188480a, null, leu.m58815a(xq00Var21).f112824b.f138757a, 0L, false, xq00Var21, muu.f147438d | 48, 52);
                } else {
                    xq00Var21.m91757b0();
                }
                return w2a1Var;
            case 21:
                xq00 xq00Var22 = (xq00) obj;
                int iIntValue22 = ((Number) obj2).intValue();
                if (xq00Var22.m91752Y(iIntValue22 & 1, (iIntValue22 & 3) != 2)) {
                    ahf1.m25932d(k0e1.m54977L(R.string.bluejay_confirm_generation_edit_prompt, xq00Var22), null, leu.m58818d(xq00Var22).f64975k, leu.m58815a(xq00Var22).f112824b.f138758b, null, null, 0, false, null, 0, null, xq00Var22, 0, 0, 2034);
                } else {
                    xq00Var22.m91757b0();
                }
                return w2a1Var;
            case 22:
                xq00 xq00Var23 = (xq00) obj;
                int iIntValue23 = ((Number) obj2).intValue();
                if (xq00Var23.m91752Y(iIntValue23 & 1, (iIntValue23 & 3) != 2)) {
                    y85.m93057b(cpu.f40644c, qgj.f188480a, null, leu.m58815a(xq00Var23).f112824b.f138757a, 0L, false, xq00Var23, cpu.f40645d | 48, 52);
                } else {
                    xq00Var23.m91757b0();
                }
                return w2a1Var;
            case 23:
                xq00 xq00Var24 = (xq00) obj;
                int iIntValue24 = ((Number) obj2).intValue();
                if (xq00Var24.m91752Y(iIntValue24 & 1, (iIntValue24 & 3) != 2)) {
                    y85.m93057b(sru.f213379c, qgj.f188480a, null, leu.m58815a(xq00Var24).f112824b.f138757a, 0L, false, xq00Var24, sru.f213380d | 48, 52);
                } else {
                    xq00Var24.m91757b0();
                }
                return w2a1Var;
            case 24:
                xq00 xq00Var25 = (xq00) obj;
                int iIntValue25 = ((Number) obj2).intValue();
                if (xq00Var25.m91752Y(iIntValue25 & 1, (iIntValue25 & 3) != 2)) {
                    ahf1.m25932d(k0e1.m54977L(R.string.confirm_preferred_location_dialog_body, xq00Var25), null, leu.m58818d(xq00Var25).f64971g, leu.m58815a(xq00Var25).f112824b.f138758b, new h171(3), null, 0, false, null, 0, null, xq00Var25, 0, 0, 2018);
                } else {
                    xq00Var25.m91757b0();
                }
                return w2a1Var;
            case 25:
                xq00 xq00Var26 = (xq00) obj;
                int iIntValue26 = ((Number) obj2).intValue();
                if (xq00Var26.m91752Y(iIntValue26 & 1, (iIntValue26 & 3) != 2)) {
                    ahf1.m25932d(k0e1.m54977L(R.string.confirm_preferred_location_dialog_cancel, xq00Var26), null, null, 0L, null, null, 0, false, null, 0, null, xq00Var26, 0, 0, Entity.AUTOCOMPLETE_FIELD_NUMBER);
                } else {
                    xq00Var26.m91757b0();
                }
                return w2a1Var;
            case 26:
                xq00 xq00Var27 = (xq00) obj;
                int iIntValue27 = ((Number) obj2).intValue();
                if (xq00Var27.m91752Y(iIntValue27 & 1, (iIntValue27 & 3) != 2)) {
                    ahf1.m25932d(k0e1.m54977L(R.string.confirm_preferred_location_dialog_confirm, xq00Var27), null, null, 0L, null, null, 0, false, null, 0, null, xq00Var27, 0, 0, Entity.AUTOCOMPLETE_FIELD_NUMBER);
                } else {
                    xq00Var27.m91757b0();
                }
                return w2a1Var;
            case 27:
                xq00 xq00Var28 = (xq00) obj;
                int iIntValue28 = ((Number) obj2).intValue();
                if (xq00Var28.m91752Y(iIntValue28 & 1, (iIntValue28 & 3) != 2)) {
                    ahf1.m25932d(k0e1.m54977L(R.string.continue_button_label, xq00Var28), null, null, 0L, null, null, 0, false, null, 0, null, xq00Var28, 0, 0, Entity.AUTOCOMPLETE_FIELD_NUMBER);
                } else {
                    xq00Var28.m91757b0();
                }
                return w2a1Var;
            case 28:
                xq00 xq00Var29 = (xq00) obj;
                int iIntValue29 = ((Number) obj2).intValue();
                if (xq00Var29.m91752Y(iIntValue29 & 1, (iIntValue29 & 3) != 2)) {
                    wjg1.m88322a(null, null, false, null, new clm0(leu.m58815a(xq00Var29).f112823a.f229876c), null, null, null, xq00Var29, 0, 239);
                } else {
                    xq00Var29.m91757b0();
                }
                return w2a1Var;
            default:
                xq00 xq00Var30 = (xq00) obj;
                int iIntValue30 = ((Number) obj2).intValue();
                if (xq00Var30.m91752Y(iIntValue30 & 1, (iIntValue30 & 3) != 2)) {
                    y85.m93057b(ztu.f286267c, qgj.f188480a, null, 0L, 0L, false, xq00Var30, ztu.f286268d | 48, 60);
                } else {
                    xq00Var30.m91757b0();
                }
                return w2a1Var;
        }
    }
}
