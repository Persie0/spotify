package p204p;

import com.spotify.music.R;
import com.spotify.searchview.proto.Entity;

/* JADX INFO: loaded from: classes10.dex */
public final class ohg extends qe70 implements th00 {

    /* JADX INFO: renamed from: L0 */
    public static final ohg f165424L0;

    /* JADX INFO: renamed from: M0 */
    public static final ohg f165425M0;

    /* JADX INFO: renamed from: N0 */
    public static final ohg f165426N0;

    /* JADX INFO: renamed from: O0 */
    public static final ohg f165427O0;

    /* JADX INFO: renamed from: P0 */
    public static final ohg f165428P0;

    /* JADX INFO: renamed from: Q0 */
    public static final ohg f165429Q0;

    /* JADX INFO: renamed from: R0 */
    public static final ohg f165430R0;

    /* JADX INFO: renamed from: S0 */
    public static final ohg f165431S0;

    /* JADX INFO: renamed from: T0 */
    public static final ohg f165432T0;

    /* JADX INFO: renamed from: U0 */
    public static final ohg f165433U0;

    /* JADX INFO: renamed from: V0 */
    public static final ohg f165434V0;

    /* JADX INFO: renamed from: W0 */
    public static final ohg f165435W0;

    /* JADX INFO: renamed from: X */
    public static final ohg f165436X;

    /* JADX INFO: renamed from: X0 */
    public static final ohg f165437X0;

    /* JADX INFO: renamed from: Y */
    public static final ohg f165438Y;

    /* JADX INFO: renamed from: Y0 */
    public static final ohg f165439Y0;

    /* JADX INFO: renamed from: Z */
    public static final ohg f165440Z;

    /* JADX INFO: renamed from: Z0 */
    public static final ohg f165441Z0;

    /* JADX INFO: renamed from: a1 */
    public static final ohg f165442a1;

    /* JADX INFO: renamed from: b */
    public static final ohg f165443b;

    /* JADX INFO: renamed from: b1 */
    public static final ohg f165444b1;

    /* JADX INFO: renamed from: c */
    public static final ohg f165445c;

    /* JADX INFO: renamed from: c1 */
    public static final ohg f165446c1;

    /* JADX INFO: renamed from: d */
    public static final ohg f165447d;

    /* JADX INFO: renamed from: e */
    public static final ohg f165448e;

    /* JADX INFO: renamed from: f */
    public static final ohg f165449f;

    /* JADX INFO: renamed from: g */
    public static final ohg f165450g;

    /* JADX INFO: renamed from: h */
    public static final ohg f165451h;

    /* JADX INFO: renamed from: i */
    public static final ohg f165452i;

    /* JADX INFO: renamed from: t */
    public static final ohg f165453t;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f165454a;

