package p204p;

import android.content.Context;
import android.text.Html;
import android.text.Spanned;
import androidx.compose.p002ui.platform.AndroidCompositionLocals_androidKt;
import com.spotify.music.R;
import com.spotify.searchview.proto.Entity;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes8.dex */
public final class ueg extends qe70 implements th00 {

    /* JADX INFO: renamed from: L0 */
    public static final ueg f229503L0;

    /* JADX INFO: renamed from: M0 */
    public static final ueg f229504M0;

    /* JADX INFO: renamed from: N0 */
    public static final ueg f229505N0;

    /* JADX INFO: renamed from: O0 */
    public static final ueg f229506O0;

    /* JADX INFO: renamed from: P0 */
    public static final ueg f229507P0;

    /* JADX INFO: renamed from: Q0 */
    public static final ueg f229508Q0;

    /* JADX INFO: renamed from: R0 */
    public static final ueg f229509R0;

    /* JADX INFO: renamed from: S0 */
    public static final ueg f229510S0;

    /* JADX INFO: renamed from: T0 */
    public static final ueg f229511T0;

    /* JADX INFO: renamed from: U0 */
    public static final ueg f229512U0;

    /* JADX INFO: renamed from: V0 */
    public static final ueg f229513V0;

    /* JADX INFO: renamed from: W0 */
    public static final ueg f229514W0;

    /* JADX INFO: renamed from: X */
    public static final ueg f229515X;

    /* JADX INFO: renamed from: X0 */
    public static final ueg f229516X0;

    /* JADX INFO: renamed from: Y */
    public static final ueg f229517Y;

    /* JADX INFO: renamed from: Y0 */
    public static final ueg f229518Y0;

    /* JADX INFO: renamed from: Z */
    public static final ueg f229519Z;

    /* JADX INFO: renamed from: Z0 */
    public static final ueg f229520Z0;

    /* JADX INFO: renamed from: a1 */
    public static final ueg f229521a1;

    /* JADX INFO: renamed from: b */
    public static final ueg f229522b;

    /* JADX INFO: renamed from: b1 */
    public static final ueg f229523b1;

    /* JADX INFO: renamed from: c */
    public static final ueg f229524c;

    /* JADX INFO: renamed from: c1 */
    public static final ueg f229525c1;

    /* JADX INFO: renamed from: d */
    public static final ueg f229526d;

    /* JADX INFO: renamed from: e */
    public static final ueg f229527e;

    /* JADX INFO: renamed from: f */
    public static final ueg f229528f;

    /* JADX INFO: renamed from: g */
    public static final ueg f229529g;

    /* JADX INFO: renamed from: h */
    public static final ueg f229530h;

    /* JADX INFO: renamed from: i */
    public static final ueg f229531i;

    /* JADX INFO: renamed from: t */
    public static final ueg f229532t;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f229533a;

