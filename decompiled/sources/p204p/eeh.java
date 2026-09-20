package p204p;

import com.spotify.music.R;
import com.spotify.searchview.proto.Entity;

/* JADX INFO: loaded from: classes6.dex */
public final class eeh extends qe70 implements th00 {

    /* JADX INFO: renamed from: L0 */
    public static final eeh f58768L0;

    /* JADX INFO: renamed from: M0 */
    public static final eeh f58769M0;

    /* JADX INFO: renamed from: N0 */
    public static final eeh f58770N0;

    /* JADX INFO: renamed from: O0 */
    public static final eeh f58771O0;

    /* JADX INFO: renamed from: P0 */
    public static final eeh f58772P0;

    /* JADX INFO: renamed from: Q0 */
    public static final eeh f58773Q0;

    /* JADX INFO: renamed from: R0 */
    public static final eeh f58774R0;

    /* JADX INFO: renamed from: S0 */
    public static final eeh f58775S0;

    /* JADX INFO: renamed from: T0 */
    public static final eeh f58776T0;

    /* JADX INFO: renamed from: U0 */
    public static final eeh f58777U0;

    /* JADX INFO: renamed from: V0 */
    public static final eeh f58778V0;

    /* JADX INFO: renamed from: W0 */
    public static final eeh f58779W0;

    /* JADX INFO: renamed from: X */
    public static final eeh f58780X;

    /* JADX INFO: renamed from: X0 */
    public static final eeh f58781X0;

    /* JADX INFO: renamed from: Y */
    public static final eeh f58782Y;

    /* JADX INFO: renamed from: Y0 */
    public static final eeh f58783Y0;

    /* JADX INFO: renamed from: Z */
    public static final eeh f58784Z;

    /* JADX INFO: renamed from: Z0 */
    public static final eeh f58785Z0;

    /* JADX INFO: renamed from: a1 */
    public static final eeh f58786a1;

    /* JADX INFO: renamed from: b */
    public static final eeh f58787b;

    /* JADX INFO: renamed from: b1 */
    public static final eeh f58788b1;

    /* JADX INFO: renamed from: c */
    public static final eeh f58789c;

    /* JADX INFO: renamed from: c1 */
    public static final eeh f58790c1;

    /* JADX INFO: renamed from: d */
    public static final eeh f58791d;

    /* JADX INFO: renamed from: e */
    public static final eeh f58792e;

    /* JADX INFO: renamed from: f */
    public static final eeh f58793f;

    /* JADX INFO: renamed from: g */
    public static final eeh f58794g;

    /* JADX INFO: renamed from: h */
    public static final eeh f58795h;

    /* JADX INFO: renamed from: i */
    public static final eeh f58796i;

    /* JADX INFO: renamed from: t */
    public static final eeh f58797t;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f58798a;

