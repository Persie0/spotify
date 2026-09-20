package p204p;

import android.graphics.Bitmap;
import com.comscore.streaming.AdvertisementType;
import com.spotify.music.R;
import com.spotify.searchview.proto.Entity;

/* JADX INFO: loaded from: classes10.dex */
public final class l5h extends qe70 implements vh00 {

    /* JADX INFO: renamed from: L0 */
    public static final l5h f129921L0;

    /* JADX INFO: renamed from: M0 */
    public static final l5h f129922M0;

    /* JADX INFO: renamed from: N0 */
    public static final l5h f129923N0;

    /* JADX INFO: renamed from: O0 */
    public static final l5h f129924O0;

    /* JADX INFO: renamed from: P0 */
    public static final l5h f129925P0;

    /* JADX INFO: renamed from: Q0 */
    public static final l5h f129926Q0;

    /* JADX INFO: renamed from: R0 */
    public static final l5h f129927R0;

    /* JADX INFO: renamed from: S0 */
    public static final l5h f129928S0;

    /* JADX INFO: renamed from: T0 */
    public static final l5h f129929T0;

    /* JADX INFO: renamed from: U0 */
    public static final l5h f129930U0;

    /* JADX INFO: renamed from: V0 */
    public static final l5h f129931V0;

    /* JADX INFO: renamed from: W0 */
    public static final l5h f129932W0;

    /* JADX INFO: renamed from: X */
    public static final l5h f129933X;

    /* JADX INFO: renamed from: X0 */
    public static final l5h f129934X0;

    /* JADX INFO: renamed from: Y */
    public static final l5h f129935Y;

    /* JADX INFO: renamed from: Y0 */
    public static final l5h f129936Y0;

    /* JADX INFO: renamed from: Z */
    public static final l5h f129937Z;

    /* JADX INFO: renamed from: Z0 */
    public static final l5h f129938Z0;

    /* JADX INFO: renamed from: a1 */
    public static final l5h f129939a1;

    /* JADX INFO: renamed from: b */
    public static final l5h f129940b;

    /* JADX INFO: renamed from: b1 */
    public static final l5h f129941b1;

    /* JADX INFO: renamed from: c */
    public static final l5h f129942c;

    /* JADX INFO: renamed from: c1 */
    public static final l5h f129943c1;

    /* JADX INFO: renamed from: d */
    public static final l5h f129944d;

    /* JADX INFO: renamed from: e */
    public static final l5h f129945e;

    /* JADX INFO: renamed from: f */
    public static final l5h f129946f;

    /* JADX INFO: renamed from: g */
    public static final l5h f129947g;

    /* JADX INFO: renamed from: h */
    public static final l5h f129948h;

    /* JADX INFO: renamed from: i */
    public static final l5h f129949i;

    /* JADX INFO: renamed from: t */
    public static final l5h f129950t;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f129951a;

