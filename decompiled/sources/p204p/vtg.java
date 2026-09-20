package p204p;

import com.spotify.music.R;
import com.spotify.searchview.proto.Entity;

/* JADX INFO: loaded from: classes9.dex */
public final class vtg extends qe70 implements th00 {

    /* JADX INFO: renamed from: L0 */
    public static final vtg f244640L0;

    /* JADX INFO: renamed from: M0 */
    public static final vtg f244641M0;

    /* JADX INFO: renamed from: N0 */
    public static final vtg f244642N0;

    /* JADX INFO: renamed from: O0 */
    public static final vtg f244643O0;

    /* JADX INFO: renamed from: P0 */
    public static final vtg f244644P0;

    /* JADX INFO: renamed from: Q0 */
    public static final vtg f244645Q0;

    /* JADX INFO: renamed from: R0 */
    public static final vtg f244646R0;

    /* JADX INFO: renamed from: S0 */
    public static final vtg f244647S0;

    /* JADX INFO: renamed from: T0 */
    public static final vtg f244648T0;

    /* JADX INFO: renamed from: U0 */
    public static final vtg f244649U0;

    /* JADX INFO: renamed from: V0 */
    public static final vtg f244650V0;

    /* JADX INFO: renamed from: W0 */
    public static final vtg f244651W0;

    /* JADX INFO: renamed from: X */
    public static final vtg f244652X;

    /* JADX INFO: renamed from: X0 */
    public static final vtg f244653X0;

    /* JADX INFO: renamed from: Y */
    public static final vtg f244654Y;

    /* JADX INFO: renamed from: Y0 */
    public static final vtg f244655Y0;

    /* JADX INFO: renamed from: Z */
    public static final vtg f244656Z;

    /* JADX INFO: renamed from: Z0 */
    public static final vtg f244657Z0;

    /* JADX INFO: renamed from: a1 */
    public static final vtg f244658a1;

    /* JADX INFO: renamed from: b */
    public static final vtg f244659b;

    /* JADX INFO: renamed from: b1 */
    public static final vtg f244660b1;

    /* JADX INFO: renamed from: c */
    public static final vtg f244661c;

    /* JADX INFO: renamed from: c1 */
    public static final vtg f244662c1;

    /* JADX INFO: renamed from: d */
    public static final vtg f244663d;

    /* JADX INFO: renamed from: e */
    public static final vtg f244664e;

    /* JADX INFO: renamed from: f */
    public static final vtg f244665f;

    /* JADX INFO: renamed from: g */
    public static final vtg f244666g;

    /* JADX INFO: renamed from: h */
    public static final vtg f244667h;

    /* JADX INFO: renamed from: i */
    public static final vtg f244668i;

    /* JADX INFO: renamed from: t */
    public static final vtg f244669t;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f244670a;

