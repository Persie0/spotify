package p204p;

import com.spotify.music.R;
import com.spotify.searchview.proto.Entity;

/* JADX INFO: loaded from: classes8.dex */
public final class pbg extends qe70 implements th00 {

    /* JADX INFO: renamed from: L0 */
    public static final pbg f175810L0;

    /* JADX INFO: renamed from: M0 */
    public static final pbg f175811M0;

    /* JADX INFO: renamed from: N0 */
    public static final pbg f175812N0;

    /* JADX INFO: renamed from: O0 */
    public static final pbg f175813O0;

    /* JADX INFO: renamed from: P0 */
    public static final pbg f175814P0;

    /* JADX INFO: renamed from: Q0 */
    public static final pbg f175815Q0;

    /* JADX INFO: renamed from: R0 */
    public static final pbg f175816R0;

    /* JADX INFO: renamed from: S0 */
    public static final pbg f175817S0;

    /* JADX INFO: renamed from: T0 */
    public static final pbg f175818T0;

    /* JADX INFO: renamed from: U0 */
    public static final pbg f175819U0;

    /* JADX INFO: renamed from: V0 */
    public static final pbg f175820V0;

    /* JADX INFO: renamed from: W0 */
    public static final pbg f175821W0;

    /* JADX INFO: renamed from: X */
    public static final pbg f175822X;

    /* JADX INFO: renamed from: X0 */
    public static final pbg f175823X0;

    /* JADX INFO: renamed from: Y */
    public static final pbg f175824Y;

    /* JADX INFO: renamed from: Y0 */
    public static final pbg f175825Y0;

    /* JADX INFO: renamed from: Z */
    public static final pbg f175826Z;

    /* JADX INFO: renamed from: Z0 */
    public static final pbg f175827Z0;

    /* JADX INFO: renamed from: a1 */
    public static final pbg f175828a1;

    /* JADX INFO: renamed from: b */
    public static final pbg f175829b;

    /* JADX INFO: renamed from: b1 */
    public static final pbg f175830b1;

    /* JADX INFO: renamed from: c */
    public static final pbg f175831c;

    /* JADX INFO: renamed from: c1 */
    public static final pbg f175832c1;

    /* JADX INFO: renamed from: d */
    public static final pbg f175833d;

    /* JADX INFO: renamed from: e */
    public static final pbg f175834e;

    /* JADX INFO: renamed from: f */
    public static final pbg f175835f;

    /* JADX INFO: renamed from: g */
    public static final pbg f175836g;

    /* JADX INFO: renamed from: h */
    public static final pbg f175837h;

    /* JADX INFO: renamed from: i */
    public static final pbg f175838i;

    /* JADX INFO: renamed from: t */
    public static final pbg f175839t;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f175840a;

