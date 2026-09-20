package p204p;

import com.spotify.music.R;
import com.spotify.searchview.proto.Entity;

/* JADX INFO: loaded from: classes8.dex */
public final class tah extends qe70 implements th00 {

    /* JADX INFO: renamed from: L0 */
    public static final tah f218578L0;

    /* JADX INFO: renamed from: M0 */
    public static final tah f218579M0;

    /* JADX INFO: renamed from: N0 */
    public static final tah f218580N0;

    /* JADX INFO: renamed from: O0 */
    public static final tah f218581O0;

    /* JADX INFO: renamed from: P0 */
    public static final tah f218582P0;

    /* JADX INFO: renamed from: Q0 */
    public static final tah f218583Q0;

    /* JADX INFO: renamed from: R0 */
    public static final tah f218584R0;

    /* JADX INFO: renamed from: S0 */
    public static final tah f218585S0;

    /* JADX INFO: renamed from: T0 */
    public static final tah f218586T0;

    /* JADX INFO: renamed from: U0 */
    public static final tah f218587U0;

    /* JADX INFO: renamed from: V0 */
    public static final tah f218588V0;

    /* JADX INFO: renamed from: W0 */
    public static final tah f218589W0;

    /* JADX INFO: renamed from: X */
    public static final tah f218590X;

    /* JADX INFO: renamed from: X0 */
    public static final tah f218591X0;

    /* JADX INFO: renamed from: Y */
    public static final tah f218592Y;

    /* JADX INFO: renamed from: Y0 */
    public static final tah f218593Y0;

    /* JADX INFO: renamed from: Z */
    public static final tah f218594Z;

    /* JADX INFO: renamed from: Z0 */
    public static final tah f218595Z0;

    /* JADX INFO: renamed from: a1 */
    public static final tah f218596a1;

    /* JADX INFO: renamed from: b */
    public static final tah f218597b;

    /* JADX INFO: renamed from: b1 */
    public static final tah f218598b1;

    /* JADX INFO: renamed from: c */
    public static final tah f218599c;

    /* JADX INFO: renamed from: c1 */
    public static final tah f218600c1;

    /* JADX INFO: renamed from: d */
    public static final tah f218601d;

    /* JADX INFO: renamed from: e */
    public static final tah f218602e;

    /* JADX INFO: renamed from: f */
    public static final tah f218603f;

    /* JADX INFO: renamed from: g */
    public static final tah f218604g;

    /* JADX INFO: renamed from: h */
    public static final tah f218605h;

    /* JADX INFO: renamed from: i */
    public static final tah f218606i;

    /* JADX INFO: renamed from: t */
    public static final tah f218607t;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f218608a;

