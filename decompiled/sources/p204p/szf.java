package p204p;

import com.spotify.music.R;
import com.spotify.searchview.proto.Entity;

/* JADX INFO: loaded from: classes7.dex */
public final class szf extends qe70 implements th00 {

    /* JADX INFO: renamed from: L0 */
    public static final szf f215556L0;

    /* JADX INFO: renamed from: M0 */
    public static final szf f215557M0;

    /* JADX INFO: renamed from: N0 */
    public static final szf f215558N0;

    /* JADX INFO: renamed from: O0 */
    public static final szf f215559O0;

    /* JADX INFO: renamed from: P0 */
    public static final szf f215560P0;

    /* JADX INFO: renamed from: Q0 */
    public static final szf f215561Q0;

    /* JADX INFO: renamed from: R0 */
    public static final szf f215562R0;

    /* JADX INFO: renamed from: S0 */
    public static final szf f215563S0;

    /* JADX INFO: renamed from: T0 */
    public static final szf f215564T0;

    /* JADX INFO: renamed from: U0 */
    public static final szf f215565U0;

    /* JADX INFO: renamed from: V0 */
    public static final szf f215566V0;

    /* JADX INFO: renamed from: W0 */
    public static final szf f215567W0;

    /* JADX INFO: renamed from: X */
    public static final szf f215568X;

    /* JADX INFO: renamed from: X0 */
    public static final szf f215569X0;

    /* JADX INFO: renamed from: Y */
    public static final szf f215570Y;

    /* JADX INFO: renamed from: Y0 */
    public static final szf f215571Y0;

    /* JADX INFO: renamed from: Z */
    public static final szf f215572Z;

    /* JADX INFO: renamed from: Z0 */
    public static final szf f215573Z0;

    /* JADX INFO: renamed from: a1 */
    public static final szf f215574a1;

    /* JADX INFO: renamed from: b */
    public static final szf f215575b;

    /* JADX INFO: renamed from: b1 */
    public static final szf f215576b1;

    /* JADX INFO: renamed from: c */
    public static final szf f215577c;

    /* JADX INFO: renamed from: c1 */
    public static final szf f215578c1;

    /* JADX INFO: renamed from: d */
    public static final szf f215579d;

    /* JADX INFO: renamed from: e */
    public static final szf f215580e;

    /* JADX INFO: renamed from: f */
    public static final szf f215581f;

    /* JADX INFO: renamed from: g */
    public static final szf f215582g;

    /* JADX INFO: renamed from: h */
    public static final szf f215583h;

    /* JADX INFO: renamed from: i */
    public static final szf f215584i;

    /* JADX INFO: renamed from: t */
    public static final szf f215585t;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f215586a;