    static {
        int i = 2;
        f175829b = new pbg(i, 0);
        f175831c = new pbg(i, 1);
        f175833d = new pbg(i, 2);
        f175834e = new pbg(i, 3);
        f175835f = new pbg(i, 4);
        f175836g = new pbg(i, 5);
        f175837h = new pbg(i, 6);
        f175838i = new pbg(i, 7);
        f175839t = new pbg(i, 8);
        f175822X = new pbg(i, 9);
        f175824Y = new pbg(i, 10);
        f175826Z = new pbg(i, 11);
        f175810L0 = new pbg(i, 12);
        f175811M0 = new pbg(i, 13);
        f175812N0 = new pbg(i, 14);
        f175813O0 = new pbg(i, 15);
        f175814P0 = new pbg(i, 16);
        f175815Q0 = new pbg(i, 17);
        f175816R0 = new pbg(i, 18);
        f175817S0 = new pbg(i, 19);
        f175818T0 = new pbg(i, 20);
        f175819U0 = new pbg(i, 21);
        f175820V0 = new pbg(i, 22);
        f175821W0 = new pbg(i, 23);
        f175823X0 = new pbg(i, 24);
        f175825Y0 = new pbg(i, 25);
        f175827Z0 = new pbg(i, 26);
        f175828a1 = new pbg(i, 27);
        f175830b1 = new pbg(i, 28);
        f175832c1 = new pbg(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pbg(int i, int i2) {
        super(i);
        this.f175840a = i2;
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f175840a) {
            case 0:
                xq00 xq00Var = (xq00) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (xq00Var.m91752Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    y85.m93057b(oou.f167693c, new rgj(k0e1.m54977L(R.string.date_picker_previous_month_action, xq00Var)), null, 0L, 0L, false, xq00Var, oou.f167694d, 60);
                } else {
                    xq00Var.m91757b0();
                }
                break;
            case 1:
                xq00 xq00Var2 = (xq00) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (xq00Var2.m91752Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    y85.m93057b(pou.f179785c, new rgj(k0e1.m54977L(R.string.date_picker_next_month_action, xq00Var2)), null, 0L, 0L, false, xq00Var2, pou.f179786d, 60);
                } else {
                    xq00Var2.m91757b0();
                }
                break;
            case 2:
                xq00 xq00Var3 = (xq00) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                if (xq00Var3.m91752Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    ahf1.m25932d(k0e1.m54977L(R.string.daylist_above_section_button, xq00Var3), null, null, 0L, null, null, 0, false, null, 0, null, xq00Var3, 0, 0, Entity.AUTOCOMPLETE_FIELD_NUMBER);
                } else {
                    xq00Var3.m91757b0();
                }
                break;
            case 3:
                xq00 xq00Var4 = (xq00) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                if (xq00Var4.m91752Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    alo0.m26350a(dlo0.f50290a, null, null, 0L, false, xq00Var4, 6, 30);
                } else {
                    xq00Var4.m91757b0();
                }
                break;
            case 4:
                xq00 xq00Var5 = (xq00) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                if (xq00Var5.m91752Y(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    y85.m93057b(ztu.f286267c, qgj.f188480a, null, leu.m58815a(xq00Var5).f112824b.f138757a, 0L, false, xq00Var5, ztu.f286268d | 48, 52);
                } else {
                    xq00Var5.m91757b0();
                }
                break;
            case 5:
                xq00 xq00Var6 = (xq00) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                if (xq00Var6.m91752Y(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    y85.m93057b(bsu.f30386c, qgj.f188480a, null, leu.m58815a(xq00Var6).f112824b.f138757a, 0L, false, xq00Var6, bsu.f30387d | 48, 52);
                } else {
                    xq00Var6.m91757b0();
                }
                break;
            case 6:
                xq00 xq00Var7 = (xq00) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                if (xq00Var7.m91752Y(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    y85.m93057b(jqu.f115003c, qgj.f188480a, null, leu.m58815a(xq00Var7).f112824b.f138757a, 0L, false, xq00Var7, jqu.f115004d | 48, 52);
                } else {
                    xq00Var7.m91757b0();
                }
                break;
            case 7:
                xq00 xq00Var8 = (xq00) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                if (xq00Var8.m91752Y(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    ahf1.m25932d(k0e1.m54977L(R.string.settings_default_save_location_see_all, xq00Var8), null, null, 0L, null, null, 0, false, null, 0, null, xq00Var8, 0, 0, Entity.AUTOCOMPLETE_FIELD_NUMBER);
                } else {
                    xq00Var8.m91757b0();
                }
                break;
            case 8:
                xq00 xq00Var9 = (xq00) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                if (xq00Var9.m91752Y(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    ahf1.m25932d(k0e1.m54977L(R.string.settings_default_save_location_update, xq00Var9), null, leu.m58818d(xq00Var9).f64975k, leu.m58815a(xq00Var9).f112824b.f138758b, null, null, 0, false, null, 0, null, xq00Var9, 0, 0, 2034);
                } else {
                    xq00Var9.m91757b0();
                }
                break;
            case 9:
                xq00 xq00Var10 = (xq00) obj;
                int iIntValue10 = ((Number) obj2).intValue();
                if (xq00Var10.m91752Y(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    ahf1.m25932d(k0e1.m54977L(R.string.delete_managed_account_primary_button, xq00Var10), mi21.m61822f(1.0f, cxh0.f43038a), null, 0L, new h171(3), null, 0, false, null, 0, null, xq00Var10, 0, 0, 2028);
                } else {
                    xq00Var10.m91757b0();
                }
                break;
            case 10:
                xq00 xq00Var11 = (xq00) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                if (xq00Var11.m91752Y(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    y85.m93057b(jnu.f114200c, new rgj(k0e1.m54977L(R.string.delete_managed_account_back, xq00Var11)), null, 0L, 0L, false, xq00Var11, jnu.f114201d, 60);
                } else {
                    xq00Var11.m91757b0();
                }
                break;
            case 11:
                xq00 xq00Var12 = (xq00) obj;
                int iIntValue12 = ((Number) obj2).intValue();
                if (xq00Var12.m91752Y(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    ahf1.m25932d(k0e1.m54977L(R.string.delete_managed_account_toolbar_title, xq00Var12), null, leu.m58818d(xq00Var12).f64972h, 0L, null, null, 0, false, null, 0, null, xq00Var12, 0, 0, 2042);
                } else {
                    xq00Var12.m91757b0();
                }
                break;
            case 12:
                xq00 xq00Var13 = (xq00) obj;
                int iIntValue13 = ((Number) obj2).intValue();
                if (xq00Var13.m91752Y(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    ahf1.m25932d(k0e1.m54977L(R.string.delete_managed_account_secondary_button, xq00Var13), mi21.m61822f(1.0f, cxh0.f43038a), null, 0L, new h171(3), null, 0, false, null, 0, null, xq00Var13, 0, 0, 2028);
                } else {
                    xq00Var13.m91757b0();
                }
                break;
            case 13:
                xq00 xq00Var14 = (xq00) obj;
                int iIntValue14 = ((Number) obj2).intValue();
                if (xq00Var14.m91752Y(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    ahf1.m25932d(k0e1.m54977L(R.string.edit_playlist_delete_playlist_dialog_title, xq00Var14), null, null, 0L, null, null, 0, false, null, 0, null, xq00Var14, 0, 0, Entity.AUTOCOMPLETE_FIELD_NUMBER);
                } else {
                    xq00Var14.m91757b0();
                }
                break;
            case 14:
                xq00 xq00Var15 = (xq00) obj;
                int iIntValue15 = ((Number) obj2).intValue();
                if (xq00Var15.m91752Y(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    ahf1.m25932d(k0e1.m54977L(R.string.edit_playlist_delete_playlist_dialog_cancel_button, xq00Var15), null, leu.m58818d(xq00Var15).f64972h, leu.m58815a(xq00Var15).f112824b.f138762f, null, null, 0, false, null, 0, null, xq00Var15, 0, 0, 2034);
                } else {
                    xq00Var15.m91757b0();
                }
                break;
            case 15:
                xq00 xq00Var16 = (xq00) obj;
                int iIntValue16 = ((Number) obj2).intValue();
                if (xq00Var16.m91752Y(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    ahf1.m25932d(k0e1.m54977L(R.string.edit_playlist_delete_playlist_dialog_delete_button, xq00Var16), null, leu.m58818d(xq00Var16).f64972h, leu.m58815a(xq00Var16).f112824b.f138762f, null, null, 0, false, null, 0, null, xq00Var16, 0, 0, 2034);
                } else {
                    xq00Var16.m91757b0();
                }
                break;
            case 16:
                xq00 xq00Var17 = (xq00) obj;
                int iIntValue17 = ((Number) obj2).intValue();
                if (xq00Var17.m91752Y(iIntValue17 & 1, (iIntValue17 & 3) != 2)) {
                    y85.m93057b(oou.f167693c, new rgj(k0e1.m54977L(R.string.back_button_accessibility, xq00Var17)), null, 0L, 0L, false, xq00Var17, oou.f167694d, 60);
                } else {
                    xq00Var17.m91757b0();
                }
                break;
            case 17:
                xq00 xq00Var18 = (xq00) obj;
                int iIntValue18 = ((Number) obj2).intValue();
                if (xq00Var18.m91752Y(iIntValue18 & 1, (iIntValue18 & 3) != 2)) {
                    y85.m93057b(uwu.f234734c, new rgj(k0e1.m54977L(R.string.close_button_accessibility, xq00Var18)), null, 0L, 0L, false, xq00Var18, uwu.f234735d, 60);
                } else {
                    xq00Var18.m91757b0();
                }
                break;
            case 18:
                xq00 xq00Var19 = (xq00) obj;
                int iIntValue19 = ((Number) obj2).intValue();
                if (!xq00Var19.m91752Y(iIntValue19 & 1, (iIntValue19 & 3) != 2)) {
                    xq00Var19.m91757b0();
                }
                break;
            case 19:
                xq00 xq00Var20 = (xq00) obj;
                int iIntValue20 = ((Number) obj2).intValue();
                if (xq00Var20.m91752Y(iIntValue20 & 1, (iIntValue20 & 3) != 2)) {
                    wjg1.m88322a(null, null, false, null, new clm0(leu.m58815a(xq00Var20).f112823a.f229876c), null, null, null, xq00Var20, 0, 239);
                } else {
                    xq00Var20.m91757b0();
                }
                break;
            case 20:
                xq00 xq00Var21 = (xq00) obj;
                int iIntValue21 = ((Number) obj2).intValue();
                if (xq00Var21.m91752Y(iIntValue21 & 1, (iIntValue21 & 3) != 2)) {
                    ahf1.m25932d(k0e1.m54977L(R.string.desktop_launcher_bottom_sheet_open_camera, xq00Var21), null, null, 0L, null, null, 0, false, null, 0, null, xq00Var21, 0, 0, Entity.AUTOCOMPLETE_FIELD_NUMBER);
                } else {
                    xq00Var21.m91757b0();
                }
                break;
            case 21:
                xq00 xq00Var22 = (xq00) obj;
                int iIntValue22 = ((Number) obj2).intValue();
                if (xq00Var22.m91752Y(iIntValue22 & 1, (iIntValue22 & 3) != 2)) {
                    ahf1.m25932d(k0e1.m54977L(R.string.remote_downloads_device_limit_dialog_body, xq00Var22), null, null, 0L, null, null, 0, false, null, 0, null, xq00Var22, 0, 0, Entity.AUTOCOMPLETE_FIELD_NUMBER);
                } else {
                    xq00Var22.m91757b0();
                }
                break;
            case 22:
                xq00 xq00Var23 = (xq00) obj;
                int iIntValue23 = ((Number) obj2).intValue();
                if (xq00Var23.m91752Y(iIntValue23 & 1, (iIntValue23 & 3) != 2)) {
                    ahf1.m25932d(k0e1.m54977L(R.string.remote_downloads_device_limit_dialog_button, xq00Var23), null, null, 0L, null, null, 0, false, null, 0, null, xq00Var23, 0, 0, Entity.AUTOCOMPLETE_FIELD_NUMBER);
                } else {
                    xq00Var23.m91757b0();
                }
                break;
            case 23:
                xq00 xq00Var24 = (xq00) obj;
                int iIntValue24 = ((Number) obj2).intValue();
                if (xq00Var24.m91752Y(iIntValue24 & 1, (iIntValue24 & 3) != 2)) {
                    ahf1.m25932d(k0e1.m54977L(R.string.remote_downloads_device_limit_dialog_title, xq00Var24), null, null, 0L, null, null, 0, false, null, 0, null, xq00Var24, 0, 0, Entity.AUTOCOMPLETE_FIELD_NUMBER);
                } else {
                    xq00Var24.m91757b0();
                }
                break;
            case 24:
                xq00 xq00Var25 = (xq00) obj;
                int iIntValue25 = ((Number) obj2).intValue();
                if (xq00Var25.m91752Y(iIntValue25 & 1, (iIntValue25 & 3) != 2)) {
                    ahf1.m25932d(k0e1.m54977L(R.string.taste_profile_feedback_notes_discard_dialog_discard, xq00Var25), null, null, 0L, null, null, 0, false, null, 0, null, xq00Var25, 0, 0, Entity.AUTOCOMPLETE_FIELD_NUMBER);
                } else {
                    xq00Var25.m91757b0();
                }
                break;
            case 25:
                xq00 xq00Var26 = (xq00) obj;
                int iIntValue26 = ((Number) obj2).intValue();
                if (xq00Var26.m91752Y(iIntValue26 & 1, (iIntValue26 & 3) != 2)) {
                    ahf1.m25932d(k0e1.m54977L(R.string.taste_profile_feedback_notes_discard_dialog_title, xq00Var26), null, null, 0L, null, null, 0, false, null, 0, null, xq00Var26, 0, 0, Entity.AUTOCOMPLETE_FIELD_NUMBER);
                } else {
                    xq00Var26.m91757b0();
                }
                break;
            case 26:
                xq00 xq00Var27 = (xq00) obj;
                int iIntValue27 = ((Number) obj2).intValue();
                if (xq00Var27.m91752Y(iIntValue27 & 1, (iIntValue27 & 3) != 2)) {
                    ahf1.m25932d(k0e1.m54977L(R.string.taste_profile_feedback_notes_discard_dialog_keep_editing, xq00Var27), null, null, 0L, null, null, 0, false, null, 0, null, xq00Var27, 0, 0, Entity.AUTOCOMPLETE_FIELD_NUMBER);
                } else {
                    xq00Var27.m91757b0();
                }
                break;
            case 27:
                xq00 xq00Var28 = (xq00) obj;
                int iIntValue28 = ((Number) obj2).intValue();
                if (xq00Var28.m91752Y(iIntValue28 & 1, (iIntValue28 & 3) != 2)) {
                    ahf1.m25932d(k0e1.m54977L(R.string.taste_profile_feedback_notes_discard_dialog_message, xq00Var28), null, null, 0L, null, null, 0, false, null, 0, null, xq00Var28, 0, 0, Entity.AUTOCOMPLETE_FIELD_NUMBER);
                } else {
                    xq00Var28.m91757b0();
                }
                break;
            case 28:
                xq00 xq00Var29 = (xq00) obj;
                int iIntValue29 = ((Number) obj2).intValue();
                if (xq00Var29.m91752Y(iIntValue29 & 1, (iIntValue29 & 3) != 2)) {
                    ahf1.m25932d(k0e1.m54977L(R.string.enhanced_share_card_discard_dialog_title, xq00Var29), null, null, 0L, null, null, 0, false, null, 0, null, xq00Var29, 0, 0, Entity.AUTOCOMPLETE_FIELD_NUMBER);
                } else {
                    xq00Var29.m91757b0();
                }
                break;
            default:
                xq00 xq00Var30 = (xq00) obj;
                int iIntValue30 = ((Number) obj2).intValue();
                if (xq00Var30.m91752Y(iIntValue30 & 1, (iIntValue30 & 3) != 2)) {
                    ahf1.m25932d(k0e1.m54977L(R.string.enhanced_share_card_discard_dialog_message, xq00Var30), null, null, 0L, null, null, 0, false, null, 0, null, xq00Var30, 0, 0, Entity.AUTOCOMPLETE_FIELD_NUMBER);
                } else {
                    xq00Var30.m91757b0();
                }
                break;
        }
        return w2a1.f247311a;
    }
}