    static {
        int i = 3;
        f129940b = new l5h(i, 0);
        f129942c = new l5h(i, 1);
        f129944d = new l5h(i, 2);
        f129945e = new l5h(i, 3);
        f129946f = new l5h(i, 4);
        f129947g = new l5h(i, 5);
        f129948h = new l5h(i, 6);
        f129949i = new l5h(i, 7);
        f129950t = new l5h(i, 8);
        f129933X = new l5h(i, 9);
        f129935Y = new l5h(i, 10);
        f129937Z = new l5h(i, 11);
        f129921L0 = new l5h(i, 12);
        f129922M0 = new l5h(i, 13);
        f129923N0 = new l5h(i, 14);
        f129924O0 = new l5h(i, 15);
        f129925P0 = new l5h(i, 16);
        f129926Q0 = new l5h(i, 17);
        f129927R0 = new l5h(i, 18);
        f129928S0 = new l5h(i, 19);
        f129929T0 = new l5h(i, 20);
        f129930U0 = new l5h(i, 21);
        f129931V0 = new l5h(i, 22);
        f129932W0 = new l5h(i, 23);
        f129934X0 = new l5h(i, 24);
        f129936Y0 = new l5h(i, 25);
        f129938Z0 = new l5h(i, 26);
        f129939a1 = new l5h(i, 27);
        f129941b1 = new l5h(i, 28);
        f129943c1 = new l5h(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l5h(int i, int i2) {
        super(i);
        this.f129951a = i2;
    }

    @Override // p204p.vh00
    /* JADX INFO: renamed from: D0 */
    public final Object mo24510D0(Object obj, Object obj2, Object obj3) {
        switch (this.f129951a) {
            case 0:
                ((Number) obj3).intValue();
                return w2a1.f247311a;
            case 1:
                xq00 xq00Var = (xq00) obj2;
                ((Number) obj3).intValue();
                y85.m93057b(pou.f179785c, qgj.f188480a, mi21.m61834r(leu.m58816b(xq00Var).f117235g.f159604b, cxh0.f43038a), leu.m58815a(xq00Var).f112825c.f221219b, 0L, false, xq00Var, pou.f179786d | 48, 48);
                return w2a1.f247311a;
            case 2:
                Bitmap bitmap = (Bitmap) obj;
                xq00 xq00Var2 = (xq00) obj2;
                ((Number) obj3).intValue();
                cxh0 cxh0Var = cxh0.f43038a;
                if (bitmap != null) {
                    xq00Var2.m91771i0(-1038228660);
                    upf.m83688e(new q94(bitmap), null, mi21.m61820d(1.0f, cxh0Var), r101.f194644L0, xq00Var2, 48, AdvertisementType.BRANDED_ON_DEMAND_MID_ROLL);
                    xq00Var2.m91788r(false);
                } else {
                    xq00Var2.m91771i0(-1038049852);
                    dha.m36004a(mi21.m61820d(1.0f, cxh0Var), xq00Var2, 0);
                    xq00Var2.m91788r(false);
                }
                return w2a1.f247311a;
            case 3:
                xq00 xq00Var3 = (xq00) obj2;
                ((Number) obj3).intValue();
                ahf1.m25932d(k0e1.m54977L(R.string.sort_button_text, xq00Var3), null, leu.m58818d(xq00Var3).f64975k, 0L, null, null, 0, false, null, 0, null, xq00Var3, 0, 0, 2042);
                return w2a1.f247311a;
            case 4:
                xq00 xq00Var4 = (xq00) obj2;
                ((Number) obj3).intValue();
                y85.m93057b(pou.f179785c, qgj.f188480a, mi21.m61834r(leu.m58816b(xq00Var4).f117235g.f159605c, cxh0.f43038a), leu.m58815a(xq00Var4).f112825c.f221219b, 0L, false, xq00Var4, pou.f179786d | 48, 48);
                return w2a1.f247311a;
            case 5:
                String str = (String) obj;
                xq00 xq00Var5 = (xq00) obj2;
                int iIntValue = ((Number) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= xq00Var5.m91766g(str) ? 4 : 2;
                }
                if (xq00Var5.m91752Y(iIntValue & 1, (iIntValue & 19) != 18)) {
                    ahf1.m25932d(str, null, leu.m58818d(xq00Var5).f64974j, leu.m58815a(xq00Var5).f112824b.f138758b, null, null, 0, false, null, 0, null, xq00Var5, iIntValue & 14, 0, 2034);
                } else {
                    xq00Var5.m91757b0();
                }
                return w2a1.f247311a;
            case 6:
                xq00 xq00Var6 = (xq00) obj2;
                ((Number) obj3).intValue();
                y85.m93057b(cpu.f40644c, qgj.f188480a, null, leu.m58815a(xq00Var6).f112824b.f138758b, 0L, false, xq00Var6, cpu.f40645d | 48, 52);
                return w2a1.f247311a;
            case 7:
                xq00 xq00Var7 = (xq00) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                if (xq00Var7.m91752Y(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    usg1.m83887f(null, xq00Var7, 0);
                } else {
                    xq00Var7.m91757b0();
                }
                return w2a1.f247311a;
            case 8:
                xq00 xq00Var8 = (xq00) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                if (xq00Var8.m91752Y(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    usg1.m83887f(null, xq00Var8, 0);
                } else {
                    xq00Var8.m91757b0();
                }
                return w2a1.f247311a;
            case 9:
                xq00 xq00Var9 = (xq00) obj2;
                ((Number) obj3).intValue();
                fxh0 fxh0VarM61834r = mi21.m61834r(leu.m58816b(xq00Var9).f117235g.f159608f, nec.m64246i(r9g1.m75068p(cxh0.f43038a, hmx0.f93097a), leu.m58815a(xq00Var9).f112823a.f229875b.f123093a, kxf1.f127485a));
                m6d0 m6d0VarM36007d = dha.m36007d(d7f0.f46174i, false);
                int iHashCode = Long.hashCode(xq00Var9.f264809T);
                wpn0 wpn0VarM91778m = xq00Var9.m91778m();
                fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var9, fxh0VarM61834r);
                soh.f211194A.getClass();
                C2087le c2087le = roh.f201257b;
                if (xq00Var9.f264811a == null) {
                    pmg1.m70360s();
                    throw null;
                }
                xq00Var9.m91779m0();
                if (xq00Var9.f264808S) {
                    xq00Var9.m91776l(c2087le);
                } else {
                    xq00Var9.m91799w0();
                }
                zsf1.m96835F(m6d0VarM36007d, roh.f201262g, xq00Var9);
                zsf1.m96835F(wpn0VarM91778m, roh.f201261f, xq00Var9);
                zsf1.m96835F(Integer.valueOf(iHashCode), roh.f201265j, xq00Var9);
                zsf1.m96833D(roh.f201266k, xq00Var9);
                zsf1.m96835F(fxh0VarM48286s, roh.f201259d, xq00Var9);
                y85.m93057b(uuu.f234260c, qgj.f188480a, null, 0L, 0L, false, xq00Var9, uuu.f234261d | 48, 60);
                xq00Var9.m91788r(true);
                return w2a1.f247311a;
            case 10:
                xq00 xq00Var10 = (xq00) obj2;
                ((Number) obj3).intValue();
                ahf1.m25932d(k0e1.m54977L(R.string.send_chat_invite_row_title, xq00Var10), null, null, 0L, null, null, 0, false, null, 0, null, xq00Var10, 0, 0, Entity.AUTOCOMPLETE_FIELD_NUMBER);
                return w2a1.f247311a;
            case 11:
                xq00 xq00Var11 = (xq00) obj2;
                ((Number) obj3).intValue();
                ahf1.m25932d(k0e1.m54977L(R.string.send_chat_invite_row_subtitle, xq00Var11), null, null, 0L, null, null, 0, false, null, 0, null, xq00Var11, 0, 0, Entity.AUTOCOMPLETE_FIELD_NUMBER);
                return w2a1.f247311a;
            case 12:
                xq00 xq00Var12 = (xq00) obj2;
                ((Number) obj3).intValue();
                ahf1.m25932d("X", null, leu.m58818d(xq00Var12).f64974j, 0L, null, null, 2, false, new ol80(1), 0, null, xq00Var12, 6, 0, 1722);
                return w2a1.f247311a;
            case 13:
                xq00 xq00Var13 = (xq00) obj2;
                ((Number) obj3).intValue();
                ahf1.m25932d("X", null, leu.m58818d(xq00Var13).f64977m, 0L, null, null, 2, false, new ol80(1), 0, null, xq00Var13, 6, 0, 1722);
                return w2a1.f247311a;
            case 14:
                xq00 xq00Var14 = (xq00) obj2;
                ((Number) obj3).intValue();
                ahf1.m25932d("X\nX", null, leu.m58818d(xq00Var14).f64971g, 0L, null, null, 2, false, new ol80(2), 0, null, xq00Var14, 6, 0, 1722);
                return w2a1.f247311a;
            case 15:
                ((Number) obj3).intValue();
                float f = svz0.f214541a;
                riw0.m75615i((xq00) obj2, mi21.m61824h(f, mi21.m61838v(f, cxh0.f43038a)));
                return w2a1.f247311a;
            case 16:
                xq00 xq00Var15 = (xq00) obj2;
                int iIntValue4 = ((Number) obj3).intValue();
                if (xq00Var15.m91752Y(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    String strM54977L = k0e1.m54977L(R.string.settings_page_search_recents_header, xq00Var15);
                    if71 if71Var = leu.m58818d(xq00Var15).f64970f;
                    long j = leu.m58815a(xq00Var15).f112824b.f138758b;
                    fxh0 fxh0VarM61822f = mi21.m61822f(1.0f, cxh0.f43038a);
                    Object objM91750T = xq00Var15.m91750T();
                    if (objM91750T == t6x0.f217647t) {
                        objM91750T = byg.f32196M0;
                        xq00Var15.m91793t0(objM91750T);
                    }
                    ahf1.m25932d(strM54977L, zoz0.m96644b(fxh0VarM61822f, true, (gh00) objM91750T), if71Var, j, null, null, 0, false, null, 0, null, xq00Var15, 0, 0, 2032);
                } else {
                    xq00Var15.m91757b0();
                }
                return w2a1.f247311a;
            case 17:
                xq00 xq00Var16 = (xq00) obj2;
                int iIntValue5 = ((Number) obj3).intValue();
                if (xq00Var16.m91752Y(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    p711.m69222a(null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, q7h.f186131a, xq00Var16, 0, 196608, 32767);
                } else {
                    xq00Var16.m91757b0();
                }
                return w2a1.f247311a;
            case 18:
                xq00 xq00Var17 = (xq00) obj2;
                int iIntValue6 = ((Number) obj3).intValue();
                if (xq00Var17.m91752Y(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    y85.m93057b(pou.f179785c, qgj.f188480a, mi21.m61834r(leu.m58816b(xq00Var17).f117235g.f159604b, cxh0.f43038a), 0L, 0L, false, xq00Var17, pou.f179786d | 48, 56);
                } else {
                    xq00Var17.m91757b0();
                }
                return w2a1.f247311a;
            case 19:
                xq00 xq00Var18 = (xq00) obj2;
                ((Number) obj3).intValue();
                qiu.m72880f(rkk.m75772x(-1067676504, new g2g((y631) obj, 7), xq00Var18), xq00Var18, 6);
                return w2a1.f247311a;
            case 20:
                xq00 xq00Var19 = (xq00) obj2;
                int iIntValue7 = ((Number) obj3).intValue();
                if (xq00Var19.m91752Y(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    ahf1.m25932d(k0e1.m54977L(R.string.chat_share_suggested_users_title, xq00Var19), zsf1.m96832C(zsf1.m96830A(cxh0.f43038a, leu.m58816b(xq00Var19).f117230b.f224763f, 0.0f, 2), 0.0f, leu.m58816b(xq00Var19).f117230b.f224763f, 0.0f, leu.m58816b(xq00Var19).f117230b.f224761d, 5), leu.m58818d(xq00Var19).f64969e, leu.m58815a(xq00Var19).f112824b.f138757a, new h171(5), null, 0, false, null, 0, null, xq00Var19, 0, 0, 2016);
                } else {
                    xq00Var19.m91757b0();
                }
                return w2a1.f247311a;
            case 21:
                xq00 xq00Var20 = (xq00) obj2;
                int iIntValue8 = ((Number) obj3).intValue();
                if (!xq00Var20.m91752Y(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    xq00Var20.m91757b0();
                }
                return w2a1.f247311a;
            case 22:
                xq00 xq00Var21 = (xq00) obj2;
                int iIntValue9 = ((Number) obj3).intValue();
                if (xq00Var21.m91752Y(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    float f2 = f811.f66831c;
                    float f3 = f811.f66830b;
                    cxh0 cxh0Var2 = cxh0.f43038a;
                    fxh0 fxh0VarM96865y = zsf1.m96865y(f811.f66829a, nec.m64246i(r9g1.m75068p(mi21.m61817a(cxh0Var2, f2, f3), hmx0.m47993b(8)), n6f.m63765b(n6f.f150862b, 0.6f, 0.0f, 0.0f, 0.0f, 14), kxf1.f127485a));
                    m6d0 m6d0VarM36007d2 = dha.m36007d(d7f0.f46166e, false);
                    int iHashCode2 = Long.hashCode(xq00Var21.f264809T);
                    wpn0 wpn0VarM91778m2 = xq00Var21.m91778m();
                    fxh0 fxh0VarM48286s2 = hqg1.m48286s(xq00Var21, fxh0VarM96865y);
                    soh.f211194A.getClass();
                    C2087le c2087le2 = roh.f201257b;
                    if (xq00Var21.f264811a == null) {
                        pmg1.m70360s();
                        throw null;
                    }
                    xq00Var21.m91779m0();
                    if (xq00Var21.f264808S) {
                        xq00Var21.m91776l(c2087le2);
                    } else {
                        xq00Var21.m91799w0();
                    }
                    zsf1.m96835F(m6d0VarM36007d2, roh.f201262g, xq00Var21);
                    zsf1.m96835F(wpn0VarM91778m2, roh.f201261f, xq00Var21);
                    zsf1.m96835F(Integer.valueOf(iHashCode2), roh.f201265j, xq00Var21);
                    zsf1.m96833D(roh.f201266k, xq00Var21);
                    zsf1.m96835F(fxh0VarM48286s2, roh.f201259d, xq00Var21);
                    p271.m68899b(epv0.m39673I("ShareableLoading", pha.f177517a.mo66945a(mi21.m61814B(cxh0Var2, null, 3), d7f0.f46174i)), 4, 0L, 0L, xq00Var21, 48, 12);
                    xq00Var21.m91788r(true);
                } else {
                    xq00Var21.m91757b0();
                }
                return w2a1.f247311a;
            case 23:
                xq00 xq00Var22 = (xq00) obj2;
                int iIntValue10 = ((Number) obj3).intValue();
                if (xq00Var22.m91752Y(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    fxh0 fxh0VarM96865y2 = zsf1.m96865y(leu.m58816b(xq00Var22).f117230b.f224763f, mi21.m61822f(1.0f, cxh0.f43038a));
                    m6d0 m6d0VarM36007d3 = dha.m36007d(d7f0.f46174i, false);
                    int iHashCode3 = Long.hashCode(xq00Var22.f264809T);
                    wpn0 wpn0VarM91778m3 = xq00Var22.m91778m();
                    fxh0 fxh0VarM48286s3 = hqg1.m48286s(xq00Var22, fxh0VarM96865y2);
                    soh.f211194A.getClass();
                    C2087le c2087le3 = roh.f201257b;
                    if (xq00Var22.f264811a == null) {
                        pmg1.m70360s();
                        throw null;
                    }
                    xq00Var22.m91779m0();
                    if (xq00Var22.f264808S) {
                        xq00Var22.m91776l(c2087le3);
                    } else {
                        xq00Var22.m91799w0();
                    }
                    zsf1.m96835F(m6d0VarM36007d3, roh.f201262g, xq00Var22);
                    zsf1.m96835F(wpn0VarM91778m3, roh.f201261f, xq00Var22);
                    zsf1.m96835F(Integer.valueOf(iHashCode3), roh.f201265j, xq00Var22);
                    zsf1.m96833D(roh.f201266k, xq00Var22);
                    zsf1.m96835F(fxh0VarM48286s3, roh.f201259d, xq00Var22);
                    p271.m68899b(null, 4, 0L, 0L, xq00Var22, 48, 13);
                    xq00Var22.m91788r(true);
                } else {
                    xq00Var22.m91757b0();
                }
                return w2a1.f247311a;
            case 24:
                xq00 xq00Var23 = (xq00) obj2;
                int iIntValue11 = ((Number) obj3).intValue();
                if (xq00Var23.m91752Y(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    y85.m93057b(hou.f93607c, qgj.f188480a, mi21.m61834r(leu.m58816b(xq00Var23).f117235g.f159605c, cxh0.f43038a), leu.m58815a(xq00Var23).f112824b.f138759c, 0L, false, xq00Var23, hou.f93608d | 48, 48);
                } else {
                    xq00Var23.m91757b0();
                }
                return w2a1.f247311a;
            case 25:
                ((Number) obj3).intValue();
                dha.m36004a(nec.m64246i(mi21.m61834r(8, cxh0.f43038a), fh11.f69526c, hmx0.f93097a), (xq00) obj2, 0);
                return w2a1.f247311a;
            case 26:
                xq00 xq00Var24 = (xq00) obj2;
                ((Number) obj3).intValue();
                y85.m93057b(psu.f180961c, qgj.f188480a, mi21.m61834r(leu.m58816b(xq00Var24).f117235g.f159604b, cxh0.f43038a), 0L, 0L, false, xq00Var24, psu.f180962d | 48, 56);
                return w2a1.f247311a;
            case 27:
                xq00 xq00Var25 = (xq00) obj2;
                ((Number) obj3).intValue();
                p271.m68899b(null, 2, leu.m58815a(xq00Var25).f112824b.f138758b, 0L, xq00Var25, 48, 9);
                return w2a1.f247311a;
            case 28:
                xq00 xq00Var26 = (xq00) obj2;
                ((Number) obj3).intValue();
                fxh0 fxh0VarM64246i = nec.m64246i(r9g1.m75068p(mi21.m61834r(56, cxh0.f43038a), hmx0.m47993b(leu.m58816b(xq00Var26).f117234f.f148186b)), leu.m58815a(xq00Var26).f112823a.f229875b.f123093a, kxf1.f127485a);
                m6d0 m6d0VarM36007d4 = dha.m36007d(d7f0.f46174i, false);
                int iHashCode4 = Long.hashCode(xq00Var26.f264809T);
                wpn0 wpn0VarM91778m4 = xq00Var26.m91778m();
                fxh0 fxh0VarM48286s4 = hqg1.m48286s(xq00Var26, fxh0VarM64246i);
                soh.f211194A.getClass();
                C2087le c2087le4 = roh.f201257b;
                if (xq00Var26.f264811a == null) {
                    pmg1.m70360s();
                    throw null;
                }
                xq00Var26.m91779m0();
                if (xq00Var26.f264808S) {
                    xq00Var26.m91776l(c2087le4);
                } else {
                    xq00Var26.m91799w0();
                }
                zsf1.m96835F(m6d0VarM36007d4, roh.f201262g, xq00Var26);
                zsf1.m96835F(wpn0VarM91778m4, roh.f201261f, xq00Var26);
                zsf1.m96835F(Integer.valueOf(iHashCode4), roh.f201265j, xq00Var26);
                zsf1.m96833D(roh.f201266k, xq00Var26);
                zsf1.m96835F(fxh0VarM48286s4, roh.f201259d, xq00Var26);
                y85.m93057b(auu.f20028c, qgj.f188480a, null, leu.m58815a(xq00Var26).f112824b.f138757a, 0L, false, xq00Var26, auu.f20029d | 48, 52);
                xq00Var26.m91788r(true);
                return w2a1.f247311a;
            default:
                xq00 xq00Var27 = (xq00) obj2;
                ((Number) obj3).intValue();
                ahf1.m25932d(k0e1.m54977L(R.string.bluejay_show_picker_create_new, xq00Var27), null, leu.m58818d(xq00Var27).f64971g, leu.m58815a(xq00Var27).f112824b.f138757a, null, null, 0, false, null, 0, null, xq00Var27, 0, 0, 2034);
                return w2a1.f247311a;
        }
    }
}