    static {
        int i = 2;
        f229522b = new ueg(i, 0);
        f229524c = new ueg(i, 1);
        f229526d = new ueg(i, 2);
        f229527e = new ueg(i, 3);
        f229528f = new ueg(i, 4);
        f229529g = new ueg(i, 5);
        f229530h = new ueg(i, 6);
        f229531i = new ueg(i, 7);
        f229532t = new ueg(i, 8);
        f229515X = new ueg(i, 9);
        f229517Y = new ueg(i, 10);
        f229519Z = new ueg(i, 11);
        f229503L0 = new ueg(i, 12);
        f229504M0 = new ueg(i, 13);
        f229505N0 = new ueg(i, 14);
        f229506O0 = new ueg(i, 15);
        f229507P0 = new ueg(i, 16);
        f229508Q0 = new ueg(i, 17);
        f229509R0 = new ueg(i, 18);
        f229510S0 = new ueg(i, 19);
        f229511T0 = new ueg(i, 20);
        f229512U0 = new ueg(i, 21);
        f229513V0 = new ueg(i, 22);
        f229514W0 = new ueg(i, 23);
        f229516X0 = new ueg(i, 24);
        f229518Y0 = new ueg(i, 25);
        f229520Z0 = new ueg(i, 26);
        f229521a1 = new ueg(i, 27);
        f229523b1 = new ueg(i, 28);
        f229525c1 = new ueg(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ueg(int i, int i2) {
        super(i);
        this.f229533a = i2;
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        String string;
        z1d0 z1d0VarM71998b;
        int i = this.f229533a;
        cxh0 cxh0Var = cxh0.f43038a;
        w2a1 w2a1Var = w2a1.f247311a;
        switch (i) {
            case 0:
                xq00 xq00Var = (xq00) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (!xq00Var.m91752Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    xq00Var.m91757b0();
                } else {
                    ahf1.m25932d(k0e1.m54977L(R.string.button_login_with_password, xq00Var), null, null, 0L, null, null, 0, false, null, 0, null, xq00Var, 0, 0, Entity.AUTOCOMPLETE_FIELD_NUMBER);
                }
                break;
            case 1:
                xq00 xq00Var2 = (xq00) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (!xq00Var2.m91752Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    xq00Var2.m91757b0();
                } else {
                    ahf1.m25932d(k0e1.m54977L(R.string.button_resend_sms_alt, xq00Var2), null, null, 0L, null, null, 0, false, null, 0, null, xq00Var2, 0, 0, Entity.AUTOCOMPLETE_FIELD_NUMBER);
                }
                break;
            case 2:
                xq00 xq00Var3 = (xq00) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                if (!xq00Var3.m91752Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    xq00Var3.m91757b0();
                } else {
                    y85.m93057b(kuu.f126680c, qgj.f188480a, mi21.m61834r(16, cxh0Var), 0L, 0L, false, xq00Var3, kuu.f126681d | 48, 56);
                }
                break;
            case 3:
                xq00 xq00Var4 = (xq00) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                if (!xq00Var4.m91752Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    xq00Var4.m91757b0();
                } else {
                    ahf1.m25932d(k0e1.m54977L(R.string.continue_with_password, xq00Var4), mi21.m61822f(1.0f, cxh0Var), null, 0L, new h171(3), null, 0, false, null, 0, null, xq00Var4, 0, 0, 2028);
                }
                break;
            case 4:
                xq00 xq00Var5 = (xq00) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                if (!xq00Var5.m91752Y(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    xq00Var5.m91757b0();
                } else {
                    ahf1.m25932d(k0e1.m54977L(R.string.continue_with_passwordless, xq00Var5), mi21.m61822f(1.0f, cxh0Var), null, 0L, new h171(3), null, 0, false, null, 0, null, xq00Var5, 0, 0, 2028);
                }
                break;
            case 5:
                xq00 xq00Var6 = (xq00) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                if (!xq00Var6.m91752Y(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    xq00Var6.m91757b0();
                } else {
                    gfp gfpVar = leu.f132721a;
                    uba.f228663a.m82724a(null, 36, 4, null, ((hiu) iiu.f102631a.f258040e).f91879j, xq00Var6, 0, 9);
                }
                break;
            case 6:
                xq00 xq00Var7 = (xq00) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                if (!xq00Var7.m91752Y(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    xq00Var7.m91757b0();
                } else {
                    ahf1.m25932d(k0e1.m54977L(R.string.empty_state_browse_button, xq00Var7), null, null, 0L, null, null, 0, false, null, 0, null, xq00Var7, 0, 0, Entity.AUTOCOMPLETE_FIELD_NUMBER);
                }
                break;
            case 7:
                xq00 xq00Var8 = (xq00) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                if (!xq00Var8.m91752Y(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    xq00Var8.m91757b0();
                } else {
                    dgu.m35943g(null, xq00Var8, 0);
                }
                break;
            case 8:
                xq00 xq00Var9 = (xq00) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                if (!xq00Var9.m91752Y(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    xq00Var9.m91757b0();
                } else {
                    vgg1.m85460a(6, 2, " ", xq00Var9, null);
                }
                break;
            case 9:
                xq00 xq00Var10 = (xq00) obj;
                int iIntValue10 = ((Number) obj2).intValue();
                if (!xq00Var10.m91752Y(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    xq00Var10.m91757b0();
                } else {
                    xhu xhuVarM72053h = q350.m72053h(xq00Var10);
                    yhu yhuVar = new yhu(4);
                    j4m0 j4m0Var = q350.m72053h(xq00Var10).f261703a;
                    Object objM91750T = xq00Var10.m91750T();
                    if (objM91750T == t6x0.f217647t) {
                        objM91750T = ktf.f126261R0;
                        xq00Var10.m91793t0(objM91750T);
                    }
                    z520.m95428h(false, (gh00) objM91750T, yhuVar, xhuVarM72053h, null, 0, null, null, null, null, null, null, null, false, j4m0Var, mfg.f143064a, xq00Var10, 54, 199680, 8176);
                }
                break;
            case 10:
                xq00 xq00Var11 = (xq00) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                if (!xq00Var11.m91752Y(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    xq00Var11.m91757b0();
                } else {
                    ahf1.m25932d(k0e1.m54977L(R.string.feedback_input_hint, xq00Var11), null, null, rfg1.m75433c(167, 167, 167, 255), null, null, 0, false, null, 0, null, xq00Var11, 3072, 0, 2038);
                }
                break;
            case 11:
                xq00 xq00Var12 = (xq00) obj;
                int iIntValue12 = ((Number) obj2).intValue();
                if (!xq00Var12.m91752Y(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    xq00Var12.m91757b0();
                } else {
                    ahf1.m25932d(k0e1.m54977L(R.string.submit_feedback, xq00Var12), null, null, 0L, null, null, 0, false, null, 0, null, xq00Var12, 0, 0, Entity.AUTOCOMPLETE_FIELD_NUMBER);
                }
                break;
            case 12:
                xq00 xq00Var13 = (xq00) obj;
                int iIntValue13 = ((Number) obj2).intValue();
                if (!xq00Var13.m91752Y(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    xq00Var13.m91757b0();
                } else {
                    wjg1.m88322a(null, null, false, null, dlm0.f50256a, null, null, null, xq00Var13, 0, 239);
                }
                break;
            case 13:
                xq00 xq00Var14 = (xq00) obj;
                int iIntValue14 = ((Number) obj2).intValue();
                if (!xq00Var14.m91752Y(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    xq00Var14.m91757b0();
                } else {
                    ahf1.m25932d(k0e1.m54977L(R.string.enhanced_share_card_done_button, xq00Var14), null, null, 0L, null, null, 0, false, null, 0, null, xq00Var14, 0, 0, Entity.AUTOCOMPLETE_FIELD_NUMBER);
                }
                break;
            case 14:
                xq00 xq00Var15 = (xq00) obj;
                int iIntValue15 = ((Number) obj2).intValue();
                if (!xq00Var15.m91752Y(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    xq00Var15.m91757b0();
                } else {
                    ahf1.m25932d(k0e1.m54977L(R.string.chat_content_picker_entity_row_add_action, xq00Var15), null, null, leu.m58815a(xq00Var15).f112824b.f138757a, null, null, 0, false, null, 0, null, xq00Var15, 0, 0, 2038);
                }
                break;
            case 15:
                xq00 xq00Var16 = (xq00) obj;
                int iIntValue16 = ((Number) obj2).intValue();
                if (!xq00Var16.m91752Y(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    xq00Var16.m91757b0();
                }
                break;
            case 16:
                xq00 xq00Var17 = (xq00) obj;
                int iIntValue17 = ((Number) obj2).intValue();
                if (!xq00Var17.m91752Y(iIntValue17 & 1, (iIntValue17 & 3) != 2)) {
                    xq00Var17.m91757b0();
                }
                break;
            case 17:
                xq00 xq00Var18 = (xq00) obj;
                int iIntValue18 = ((Number) obj2).intValue();
                if (!xq00Var18.m91752Y(iIntValue18 & 1, (iIntValue18 & 3) != 2)) {
                    xq00Var18.m91757b0();
                } else {
                    y85.m93057b(psu.f180961c, qgj.f188480a, null, 0L, 0L, false, xq00Var18, psu.f180962d | 48, 60);
                }
                break;
            case 18:
                xq00 xq00Var19 = (xq00) obj;
                int iIntValue19 = ((Number) obj2).intValue();
                if (!xq00Var19.m91752Y(iIntValue19 & 1, (iIntValue19 & 3) != 2)) {
                    xq00Var19.m91757b0();
                } else {
                    y85.m93057b(lru.f136360c, qgj.f188480a, null, 0L, 0L, false, xq00Var19, lru.f136361d | 48, 60);
                }
                break;
            case 19:
                xq00 xq00Var20 = (xq00) obj;
                int iIntValue20 = ((Number) obj2).intValue();
                if (!xq00Var20.m91752Y(iIntValue20 & 1, (iIntValue20 & 3) != 2)) {
                    xq00Var20.m91757b0();
                } else {
                    y85.m93057b(jnu.f114200c, new rgj(k0e1.m54977L(R.string.entity_segments_page_back_button_description, xq00Var20)), null, 0L, 0L, false, xq00Var20, jnu.f114201d, 60);
                }
                break;
            case 20:
                xq00 xq00Var21 = (xq00) obj;
                int iIntValue21 = ((Number) obj2).intValue();
                if (!xq00Var21.m91752Y(iIntValue21 & 1, (iIntValue21 & 3) != 2)) {
                    xq00Var21.m91757b0();
                } else {
                    ahf1.m25932d(k0e1.m54977L(R.string.highlight_stats_error_button_text, xq00Var21), null, leu.m58818d(xq00Var21).f64972h, 0L, null, null, 0, false, null, 0, null, xq00Var21, 0, 0, 2042);
                }
                break;
            case 21:
                xq00 xq00Var22 = (xq00) obj;
                int iIntValue22 = ((Number) obj2).intValue();
                if (!xq00Var22.m91752Y(iIntValue22 & 1, (iIntValue22 & 3) != 2)) {
                    xq00Var22.m91757b0();
                } else {
                    y85.m93057b(kuu.f126680c, qgj.f188480a, null, 0L, 0L, false, xq00Var22, kuu.f126681d | 48, 60);
                }
                break;
            case 22:
                xq00 xq00Var23 = (xq00) obj;
                int iIntValue23 = ((Number) obj2).intValue();
                if (!xq00Var23.m91752Y(iIntValue23 & 1, (iIntValue23 & 3) != 2)) {
                    xq00Var23.m91757b0();
                } else {
                    ahf1.m25932d(k0e1.m54977L(R.string.campfire_error_dialog_opt_out_title, xq00Var23), null, null, 0L, null, null, 0, false, null, 0, null, xq00Var23, 0, 0, Entity.AUTOCOMPLETE_FIELD_NUMBER);
                }
                break;
            case 23:
                xq00 xq00Var24 = (xq00) obj;
                int iIntValue24 = ((Number) obj2).intValue();
                if (!xq00Var24.m91752Y(iIntValue24 & 1, (iIntValue24 & 3) != 2)) {
                    xq00Var24.m91757b0();
                } else {
                    ahf1.m25932d(k0e1.m54977L(R.string.campfire_error_dialog_cta_go_to_settings, xq00Var24), null, null, 0L, null, null, 0, false, null, 0, null, xq00Var24, 0, 0, Entity.AUTOCOMPLETE_FIELD_NUMBER);
                }
                break;
            case 24:
                xq00 xq00Var25 = (xq00) obj;
                int iIntValue25 = ((Number) obj2).intValue();
                if (!xq00Var25.m91752Y(iIntValue25 & 1, (iIntValue25 & 3) != 2)) {
                    xq00Var25.m91757b0();
                } else {
                    ahf1.m25932d(k0e1.m54977L(R.string.campfire_error_dialog_cta_cancel, xq00Var25), null, null, 0L, null, null, 0, false, null, 0, null, xq00Var25, 0, 0, Entity.AUTOCOMPLETE_FIELD_NUMBER);
                }
                break;
            case 25:
                xq00 xq00Var26 = (xq00) obj;
                int iIntValue26 = ((Number) obj2).intValue();
                if (!xq00Var26.m91752Y(iIntValue26 & 1, (iIntValue26 & 3) != 2)) {
                    xq00Var26.m91757b0();
                } else {
                    CharSequence text = ((Context) xq00Var26.m91774k(AndroidCompositionLocals_androidKt.f502b)).getResources().getText(R.string.campfire_error_dialog_opt_out_message);
                    if (text instanceof Spanned) {
                        string = Html.toHtml((Spanned) text, 0);
                        r2d0 r2d0VarM85464e = vgg1.m85464e(Pattern.compile("<p dir=\"(?:ltr|rtl)\">(.*?)</p>").matcher(string), 0, string);
                        if (r2d0VarM85464e != null && (z1d0VarM71998b = r2d0VarM85464e.f195129c.m71998b(1)) != null) {
                            string = z1d0VarM71998b.f278290a;
                        }
                    } else {
                        string = text.toString();
                    }
                    ahf1.m25933e(m3l.m60712s(string, new gzz(leu.m58818d(xq00Var26).f64975k.f101704a.f63415f, null)), null, null, 0L, null, null, 0, false, null, 0, null, null, xq00Var26, 0, 0, 4094);
                }
                break;
            case 26:
                xq00 xq00Var27 = (xq00) obj;
                int iIntValue27 = ((Number) obj2).intValue();
                if (!xq00Var27.m91752Y(iIntValue27 & 1, (iIntValue27 & 3) != 2)) {
                    xq00Var27.m91757b0();
                } else {
                    ahf1.m25932d(k0e1.m54977L(R.string.media_trimmer_error_title, xq00Var27), null, null, 0L, null, null, 0, false, null, 0, null, xq00Var27, 0, 0, Entity.AUTOCOMPLETE_FIELD_NUMBER);
                }
                break;
            case 27:
                xq00 xq00Var28 = (xq00) obj;
                int iIntValue28 = ((Number) obj2).intValue();
                if (!xq00Var28.m91752Y(iIntValue28 & 1, (iIntValue28 & 3) != 2)) {
                    xq00Var28.m91757b0();
                } else {
                    ahf1.m25932d(k0e1.m54977L(R.string.media_trimmer_error_subtitle, xq00Var28), null, null, 0L, null, null, 0, false, null, 0, null, xq00Var28, 0, 0, Entity.AUTOCOMPLETE_FIELD_NUMBER);
                }
                break;
            case 28:
                xq00 xq00Var29 = (xq00) obj;
                int iIntValue29 = ((Number) obj2).intValue();
                if (!xq00Var29.m91752Y(iIntValue29 & 1, (iIntValue29 & 3) != 2)) {
                    xq00Var29.m91757b0();
                } else {
                    ahf1.m25932d(k0e1.m54977L(R.string.promptable_section_error_retry, xq00Var29), null, leu.m58818d(xq00Var29).f64975k, 0L, null, null, 0, false, null, 0, null, xq00Var29, 0, 0, 2042);
                }
                break;
            default:
                xq00 xq00Var30 = (xq00) obj;
                int iIntValue30 = ((Number) obj2).intValue();
                if (!xq00Var30.m91752Y(iIntValue30 & 1, (iIntValue30 & 3) != 2)) {
                    xq00Var30.m91757b0();
                } else {
                    y85.m93057b(kuu.f126680c, qgj.f188480a, null, 0L, 0L, false, xq00Var30, kuu.f126681d | 48, 60);
                }
                break;
        }
        return w2a1Var;
    }
}