    static {
        int i = 2;
        f58787b = new eeh(i, 0);
        f58789c = new eeh(i, 1);
        f58791d = new eeh(i, 2);
        f58792e = new eeh(i, 3);
        f58793f = new eeh(i, 4);
        f58794g = new eeh(i, 5);
        f58795h = new eeh(i, 6);
        f58796i = new eeh(i, 7);
        f58797t = new eeh(i, 8);
        f58780X = new eeh(i, 9);
        f58782Y = new eeh(i, 10);
        f58784Z = new eeh(i, 11);
        f58768L0 = new eeh(i, 12);
        f58769M0 = new eeh(i, 13);
        f58770N0 = new eeh(i, 14);
        f58771O0 = new eeh(i, 15);
        f58772P0 = new eeh(i, 16);
        f58773Q0 = new eeh(i, 17);
        f58774R0 = new eeh(i, 18);
        f58775S0 = new eeh(i, 19);
        f58776T0 = new eeh(i, 20);
        f58777U0 = new eeh(i, 21);
        f58778V0 = new eeh(i, 22);
        f58779W0 = new eeh(i, 23);
        f58781X0 = new eeh(i, 24);
        f58783Y0 = new eeh(i, 25);
        f58785Z0 = new eeh(i, 26);
        f58786a1 = new eeh(i, 27);
        f58788b1 = new eeh(i, 28);
        f58790c1 = new eeh(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eeh(int i, int i2) {
        super(i);
        this.f58798a = i2;
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f58798a) {
            case 0:
                xq00 xq00Var = (xq00) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (xq00Var.m91752Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    y85.m93057b(bsu.f30386c, new rgj(k0e1.m54977L(R.string.show_more_button_content_description, xq00Var)), null, leu.m58815a(xq00Var).f112824b.f138758b, 0L, false, xq00Var, bsu.f30387d, 52);
                } else {
                    xq00Var.m91757b0();
                }
                return w2a1.f247311a;
            case 1:
                xq00 xq00Var2 = (xq00) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (xq00Var2.m91752Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    y85.m93057b(mru.f146615c, new rgj(k0e1.m54977L(R.string.padlock_icon_content_description, xq00Var2)), null, 0L, 0L, true, xq00Var2, mru.f146616d | 196608, 28);
                } else {
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
                    q350.m72049d(null, null, xq00Var4, 0, 3);
                } else {
                    xq00Var4.m91757b0();
                }
                return w2a1.f247311a;
            case 4:
                xq00 xq00Var5 = (xq00) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                if (!xq00Var5.m91752Y(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    xq00Var5.m91757b0();
                }
                return w2a1.f247311a;
            case 5:
                xq00 xq00Var6 = (xq00) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                if (xq00Var6.m91752Y(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    ahf1.m25932d(k0e1.m54977L(R.string.edit_playlist_unsaved_changes_dialog_message, xq00Var6), null, null, 0L, null, null, 0, false, null, 0, null, xq00Var6, 0, 0, Entity.AUTOCOMPLETE_FIELD_NUMBER);
                } else {
                    xq00Var6.m91757b0();
                }
                return w2a1.f247311a;
            case 6:
                xq00 xq00Var7 = (xq00) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                if (xq00Var7.m91752Y(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    ahf1.m25932d(k0e1.m54977L(R.string.edit_playlist_unsaved_changes_dialog_button_continue_editing, xq00Var7), null, leu.m58818d(xq00Var7).f64972h, 0L, null, null, 0, false, null, 0, null, xq00Var7, 0, 0, 2042);
                } else {
                    xq00Var7.m91757b0();
                }
                return w2a1.f247311a;
            case 7:
                xq00 xq00Var8 = (xq00) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                if (xq00Var8.m91752Y(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    ahf1.m25932d(k0e1.m54977L(R.string.edit_playlist_unsaved_changes_dialog_button_discard_changes, xq00Var8), null, leu.m58818d(xq00Var8).f64972h, 0L, null, null, 0, false, null, 0, null, xq00Var8, 0, 0, 2042);
                } else {
                    xq00Var8.m91757b0();
                }
                return w2a1.f247311a;
            case 8:
                xq00 xq00Var9 = (xq00) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                if (xq00Var9.m91752Y(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    ahf1.m25932d(k0e1.m54977L(R.string.edit_playlist_unsaved_changes_dialog_title, xq00Var9), null, null, 0L, null, null, 0, false, null, 0, null, xq00Var9, 0, 0, Entity.AUTOCOMPLETE_FIELD_NUMBER);
                } else {
                    xq00Var9.m91757b0();
                }
                return w2a1.f247311a;
            case 9:
                xq00 xq00Var10 = (xq00) obj;
                int iIntValue10 = ((Number) obj2).intValue();
                if (xq00Var10.m91752Y(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    y85.m93057b(uwu.f234734c, new rgj(k0e1.m54977L(R.string.update_birthday_close_button_content_description, xq00Var10)), null, 0L, 0L, false, xq00Var10, uwu.f234735d, 60);
                } else {
                    xq00Var10.m91757b0();
                }
                return w2a1.f247311a;
            case 10:
                xq00 xq00Var11 = (xq00) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                if (xq00Var11.m91752Y(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    ahf1.m25932d(k0e1.m54977L(R.string.update_birthday_save_button, xq00Var11), null, null, leu.m58815a(xq00Var11).f112824b.f138759c, null, null, 0, false, null, 0, null, xq00Var11, 0, 0, 2038);
                } else {
                    xq00Var11.m91757b0();
                }
                return w2a1.f247311a;
            case 11:
                xq00 xq00Var12 = (xq00) obj;
                int iIntValue12 = ((Number) obj2).intValue();
                if (xq00Var12.m91752Y(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    y85.m93057b(uwu.f234734c, new rgj(k0e1.m54977L(R.string.update_name_close_button_content_description, xq00Var12)), null, 0L, 0L, false, xq00Var12, uwu.f234735d, 60);
                } else {
                    xq00Var12.m91757b0();
                }
                return w2a1.f247311a;
            case 12:
                xq00 xq00Var13 = (xq00) obj;
                int iIntValue13 = ((Number) obj2).intValue();
                if (xq00Var13.m91752Y(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    ahf1.m25932d(k0e1.m54977L(R.string.update_name_save_button, xq00Var13), null, null, leu.m58815a(xq00Var13).f112824b.f138759c, null, null, 0, false, null, 0, null, xq00Var13, 0, 0, 2038);
                } else {
                    xq00Var13.m91757b0();
                }
                return w2a1.f247311a;
            case 13:
                xq00 xq00Var14 = (xq00) obj;
                int iIntValue14 = ((Number) obj2).intValue();
                if (xq00Var14.m91752Y(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    ahf1.m25932d(k0e1.m54977L(R.string.dismiss_label, xq00Var14), null, null, 0L, null, null, 0, false, null, 0, null, xq00Var14, 0, 0, Entity.AUTOCOMPLETE_FIELD_NUMBER);
                } else {
                    xq00Var14.m91757b0();
                }
                return w2a1.f247311a;
            case 14:
                xq00 xq00Var15 = (xq00) obj;
                int iIntValue15 = ((Number) obj2).intValue();
                if (xq00Var15.m91752Y(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    fxh0 fxh0VarM61824h = mi21.m61824h(200, mi21.m61822f(1.0f, cxh0.f43038a));
                    m6d0 m6d0VarM36007d = dha.m36007d(d7f0.f46174i, false);
                    int iHashCode = Long.hashCode(xq00Var15.f264809T);
                    wpn0 wpn0VarM91778m = xq00Var15.m91778m();
                    fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var15, fxh0VarM61824h);
                    soh.f211194A.getClass();
                    C2087le c2087le = roh.f201257b;
                    if (xq00Var15.f264811a == null) {
                        pmg1.m70360s();
                        throw null;
                    }
                    xq00Var15.m91779m0();
                    if (xq00Var15.f264808S) {
                        xq00Var15.m91776l(c2087le);
                    } else {
                        xq00Var15.m91799w0();
                    }
                    zsf1.m96835F(m6d0VarM36007d, roh.f201262g, xq00Var15);
                    zsf1.m96835F(wpn0VarM91778m, roh.f201261f, xq00Var15);
                    zsf1.m96835F(Integer.valueOf(iHashCode), roh.f201265j, xq00Var15);
                    zsf1.m96833D(roh.f201266k, xq00Var15);
                    zsf1.m96835F(fxh0VarM48286s, roh.f201259d, xq00Var15);
                    p271.m68899b(null, 3, leu.m58815a(xq00Var15).f112824b.f138757a, 0L, xq00Var15, 48, 9);
                    xq00Var15.m91788r(true);
                } else {
                    xq00Var15.m91757b0();
                }
                return w2a1.f247311a;
            case 15:
                xq00 xq00Var16 = (xq00) obj;
                int iIntValue16 = ((Number) obj2).intValue();
                if (xq00Var16.m91752Y(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    dxf1.m37233g(0, xq00Var16);
                } else {
                    xq00Var16.m91757b0();
                }
                return w2a1.f247311a;
            case 16:
                xq00 xq00Var17 = (xq00) obj;
                int iIntValue17 = ((Number) obj2).intValue();
                if (xq00Var17.m91752Y(iIntValue17 & 1, (iIntValue17 & 3) != 2)) {
                    y0v.m92603a(2, cfh.f37375a, xq00Var17, 390, 2);
                } else {
                    xq00Var17.m91757b0();
                }
                return w2a1.f247311a;
            case 17:
                xq00 xq00Var18 = (xq00) obj;
                int iIntValue18 = ((Number) obj2).intValue();
                if (xq00Var18.m91752Y(iIntValue18 & 1, (iIntValue18 & 3) != 2)) {
                    y85.m93057b(bsu.f30386c, new rgj(k0e1.m54977L(R.string.user_activity_row_context_menu_button, xq00Var18)), null, leu.m58815a(xq00Var18).f112824b.f138758b, 0L, false, xq00Var18, bsu.f30387d, 52);
                } else {
                    xq00Var18.m91757b0();
                }
                return w2a1.f247311a;
            case 18:
                xq00 xq00Var19 = (xq00) obj;
                int iIntValue19 = ((Number) obj2).intValue();
                if (xq00Var19.m91752Y(iIntValue19 & 1, (iIntValue19 & 3) != 2)) {
                    y85.m93057b(bsu.f30386c, new rgj(k0e1.m54977L(R.string.user_activity_row_context_menu_button, xq00Var19)), null, leu.m58815a(xq00Var19).f112824b.f138758b, 0L, false, xq00Var19, bsu.f30387d, 52);
                } else {
                    xq00Var19.m91757b0();
                }
                return w2a1.f247311a;
            case 19:
                xq00 xq00Var20 = (xq00) obj;
                int iIntValue20 = ((Number) obj2).intValue();
                if (xq00Var20.m91752Y(iIntValue20 & 1, (iIntValue20 & 3) != 2)) {
                    ahf1.m25932d(k0e1.m54977L(R.string.user_blocked_action_delete, xq00Var20), null, null, 0L, null, null, 0, false, null, 0, null, xq00Var20, 0, 0, Entity.AUTOCOMPLETE_FIELD_NUMBER);
                } else {
                    xq00Var20.m91757b0();
                }
                return w2a1.f247311a;
            case 20:
                xq00 xq00Var21 = (xq00) obj;
                int iIntValue21 = ((Number) obj2).intValue();
                if (xq00Var21.m91752Y(iIntValue21 & 1, (iIntValue21 & 3) != 2)) {
                    ahf1.m25932d(k0e1.m54977L(R.string.user_blocked_action_unblock, xq00Var21), null, null, 0L, null, null, 0, false, null, 0, null, xq00Var21, 0, 0, Entity.AUTOCOMPLETE_FIELD_NUMBER);
                } else {
                    xq00Var21.m91757b0();
                }
                return w2a1.f247311a;
            case 21:
                xq00 xq00Var22 = (xq00) obj;
                int iIntValue22 = ((Number) obj2).intValue();
                if (xq00Var22.m91752Y(iIntValue22 & 1, (iIntValue22 & 3) != 2)) {
                    ahf1.m25932d(k0e1.m54977L(R.string.user_info_next_button, xq00Var22), null, null, 0L, null, null, 0, false, null, 0, null, xq00Var22, 0, 0, Entity.AUTOCOMPLETE_FIELD_NUMBER);
                } else {
                    xq00Var22.m91757b0();
                }
                return w2a1.f247311a;
            case 22:
                xq00 xq00Var23 = (xq00) obj;
                int iIntValue23 = ((Number) obj2).intValue();
                if (xq00Var23.m91752Y(iIntValue23 & 1, (iIntValue23 & 3) != 2)) {
                    ahf1.m25932d(k0e1.m54977L(R.string.timeline_no_listening_history_find_music, xq00Var23), null, leu.m58818d(xq00Var23).f64972h, 0L, null, null, 0, false, null, 0, null, xq00Var23, 0, 0, 2042);
                } else {
                    xq00Var23.m91757b0();
                }
                return w2a1.f247311a;
            case 23:
                xq00 xq00Var24 = (xq00) obj;
                int iIntValue24 = ((Number) obj2).intValue();
                if (xq00Var24.m91752Y(iIntValue24 & 1, (iIntValue24 & 3) != 2)) {
                    ahf1.m25932d(k0e1.m54977L(R.string.add_friends_requested_button, xq00Var24), null, null, 0L, null, null, 0, false, null, 0, null, xq00Var24, 0, 0, Entity.AUTOCOMPLETE_FIELD_NUMBER);
                } else {
                    xq00Var24.m91757b0();
                }
                return w2a1.f247311a;
            case 24:
                xq00 xq00Var25 = (xq00) obj;
                int iIntValue25 = ((Number) obj2).intValue();
                if (xq00Var25.m91752Y(iIntValue25 & 1, (iIntValue25 & 3) != 2)) {
                    ahf1.m25932d(k0e1.m54977L(R.string.add_friends_add_button, xq00Var25), null, null, 0L, null, null, 0, false, null, 0, null, xq00Var25, 0, 0, Entity.AUTOCOMPLETE_FIELD_NUMBER);
                } else {
                    xq00Var25.m91757b0();
                }
                return w2a1.f247311a;
            case 25:
                xq00 xq00Var26 = (xq00) obj;
                int iIntValue26 = ((Number) obj2).intValue();
                if (xq00Var26.m91752Y(iIntValue26 & 1, (iIntValue26 & 3) != 2)) {
                    p271.m68899b(null, 3, leu.m58815a(xq00Var26).f112824b.f138757a, 0L, xq00Var26, 48, 9);
                } else {
                    xq00Var26.m91757b0();
                }
                return w2a1.f247311a;
            case 26:
                xq00 xq00Var27 = (xq00) obj;
                int iIntValue27 = ((Number) obj2).intValue();
                if (xq00Var27.m91752Y(iIntValue27 & 1, (iIntValue27 & 3) != 2)) {
                    y85.m93057b(oou.f167693c, new rgj(k0e1.m54977L(R.string.user_feedback_close_button_description, xq00Var27)), mi21.m61822f(1.0f, cxh0.f43038a), 0L, 0L, false, xq00Var27, oou.f167694d, 56);
                } else {
                    xq00Var27.m91757b0();
                }
                return w2a1.f247311a;
            case 27:
                xq00 xq00Var28 = (xq00) obj;
                int iIntValue28 = ((Number) obj2).intValue();
                if (xq00Var28.m91752Y(iIntValue28 & 1, (iIntValue28 & 3) != 2)) {
                    y85.m93057b(uuu.f234260c, qgj.f188480a, null, leu.m58815a(xq00Var28).f112825c.f221219b, 0L, false, xq00Var28, uuu.f234261d | 48, 52);
                } else {
                    xq00Var28.m91757b0();
                }
                return w2a1.f247311a;
            case 28:
                xq00 xq00Var29 = (xq00) obj;
                int iIntValue29 = ((Number) obj2).intValue();
                if (xq00Var29.m91752Y(iIntValue29 & 1, (iIntValue29 & 3) != 2)) {
                    ahf1.m25932d(k0e1.m54977L(R.string.verification_failure_primary_button_title, xq00Var29), null, leu.m58818d(xq00Var29).f64972h, 0L, new h171(3), null, 0, false, null, 0, null, xq00Var29, 0, 0, 2026);
                } else {
                    xq00Var29.m91757b0();
                }
                return w2a1.f247311a;
            default:
                xq00 xq00Var30 = (xq00) obj;
                int iIntValue30 = ((Number) obj2).intValue();
                if (xq00Var30.m91752Y(iIntValue30 & 1, (iIntValue30 & 3) != 2)) {
                    ahf1.m25932d(k0e1.m54977L(R.string.verification_failure_primary_secondary_button_title, xq00Var30), null, leu.m58818d(xq00Var30).f64972h, 0L, new h171(3), null, 0, false, null, 0, null, xq00Var30, 0, 0, 2026);
                } else {
                    xq00Var30.m91757b0();
                }
                return w2a1.f247311a;
        }
    }
}