    static {
        int i = 2;
        f165443b = new ohg(i, 0);
        f165445c = new ohg(i, 1);
        f165447d = new ohg(i, 2);
        f165448e = new ohg(i, 3);
        f165449f = new ohg(i, 4);
        f165450g = new ohg(i, 5);
        f165451h = new ohg(i, 6);
        f165452i = new ohg(i, 7);
        f165453t = new ohg(i, 8);
        f165436X = new ohg(i, 9);
        f165438Y = new ohg(i, 10);
        f165440Z = new ohg(i, 11);
        f165424L0 = new ohg(i, 12);
        f165425M0 = new ohg(i, 13);
        f165426N0 = new ohg(i, 14);
        f165427O0 = new ohg(i, 15);
        f165428P0 = new ohg(i, 16);
        f165429Q0 = new ohg(i, 17);
        f165430R0 = new ohg(i, 18);
        f165431S0 = new ohg(i, 19);
        f165432T0 = new ohg(i, 20);
        f165433U0 = new ohg(i, 21);
        f165434V0 = new ohg(i, 22);
        f165435W0 = new ohg(i, 23);
        f165437X0 = new ohg(i, 24);
        f165439Y0 = new ohg(i, 25);
        f165441Z0 = new ohg(i, 26);
        f165442a1 = new ohg(i, 27);
        f165444b1 = new ohg(i, 28);
        f165446c1 = new ohg(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ohg(int i, int i2) {
        super(i);
        this.f165454a = i2;
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f165454a;
        cxh0 cxh0Var = cxh0.f43038a;
        w2a1 w2a1Var = w2a1.f247311a;
        switch (i) {
            case 0:
                xq00 xq00Var = (xq00) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (xq00Var.m91752Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    y85.m93057b(bsu.f30386c, new rgj(k0e1.m54977L(R.string.taste_profile_feedback_note_more_options_content_description, xq00Var)), mi21.m61834r(leu.m58816b(xq00Var).f117235g.f159604b, cxh0Var), 0L, 0L, false, xq00Var, bsu.f30387d, 56);
                } else {
                    xq00Var.m91757b0();
                }
                return w2a1Var;
            case 1:
                xq00 xq00Var2 = (xq00) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (xq00Var2.m91752Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ahf1.m25932d(k0e1.m54977L(R.string.taste_profile_feedback_notes_delete_dialog_confirm, xq00Var2), null, null, 0L, null, null, 0, false, null, 0, null, xq00Var2, 0, 0, Entity.AUTOCOMPLETE_FIELD_NUMBER);
                } else {
                    xq00Var2.m91757b0();
                }
                return w2a1Var;
            case 2:
                xq00 xq00Var3 = (xq00) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                if (xq00Var3.m91752Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    ahf1.m25932d(k0e1.m54977L(R.string.taste_profile_feedback_notes_delete_dialog_cancel, xq00Var3), null, null, 0L, null, null, 0, false, null, 0, null, xq00Var3, 0, 0, Entity.AUTOCOMPLETE_FIELD_NUMBER);
                } else {
                    xq00Var3.m91757b0();
                }
                return w2a1Var;
            case 3:
                xq00 xq00Var4 = (xq00) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                if (xq00Var4.m91752Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    y85.m93057b(bqu.f29881c, qgj.f188480a, null, leu.m58815a(xq00Var4).f112824b.f138760d, 0L, true, xq00Var4, bqu.f29882d | 196656, 20);
                } else {
                    xq00Var4.m91757b0();
                }
                return w2a1Var;
            case 4:
                xq00 xq00Var5 = (xq00) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                if (xq00Var5.m91752Y(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    ahf1.m25932d(k0e1.m54977L(R.string.taste_profile_feedback_notes_note_limit_title, xq00Var5), null, null, 0L, null, null, 0, false, null, 0, null, xq00Var5, 0, 0, Entity.AUTOCOMPLETE_FIELD_NUMBER);
                } else {
                    xq00Var5.m91757b0();
                }
                return w2a1Var;
            case 5:
                xq00 xq00Var6 = (xq00) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                if (xq00Var6.m91752Y(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    ahf1.m25932d(k0e1.m54977L(R.string.taste_profile_feedback_notes_note_limit_dismiss, xq00Var6), null, null, 0L, null, null, 0, false, null, 0, null, xq00Var6, 0, 0, Entity.AUTOCOMPLETE_FIELD_NUMBER);
                } else {
                    xq00Var6.m91757b0();
                }
                return w2a1Var;
            case 6:
                xq00 xq00Var7 = (xq00) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                if (xq00Var7.m91752Y(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    ahf1.m25932d(k0e1.m54977L(R.string.taste_profile_feedback_notes_note_limit_message, xq00Var7), null, null, 0L, null, null, 0, false, null, 0, null, xq00Var7, 0, 0, Entity.AUTOCOMPLETE_FIELD_NUMBER);
                } else {
                    xq00Var7.m91757b0();
                }
                return w2a1Var;
            case 7:
                xq00 xq00Var8 = (xq00) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                if (xq00Var8.m91752Y(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    y85.m93057b(uwu.f234734c, new rgj(k0e1.m54977L(R.string.bluejay_file_attachment_remove, xq00Var8)), null, 0L, 0L, false, xq00Var8, uwu.f234735d, 60);
                } else {
                    xq00Var8.m91757b0();
                }
                return w2a1Var;
            case 8:
                xq00 xq00Var9 = (xq00) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                if (xq00Var9.m91752Y(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    ahf1.m25932d(k0e1.m54977L(R.string.filter_and_sort_apply, xq00Var9), mi21.m61822f(1.0f, cxh0Var), null, 0L, new h171(3), null, 0, false, null, 0, null, xq00Var9, 0, 0, 2028);
                } else {
                    xq00Var9.m91757b0();
                }
                return w2a1Var;
            case 9:
                xq00 xq00Var10 = (xq00) obj;
                int iIntValue10 = ((Number) obj2).intValue();
                if (xq00Var10.m91752Y(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    ahf1.m25932d(k0e1.m54977L(R.string.filter_and_sort_cancel, xq00Var10), mi21.m61822f(1.0f, cxh0Var), null, 0L, new h171(3), null, 0, false, null, 0, null, xq00Var10, 0, 0, 2028);
                } else {
                    xq00Var10.m91757b0();
                }
                return w2a1Var;
            case 10:
                xq00 xq00Var11 = (xq00) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                if (xq00Var11.m91752Y(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    y85.m93057b(dqu.f52086c, qgj.f188480a, null, 0L, 0L, false, xq00Var11, dqu.f52087d | 48, 60);
                } else {
                    xq00Var11.m91757b0();
                }
                return w2a1Var;
            case 11:
                xq00 xq00Var12 = (xq00) obj;
                int iIntValue12 = ((Number) obj2).intValue();
                if (xq00Var12.m91752Y(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    y85.m93057b(uwu.f234734c, new rgj(k0e1.m54977L(R.string.assisted_curation_search_filter_clear_content_description, xq00Var12)), mi21.m61834r(leu.m58816b(xq00Var12).f117235g.f159604b, cxh0Var), leu.m58815a(xq00Var12).f112824b.f138757a, 0L, false, xq00Var12, uwu.f234735d, 48);
                } else {
                    xq00Var12.m91757b0();
                }
                return w2a1Var;
            case 12:
                xq00 xq00Var13 = (xq00) obj;
                int iIntValue13 = ((Number) obj2).intValue();
                if (xq00Var13.m91752Y(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    y85.m93057b(pru.f180679c, new rgj(k0e1.m54977L(R.string.your_library_filter_drag_handle_description, xq00Var13)), null, 0L, 0L, false, xq00Var13, pru.f180680d, 60);
                } else {
                    xq00Var13.m91757b0();
                }
                return w2a1Var;
            case 13:
                xq00 xq00Var14 = (xq00) obj;
                int iIntValue14 = ((Number) obj2).intValue();
                if (xq00Var14.m91752Y(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    y85.m93057b(vwu.f245554c, qgj.f188480a, null, 0L, 0L, true, xq00Var14, vwu.f245555d | 196656, 28);
                } else {
                    xq00Var14.m91757b0();
                }
                return w2a1Var;
            case 14:
                xq00 xq00Var15 = (xq00) obj;
                int iIntValue15 = ((Number) obj2).intValue();
                if (xq00Var15.m91752Y(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    ahf1.m25932d(k0e1.m54977L(R.string.user_social_stats_details_invite_friend_button_label, xq00Var15), null, leu.m58818d(xq00Var15).f64972h, 0L, null, null, 0, false, null, 0, null, xq00Var15, 0, 0, 2042);
                } else {
                    xq00Var15.m91757b0();
                }
                return w2a1Var;
            case 15:
                xq00 xq00Var16 = (xq00) obj;
                int iIntValue16 = ((Number) obj2).intValue();
                if (xq00Var16.m91752Y(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    vsf1.m86330p(0, xq00Var16);
                } else {
                    xq00Var16.m91757b0();
                }
                return w2a1Var;
            case 16:
                xq00 xq00Var17 = (xq00) obj;
                int iIntValue17 = ((Number) obj2).intValue();
                if (xq00Var17.m91752Y(iIntValue17 & 1, (iIntValue17 & 3) != 2)) {
                    y85.m93057b(tuu.f223921c, qgj.f188480a, null, 0L, 0L, false, xq00Var17, tuu.f223922d | 48, 60);
                } else {
                    xq00Var17.m91757b0();
                }
                return w2a1Var;
            case 17:
                xq00 xq00Var18 = (xq00) obj;
                int iIntValue18 = ((Number) obj2).intValue();
                if (xq00Var18.m91752Y(iIntValue18 & 1, (iIntValue18 & 3) != 2)) {
                    vsf1.m86327m(0, xq00Var18);
                } else {
                    xq00Var18.m91757b0();
                }
                return w2a1Var;
            case 18:
                xq00 xq00Var19 = (xq00) obj;
                int iIntValue19 = ((Number) obj2).intValue();
                if (xq00Var19.m91752Y(iIntValue19 & 1, (iIntValue19 & 3) != 2)) {
                    vsf1.m86326l(0, xq00Var19);
                } else {
                    xq00Var19.m91757b0();
                }
                return w2a1Var;
            case 19:
                xq00 xq00Var20 = (xq00) obj;
                int iIntValue20 = ((Number) obj2).intValue();
                if (xq00Var20.m91752Y(iIntValue20 & 1, (iIntValue20 & 3) != 2)) {
                    fxh0 fxh0VarM61820d = mi21.m61820d(1.0f, cxh0Var);
                    m6d0 m6d0VarM36007d = dha.m36007d(d7f0.f46174i, false);
                    int iHashCode = Long.hashCode(xq00Var20.f264809T);
                    wpn0 wpn0VarM91778m = xq00Var20.m91778m();
                    fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var20, fxh0VarM61820d);
                    soh.f211194A.getClass();
                    C2087le c2087le = roh.f201257b;
                    if (xq00Var20.f264811a == null) {
                        pmg1.m70360s();
                        throw null;
                    }
                    xq00Var20.m91779m0();
                    if (xq00Var20.f264808S) {
                        xq00Var20.m91776l(c2087le);
                    } else {
                        xq00Var20.m91799w0();
                    }
                    zsf1.m96835F(m6d0VarM36007d, roh.f201262g, xq00Var20);
                    zsf1.m96835F(wpn0VarM91778m, roh.f201261f, xq00Var20);
                    zsf1.m96835F(Integer.valueOf(iHashCode), roh.f201265j, xq00Var20);
                    zsf1.m96833D(roh.f201266k, xq00Var20);
                    zsf1.m96835F(fxh0VarM48286s, roh.f201259d, xq00Var20);
                    p271.m68899b(null, 5, 0L, 0L, xq00Var20, 48, 13);
                    xq00Var20.m91788r(true);
                } else {
                    xq00Var20.m91757b0();
                }
                return w2a1Var;
            case 20:
                xq00 xq00Var21 = (xq00) obj;
                int iIntValue21 = ((Number) obj2).intValue();
                if (xq00Var21.m91752Y(iIntValue21 & 1, (iIntValue21 & 3) != 2)) {
                    ahf1.m25932d(k0e1.m54977L(R.string.profile_follow_back_message_invite_sheet_not_now, xq00Var21), null, leu.m58818d(xq00Var21).f64972h, 0L, null, null, 0, false, null, 0, null, xq00Var21, 0, 0, 2042);
                } else {
                    xq00Var21.m91757b0();
                }
                return w2a1Var;
            case 21:
                xq00 xq00Var22 = (xq00) obj;
                int iIntValue22 = ((Number) obj2).intValue();
                if (xq00Var22.m91752Y(iIntValue22 & 1, (iIntValue22 & 3) != 2)) {
                    ahf1.m25932d(k0e1.m54977L(R.string.profile_follow_back_message_invite_sheet_send_message, xq00Var22), null, leu.m58818d(xq00Var22).f64972h, 0L, null, null, 0, false, null, 0, null, xq00Var22, 0, 0, 2042);
                } else {
                    xq00Var22.m91757b0();
                }
                return w2a1Var;
            case 22:
                xq00 xq00Var23 = (xq00) obj;
                int iIntValue23 = ((Number) obj2).intValue();
                if (xq00Var23.m91752Y(iIntValue23 & 1, (iIntValue23 & 3) != 2)) {
                    ahf1.m25932d(k0e1.m54977L(R.string.forced_graduation_message_button, xq00Var23), epv0.m39673I("forced_graduation_lock_button_test_tag", mi21.m61822f(1.0f, cxh0Var)), leu.m58818d(xq00Var23).f64972h, 0L, new h171(3), null, 0, false, null, 0, null, xq00Var23, 0, 0, 2024);
                } else {
                    xq00Var23.m91757b0();
                }
                return w2a1Var;
            case 23:
                xq00 xq00Var24 = (xq00) obj;
                int iIntValue24 = ((Number) obj2).intValue();
                if (xq00Var24.m91752Y(iIntValue24 & 1, (iIntValue24 & 3) != 2)) {
                    ahf1.m25932d(k0e1.m54977L(R.string.free_user_session_joined_sheet_primary_button, xq00Var24), null, null, 0L, null, null, 0, false, null, 0, null, xq00Var24, 0, 0, Entity.AUTOCOMPLETE_FIELD_NUMBER);
                } else {
                    xq00Var24.m91757b0();
                }
                return w2a1Var;
            case 24:
                xq00 xq00Var25 = (xq00) obj;
                int iIntValue25 = ((Number) obj2).intValue();
                if (xq00Var25.m91752Y(iIntValue25 & 1, (iIntValue25 & 3) != 2)) {
                    ahf1.m25932d(k0e1.m54977L(R.string.explore_premium_button_title, xq00Var25), null, null, 0L, null, null, 0, false, null, 0, null, xq00Var25, 0, 0, Entity.AUTOCOMPLETE_FIELD_NUMBER);
                } else {
                    xq00Var25.m91757b0();
                }
                return w2a1Var;
            case 25:
                xq00 xq00Var26 = (xq00) obj;
                int iIntValue26 = ((Number) obj2).intValue();
                if (xq00Var26.m91752Y(iIntValue26 & 1, (iIntValue26 & 3) != 2)) {
                    ahf1.m25932d(k0e1.m54977L(R.string.profile_friend_request_sheet_button, xq00Var26), null, leu.m58818d(xq00Var26).f64972h, 0L, null, null, 0, false, null, 0, null, xq00Var26, 0, 0, 2042);
                } else {
                    xq00Var26.m91757b0();
                }
                return w2a1Var;
            case 26:
                xq00 xq00Var27 = (xq00) obj;
                int iIntValue27 = ((Number) obj2).intValue();
                if (xq00Var27.m91752Y(iIntValue27 & 1, (iIntValue27 & 3) != 2)) {
                    vgg1.m85460a(0, 2, k0e1.m54977L(R.string.lyrics_fullscreen_chip_label_share, xq00Var27), xq00Var27, null);
                } else {
                    xq00Var27.m91757b0();
                }
                return w2a1Var;
            case 27:
                gfp gfpVar = leu.f132721a;
                return new n6f(((hiu) iiu.f102631a.f258040e).f91871b);
            case 28:
                xq00 xq00Var28 = (xq00) obj;
                int iIntValue28 = ((Number) obj2).intValue();
                if (xq00Var28.m91752Y(iIntValue28 & 1, (iIntValue28 & 3) != 2)) {
                    y85.m93057b(uuu.f234260c, qgj.f188480a, null, 0L, 0L, false, xq00Var28, uuu.f234261d | 48, 60);
                } else {
                    xq00Var28.m91757b0();
                }
                return w2a1Var;
            default:
                xq00 xq00Var29 = (xq00) obj;
                int iIntValue29 = ((Number) obj2).intValue();
                if (xq00Var29.m91752Y(iIntValue29 & 1, (iIntValue29 & 3) != 2)) {
                    y85.m93057b(uuu.f234260c, qgj.f188480a, mi21.m61834r(leu.m58816b(xq00Var29).f117235g.f159605c, cxh0Var), n6f.f150871k, 0L, false, xq00Var29, uuu.f234261d | 199728, 16);
                } else {
                    xq00Var29.m91757b0();
                }
                return w2a1Var;
        }
    }
}