    static {
        int i = 2;
        f244659b = new vtg(i, 0);
        f244661c = new vtg(i, 1);
        f244663d = new vtg(i, 2);
        f244664e = new vtg(i, 3);
        f244665f = new vtg(i, 4);
        f244666g = new vtg(i, 5);
        f244667h = new vtg(i, 6);
        f244668i = new vtg(i, 7);
        f244669t = new vtg(i, 8);
        f244652X = new vtg(i, 9);
        f244654Y = new vtg(i, 10);
        f244656Z = new vtg(i, 11);
        f244640L0 = new vtg(i, 12);
        f244641M0 = new vtg(i, 13);
        f244642N0 = new vtg(i, 14);
        f244643O0 = new vtg(i, 15);
        f244644P0 = new vtg(i, 16);
        f244645Q0 = new vtg(i, 17);
        f244646R0 = new vtg(i, 18);
        f244647S0 = new vtg(i, 19);
        f244648T0 = new vtg(i, 20);
        f244649U0 = new vtg(i, 21);
        f244650V0 = new vtg(i, 22);
        f244651W0 = new vtg(i, 23);
        f244653X0 = new vtg(i, 24);
        f244655Y0 = new vtg(i, 25);
        f244657Z0 = new vtg(i, 26);
        f244658a1 = new vtg(i, 27);
        f244660b1 = new vtg(i, 28);
        f244662c1 = new vtg(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vtg(int i, int i2) {
        super(i);
        this.f244670a = i2;
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f244670a) {
            case 0:
                xq00 xq00Var = (xq00) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (xq00Var.m91752Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ahf1.m25932d(k0e1.m54977L(R.string.mixing_messaging_reorder_need_more_tracks_dialog_title, xq00Var), null, null, 0L, null, null, 0, false, null, 0, null, xq00Var, 0, 0, Entity.AUTOCOMPLETE_FIELD_NUMBER);
                } else {
                    xq00Var.m91757b0();
                }
                return w2a1.f247311a;
            case 1:
                xq00 xq00Var2 = (xq00) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (xq00Var2.m91752Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ahf1.m25932d(k0e1.m54977L(R.string.mixing_messaging_reorder_not_needed_dialog_title, xq00Var2), null, null, 0L, null, null, 0, false, null, 0, null, xq00Var2, 0, 0, Entity.AUTOCOMPLETE_FIELD_NUMBER);
                } else {
                    xq00Var2.m91757b0();
                }
                return w2a1.f247311a;
            case 2:
                xq00 xq00Var3 = (xq00) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                if (xq00Var3.m91752Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    ahf1.m25932d(k0e1.m54977L(R.string.mixing_messaging_reorder_not_needed_dialog_close_button, xq00Var3), null, leu.m58818d(xq00Var3).f64972h, 0L, null, null, 0, false, null, 0, null, xq00Var3, 0, 0, 2042);
                } else {
                    xq00Var3.m91757b0();
                }
                return w2a1.f247311a;
            case 3:
                xq00 xq00Var4 = (xq00) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                if (xq00Var4.m91752Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    ahf1.m25932d(k0e1.m54977L(R.string.mixing_messaging_reorder_not_needed_dialog_body, xq00Var4), null, null, 0L, null, null, 0, false, null, 0, null, xq00Var4, 0, 0, Entity.AUTOCOMPLETE_FIELD_NUMBER);
                } else {
                    xq00Var4.m91757b0();
                }
                return w2a1.f247311a;
            case 4:
                xq00 xq00Var5 = (xq00) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                if (xq00Var5.m91752Y(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    ahf1.m25932d(k0e1.m54977L(R.string.mixing_messaging_reorder_override_warning_dialog_body, xq00Var5), null, null, 0L, null, null, 0, false, null, 0, null, xq00Var5, 0, 0, Entity.AUTOCOMPLETE_FIELD_NUMBER);
                } else {
                    xq00Var5.m91757b0();
                }
                return w2a1.f247311a;
            case 5:
                xq00 xq00Var6 = (xq00) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                if (xq00Var6.m91752Y(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    ahf1.m25932d(k0e1.m54977L(R.string.mixing_messaging_reorder_override_warning_dialog_primary_button, xq00Var6), null, leu.m58818d(xq00Var6).f64972h, 0L, null, null, 0, false, null, 0, null, xq00Var6, 0, 0, 2042);
                } else {
                    xq00Var6.m91757b0();
                }
                return w2a1.f247311a;
            case 6:
                xq00 xq00Var7 = (xq00) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                if (xq00Var7.m91752Y(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    ahf1.m25932d(k0e1.m54977L(R.string.mixing_messaging_reorder_override_warning_dialog_title, xq00Var7), null, null, 0L, null, null, 0, false, null, 0, null, xq00Var7, 0, 0, Entity.AUTOCOMPLETE_FIELD_NUMBER);
                } else {
                    xq00Var7.m91757b0();
                }
                return w2a1.f247311a;
            case 7:
                xq00 xq00Var8 = (xq00) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                if (xq00Var8.m91752Y(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    uuf1.m83987g(0, 1, xq00Var8, null);
                } else {
                    xq00Var8.m91757b0();
                }
                return w2a1.f247311a;
            case 8:
                xq00 xq00Var9 = (xq00) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                if (xq00Var9.m91752Y(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    y0v.m92603a(0, aug.f19930a, xq00Var9, 384, 3);
                } else {
                    xq00Var9.m91757b0();
                }
                return w2a1.f247311a;
            case 9:
                xq00 xq00Var10 = (xq00) obj;
                int iIntValue10 = ((Number) obj2).intValue();
                if (xq00Var10.m91752Y(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    ahf1.m25932d(k0e1.m54977L(R.string.mixing_edit_page_customize_button, xq00Var10), null, leu.m58818d(xq00Var10).f64975k, leu.m58815a(xq00Var10).f112824b.f138759c, null, null, 0, false, null, 0, null, xq00Var10, 0, 0, 2034);
                } else {
                    xq00Var10.m91757b0();
                }
                return w2a1.f247311a;
            case 10:
                xq00 xq00Var11 = (xq00) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                if (xq00Var11.m91752Y(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    ahf1.m25932d(k0e1.m54977L(R.string.mixing_edit_page_customize_button, xq00Var11), null, leu.m58818d(xq00Var11).f64974j, 0L, null, null, 0, false, new ol80(1), 0, new qx7(leu.m58818d(xq00Var11).f64979o.f101704a.f63411b, leu.m58818d(xq00Var11).f64974j.f101704a.f63411b, epv0.m39702v(1), null, 8), xq00Var11, 0, 8, 762);
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
                if (xq00Var13.m91752Y(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    fxh0 fxh0VarM64246i = nec.m64246i(mi21.m61820d(1.0f, cxh0.f43038a), n6f.m63765b(leu.m58815a(xq00Var13).f112823a.f229876c, 0.5f, 0.0f, 0.0f, 0.0f, 14), kxf1.f127485a);
                    m6d0 m6d0VarM36007d = dha.m36007d(d7f0.f46174i, false);
                    int iHashCode = Long.hashCode(xq00Var13.f264809T);
                    wpn0 wpn0VarM91778m = xq00Var13.m91778m();
                    fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var13, fxh0VarM64246i);
                    soh.f211194A.getClass();
                    C2087le c2087le = roh.f201257b;
                    if (xq00Var13.f264811a == null) {
                        pmg1.m70360s();
                        throw null;
                    }
                    xq00Var13.m91779m0();
                    if (xq00Var13.f264808S) {
                        xq00Var13.m91776l(c2087le);
                    } else {
                        xq00Var13.m91799w0();
                    }
                    zsf1.m96835F(m6d0VarM36007d, roh.f201262g, xq00Var13);
                    zsf1.m96835F(wpn0VarM91778m, roh.f201261f, xq00Var13);
                    zsf1.m96835F(Integer.valueOf(iHashCode), roh.f201265j, xq00Var13);
                    zsf1.m96833D(roh.f201266k, xq00Var13);
                    zsf1.m96835F(fxh0VarM48286s, roh.f201259d, xq00Var13);
                    p271.m68899b(null, 5, 0L, 0L, xq00Var13, 48, 13);
                    xq00Var13.m91788r(true);
                } else {
                    xq00Var13.m91757b0();
                }
                return w2a1.f247311a;
            case 13:
                xq00 xq00Var14 = (xq00) obj;
                int iIntValue14 = ((Number) obj2).intValue();
                if (!xq00Var14.m91752Y(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    xq00Var14.m91757b0();
                }
                return w2a1.f247311a;
            case 14:
                xq00 xq00Var15 = (xq00) obj;
                int iIntValue15 = ((Number) obj2).intValue();
                if (xq00Var15.m91752Y(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    y85.m93057b(vuu.f245077c, qgj.f188480a, null, 0L, 0L, false, xq00Var15, vuu.f245078d | 48, 60);
                } else {
                    xq00Var15.m91757b0();
                }
                return w2a1.f247311a;
            case 15:
                xq00 xq00Var16 = (xq00) obj;
                int iIntValue16 = ((Number) obj2).intValue();
                if (xq00Var16.m91752Y(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    ahf1.m25932d(k0e1.m54977L(R.string.mixing_extended_versions_page_close_button, xq00Var16), null, leu.m58818d(xq00Var16).f64975k, 0L, null, null, 0, false, new ol80(1), 0, new qx7(leu.m58818d(xq00Var16).f64980p.f101704a.f63411b, leu.m58818d(xq00Var16).f64975k.f101704a.f63411b, epv0.m39702v(1), null, 8), xq00Var16, 0, 8, 762);
                } else {
                    xq00Var16.m91757b0();
                }
                return w2a1.f247311a;
            case 16:
                xq00 xq00Var17 = (xq00) obj;
                int iIntValue17 = ((Number) obj2).intValue();
                if (xq00Var17.m91752Y(iIntValue17 & 1, (iIntValue17 & 3) != 2)) {
                    exb.m40205c(0, xq00Var17);
                } else {
                    xq00Var17.m91757b0();
                }
                return w2a1.f247311a;
            case 17:
                xq00 xq00Var18 = (xq00) obj;
                int iIntValue18 = ((Number) obj2).intValue();
                if (xq00Var18.m91752Y(iIntValue18 & 1, (iIntValue18 & 3) != 2)) {
                    ahf1.m25932d(k0e1.m54977L(R.string.mixing_extended_versions_page_add_button, xq00Var18), null, leu.m58818d(xq00Var18).f64978n, 0L, null, null, 0, false, null, 0, null, xq00Var18, 0, 0, 2042);
                } else {
                    xq00Var18.m91757b0();
                }
                return w2a1.f247311a;
            case 18:
                xq00 xq00Var19 = (xq00) obj;
                int iIntValue19 = ((Number) obj2).intValue();
                if (xq00Var19.m91752Y(iIntValue19 & 1, (iIntValue19 & 3) != 2)) {
                    ahf1.m25932d(k0e1.m54977L(R.string.mixing_extended_versions_page_close_button, xq00Var19), null, leu.m58818d(xq00Var19).f64975k, 0L, null, null, 0, false, null, 0, null, xq00Var19, 0, 0, 2042);
                } else {
                    xq00Var19.m91757b0();
                }
                return w2a1.f247311a;
            case 19:
                xq00 xq00Var20 = (xq00) obj;
                int iIntValue20 = ((Number) obj2).intValue();
                if (xq00Var20.m91752Y(iIntValue20 & 1, (iIntValue20 & 3) != 2)) {
                    ahf1.m25932d(k0e1.m54977L(R.string.mixing_edit_page_header_cancel_label, xq00Var20), null, leu.m58818d(xq00Var20).f64975k, 0L, null, null, 0, false, new ol80(1), 0, new qx7(leu.m58818d(xq00Var20).f64980p.f101704a.f63411b, leu.m58818d(xq00Var20).f64975k.f101704a.f63411b, epv0.m39702v(1), null, 8), xq00Var20, 0, 8, 762);
                } else {
                    xq00Var20.m91757b0();
                }
                return w2a1.f247311a;
            case 20:
                xq00 xq00Var21 = (xq00) obj;
                int iIntValue21 = ((Number) obj2).intValue();
                if (xq00Var21.m91752Y(iIntValue21 & 1, (iIntValue21 & 3) != 2)) {
                    ahf1.m25932d(k0e1.m54977L(R.string.mixing_edit_page_header_save_label, xq00Var21), null, leu.m58818d(xq00Var21).f64975k, leu.m58815a(xq00Var21).f112824b.f138759c, null, null, 0, false, new ol80(1), 0, new qx7(leu.m58818d(xq00Var21).f64980p.f101704a.f63411b, leu.m58818d(xq00Var21).f64975k.f101704a.f63411b, epv0.m39702v(1), null, 8), xq00Var21, 0, 8, 754);
                } else {
                    xq00Var21.m91757b0();
                }
                return w2a1.f247311a;
            case 21:
                xq00 xq00Var22 = (xq00) obj;
                int iIntValue22 = ((Number) obj2).intValue();
                if (xq00Var22.m91752Y(iIntValue22 & 1, (iIntValue22 & 3) != 2)) {
                    y85.m93057b(bsu.f30386c, new rgj(k0e1.m54977L(R.string.mixing_edit_page_header_more_content_description, xq00Var22)), null, leu.m58815a(xq00Var22).f112824b.f138757a, 0L, false, xq00Var22, bsu.f30387d, 52);
                } else {
                    xq00Var22.m91757b0();
                }
                return w2a1.f247311a;
            case 22:
                xq00 xq00Var23 = (xq00) obj;
                int iIntValue23 = ((Number) obj2).intValue();
                if (xq00Var23.m91752Y(iIntValue23 & 1, (iIntValue23 & 3) != 2)) {
                    y85.m93057b(nqu.f157339c, new rgj(k0e1.m54977L(R.string.mixing_edit_page_header_education_videos_content_description, xq00Var23)), null, leu.m58815a(xq00Var23).f112824b.f138757a, 0L, false, xq00Var23, nqu.f157340d, 52);
                } else {
                    xq00Var23.m91757b0();
                }
                return w2a1.f247311a;
            case 23:
                xq00 xq00Var24 = (xq00) obj;
                int iIntValue24 = ((Number) obj2).intValue();
                if (xq00Var24.m91752Y(iIntValue24 & 1, (iIntValue24 & 3) != 2)) {
                    ahf1.m25932d(k0e1.m54977L(R.string.mixing_edit_page_header_save_label, xq00Var24), null, leu.m58818d(xq00Var24).f64975k, 0L, null, null, 0, false, new ol80(1), 0, new qx7(leu.m58818d(xq00Var24).f64980p.f101704a.f63411b, leu.m58818d(xq00Var24).f64975k.f101704a.f63411b, epv0.m39702v(1), null, 8), xq00Var24, 0, 8, 762);
                } else {
                    xq00Var24.m91757b0();
                }
                return w2a1.f247311a;
            case 24:
                xq00 xq00Var25 = (xq00) obj;
                int iIntValue25 = ((Number) obj2).intValue();
                if (!xq00Var25.m91752Y(iIntValue25 & 1, (iIntValue25 & 3) != 2)) {
                    xq00Var25.m91757b0();
                }
                return w2a1.f247311a;
            case 25:
                xq00 xq00Var26 = (xq00) obj;
                int iIntValue26 = ((Number) obj2).intValue();
                if (xq00Var26.m91752Y(iIntValue26 & 1, (iIntValue26 & 3) != 2)) {
                    ahf1.m25932d(k0e1.m54977L(R.string.mixing_edit_page_bottom_sheet_bpm_mismatch_button_edit_mix_order, xq00Var26), null, null, 0L, null, null, 0, false, null, 0, null, xq00Var26, 0, 0, Entity.AUTOCOMPLETE_FIELD_NUMBER);
                } else {
                    xq00Var26.m91757b0();
                }
                return w2a1.f247311a;
            case 26:
                xq00 xq00Var27 = (xq00) obj;
                int iIntValue27 = ((Number) obj2).intValue();
                if (xq00Var27.m91752Y(iIntValue27 & 1, (iIntValue27 & 3) != 2)) {
                    ahf1.m25932d(k0e1.m54977L(R.string.mixing_edit_page_bottom_sheet_bpm_mismatch_button_go_back, xq00Var27), null, null, 0L, null, null, 0, false, null, 0, null, xq00Var27, 0, 0, Entity.AUTOCOMPLETE_FIELD_NUMBER);
                } else {
                    xq00Var27.m91757b0();
                }
                return w2a1.f247311a;
            case 27:
                xq00 xq00Var28 = (xq00) obj;
                int iIntValue28 = ((Number) obj2).intValue();
                if (xq00Var28.m91752Y(iIntValue28 & 1, (iIntValue28 & 3) != 2)) {
                    cct.m32312k(1, R.string.mixing_edit_page_bottom_sheet_bpm_mismatch_body_tip_pair, 6, xq00Var28);
                    cct.m32312k(2, R.string.f5949x417b4fb8, 6, xq00Var28);
                    cct.m32312k(3, R.string.mixing_edit_page_bottom_sheet_bpm_mismatch_body_tip_reorder, 6, xq00Var28);
                } else {
                    xq00Var28.m91757b0();
                }
                return w2a1.f247311a;
            case 28:
                xq00 xq00Var29 = (xq00) obj;
                int iIntValue29 = ((Number) obj2).intValue();
                if (xq00Var29.m91752Y(iIntValue29 & 1, (iIntValue29 & 3) != 2)) {
                    ahf1.m25932d(k0e1.m54977L(R.string.mixing_opt_in_promo_button, xq00Var29), null, leu.m58818d(xq00Var29).f64972h, 0L, null, null, 0, false, null, 0, null, xq00Var29, 0, 0, 2042);
                } else {
                    xq00Var29.m91757b0();
                }
                return w2a1.f247311a;
            default:
                xq00 xq00Var30 = (xq00) obj;
                int iIntValue30 = ((Number) obj2).intValue();
                if (xq00Var30.m91752Y(iIntValue30 & 1, (iIntValue30 & 3) != 2)) {
                    vgg1.m85460a(0, 2, k0e1.m54977L(R.string.mixing_harmonize_button_title, xq00Var30), xq00Var30, null);
                } else {
                    xq00Var30.m91757b0();
                }
                return w2a1.f247311a;
        }
    }
}