    static {
        int i = 2;
        f215575b = new szf(i, 0);
        f215577c = new szf(i, 1);
        f215579d = new szf(i, 2);
        f215580e = new szf(i, 3);
        f215581f = new szf(i, 4);
        f215582g = new szf(i, 5);
        f215583h = new szf(i, 6);
        f215584i = new szf(i, 7);
        f215585t = new szf(i, 8);
        f215568X = new szf(i, 9);
        f215570Y = new szf(i, 10);
        f215572Z = new szf(i, 11);
        f215556L0 = new szf(i, 12);
        f215557M0 = new szf(i, 13);
        f215558N0 = new szf(i, 14);
        f215559O0 = new szf(i, 15);
        f215560P0 = new szf(i, 16);
        f215561Q0 = new szf(i, 17);
        f215562R0 = new szf(i, 18);
        f215563S0 = new szf(i, 19);
        f215564T0 = new szf(i, 20);
        f215565U0 = new szf(i, 21);
        f215566V0 = new szf(i, 22);
        f215567W0 = new szf(i, 23);
        f215569X0 = new szf(i, 24);
        f215571Y0 = new szf(i, 25);
        f215573Z0 = new szf(i, 26);
        f215574a1 = new szf(i, 27);
        f215576b1 = new szf(i, 28);
        f215578c1 = new szf(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ szf(int i, int i2) {
        super(i);
        this.f215586a = i2;
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f215586a;
        w2a1 w2a1Var = w2a1.f247311a;
        switch (i) {
            case 0:
                xq00 xq00Var = (xq00) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (!xq00Var.m91752Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    xq00Var.m91757b0();
                } else {
                    ahf1.m25932d(k0e1.m54977L(R.string.add_child_account_nudge_cancel_button, xq00Var), null, null, 0L, null, null, 0, false, null, 0, null, xq00Var, 0, 0, Entity.AUTOCOMPLETE_FIELD_NUMBER);
                }
                break;
            case 1:
                xq00 xq00Var2 = (xq00) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (!xq00Var2.m91752Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    xq00Var2.m91757b0();
                } else {
                    ahf1.m25932d(k0e1.m54977L(R.string.add_child_plan_member_error_action_cancel, xq00Var2), null, null, 0L, null, null, 0, false, null, 0, null, xq00Var2, 0, 0, Entity.AUTOCOMPLETE_FIELD_NUMBER);
                }
                break;
            case 2:
                xq00 xq00Var3 = (xq00) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                if (!xq00Var3.m91752Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    xq00Var3.m91757b0();
                } else {
                    ahf1.m25932d(k0e1.m54977L(R.string.add_child_plan_member_error_title, xq00Var3), null, leu.m58818d(xq00Var3).f64969e, 0L, null, null, 0, false, null, 0, null, xq00Var3, 0, 0, 2042);
                }
                break;
            case 3:
                xq00 xq00Var4 = (xq00) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                if (!xq00Var4.m91752Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    xq00Var4.m91757b0();
                } else {
                    ahf1.m25932d(k0e1.m54977L(R.string.add_child_plan_member_action_cancel, xq00Var4), null, null, 0L, null, null, 0, false, null, 0, null, xq00Var4, 0, 0, Entity.AUTOCOMPLETE_FIELD_NUMBER);
                }
                break;
            case 4:
                xq00 xq00Var5 = (xq00) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                if (!xq00Var5.m91752Y(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    xq00Var5.m91757b0();
                } else {
                    ahf1.m25932d(k0e1.m54977L(R.string.add_child_plan_member_error_action_retry, xq00Var5), null, null, 0L, null, null, 0, false, null, 0, null, xq00Var5, 0, 0, Entity.AUTOCOMPLETE_FIELD_NUMBER);
                }
                break;
            case 5:
                xq00 xq00Var6 = (xq00) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                if (!xq00Var6.m91752Y(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    xq00Var6.m91757b0();
                } else {
                    ahf1.m25932d(k0e1.m54977L(R.string.add_child_plan_member_error_body, xq00Var6), null, leu.m58818d(xq00Var6).f64974j, 0L, null, null, 0, false, null, 0, null, xq00Var6, 0, 0, 2042);
                }
                break;
            case 6:
                xq00 xq00Var7 = (xq00) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                if (!xq00Var7.m91752Y(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    xq00Var7.m91757b0();
                } else {
                    ahf1.m25932d(k0e1.m54977L(R.string.add_child_plan_member_action_add, xq00Var7), null, null, 0L, null, null, 0, false, null, 0, null, xq00Var7, 0, 0, Entity.AUTOCOMPLETE_FIELD_NUMBER);
                }
                break;
            case 7:
                xq00 xq00Var8 = (xq00) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                if (!xq00Var8.m91752Y(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    xq00Var8.m91757b0();
                }
                break;
            case 8:
                xq00 xq00Var9 = (xq00) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                if (!xq00Var9.m91752Y(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    xq00Var9.m91757b0();
                } else {
                    pp91.m70523d(k0e1.m54977L(R.string.chat_share_add_to_group_title, xq00Var9), null, 0L, 0L, null, null, xq00Var9, 0, 126);
                }
                break;
            case 9:
                xq00 xq00Var10 = (xq00) obj;
                int iIntValue10 = ((Number) obj2).intValue();
                if (!xq00Var10.m91752Y(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    xq00Var10.m91757b0();
                } else {
                    ahf1.m25932d(k0e1.m54977L(R.string.chat_share_add_to_group_action, xq00Var10), null, null, 0L, null, null, 0, false, null, 0, null, xq00Var10, 0, 0, Entity.AUTOCOMPLETE_FIELD_NUMBER);
                }
                break;
            case 10:
                xq00 xq00Var11 = (xq00) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                if (!xq00Var11.m91752Y(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    xq00Var11.m91757b0();
                } else {
                    ahf1.m25932d(k0e1.m54977L(R.string.add_button, xq00Var11), null, null, 0L, null, null, 0, false, null, 0, null, xq00Var11, 0, 0, Entity.AUTOCOMPLETE_FIELD_NUMBER);
                }
                break;
            case 11:
                xq00 xq00Var12 = (xq00) obj;
                int iIntValue12 = ((Number) obj2).intValue();
                if (!xq00Var12.m91752Y(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    xq00Var12.m91757b0();
                } else {
                    ahf1.m25932d(k0e1.m54977L(R.string.cancel_button, xq00Var12), null, null, 0L, null, null, 0, false, null, 0, null, xq00Var12, 0, 0, Entity.AUTOCOMPLETE_FIELD_NUMBER);
                }
                break;
            case 12:
                xq00 xq00Var13 = (xq00) obj;
                int iIntValue13 = ((Number) obj2).intValue();
                if (!xq00Var13.m91752Y(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    xq00Var13.m91757b0();
                } else {
                    ahf1.m25932d(k0e1.m54977L(R.string.add_to_playlist_button_done, xq00Var13), null, leu.m58818d(xq00Var13).f64975k, 0L, null, null, 0, false, null, 0, null, xq00Var13, 0, 0, 2042);
                }
                break;
            case 13:
                xq00 xq00Var14 = (xq00) obj;
                int iIntValue14 = ((Number) obj2).intValue();
                if (!xq00Var14.m91752Y(1 & iIntValue14, (iIntValue14 & 3) != 2)) {
                    xq00Var14.m91757b0();
                } else {
                    iyg1.m51921h(0, xq00Var14);
                }
                break;
            case 14:
                xq00 xq00Var15 = (xq00) obj;
                int iIntValue15 = ((Number) obj2).intValue();
                if (!xq00Var15.m91752Y(1 & iIntValue15, (iIntValue15 & 3) != 2)) {
                    xq00Var15.m91757b0();
                } else {
                    iyg1.m51921h(0, xq00Var15);
                }
                break;
            case 15:
                xq00 xq00Var16 = (xq00) obj;
                int iIntValue16 = ((Number) obj2).intValue();
                if (!xq00Var16.m91752Y(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    xq00Var16.m91757b0();
                } else {
                    ahf1.m25932d(k0e1.m54977L(R.string.add_to_playlist_sorting_label, xq00Var16), null, leu.m58818d(xq00Var16).f64975k, 0L, null, null, 0, false, null, 0, null, xq00Var16, 0, 0, 2042);
                }
                break;
            case 16:
                xq00 xq00Var17 = (xq00) obj;
                int iIntValue17 = ((Number) obj2).intValue();
                if (!xq00Var17.m91752Y(iIntValue17 & 1, (iIntValue17 & 3) != 2)) {
                    xq00Var17.m91757b0();
                } else {
                    ahf1.m25932d(k0e1.m54977L(R.string.add_to_playlist_new_playlist_button_text, xq00Var17), null, leu.m58818d(xq00Var17).f64978n, leu.m58815a(xq00Var17).f112824b.f138759c, null, null, 0, false, null, 0, null, xq00Var17, 0, 0, 2034);
                }
                break;
            case 17:
                xq00 xq00Var18 = (xq00) obj;
                int iIntValue18 = ((Number) obj2).intValue();
                if (!xq00Var18.m91752Y(iIntValue18 & 1, (iIntValue18 & 3) != 2)) {
                    xq00Var18.m91757b0();
                } else {
                    y85.m93057b(jnu.f114200c, new rgj(k0e1.m54977L(R.string.add_to_playlist_back_button_content_description, xq00Var18)), null, 0L, 0L, false, xq00Var18, jnu.f114201d, 60);
                }
                break;
            case 18:
                xq00 xq00Var19 = (xq00) obj;
                int iIntValue19 = ((Number) obj2).intValue();
                if (!xq00Var19.m91752Y(iIntValue19 & 1, (iIntValue19 & 3) != 2)) {
                    xq00Var19.m91757b0();
                } else {
                    cqu cquVar = cqu.f40993c;
                    gfp gfpVar = leu.f132721a;
                    y85.m93057b(cquVar, qgj.f188480a, null, ((diu) iiu.f102631a.f258037b).f49484i, 0L, false, xq00Var19, cqu.f40994d | 48, 52);
                }
                break;
            case 19:
                xq00 xq00Var20 = (xq00) obj;
                int iIntValue20 = ((Number) obj2).intValue();
                if (!xq00Var20.m91752Y(iIntValue20 & 1, (iIntValue20 & 3) != 2)) {
                    xq00Var20.m91757b0();
                } else {
                    ahf1.m25932d(k0e1.m54977L(R.string.dsa_error_action, xq00Var20), null, leu.m58818d(xq00Var20).f64972h, 0L, null, null, 0, false, null, 0, null, xq00Var20, 0, 0, 2042);
                }
                break;
            case 20:
                xq00 xq00Var21 = (xq00) obj;
                int iIntValue21 = ((Number) obj2).intValue();
                if (!xq00Var21.m91752Y(1 & iIntValue21, (iIntValue21 & 3) != 2)) {
                    xq00Var21.m91757b0();
                } else {
                    s22.m77001a(0, leu.m58815a(xq00Var21).f112824b.f138757a, xq00Var21, null);
                }
                break;
            case 21:
                xq00 xq00Var22 = (xq00) obj;
                int iIntValue22 = ((Number) obj2).intValue();
                if (!xq00Var22.m91752Y(iIntValue22 & 1, (iIntValue22 & 3) != 2)) {
                    xq00Var22.m91757b0();
                } else {
                    ahf1.m25932d(k0e1.m54977L(R.string.age_assurance_intro_cta_not_now, xq00Var22), null, null, 0L, null, null, 0, false, null, 0, null, xq00Var22, 0, 0, Entity.AUTOCOMPLETE_FIELD_NUMBER);
                }
                break;
            case 22:
                xq00 xq00Var23 = (xq00) obj;
                int iIntValue23 = ((Number) obj2).intValue();
                if (!xq00Var23.m91752Y(iIntValue23 & 1, (iIntValue23 & 3) != 2)) {
                    xq00Var23.m91757b0();
                } else {
                    y85.m93057b(cqu.f40993c, qgj.f188480a, null, 0L, 0L, false, xq00Var23, cqu.f40994d | 48, 60);
                }
                break;
            case 23:
                xq00 xq00Var24 = (xq00) obj;
                int iIntValue24 = ((Number) obj2).intValue();
                if (!xq00Var24.m91752Y(iIntValue24 & 1, (iIntValue24 & 3) != 2)) {
                    xq00Var24.m91757b0();
                } else {
                    fyf fyfVar = v0g.f235989a;
                    float f = y481.f269099a;
                    long j = n6f.f150870j;
                    gfp gfpVar2 = leu.f132721a;
                    w45.m87125a(fyfVar, null, null, null, 0.0f, null, y481.m92798f(j, ((fiu) ((u7q) iiu.f102631a.f258038c).f227741b).f69988v, leu.m58815a(xq00Var24).f112824b.f138757a, leu.m58815a(xq00Var24).f112824b.f138757a, leu.m58815a(xq00Var24).f112824b.f138757a, xq00Var24, 32), xq00Var24, 6, 190);
                }
                break;
            case 24:
                xq00 xq00Var25 = (xq00) obj;
                int iIntValue25 = ((Number) obj2).intValue();
                if (!xq00Var25.m91752Y(iIntValue25 & 1, (iIntValue25 & 3) != 2)) {
                    xq00Var25.m91757b0();
                } else {
                    ahf1.m25932d(k0e1.m54977L(R.string.age_assurance_parental_consent_toolbar_title, xq00Var25), null, leu.m58818d(xq00Var25).f64972h, 0L, null, null, 0, false, null, 0, null, xq00Var25, 0, 0, 2042);
                }
                break;
            case 25:
                xq00 xq00Var26 = (xq00) obj;
                int iIntValue26 = ((Number) obj2).intValue();
                if (!xq00Var26.m91752Y(iIntValue26 & 1, (iIntValue26 & 3) != 2)) {
                    xq00Var26.m91757b0();
                } else {
                    ahf1.m25932d(k0e1.m54977L(R.string.age_assurance_underage_blocking_cta_confirm_age, xq00Var26), null, null, 0L, null, null, 0, false, null, 0, null, xq00Var26, 0, 0, Entity.AUTOCOMPLETE_FIELD_NUMBER);
                }
                break;
            case 26:
                xq00 xq00Var27 = (xq00) obj;
                int iIntValue27 = ((Number) obj2).intValue();
                if (!xq00Var27.m91752Y(iIntValue27 & 1, (iIntValue27 & 3) != 2)) {
                    xq00Var27.m91757b0();
                } else {
                    ahf1.m25932d(k0e1.m54977L(R.string.age_assurance_underage_blocking_cta_get_parental_consent, xq00Var27), null, null, 0L, null, null, 0, false, null, 0, null, xq00Var27, 0, 0, Entity.AUTOCOMPLETE_FIELD_NUMBER);
                }
                break;
            case 27:
                xq00 xq00Var28 = (xq00) obj;
                int iIntValue28 = ((Number) obj2).intValue();
                if (!xq00Var28.m91752Y(iIntValue28 & 1, (iIntValue28 & 3) != 2)) {
                    xq00Var28.m91757b0();
                } else {
                    ahf1.m25932d(k0e1.m54977L(R.string.age_assurance_underage_blocking_cta_log_out, xq00Var28), null, null, 0L, null, null, 0, false, null, 0, null, xq00Var28, 0, 0, Entity.AUTOCOMPLETE_FIELD_NUMBER);
                }
                break;
            case 28:
                xq00 xq00Var29 = (xq00) obj;
                int iIntValue29 = ((Number) obj2).intValue();
                if (!xq00Var29.m91752Y(iIntValue29 & 1, (iIntValue29 & 3) != 2)) {
                    xq00Var29.m91757b0();
                } else {
                    ahf1.m25932d(k0e1.m54977L(R.string.signup_action_next, xq00Var29), null, null, 0L, null, null, 0, false, null, 0, null, xq00Var29, 0, 0, Entity.AUTOCOMPLETE_FIELD_NUMBER);
                }
                break;
            default:
                xq00 xq00Var30 = (xq00) obj;
                int iIntValue30 = ((Number) obj2).intValue();
                if (!xq00Var30.m91752Y(iIntValue30 & 1, (iIntValue30 & 3) != 2)) {
                    xq00Var30.m91757b0();
                } else {
                    ahf1.m25932d(k0e1.m54977L(R.string.age_verification_ineligible_close_button, xq00Var30), null, leu.m58818d(xq00Var30).f64972h, 0L, null, null, 0, false, null, 0, null, xq00Var30, 0, 0, 2042);
                }
                break;
        }
        return w2a1Var;
    }
}
