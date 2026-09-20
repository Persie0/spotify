package p204p;

import android.content.Context;
import androidx.compose.p002ui.platform.AndroidCompositionLocals_androidKt;
import com.spotify.music.R;
import com.spotify.searchview.proto.Entity;

/* JADX INFO: loaded from: classes10.dex */
public final class z3h extends qe70 implements th00 {

    /* JADX INFO: renamed from: L0 */
    public static final z3h f278926L0;

    /* JADX INFO: renamed from: M0 */
    public static final z3h f278927M0;

    /* JADX INFO: renamed from: N0 */
    public static final z3h f278928N0;

    /* JADX INFO: renamed from: O0 */
    public static final z3h f278929O0;

    /* JADX INFO: renamed from: P0 */
    public static final z3h f278930P0;

    /* JADX INFO: renamed from: Q0 */
    public static final z3h f278931Q0;

    /* JADX INFO: renamed from: R0 */
    public static final z3h f278932R0;

    /* JADX INFO: renamed from: S0 */
    public static final z3h f278933S0;

    /* JADX INFO: renamed from: T0 */
    public static final z3h f278934T0;

    /* JADX INFO: renamed from: U0 */
    public static final z3h f278935U0;

    /* JADX INFO: renamed from: V0 */
    public static final z3h f278936V0;

    /* JADX INFO: renamed from: W0 */
    public static final z3h f278937W0;

    /* JADX INFO: renamed from: X */
    public static final z3h f278938X;

    /* JADX INFO: renamed from: X0 */
    public static final z3h f278939X0;

    /* JADX INFO: renamed from: Y */
    public static final z3h f278940Y;

    /* JADX INFO: renamed from: Y0 */
    public static final z3h f278941Y0;

    /* JADX INFO: renamed from: Z */
    public static final z3h f278942Z;

    /* JADX INFO: renamed from: Z0 */
    public static final z3h f278943Z0;

    /* JADX INFO: renamed from: a1 */
    public static final z3h f278944a1;

    /* JADX INFO: renamed from: b */
    public static final z3h f278945b;

    /* JADX INFO: renamed from: b1 */
    public static final z3h f278946b1;

    /* JADX INFO: renamed from: c */
    public static final z3h f278947c;

    /* JADX INFO: renamed from: c1 */
    public static final z3h f278948c1;

    /* JADX INFO: renamed from: d */
    public static final z3h f278949d;

    /* JADX INFO: renamed from: e */
    public static final z3h f278950e;

    /* JADX INFO: renamed from: f */
    public static final z3h f278951f;

    /* JADX INFO: renamed from: g */
    public static final z3h f278952g;

    /* JADX INFO: renamed from: h */
    public static final z3h f278953h;

    /* JADX INFO: renamed from: i */
    public static final z3h f278954i;

    /* JADX INFO: renamed from: t */
    public static final z3h f278955t;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f278956a;

