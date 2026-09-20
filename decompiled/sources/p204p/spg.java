package p204p;

import com.spotify.music.R;
import com.spotify.searchview.proto.Entity;

/* JADX INFO: loaded from: classes8.dex */
public final class spg extends qe70 implements th00 {

    /* JADX INFO: renamed from: L0 */
    public static final spg f212842L0;

    /* JADX INFO: renamed from: M0 */
    public static final spg f212843M0;

    /* JADX INFO: renamed from: N0 */
    public static final spg f212844N0;

    /* JADX INFO: renamed from: O0 */
    public static final spg f212845O0;

    /* JADX INFO: renamed from: P0 */
    public static final spg f212846P0;

    /* JADX INFO: renamed from: Q0 */
    public static final spg f212847Q0;

    /* JADX INFO: renamed from: R0 */
    public static final spg f212848R0;

    /* JADX INFO: renamed from: S0 */
    public static final spg f212849S0;

    /* JADX INFO: renamed from: T0 */
    public static final spg f212850T0;

    /* JADX INFO: renamed from: U0 */
    public static final spg f212851U0;

    /* JADX INFO: renamed from: V0 */
    public static final spg f212852V0;

    /* JADX INFO: renamed from: W0 */
    public static final spg f212853W0;

    /* JADX INFO: renamed from: X */
    public static final spg f212854X;

    /* JADX INFO: renamed from: X0 */
    public static final spg f212855X0;

    /* JADX INFO: renamed from: Y */
    public static final spg f212856Y;

    /* JADX INFO: renamed from: Y0 */
    public static final spg f212857Y0;

    /* JADX INFO: renamed from: Z */
    public static final spg f212858Z;

    /* JADX INFO: renamed from: Z0 */
    public static final spg f212859Z0;

    /* JADX INFO: renamed from: a1 */
    public static final spg f212860a1;

    /* JADX INFO: renamed from: b */
    public static final spg f212861b;

    /* JADX INFO: renamed from: b1 */
    public static final spg f212862b1;

    /* JADX INFO: renamed from: c */
    public static final spg f212863c;

    /* JADX INFO: renamed from: c1 */
    public static final spg f212864c1;

    /* JADX INFO: renamed from: d */
    public static final spg f212865d;

    /* JADX INFO: renamed from: e */
    public static final spg f212866e;

    /* JADX INFO: renamed from: f */
    public static final spg f212867f;

    /* JADX INFO: renamed from: g */
    public static final spg f212868g;

    /* JADX INFO: renamed from: h */
    public static final spg f212869h;

    /* JADX INFO: renamed from: i */
    public static final spg f212870i;

    /* JADX INFO: renamed from: t */
    public static final spg f212871t;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f212872a;