    static {
        int i = 2;
        f218597b = new tah(i, 0);
        f218599c = new tah(i, 1);
        f218601d = new tah(i, 2);
        f218602e = new tah(i, 3);
        f218603f = new tah(i, 4);
        f218604g = new tah(i, 5);
        f218605h = new tah(i, 6);
        f218606i = new tah(i, 7);
        f218607t = new tah(i, 8);
        f218590X = new tah(i, 9);
        f218592Y = new tah(i, 10);
        f218594Z = new tah(i, 11);
        f218578L0 = new tah(i, 12);
        f218579M0 = new tah(i, 13);
        f218580N0 = new tah(i, 14);
        f218581O0 = new tah(i, 15);
        f218582P0 = new tah(i, 16);
        f218583Q0 = new tah(i, 17);
        f218584R0 = new tah(i, 18);
        f218585S0 = new tah(i, 19);
        f218586T0 = new tah(i, 20);
        f218587U0 = new tah(i, 21);
        f218588V0 = new tah(i, 22);
        f218589W0 = new tah(i, 23);
        f218591X0 = new tah(i, 24);
        f218593Y0 = new tah(i, 25);
        f218595Z0 = new tah(i, 26);
        f218596a1 = new tah(i, 27);
        f218598b1 = new tah(i, 28);
        f218600c1 = new tah(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tah(int i, int i2) {
        super(i);
        this.f218608a = i2;
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f218608a) {
            case 0:
                xq00 xq00Var = (xq00) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (xq00Var.m91752Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ahf1.m25932d(k0e1.m54977L(R.string.speed_control_optin_not_now, xq00Var), null, null, 0L, null, null, 0, false, null, 0, null, xq00Var, 0, 0, Entity.AUTOCOMPLETE_FIELD_NUMBER);
                } else {
                    xq00Var.m91757b0();
                }
                return w2a1.f247311a;
            case 1:
                xq00 xq00Var2 = (xq00) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (xq00Var2.m91752Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ahf1.m25932d(k0e1.m54977L(R.string.speed_control_optin_get_started, xq00Var2), null, null, 0L, null, null, 0, false, null, 0, null, xq00Var2, 0, 0, Entity.AUTOCOMPLETE_FIELD_NUMBER);
                } else {
                    xq00Var2.m91757b0();
                }
                return w2a1.f247311a;
            case 2:
                xq00 xq00Var3 = (xq00) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                if (xq00Var3.m91752Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    y85.m93057b(bsu.f30386c, new rgj("Options"), null, 0L, 0L, false, xq00Var3, bsu.f30387d, 60);
                } else {
                    xq00Var3.m91757b0();
                }
                return w2a1.f247311a;
            case 3:
                xq00 xq00Var4 = (xq00) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                if (xq00Var4.m91752Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    ahf1.m25932d(k0e1.m54977L(R.string.split_browser_menu_share, xq00Var4), null, null, 0L, null, null, 0, false, null, 0, null, xq00Var4, 0, 0, Entity.AUTOCOMPLETE_FIELD_NUMBER);
                } else {
                    xq00Var4.m91757b0();
                }
                return w2a1.f247311a;
            case 4:
                xq00 xq00Var5 = (xq00) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                if (xq00Var5.m91752Y(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    ahf1.m25932d(k0e1.m54977L(R.string.split_browser_action_refresh, xq00Var5), null, null, 0L, null, null, 0, false, null, 0, null, xq00Var5, 0, 0, Entity.AUTOCOMPLETE_FIELD_NUMBER);
                } else {
                    xq00Var5.m91757b0();
                }
                return w2a1.f247311a;
            case 5:
                xq00 xq00Var6 = (xq00) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                if (xq00Var6.m91752Y(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    ahf1.m25932d(k0e1.m54977L(R.string.split_browser_menu_refresh, xq00Var6), null, null, 0L, null, null, 0, false, null, 0, null, xq00Var6, 0, 0, Entity.AUTOCOMPLETE_FIELD_NUMBER);
                } else {
                    xq00Var6.m91757b0();
                }
                return w2a1.f247311a;
            case 6:
                xq00 xq00Var7 = (xq00) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                if (xq00Var7.m91752Y(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    y85.m93057b(uwu.f234734c, new rgj(k0e1.m54977L(R.string.split_browser_close_content_description, xq00Var7)), null, 0L, 0L, false, xq00Var7, uwu.f234735d, 60);
                } else {
                    xq00Var7.m91757b0();
                }
                return w2a1.f247311a;
            case 7:
                xq00 xq00Var8 = (xq00) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                if (xq00Var8.m91752Y(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    y85.m93057b(uwu.f234734c, new rgj(k0e1.m54977L(R.string.split_browser_close_content_description, xq00Var8)), null, n6f.f150866f, 0L, false, xq00Var8, uwu.f234735d, 52);
                } else {
                    xq00Var8.m91757b0();
                }
                return w2a1.f247311a;
            case 8:
                xq00 xq00Var9 = (xq00) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                if (xq00Var9.m91752Y(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    ahf1.m25932d(k0e1.m54977L(R.string.split_browser_menu_copy_link, xq00Var9), null, null, 0L, null, null, 0, false, null, 0, null, xq00Var9, 0, 0, Entity.AUTOCOMPLETE_FIELD_NUMBER);
                } else {
                    xq00Var9.m91757b0();
                }
                return w2a1.f247311a;
            case 9:
                xq00 xq00Var10 = (xq00) obj;
                int iIntValue10 = ((Number) obj2).intValue();
                if (xq00Var10.m91752Y(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    y85.m93057b(rqu.f201886c, qgj.f188480a, null, 0L, 0L, false, xq00Var10, rqu.f201887d | 48, 60);
                } else {
                    xq00Var10.m91757b0();
                }
                return w2a1.f247311a;
            case 10:
                xq00 xq00Var11 = (xq00) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                if (xq00Var11.m91752Y(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    ahf1.m25932d(k0e1.m54977L(R.string.page_match_start_scanning_button, xq00Var11), null, leu.m58818d(xq00Var11).f64972h, 0L, null, null, 0, false, null, 0, null, xq00Var11, 0, 0, 2042);
                } else {
                    xq00Var11.m91757b0();
                }
                return w2a1.f247311a;
            case 11:
                xq00 xq00Var12 = (xq00) obj;
                int iIntValue12 = ((Number) obj2).intValue();
                if (!xq00Var12.m91752Y(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    xq00Var12.m91757b0();
                }
                return w2a1.f247311a;
            case 12:
                xq00 xq00Var13 = (xq00) obj;
                int iIntValue13 = ((Number) obj2).intValue();
                if (!xq00Var13.m91752Y(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    xq00Var13.m91757b0();
                }
                return w2a1.f247311a;
            case 13:
                xq00 xq00Var14 = (xq00) obj;
                int iIntValue14 = ((Number) obj2).intValue();
                if (xq00Var14.m91752Y(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    y85.m93057b(oou.f167693c, new rgj(k0e1.m54977L(R.string.back_button_content_description, xq00Var14)), null, leu.m58815a(xq00Var14).f112824b.f138757a, 0L, false, xq00Var14, oou.f167694d, 52);
                } else {
                    xq00Var14.m91757b0();
                }
                return w2a1.f247311a;
            case 14:
                xq00 xq00Var15 = (xq00) obj;
                int iIntValue15 = ((Number) obj2).intValue();
                if (xq00Var15.m91752Y(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    y85.m93057b(uuu.f234260c, new rgj(k0e1.m54977L(R.string.user_stats_details_share_button_accessibility_label, xq00Var15)), null, 0L, 0L, false, xq00Var15, uuu.f234261d, 60);
                } else {
                    xq00Var15.m91757b0();
                }
                return w2a1.f247311a;
            case 15:
                xq00 xq00Var16 = (xq00) obj;
                int iIntValue16 = ((Number) obj2).intValue();
                if (!xq00Var16.m91752Y(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    xq00Var16.m91757b0();
                }
                return w2a1.f247311a;
            case 16:
                xq00 xq00Var17 = (xq00) obj;
                int iIntValue17 = ((Number) obj2).intValue();
                if (xq00Var17.m91752Y(iIntValue17 & 1, (iIntValue17 & 3) != 2)) {
                    ahf1.m25932d(k0e1.m54977L(R.string.ads_report_submit_button, xq00Var17), null, null, 0L, null, null, 0, false, null, 0, null, xq00Var17, 0, 0, Entity.AUTOCOMPLETE_FIELD_NUMBER);
                } else {
                    xq00Var17.m91757b0();
                }
                return w2a1.f247311a;
            case 17:
                xq00 xq00Var18 = (xq00) obj;
                int iIntValue18 = ((Number) obj2).intValue();
                if (xq00Var18.m91752Y(iIntValue18 & 1, (iIntValue18 & 3) != 2)) {
                    ahf1.m25932d("Manage", null, null, 0L, null, null, 0, false, null, 0, null, xq00Var18, 6, 0, Entity.AUTOCOMPLETE_FIELD_NUMBER);
                } else {
                    xq00Var18.m91757b0();
                }
                return w2a1.f247311a;
            case 18:
                xq00 xq00Var19 = (xq00) obj;
                int iIntValue19 = ((Number) obj2).intValue();
                if (xq00Var19.m91752Y(iIntValue19 & 1, (iIntValue19 & 3) != 2)) {
                    wjg1.m88322a(null, null, false, null, new clm0(leu.m58815a(xq00Var19).f112823a.f229876c), null, null, null, xq00Var19, 0, 239);
                } else {
                    xq00Var19.m91757b0();
                }
                return w2a1.f247311a;
            case 19:
                xq00 xq00Var20 = (xq00) obj;
                int iIntValue20 = ((Number) obj2).intValue();
                if (!xq00Var20.m91752Y(iIntValue20 & 1, (iIntValue20 & 3) != 2)) {
                    xq00Var20.m91757b0();
                }
                return w2a1.f247311a;
            case 20:
                xq00 xq00Var21 = (xq00) obj;
                int iIntValue21 = ((Number) obj2).intValue();
                if (!xq00Var21.m91752Y(iIntValue21 & 1, (iIntValue21 & 3) != 2)) {
                    xq00Var21.m91757b0();
                }
                return w2a1.f247311a;
            case 21:
                xq00 xq00Var22 = (xq00) obj;
                int iIntValue22 = ((Number) obj2).intValue();
                if (!xq00Var22.m91752Y(iIntValue22 & 1, (iIntValue22 & 3) != 2)) {
                    xq00Var22.m91757b0();
                }
                return w2a1.f247311a;
            case 22:
                xq00 xq00Var23 = (xq00) obj;
                int iIntValue23 = ((Number) obj2).intValue();
                if (!xq00Var23.m91752Y(iIntValue23 & 1, (iIntValue23 & 3) != 2)) {
                    xq00Var23.m91757b0();
                }
                return w2a1.f247311a;
            case 23:
                xq00 xq00Var24 = (xq00) obj;
                int iIntValue24 = ((Number) obj2).intValue();
                if (xq00Var24.m91752Y(iIntValue24 & 1, (iIntValue24 & 3) != 2)) {
                    fxh0 fxh0VarM61820d = mi21.m61820d(1.0f, cxh0.f43038a);
                    m6d0 m6d0VarM36007d = dha.m36007d(d7f0.f46174i, false);
                    int iHashCode = Long.hashCode(xq00Var24.f264809T);
                    wpn0 wpn0VarM91778m = xq00Var24.m91778m();
                    fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var24, fxh0VarM61820d);
                    soh.f211194A.getClass();
                    C2087le c2087le = roh.f201257b;
                    if (xq00Var24.f264811a == null) {
                        pmg1.m70360s();
                        throw null;
                    }
                    xq00Var24.m91779m0();
                    if (xq00Var24.f264808S) {
                        xq00Var24.m91776l(c2087le);
                    } else {
                        xq00Var24.m91799w0();
                    }
                    zsf1.m96835F(m6d0VarM36007d, roh.f201262g, xq00Var24);
                    zsf1.m96835F(wpn0VarM91778m, roh.f201261f, xq00Var24);
                    zsf1.m96835F(Integer.valueOf(iHashCode), roh.f201265j, xq00Var24);
                    zsf1.m96833D(roh.f201266k, xq00Var24);
                    zsf1.m96835F(fxh0VarM48286s, roh.f201259d, xq00Var24);
                    p271.m68899b(null, 0, 0L, 0L, xq00Var24, 0, 15);
                    xq00Var24.m91788r(true);
                } else {
                    xq00Var24.m91757b0();
                }
                return w2a1.f247311a;
            case 24:
                xq00 xq00Var25 = (xq00) obj;
                int iIntValue25 = ((Number) obj2).intValue();
                if (xq00Var25.m91752Y(iIntValue25 & 1, (iIntValue25 & 3) != 2)) {
                    ahf1.m25932d(k0e1.m54977L(R.string.chat_share_suggested_contacts_disabled_action, xq00Var25), null, null, 0L, null, null, 0, false, null, 0, null, xq00Var25, 0, 0, Entity.AUTOCOMPLETE_FIELD_NUMBER);
                } else {
                    xq00Var25.m91757b0();
                }
                return w2a1.f247311a;
            case 25:
                xq00 xq00Var26 = (xq00) obj;
                int iIntValue26 = ((Number) obj2).intValue();
                if (xq00Var26.m91752Y(iIntValue26 & 1, (iIntValue26 & 3) != 2)) {
                    y85.m93057b(wpu.f253840c, qgj.f188480a, mi21.m61834r(leu.m58816b(xq00Var26).f117235g.f159604b, cxh0.f43038a), 0L, 0L, false, xq00Var26, wpu.f253841d | 48, 56);
                } else {
                    xq00Var26.m91757b0();
                }
                return w2a1.f247311a;
            case 26:
                xq00 xq00Var27 = (xq00) obj;
                int iIntValue27 = ((Number) obj2).intValue();
                if (xq00Var27.m91752Y(iIntValue27 & 1, (iIntValue27 & 3) != 2)) {
                    y85.m93057b(tmu.f221780c, qgj.f188480a, mi21.m61834r(leu.m58816b(xq00Var27).f117235g.f159604b, cxh0.f43038a), 0L, 0L, false, xq00Var27, tmu.f221781d | 48, 56);
                } else {
                    xq00Var27.m91757b0();
                }
                return w2a1.f247311a;
            case 27:
                xq00 xq00Var28 = (xq00) obj;
                int iIntValue28 = ((Number) obj2).intValue();
                if (xq00Var28.m91752Y(iIntValue28 & 1, (iIntValue28 & 3) != 2)) {
                    y85.m93057b(gvu.f84830c, qgj.f188480a, null, 0L, 0L, false, xq00Var28, gvu.f84831d | 48, 60);
                } else {
                    xq00Var28.m91757b0();
                }
                return w2a1.f247311a;
            case 28:
                xq00 xq00Var29 = (xq00) obj;
                int iIntValue29 = ((Number) obj2).intValue();
                if (xq00Var29.m91752Y(iIntValue29 & 1, (iIntValue29 & 3) != 2)) {
                    ahf1.m25932d(k0e1.m54977L(R.string.sync_to_audio_button, xq00Var29), null, null, 0L, null, null, 0, false, null, 0, null, xq00Var29, 0, 0, Entity.AUTOCOMPLETE_FIELD_NUMBER);
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