    static {
        int i = 2;
        f278945b = new z3h(i, 0);
        f278947c = new z3h(i, 1);
        f278949d = new z3h(i, 2);
        f278950e = new z3h(i, 3);
        f278951f = new z3h(i, 4);
        f278952g = new z3h(i, 5);
        f278953h = new z3h(i, 6);
        f278954i = new z3h(i, 7);
        f278955t = new z3h(i, 8);
        f278938X = new z3h(i, 9);
        f278940Y = new z3h(i, 10);
        f278942Z = new z3h(i, 11);
        f278926L0 = new z3h(i, 12);
        f278927M0 = new z3h(i, 13);
        f278928N0 = new z3h(i, 14);
        f278929O0 = new z3h(i, 15);
        f278930P0 = new z3h(i, 16);
        f278931Q0 = new z3h(i, 17);
        f278932R0 = new z3h(i, 18);
        f278933S0 = new z3h(i, 19);
        f278934T0 = new z3h(i, 20);
        f278935U0 = new z3h(i, 21);
        f278936V0 = new z3h(i, 22);
        f278937W0 = new z3h(i, 23);
        f278939X0 = new z3h(i, 24);
        f278941Y0 = new z3h(i, 25);
        f278943Z0 = new z3h(i, 26);
        f278944a1 = new z3h(i, 27);
        f278946b1 = new z3h(i, 28);
        f278948c1 = new z3h(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z3h(int i, int i2) {
        super(i);
        this.f278956a = i2;
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f278956a) {
            case 0:
                xq00 xq00Var = (xq00) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (xq00Var.m91752Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ahf1.m25932d(((Context) xq00Var.m91774k(AndroidCompositionLocals_androidKt.f502b)).getResources().getString(R.string.recents_page_title), null, null, 0L, null, null, 0, false, null, 0, null, xq00Var, 0, 0, Entity.AUTOCOMPLETE_FIELD_NUMBER);
                } else {
                    xq00Var.m91757b0();
                }
                return w2a1.f247311a;
            case 1:
                xq00 xq00Var2 = (xq00) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (!xq00Var2.m91752Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    xq00Var2.m91757b0();
                }
                return w2a1.f247311a;
            case 2:
                xq00 xq00Var3 = (xq00) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                if (!xq00Var3.m91752Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    xq00Var3.m91757b0();
                }
                return w2a1.f247311a;
            case 3:
                xq00 xq00Var4 = (xq00) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                if (xq00Var4.m91752Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    ahf1.m25932d(k0e1.m54977L(R.string.side_drawer_chat_list_title, xq00Var4), null, leu.m58818d(xq00Var4).f64969e, 0L, null, null, 2, false, new ol80(1), 0, null, xq00Var4, 1572864, 0, 1722);
                } else {
                    xq00Var4.m91757b0();
                }
                return w2a1.f247311a;
            case 4:
                xq00 xq00Var5 = (xq00) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                if (xq00Var5.m91752Y(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    y85.m93057b(pou.f179785c, qgj.f188480a, null, 0L, 0L, false, xq00Var5, pou.f179786d | 48, 60);
                } else {
                    xq00Var5.m91757b0();
                }
                return w2a1.f247311a;
            case 5:
                xq00 xq00Var6 = (xq00) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                if (xq00Var6.m91752Y(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    y85.m93057b(uwu.f234734c, qgj.f188480a, null, 0L, 0L, false, xq00Var6, uwu.f234735d | 48, 60);
                } else {
                    xq00Var6.m91757b0();
                }
                return w2a1.f247311a;
            case 6:
                xq00 xq00Var7 = (xq00) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                if (xq00Var7.m91752Y(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    ln2.m59469b(null, 2, false, true, Integer.valueOf(rfg1.m75429D(leu.m58815a(xq00Var7).f112824b.f138757a)), xq00Var7, 3504, 1);
                } else {
                    xq00Var7.m91757b0();
                }
                return w2a1.f247311a;
            case 7:
                xq00 xq00Var8 = (xq00) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                if (xq00Var8.m91752Y(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    ahf1.m25932d(k0e1.m54977L(R.string.reflection_share_button_label, xq00Var8), mi21.m61822f(1.0f, cxh0.f43038a), leu.m58818d(xq00Var8).f64975k, 0L, new h171(3), null, 0, false, null, 0, null, xq00Var8, 0, 0, 2024);
                } else {
                    xq00Var8.m91757b0();
                }
                return w2a1.f247311a;
            case 8:
                xq00 xq00Var9 = (xq00) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                if (xq00Var9.m91752Y(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    ahf1.m25932d(k0e1.m54977L(R.string.reflection_survey_sheet_submit_button_label, xq00Var9), null, leu.m58818d(xq00Var9).f64972h, 0L, new h171(3), null, 0, false, null, 0, null, xq00Var9, 0, 0, 2026);
                } else {
                    xq00Var9.m91757b0();
                }
                return w2a1.f247311a;
            case 9:
                xq00 xq00Var10 = (xq00) obj;
                int iIntValue10 = ((Number) obj2).intValue();
                if (xq00Var10.m91752Y(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    y85.m93057b(jnu.f114200c, new rgj(k0e1.m54977L(R.string.regular_member_sub_account_details_back, xq00Var10)), null, 0L, 0L, false, xq00Var10, jnu.f114201d, 60);
                } else {
                    xq00Var10.m91757b0();
                }
                return w2a1.f247311a;
            case 10:
                xq00 xq00Var11 = (xq00) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                if (xq00Var11.m91752Y(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    y0v.m92603a(2, q4h.f185176a, xq00Var11, 390, 2);
                } else {
                    xq00Var11.m91757b0();
                }
                return w2a1.f247311a;
            case 11:
                xq00 xq00Var12 = (xq00) obj;
                int iIntValue12 = ((Number) obj2).intValue();
                if (xq00Var12.m91752Y(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    uuf1.m83987g(0, 1, xq00Var12, null);
                } else {
                    xq00Var12.m91757b0();
                }
                return w2a1.f247311a;
            case 12:
                xq00 xq00Var13 = (xq00) obj;
                int iIntValue13 = ((Number) obj2).intValue();
                if (xq00Var13.m91752Y(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    ahf1.m25932d(k0e1.m54977L(R.string.remote_downloads_audiobook_in_list_ok_button, xq00Var13), null, null, 0L, null, null, 0, false, null, 0, null, xq00Var13, 0, 0, Entity.AUTOCOMPLETE_FIELD_NUMBER);
                } else {
                    xq00Var13.m91757b0();
                }
                return w2a1.f247311a;
            case 13:
                xq00 xq00Var14 = (xq00) obj;
                int iIntValue14 = ((Number) obj2).intValue();
                if (xq00Var14.m91752Y(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    ahf1.m25932d(k0e1.m54977L(R.string.remote_downloads_audiobook_in_list_title, xq00Var14), null, null, 0L, null, null, 0, false, null, 0, null, xq00Var14, 0, 0, Entity.AUTOCOMPLETE_FIELD_NUMBER);
                } else {
                    xq00Var14.m91757b0();
                }
                return w2a1.f247311a;
            case 14:
                xq00 xq00Var15 = (xq00) obj;
                int iIntValue15 = ((Number) obj2).intValue();
                if (xq00Var15.m91752Y(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    y85.m93057b(vru.f244249c, new rgj(k0e1.m54977L(R.string.parental_hub_entity_row_remove, xq00Var15)), null, leu.m58815a(xq00Var15).f112824b.f138758b, 0L, false, xq00Var15, vru.f244250d, 52);
                } else {
                    xq00Var15.m91757b0();
                }
                return w2a1.f247311a;
            case 15:
                xq00 xq00Var16 = (xq00) obj;
                int iIntValue16 = ((Number) obj2).intValue();
                if (xq00Var16.m91752Y(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    ahf1.m25932d(k0e1.m54977L(R.string.remote_downloads_dialog_remove_button, xq00Var16), null, null, 0L, null, null, 0, false, null, 0, null, xq00Var16, 0, 0, Entity.AUTOCOMPLETE_FIELD_NUMBER);
                } else {
                    xq00Var16.m91757b0();
                }
                return w2a1.f247311a;
            case 16:
                xq00 xq00Var17 = (xq00) obj;
                int iIntValue17 = ((Number) obj2).intValue();
                if (xq00Var17.m91752Y(iIntValue17 & 1, (iIntValue17 & 3) != 2)) {
                    ahf1.m25932d(k0e1.m54977L(R.string.remote_downloads_confirmation_dialog_subtitle, xq00Var17), null, null, 0L, null, null, 0, false, null, 0, null, xq00Var17, 0, 0, Entity.AUTOCOMPLETE_FIELD_NUMBER);
                } else {
                    xq00Var17.m91757b0();
                }
                return w2a1.f247311a;
            case 17:
                xq00 xq00Var18 = (xq00) obj;
                int iIntValue18 = ((Number) obj2).intValue();
                if (xq00Var18.m91752Y(iIntValue18 & 1, (iIntValue18 & 3) != 2)) {
                    ahf1.m25932d(k0e1.m54977L(R.string.remote_downloads_dialog_cancel_button, xq00Var18), null, null, 0L, null, null, 0, false, null, 0, null, xq00Var18, 0, 0, Entity.AUTOCOMPLETE_FIELD_NUMBER);
                } else {
                    xq00Var18.m91757b0();
                }
                return w2a1.f247311a;
            case 18:
                xq00 xq00Var19 = (xq00) obj;
                int iIntValue19 = ((Number) obj2).intValue();
                if (xq00Var19.m91752Y(iIntValue19 & 1, (iIntValue19 & 3) != 2)) {
                    fxh0 fxh0VarM39673I = epv0.m39673I("Loading Popup", nec.m64246i(mi21.m61820d(1.0f, cxh0.f43038a), n6f.m63765b(leu.m58815a(xq00Var19).f112823a.f229876c, n6f.m63766c(((hiu) iiu.f102631a.f258040e).f91872c), 0.0f, 0.0f, 0.0f, 14), kxf1.f127485a));
                    m6d0 m6d0VarM36007d = dha.m36007d(d7f0.f46174i, false);
                    int iHashCode = Long.hashCode(xq00Var19.f264809T);
                    wpn0 wpn0VarM91778m = xq00Var19.m91778m();
                    fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var19, fxh0VarM39673I);
                    soh.f211194A.getClass();
                    C2087le c2087le = roh.f201257b;
                    if (xq00Var19.f264811a == null) {
                        pmg1.m70360s();
                        throw null;
                    }
                    xq00Var19.m91779m0();
                    if (xq00Var19.f264808S) {
                        xq00Var19.m91776l(c2087le);
                    } else {
                        xq00Var19.m91799w0();
                    }
                    zsf1.m96835F(m6d0VarM36007d, roh.f201262g, xq00Var19);
                    zsf1.m96835F(wpn0VarM91778m, roh.f201261f, xq00Var19);
                    zsf1.m96835F(Integer.valueOf(iHashCode), roh.f201265j, xq00Var19);
                    zsf1.m96833D(roh.f201266k, xq00Var19);
                    zsf1.m96835F(fxh0VarM48286s, roh.f201259d, xq00Var19);
                    p271.m68899b(null, 5, 0L, 0L, xq00Var19, 48, 13);
                    xq00Var19.m91788r(true);
                } else {
                    xq00Var19.m91757b0();
                }
                return w2a1.f247311a;
            case 19:
                xq00 xq00Var20 = (xq00) obj;
                int iIntValue20 = ((Number) obj2).intValue();
                if (xq00Var20.m91752Y(iIntValue20 & 1, (iIntValue20 & 3) != 2)) {
                    ahf1.m25932d(k0e1.m54977L(R.string.remove_invite_link_button_title, xq00Var20), null, null, 0L, null, null, 0, false, null, 0, null, xq00Var20, 0, 0, Entity.AUTOCOMPLETE_FIELD_NUMBER);
                } else {
                    xq00Var20.m91757b0();
                }
                return w2a1.f247311a;
            case 20:
                xq00 xq00Var21 = (xq00) obj;
                int iIntValue21 = ((Number) obj2).intValue();
                if (xq00Var21.m91752Y(iIntValue21 & 1, (iIntValue21 & 3) != 2)) {
                    ahf1.m25932d(k0e1.m54977L(R.string.remove_parent_page_title, xq00Var21), null, null, 0L, null, null, 0, false, null, 0, null, xq00Var21, 0, 0, Entity.AUTOCOMPLETE_FIELD_NUMBER);
                } else {
                    xq00Var21.m91757b0();
                }
                return w2a1.f247311a;
            case 21:
                xq00 xq00Var22 = (xq00) obj;
                int iIntValue22 = ((Number) obj2).intValue();
                if (xq00Var22.m91752Y(iIntValue22 & 1, (iIntValue22 & 3) != 2)) {
                    ahf1.m25932d(k0e1.m54977L(R.string.your_library_messaging_folder_rename_cancel, xq00Var22), null, leu.m58818d(xq00Var22).f64975k, leu.m58815a(xq00Var22).f112824b.f138757a, null, null, 0, false, null, 0, null, xq00Var22, 0, 0, 2034);
                } else {
                    xq00Var22.m91757b0();
                }
                return w2a1.f247311a;
            case 22:
                xq00 xq00Var23 = (xq00) obj;
                int iIntValue23 = ((Number) obj2).intValue();
                if (xq00Var23.m91752Y(iIntValue23 & 1, (iIntValue23 & 3) != 2)) {
                    ahf1.m25932d(k0e1.m54977L(R.string.your_library_messaging_folder_rename_save, xq00Var23), null, leu.m58818d(xq00Var23).f64975k, leu.m58815a(xq00Var23).f112824b.f138759c, null, null, 0, false, null, 0, null, xq00Var23, 0, 0, 2034);
                } else {
                    xq00Var23.m91757b0();
                }
                return w2a1.f247311a;
            case 23:
                xq00 xq00Var24 = (xq00) obj;
                int iIntValue24 = ((Number) obj2).intValue();
                if (xq00Var24.m91752Y(iIntValue24 & 1, (iIntValue24 & 3) != 2)) {
                    y85.m93057b(quu.f192812c, new rgj(k0e1.m54977L(R.string.ads_repeat_button_content_description, xq00Var24)), null, 0L, 0L, false, xq00Var24, quu.f192813d, 60);
                } else {
                    xq00Var24.m91757b0();
                }
                return w2a1.f247311a;
            case 24:
                xq00 xq00Var25 = (xq00) obj;
                int iIntValue25 = ((Number) obj2).intValue();
                if (xq00Var25.m91752Y(iIntValue25 & 1, (iIntValue25 & 3) != 2)) {
                    y85.m93057b(psu.f180961c, qgj.f188480a, null, 0L, 0L, false, xq00Var25, psu.f180962d | 48, 60);
                } else {
                    xq00Var25.m91757b0();
                }
                return w2a1.f247311a;
            case 25:
                xq00 xq00Var26 = (xq00) obj;
                int iIntValue26 = ((Number) obj2).intValue();
                if (xq00Var26.m91752Y(iIntValue26 & 1, (iIntValue26 & 3) != 2)) {
                    ahf1.m25932d(k0e1.m54977L(R.string.chapter_playback_confirmation_play_chapter, xq00Var26), null, null, 0L, null, null, 0, false, null, 0, null, xq00Var26, 0, 0, Entity.AUTOCOMPLETE_FIELD_NUMBER);
                } else {
                    xq00Var26.m91757b0();
                }
                return w2a1.f247311a;
            case 26:
                xq00 xq00Var27 = (xq00) obj;
                int iIntValue27 = ((Number) obj2).intValue();
                if (xq00Var27.m91752Y(iIntValue27 & 1, (iIntValue27 & 3) != 2)) {
                    ahf1.m25932d(k0e1.m54977L(R.string.report_a_problem_submit_button_text, xq00Var27), null, leu.m58818d(xq00Var27).f64972h, leu.m58815a(xq00Var27).f112824b.f138759c, null, null, 0, false, null, 0, null, xq00Var27, 0, 0, 2034);
                } else {
                    xq00Var27.m91757b0();
                }
                return w2a1.f247311a;
            case 27:
                xq00 xq00Var28 = (xq00) obj;
                int iIntValue28 = ((Number) obj2).intValue();
                if (xq00Var28.m91752Y(iIntValue28 & 1, (iIntValue28 & 3) != 2)) {
                    y85.m93057b(uwu.f234734c, qgj.f188480a, null, 0L, 0L, false, xq00Var28, uwu.f234735d | 48, 60);
                } else {
                    xq00Var28.m91757b0();
                }
                return w2a1.f247311a;
            case 28:
                xq00 xq00Var29 = (xq00) obj;
                int iIntValue29 = ((Number) obj2).intValue();
                if (xq00Var29.m91752Y(iIntValue29 & 1, (iIntValue29 & 3) != 2)) {
                    ahf1.m25932d(k0e1.m54977L(R.string.report_error_button_text, xq00Var29), null, null, 0L, null, null, 0, false, null, 0, null, xq00Var29, 0, 0, Entity.AUTOCOMPLETE_FIELD_NUMBER);
                } else {
                    xq00Var29.m91757b0();
                }
                return w2a1.f247311a;
            default:
                xq00 xq00Var30 = (xq00) obj;
                int iIntValue30 = ((Number) obj2).intValue();
                if (xq00Var30.m91752Y(iIntValue30 & 1, (iIntValue30 & 3) != 2)) {
                    i6s0.m49814b(0.0f, 0, 0, 28, leu.m58815a(xq00Var30).f112825c.f221220c, 0L, xq00Var30, mi21.m61834r(16, cxh0.f43038a));
                } else {
                    xq00Var30.m91757b0();
                }
                return w2a1.f247311a;
        }
    }
}