    static {
        int i = 2;
        f212861b = new spg(i, 0);
        f212863c = new spg(i, 1);
        f212865d = new spg(i, 2);
        f212866e = new spg(i, 3);
        f212867f = new spg(i, 4);
        f212868g = new spg(i, 5);
        f212869h = new spg(i, 6);
        f212870i = new spg(i, 7);
        f212871t = new spg(i, 8);
        f212854X = new spg(i, 9);
        f212856Y = new spg(i, 10);
        f212858Z = new spg(i, 11);
        f212842L0 = new spg(i, 12);
        f212843M0 = new spg(i, 13);
        f212844N0 = new spg(i, 14);
        f212845O0 = new spg(i, 15);
        f212846P0 = new spg(i, 16);
        f212847Q0 = new spg(i, 17);
        f212848R0 = new spg(i, 18);
        f212849S0 = new spg(i, 19);
        f212850T0 = new spg(i, 20);
        f212851U0 = new spg(i, 21);
        f212852V0 = new spg(i, 22);
        f212853W0 = new spg(i, 23);
        f212855X0 = new spg(i, 24);
        f212857Y0 = new spg(i, 25);
        f212859Z0 = new spg(i, 26);
        f212860a1 = new spg(i, 27);
        f212862b1 = new spg(i, 28);
        f212864c1 = new spg(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ spg(int i, int i2) {
        super(i);
        this.f212872a = i2;
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f212872a) {
            case 0:
                xq00 xq00Var = (xq00) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (xq00Var.m91752Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    y85.m93057b(uuu.f234260c, new rgj(k0e1.m54977L(R.string.livestream_entity_page_share_button_description, xq00Var)), null, 0L, 0L, false, xq00Var, uuu.f234261d, 60);
                } else {
                    xq00Var.m91757b0();
                }
                return w2a1.f247311a;
            case 1:
                xq00 xq00Var2 = (xq00) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (xq00Var2.m91752Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    y85.m93057b(cqu.f40993c, qgj.f188480a, null, 0L, 0L, false, xq00Var2, cqu.f40994d | 48, 60);
                } else {
                    xq00Var2.m91757b0();
                }
                return w2a1.f247311a;
            case 2:
                xq00 xq00Var3 = (xq00) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                if (xq00Var3.m91752Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    y85.m93057b(tmu.f221780c, new rgj(k0e1.m54977L(R.string.livestream_entity_page_calendar_button_description, xq00Var3)), null, 0L, 0L, false, xq00Var3, tmu.f221781d, 60);
                } else {
                    xq00Var3.m91757b0();
                }
                return w2a1.f247311a;
            case 3:
                xq00 xq00Var4 = (xq00) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                if (xq00Var4.m91752Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    fxh0 fxh0VarM61820d = mi21.m61820d(1.0f, cxh0.f43038a);
                    m6d0 m6d0VarM36007d = dha.m36007d(d7f0.f46174i, false);
                    int iHashCode = Long.hashCode(xq00Var4.f264809T);
                    wpn0 wpn0VarM91778m = xq00Var4.m91778m();
                    fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var4, fxh0VarM61820d);
                    soh.f211194A.getClass();
                    C2087le c2087le = roh.f201257b;
                    if (xq00Var4.f264811a == null) {
                        pmg1.m70360s();
                        throw null;
                    }
                    xq00Var4.m91779m0();
                    if (xq00Var4.f264808S) {
                        xq00Var4.m91776l(c2087le);
                    } else {
                        xq00Var4.m91799w0();
                    }
                    zsf1.m96835F(m6d0VarM36007d, roh.f201262g, xq00Var4);
                    zsf1.m96835F(wpn0VarM91778m, roh.f201261f, xq00Var4);
                    zsf1.m96835F(Integer.valueOf(iHashCode), roh.f201265j, xq00Var4);
                    zsf1.m96833D(roh.f201266k, xq00Var4);
                    zsf1.m96835F(fxh0VarM48286s, roh.f201259d, xq00Var4);
                    p271.m68899b(null, 5, 0L, 0L, xq00Var4, 48, 13);
                    xq00Var4.m91788r(true);
                } else {
                    xq00Var4.m91757b0();
                }
                return w2a1.f247311a;
            case 4:
                xq00 xq00Var5 = (xq00) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                if (xq00Var5.m91752Y(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    p271.m68899b(null, 0, 0L, 0L, xq00Var5, 0, 15);
                } else {
                    xq00Var5.m91757b0();
                }
                return w2a1.f247311a;
            case 5:
                xq00 xq00Var6 = (xq00) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                if (!xq00Var6.m91752Y(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    xq00Var6.m91757b0();
                }
                return w2a1.f247311a;
            case 6:
                xq00 xq00Var7 = (xq00) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                if (xq00Var7.m91752Y(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    yif1.m93786g(0, xq00Var7);
                } else {
                    xq00Var7.m91757b0();
                }
                return w2a1.f247311a;
            case 7:
                xq00 xq00Var8 = (xq00) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                if (xq00Var8.m91752Y(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    cxh0 cxh0Var = cxh0.f43038a;
                    fxh0 fxh0VarM61820d2 = mi21.m61820d(1.0f, cxh0Var);
                    m6d0 m6d0VarM36007d2 = dha.m36007d(d7f0.f46157Z, false);
                    int iHashCode2 = Long.hashCode(xq00Var8.f264809T);
                    wpn0 wpn0VarM91778m2 = xq00Var8.m91778m();
                    fxh0 fxh0VarM48286s2 = hqg1.m48286s(xq00Var8, fxh0VarM61820d2);
                    soh.f211194A.getClass();
                    C2087le c2087le2 = roh.f201257b;
                    if (xq00Var8.f264811a == null) {
                        pmg1.m70360s();
                        throw null;
                    }
                    xq00Var8.m91779m0();
                    if (xq00Var8.f264808S) {
                        xq00Var8.m91776l(c2087le2);
                    } else {
                        xq00Var8.m91799w0();
                    }
                    zsf1.m96835F(m6d0VarM36007d2, roh.f201262g, xq00Var8);
                    zsf1.m96835F(wpn0VarM91778m2, roh.f201261f, xq00Var8);
                    zsf1.m96835F(Integer.valueOf(iHashCode2), roh.f201265j, xq00Var8);
                    zsf1.m96833D(roh.f201266k, xq00Var8);
                    zsf1.m96835F(fxh0VarM48286s2, roh.f201259d, xq00Var8);
                    dha.m36004a(xtm0.m92060G(nec.m64246i(r9g1.m75068p(mi21.m61820d(1.0f, cxh0Var), hmx0.m47993b(leu.m58816b(xq00Var8).f117234f.f148186b)), leu.m58815a(xq00Var8).f112823a.f229875b.f123093a, kxf1.f127485a), 0L, hmx0.m47993b(leu.m58816b(xq00Var8).f117234f.f148186b), 13), xq00Var8, 0);
                    xq00Var8.m91788r(true);
                } else {
                    xq00Var8.m91757b0();
                }
                return w2a1.f247311a;
            case 8:
                xq00 xq00Var9 = (xq00) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                if (xq00Var9.m91752Y(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    y0v.m92603a(2, aqg.f18248a, xq00Var9, 390, 2);
                } else {
                    xq00Var9.m91757b0();
                }
                return w2a1.f247311a;
            case 9:
                xq00 xq00Var10 = (xq00) obj;
                int iIntValue10 = ((Number) obj2).intValue();
                if (xq00Var10.m91752Y(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    p271.m68899b(null, 0, leu.m58815a(xq00Var10).f112824b.f138757a, 0L, xq00Var10, 0, 11);
                } else {
                    xq00Var10.m91757b0();
                }
                return w2a1.f247311a;
            case 10:
                xq00 xq00Var11 = (xq00) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                if (xq00Var11.m91752Y(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    hrg1.m48392g(mi21.m61820d(1.0f, cxh0.f43038a), xq00Var11, 6);
                } else {
                    xq00Var11.m91757b0();
                }
                return w2a1.f247311a;
            case 11:
                xq00 xq00Var12 = (xq00) obj;
                int iIntValue12 = ((Number) obj2).intValue();
                if (xq00Var12.m91752Y(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    rxf1.m76618c(null, new c1x0(R.color.accent), xq00Var12, 0);
                } else {
                    xq00Var12.m91757b0();
                }
                return w2a1.f247311a;
            case 12:
                xq00 xq00Var13 = (xq00) obj;
                int iIntValue13 = ((Number) obj2).intValue();
                if (xq00Var13.m91752Y(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    yif1.m93786g(0, xq00Var13);
                } else {
                    xq00Var13.m91757b0();
                }
                return w2a1.f247311a;
            case 13:
                xq00 xq00Var14 = (xq00) obj;
                int iIntValue14 = ((Number) obj2).intValue();
                if (xq00Var14.m91752Y(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    vhf1.m85549c(null, xq00Var14, 0);
                } else {
                    xq00Var14.m91757b0();
                }
                return w2a1.f247311a;
            case 14:
                xq00 xq00Var15 = (xq00) obj;
                int iIntValue15 = ((Number) obj2).intValue();
                if (xq00Var15.m91752Y(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    ahf1.m25932d(k0e1.m54977L(R.string.local_files_empty_section_dialog_permission_rationale_title, xq00Var15), null, null, 0L, null, null, 0, false, null, 0, null, xq00Var15, 0, 0, Entity.AUTOCOMPLETE_FIELD_NUMBER);
                } else {
                    xq00Var15.m91757b0();
                }
                return w2a1.f247311a;
            case 15:
                xq00 xq00Var16 = (xq00) obj;
                int iIntValue16 = ((Number) obj2).intValue();
                if (xq00Var16.m91752Y(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    ahf1.m25932d(k0e1.m54977L(R.string.local_files_empty_section_dialog_permission_rationale_body, xq00Var16), null, null, 0L, null, null, 0, false, null, 0, null, xq00Var16, 0, 0, Entity.AUTOCOMPLETE_FIELD_NUMBER);
                } else {
                    xq00Var16.m91757b0();
                }
                return w2a1.f247311a;
            case 16:
                xq00 xq00Var17 = (xq00) obj;
                int iIntValue17 = ((Number) obj2).intValue();
                if (xq00Var17.m91752Y(iIntValue17 & 1, (iIntValue17 & 3) != 2)) {
                    ahf1.m25932d(k0e1.m54977L(R.string.local_files_empty_section_dialog_permission_rationale_dismiss, xq00Var17), null, leu.m58818d(xq00Var17).f64972h, 0L, null, null, 0, false, null, 0, null, xq00Var17, 0, 0, 2042);
                } else {
                    xq00Var17.m91757b0();
                }
                return w2a1.f247311a;
            case 17:
                xq00 xq00Var18 = (xq00) obj;
                int iIntValue18 = ((Number) obj2).intValue();
                if (xq00Var18.m91752Y(iIntValue18 & 1, (iIntValue18 & 3) != 2)) {
                    y85.m93057b(uwu.f234734c, qgj.f188480a, mi21.m61834r(leu.m58816b(xq00Var18).f117235g.f159604b, cxh0.f43038a), leu.m58815a(xq00Var18).f112824b.f138758b, 0L, false, xq00Var18, uwu.f234735d | 48, 48);
                } else {
                    xq00Var18.m91757b0();
                }
                return w2a1.f247311a;
            case 18:
                xq00 xq00Var19 = (xq00) obj;
                int iIntValue19 = ((Number) obj2).intValue();
                if (xq00Var19.m91752Y(iIntValue19 & 1, (iIntValue19 & 3) != 2)) {
                    y85.m93057b(tuu.f223921c, qgj.f188480a, mi21.m61834r(leu.m58816b(xq00Var19).f117235g.f159604b, cxh0.f43038a), leu.m58815a(xq00Var19).f112824b.f138758b, 0L, false, xq00Var19, tuu.f223922d | 48, 48);
                } else {
                    xq00Var19.m91757b0();
                }
                return w2a1.f247311a;
            case 19:
                xq00 xq00Var20 = (xq00) obj;
                int iIntValue20 = ((Number) obj2).intValue();
                if (xq00Var20.m91752Y(iIntValue20 & 1, (iIntValue20 & 3) != 2)) {
                    y85.m93057b(uwu.f234734c, qgj.f188480a, mi21.m61834r(leu.m58816b(xq00Var20).f117235g.f159604b, cxh0.f43038a), leu.m58815a(xq00Var20).f112824b.f138758b, 0L, false, xq00Var20, uwu.f234735d | 48, 48);
                } else {
                    xq00Var20.m91757b0();
                }
                return w2a1.f247311a;
            case 20:
                xq00 xq00Var21 = (xq00) obj;
                int iIntValue21 = ((Number) obj2).intValue();
                if (xq00Var21.m91752Y(iIntValue21 & 1, (iIntValue21 & 3) != 2)) {
                    y85.m93057b(oou.f167693c, qgj.f188480a, null, 0L, 0L, false, xq00Var21, oou.f167694d | 48, 60);
                } else {
                    xq00Var21.m91757b0();
                }
                return w2a1.f247311a;
            case 21:
                xq00 xq00Var22 = (xq00) obj;
                int iIntValue22 = ((Number) obj2).intValue();
                if (xq00Var22.m91752Y(iIntValue22 & 1, (iIntValue22 & 3) != 2)) {
                    y85.m93057b(uwu.f234734c, qgj.f188480a, null, 0L, 0L, false, xq00Var22, uwu.f234735d | 48, 60);
                } else {
                    xq00Var22.m91757b0();
                }
                return w2a1.f247311a;
            case 22:
                xq00 xq00Var23 = (xq00) obj;
                int iIntValue23 = ((Number) obj2).intValue();
                if (xq00Var23.m91752Y(iIntValue23 & 1, (iIntValue23 & 3) != 2)) {
                    y85.m93057b(uwu.f234734c, qgj.f188480a, mi21.m61834r(leu.m58816b(xq00Var23).f117235g.f159604b, cxh0.f43038a), leu.m58815a(xq00Var23).f112824b.f138758b, 0L, false, xq00Var23, uwu.f234735d | 48, 48);
                } else {
                    xq00Var23.m91757b0();
                }
                return w2a1.f247311a;
            case 23:
                xq00 xq00Var24 = (xq00) obj;
                int iIntValue24 = ((Number) obj2).intValue();
                if (xq00Var24.m91752Y(iIntValue24 & 1, (iIntValue24 & 3) != 2)) {
                    ahf1.m25932d(k0e1.m54977L(R.string.tny_location_search_title, xq00Var24), null, leu.m58818d(xq00Var24).f64972h, 0L, null, null, 0, false, null, 0, null, xq00Var24, 0, 0, 2042);
                } else {
                    xq00Var24.m91757b0();
                }
                return w2a1.f247311a;
            case 24:
                xq00 xq00Var25 = (xq00) obj;
                int iIntValue25 = ((Number) obj2).intValue();
                if (xq00Var25.m91752Y(iIntValue25 & 1, (iIntValue25 & 3) != 2)) {
                    y85.m93057b(tuu.f223921c, qgj.f188480a, mi21.m61834r(leu.m58816b(xq00Var25).f117235g.f159604b, cxh0.f43038a), 0L, 0L, false, xq00Var25, tuu.f223922d | 48, 56);
                } else {
                    xq00Var25.m91757b0();
                }
                return w2a1.f247311a;
            case 25:
                xq00 xq00Var26 = (xq00) obj;
                int iIntValue26 = ((Number) obj2).intValue();
                if (xq00Var26.m91752Y(iIntValue26 & 1, (iIntValue26 & 3) != 2)) {
                    y85.m93057b(jnu.f114200c, new rgj(k0e1.m54977L(R.string.tny_location_search_back, xq00Var26)), null, 0L, 0L, false, xq00Var26, jnu.f114201d, 60);
                } else {
                    xq00Var26.m91757b0();
                }
                return w2a1.f247311a;
            case 26:
                xq00 xq00Var27 = (xq00) obj;
                int iIntValue27 = ((Number) obj2).intValue();
                if (xq00Var27.m91752Y(iIntValue27 & 1, (iIntValue27 & 3) != 2)) {
                    y85.m93057b(uwu.f234734c, qgj.f188480a, mi21.m61834r(leu.m58816b(xq00Var27).f117235g.f159604b, cxh0.f43038a), leu.m58815a(xq00Var27).f112824b.f138758b, 0L, false, xq00Var27, uwu.f234735d | 48, 48);
                } else {
                    xq00Var27.m91757b0();
                }
                return w2a1.f247311a;
            case 27:
                xq00 xq00Var28 = (xq00) obj;
                int iIntValue28 = ((Number) obj2).intValue();
                if (xq00Var28.m91752Y(iIntValue28 & 1, (iIntValue28 & 3) != 2)) {
                    y85.m93057b(psu.f180961c, new rgj(k0e1.m54977L(R.string.livestream_entity_page_play_button, xq00Var28)), null, 0L, 0L, false, xq00Var28, psu.f180962d, 60);
                } else {
                    xq00Var28.m91757b0();
                }
                return w2a1.f247311a;
            case 28:
                xq00 xq00Var29 = (xq00) obj;
                int iIntValue29 = ((Number) obj2).intValue();
                if (xq00Var29.m91752Y(iIntValue29 & 1, (iIntValue29 & 3) != 2)) {
                    y85.m93057b(uwu.f234734c, new rgj(k0e1.m54977L(R.string.close_button_content_description, xq00Var29)), null, 0L, 0L, false, xq00Var29, uwu.f234735d, 60);
                } else {
                    xq00Var29.m91757b0();
                }
                return w2a1.f247311a;
            default:
                xq00 xq00Var30 = (xq00) obj;
                int iIntValue30 = ((Number) obj2).intValue();
                if (!xq00Var30.m91752Y(iIntValue30 & 1, (iIntValue30 & 3) != 2)) {
                    xq00Var30.m91757b0();
                }
                return w2a1.f247311a;
        }
    }
}
