package p204p;

import com.spotify.music.R;
import com.spotify.searchview.proto.Entity;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes10.dex */
public final class idg extends qe70 implements th00 {

    /* JADX INFO: renamed from: L0 */
    public static final idg f101102L0;

    /* JADX INFO: renamed from: M0 */
    public static final idg f101103M0;

    /* JADX INFO: renamed from: N0 */
    public static final idg f101104N0;

    /* JADX INFO: renamed from: O0 */
    public static final idg f101105O0;

    /* JADX INFO: renamed from: P0 */
    public static final idg f101106P0;

    /* JADX INFO: renamed from: Q0 */
    public static final idg f101107Q0;

    /* JADX INFO: renamed from: R0 */
    public static final idg f101108R0;

    /* JADX INFO: renamed from: S0 */
    public static final idg f101109S0;

    /* JADX INFO: renamed from: T0 */
    public static final idg f101110T0;

    /* JADX INFO: renamed from: U0 */
    public static final idg f101111U0;

    /* JADX INFO: renamed from: V0 */
    public static final idg f101112V0;

    /* JADX INFO: renamed from: W0 */
    public static final idg f101113W0;

    /* JADX INFO: renamed from: X */
    public static final idg f101114X;

    /* JADX INFO: renamed from: X0 */
    public static final idg f101115X0;

    /* JADX INFO: renamed from: Y */
    public static final idg f101116Y;

    /* JADX INFO: renamed from: Y0 */
    public static final idg f101117Y0;

    /* JADX INFO: renamed from: Z */
    public static final idg f101118Z;

    /* JADX INFO: renamed from: Z0 */
    public static final idg f101119Z0;

    /* JADX INFO: renamed from: a1 */
    public static final idg f101120a1;

    /* JADX INFO: renamed from: b */
    public static final idg f101121b;

    /* JADX INFO: renamed from: b1 */
    public static final idg f101122b1;

    /* JADX INFO: renamed from: c */
    public static final idg f101123c;

    /* JADX INFO: renamed from: c1 */
    public static final idg f101124c1;

    /* JADX INFO: renamed from: d */
    public static final idg f101125d;

    /* JADX INFO: renamed from: e */
    public static final idg f101126e;

    /* JADX INFO: renamed from: f */
    public static final idg f101127f;

    /* JADX INFO: renamed from: g */
    public static final idg f101128g;

    /* JADX INFO: renamed from: h */
    public static final idg f101129h;

    /* JADX INFO: renamed from: i */
    public static final idg f101130i;

    /* JADX INFO: renamed from: t */
    public static final idg f101131t;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f101132a;

    static {
        int i = 2;
        f101121b = new idg(i, 0);
        f101123c = new idg(i, 1);
        f101125d = new idg(i, 2);
        f101126e = new idg(i, 3);
        f101127f = new idg(i, 4);
        f101128g = new idg(i, 5);
        f101129h = new idg(i, 6);
        f101130i = new idg(i, 7);
        f101131t = new idg(i, 8);
        f101114X = new idg(i, 9);
        f101116Y = new idg(i, 10);
        f101118Z = new idg(i, 11);
        f101102L0 = new idg(i, 12);
        f101103M0 = new idg(i, 13);
        f101104N0 = new idg(i, 14);
        f101105O0 = new idg(i, 15);
        f101106P0 = new idg(i, 16);
        f101107Q0 = new idg(i, 17);
        f101108R0 = new idg(i, 18);
        f101109S0 = new idg(i, 19);
        f101110T0 = new idg(i, 20);
        f101111U0 = new idg(i, 21);
        f101112V0 = new idg(i, 22);
        f101113W0 = new idg(i, 23);
        f101115X0 = new idg(i, 24);
        f101117Y0 = new idg(i, 25);
        f101119Z0 = new idg(i, 26);
        f101120a1 = new idg(i, 27);
        f101122b1 = new idg(i, 28);
        f101124c1 = new idg(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ idg(int i, int i2) {
        super(i);
        this.f101132a = i2;
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f101132a;
        cxh0 cxh0Var = cxh0.f43038a;
        w2a1 w2a1Var = w2a1.f247311a;
        switch (i) {
            case 0:
                xq00 xq00Var = (xq00) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (xq00Var.m91752Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ahf1.m25932d(k0e1.m54977L(R.string.enhanced_share_card_discard_dialog_secondary, xq00Var), null, null, 0L, null, null, 0, false, null, 0, null, xq00Var, 0, 0, Entity.AUTOCOMPLETE_FIELD_NUMBER);
                } else {
                    xq00Var.m91757b0();
                }
                return w2a1Var;
            case 1:
                xq00 xq00Var2 = (xq00) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (xq00Var2.m91752Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ahf1.m25932d(k0e1.m54977L(R.string.enhanced_share_card_discard_dialog_primary, xq00Var2), null, null, 0L, null, null, 0, false, null, 0, null, xq00Var2, 0, 0, Entity.AUTOCOMPLETE_FIELD_NUMBER);
                } else {
                    xq00Var2.m91757b0();
                }
                return w2a1Var;
            case 2:
                xq00 xq00Var3 = (xq00) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                if (xq00Var3.m91752Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    ahf1.m25932d(k0e1.m54977L(R.string.disk_almost_full_ok, xq00Var3), null, null, 0L, null, null, 0, false, null, 0, null, xq00Var3, 0, 0, Entity.AUTOCOMPLETE_FIELD_NUMBER);
                } else {
                    xq00Var3.m91757b0();
                }
                return w2a1Var;
            case 3:
                xq00 xq00Var4 = (xq00) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                if (xq00Var4.m91752Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    ahf1.m25932d(k0e1.m54977L(R.string.disk_almost_full_message, xq00Var4), null, null, 0L, null, null, 0, false, null, 0, null, xq00Var4, 0, 0, Entity.AUTOCOMPLETE_FIELD_NUMBER);
                } else {
                    xq00Var4.m91757b0();
                }
                return w2a1Var;
            case 4:
                xq00 xq00Var5 = (xq00) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                if (xq00Var5.m91752Y(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    ahf1.m25932d(k0e1.m54977L(R.string.disk_almost_full_title, xq00Var5), null, null, 0L, null, null, 0, false, null, 0, null, xq00Var5, 0, 0, Entity.AUTOCOMPLETE_FIELD_NUMBER);
                } else {
                    xq00Var5.m91757b0();
                }
                return w2a1Var;
            case 5:
                xq00 xq00Var6 = (xq00) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                if (xq00Var6.m91752Y(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    ksg1.m57220j(432, xq00Var6, null, true, false);
                } else {
                    xq00Var6.m91757b0();
                }
                return w2a1Var;
            case 6:
                xq00 xq00Var7 = (xq00) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                if (xq00Var7.m91752Y(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    ahf1.m25932d(k0e1.m54977L(R.string.cancel_recording, xq00Var7), null, leu.m58818d(xq00Var7).f64972h, cgg1.m32713k(R.color.white, xq00Var7), null, null, 0, false, null, 0, null, xq00Var7, 0, 0, 2034);
                } else {
                    xq00Var7.m91757b0();
                }
                return w2a1Var;
            case 7:
                xq00 xq00Var8 = (xq00) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                if (xq00Var8.m91752Y(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    y85.m93057b(spu.f212955c, new rgj(k0e1.m54977L(R.string.media_download_button_action_download, xq00Var8)), null, leu.m58815a(xq00Var8).f112825c.f221218a, 0L, false, xq00Var8, spu.f212956d, 52);
                } else {
                    xq00Var8.m91757b0();
                }
                return w2a1Var;
            case 8:
                xq00 xq00Var9 = (xq00) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                if (xq00Var9.m91752Y(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    ahf1.m25932d(k0e1.m54977L(R.string.download_over_cellular_dialog_primary_action_gotosettings, xq00Var9), null, null, 0L, new h171(3), null, 2, false, new ol80(2), 0, null, xq00Var9, 0, 0, 1710);
                } else {
                    xq00Var9.m91757b0();
                }
                return w2a1Var;
            case 9:
                xq00 xq00Var10 = (xq00) obj;
                int iIntValue10 = ((Number) obj2).intValue();
                if (xq00Var10.m91752Y(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    ahf1.m25932d(k0e1.m54977L(R.string.campfire_edit_group_details_cancel, xq00Var10), null, null, 0L, null, null, 0, false, null, 0, null, xq00Var10, 0, 0, Entity.AUTOCOMPLETE_FIELD_NUMBER);
                } else {
                    xq00Var10.m91757b0();
                }
                return w2a1Var;
            case 10:
                xq00 xq00Var11 = (xq00) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                if (xq00Var11.m91752Y(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    ahf1.m25932d(k0e1.m54977L(R.string.campfire_edit_group_details_done, xq00Var11), null, null, leu.m58815a(xq00Var11).f112824b.f138759c, null, null, 0, false, null, 0, null, xq00Var11, 0, 0, 2038);
                } else {
                    xq00Var11.m91757b0();
                }
                return w2a1Var;
            case 11:
                xq00 xq00Var12 = (xq00) obj;
                int iIntValue12 = ((Number) obj2).intValue();
                if (xq00Var12.m91752Y(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    wjg1.m88322a(null, null, false, null, dlm0.f50256a, null, null, null, xq00Var12, 0, 239);
                } else {
                    xq00Var12.m91757b0();
                }
                return w2a1Var;
            case 12:
                xq00 xq00Var13 = (xq00) obj;
                int iIntValue13 = ((Number) obj2).intValue();
                if (xq00Var13.m91752Y(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    ahf1.m25932d(k0e1.m54977L(R.string.edit_playlist_cover_art_change_image_button, xq00Var13), null, null, 0L, null, null, 0, false, null, 0, null, xq00Var13, 0, 0, Entity.AUTOCOMPLETE_FIELD_NUMBER);
                } else {
                    xq00Var13.m91757b0();
                }
                return w2a1Var;
            case 13:
                xq00 xq00Var14 = (xq00) obj;
                int iIntValue14 = ((Number) obj2).intValue();
                if (xq00Var14.m91752Y(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    ahf1.m25932d(k0e1.m54977L(R.string.edit_playlist_cover_art_page_create_cover_art_button_text, xq00Var14), null, null, 0L, null, null, 0, false, null, 0, null, xq00Var14, 0, 0, Entity.AUTOCOMPLETE_FIELD_NUMBER);
                } else {
                    xq00Var14.m91757b0();
                }
                return w2a1Var;
            case 14:
                xq00 xq00Var15 = (xq00) obj;
                int iIntValue15 = ((Number) obj2).intValue();
                if (xq00Var15.m91752Y(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    fxh0 fxh0VarM61820d = mi21.m61820d(1.0f, cxh0Var);
                    aaf aafVarM87496a = w9f.m87496a(bj5.f27614e, d7f0.f46145P0, xq00Var15, 54);
                    int iHashCode = Long.hashCode(xq00Var15.f264809T);
                    wpn0 wpn0VarM91778m = xq00Var15.m91778m();
                    fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var15, fxh0VarM61820d);
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
                    zsf1.m96835F(aafVarM87496a, roh.f201262g, xq00Var15);
                    zsf1.m96835F(wpn0VarM91778m, roh.f201261f, xq00Var15);
                    zsf1.m96835F(Integer.valueOf(iHashCode), roh.f201265j, xq00Var15);
                    zsf1.m96833D(roh.f201266k, xq00Var15);
                    zsf1.m96835F(fxh0VarM48286s, roh.f201259d, xq00Var15);
                    ahf1.m25932d(k0e1.m54977L(R.string.edit_playlist_items_empty_title, xq00Var15), zsf1.m96830A(cxh0Var, leu.m58816b(xq00Var15).f117230b.f224763f, 0.0f, 2), leu.m58818d(xq00Var15).f64969e, leu.m58815a(xq00Var15).f112824b.f138757a, new h171(3), null, 0, false, null, 0, null, xq00Var15, 0, 0, 2016);
                    ahf1.m25932d(k0e1.m54977L(R.string.edit_playlist_items_empty_subtitle, xq00Var15), zsf1.m96830A(cxh0Var, leu.m58816b(xq00Var15).f117230b.f224763f, 0.0f, 2), fr0.m42477u(cxh0Var, leu.m58816b(xq00Var15).f117230b.f224759b, xq00Var15, xq00Var15).f64974j, leu.m58815a(xq00Var15).f112824b.f138758b, new h171(3), null, 0, false, null, 0, null, xq00Var15, 0, 0, 2016);
                    xq00Var15.m91788r(true);
                } else {
                    xq00Var15.m91757b0();
                }
                return w2a1Var;
            case 15:
                xq00 xq00Var16 = (xq00) obj;
                int iIntValue16 = ((Number) obj2).intValue();
                if (xq00Var16.m91752Y(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    riw0.m75615i(xq00Var16, mi21.m61824h(leu.m58816b(xq00Var16).f117230b.f224763f, mi21.m61822f(1.0f, cxh0Var)));
                } else {
                    xq00Var16.m91757b0();
                }
                return w2a1Var;
            case 16:
                xq00 xq00Var17 = (xq00) obj;
                int iIntValue17 = ((Number) obj2).intValue();
                if (!xq00Var17.m91752Y(iIntValue17 & 1, (iIntValue17 & 3) != 2)) {
                    xq00Var17.m91757b0();
                }
                return w2a1Var;
            case 17:
                xq00 xq00Var18 = (xq00) obj;
                int iIntValue18 = ((Number) obj2).intValue();
                if (xq00Var18.m91752Y(iIntValue18 & 1, (iIntValue18 & 3) != 2)) {
                    ahf1.m25932d(k0e1.m54977L(R.string.edit_playlist_items_save_button, xq00Var18), null, leu.m58818d(xq00Var18).f64975k, leu.m58815a(xq00Var18).f112824b.f138759c, null, null, 0, false, new ol80(1), 0, null, xq00Var18, 0, 0, 1778);
                } else {
                    xq00Var18.m91757b0();
                }
                return w2a1Var;
            case 18:
                xq00 xq00Var19 = (xq00) obj;
                int iIntValue19 = ((Number) obj2).intValue();
                if (!xq00Var19.m91752Y(iIntValue19 & 1, (iIntValue19 & 3) != 2)) {
                    xq00Var19.m91757b0();
                }
                return w2a1Var;
            case 19:
                xq00 xq00Var20 = (xq00) obj;
                int iIntValue20 = ((Number) obj2).intValue();
                if (xq00Var20.m91752Y(iIntValue20 & 1, (iIntValue20 & 3) != 2)) {
                    riw0.m75615i(xq00Var20, mi21.m61824h(leu.m58816b(xq00Var20).f117230b.f224765h, mi21.m61822f(1.0f, cxh0Var)));
                } else {
                    xq00Var20.m91757b0();
                }
                return w2a1Var;
            case 20:
                xq00 xq00Var21 = (xq00) obj;
                int iIntValue21 = ((Number) obj2).intValue();
                if (xq00Var21.m91752Y(iIntValue21 & 1, (iIntValue21 & 3) != 2)) {
                    fxh0 fxh0VarM61822f = mi21.m61822f(1.0f, cxh0Var);
                    WeakHashMap weakHashMap = cxd1.f42984x;
                    riw0.m75615i(xq00Var21, mi21.m61824h(rfg1.m75451u(bxd1.m30815d(xq00Var21).f42989e, xq00Var21).mo29185a(), fxh0VarM61822f));
                } else {
                    xq00Var21.m91757b0();
                }
                return w2a1Var;
            case 21:
                xq00 xq00Var22 = (xq00) obj;
                int iIntValue22 = ((Number) obj2).intValue();
                if (xq00Var22.m91752Y(iIntValue22 & 1, (iIntValue22 & 3) != 2)) {
                    ahf1.m25932d(k0e1.m54977L(R.string.edit_playlists_privacy_page_title, xq00Var22), null, leu.m58818d(xq00Var22).f64969e, 0L, null, null, 0, false, null, 0, null, xq00Var22, 0, 0, 2042);
                } else {
                    xq00Var22.m91757b0();
                }
                return w2a1Var;
            case 22:
                xq00 xq00Var23 = (xq00) obj;
                int iIntValue23 = ((Number) obj2).intValue();
                if (xq00Var23.m91752Y(iIntValue23 & 1, (iIntValue23 & 3) != 2)) {
                    ahf1.m25932d(k0e1.m54977L(R.string.edit_playlists_profile_visibility_page_title, xq00Var23), null, leu.m58818d(xq00Var23).f64969e, 0L, null, null, 0, false, null, 0, null, xq00Var23, 0, 0, 2042);
                } else {
                    xq00Var23.m91757b0();
                }
                return w2a1Var;
            case 23:
                xq00 xq00Var24 = (xq00) obj;
                int iIntValue24 = ((Number) obj2).intValue();
                if (xq00Var24.m91752Y(iIntValue24 & 1, (iIntValue24 & 3) != 2)) {
                    fxh0 fxh0VarM61822f2 = mi21.m61822f(1.0f, cxh0Var);
                    WeakHashMap weakHashMap2 = cxd1.f42984x;
                    riw0.m75615i(xq00Var24, mi21.m61824h(rfg1.m75451u(bxd1.m30815d(xq00Var24).f42989e, xq00Var24).mo29185a(), fxh0VarM61822f2));
                } else {
                    xq00Var24.m91757b0();
                }
                return w2a1Var;
            case 24:
                xq00 xq00Var25 = (xq00) obj;
                int iIntValue25 = ((Number) obj2).intValue();
                if (xq00Var25.m91752Y(iIntValue25 & 1, (iIntValue25 & 3) != 2)) {
                    riw0.m75615i(xq00Var25, mi21.m61824h(leu.m58816b(xq00Var25).f117230b.f224765h, mi21.m61822f(1.0f, cxh0Var)));
                } else {
                    xq00Var25.m91757b0();
                }
                return w2a1Var;
            case 25:
                xq00 xq00Var26 = (xq00) obj;
                int iIntValue26 = ((Number) obj2).intValue();
                if (!xq00Var26.m91752Y(iIntValue26 & 1, (iIntValue26 & 3) != 2)) {
                    xq00Var26.m91757b0();
                }
                return w2a1Var;
            case 26:
                xq00 xq00Var27 = (xq00) obj;
                int iIntValue27 = ((Number) obj2).intValue();
                if (xq00Var27.m91752Y(iIntValue27 & 1, (iIntValue27 & 3) != 2)) {
                    ahf1.m25932d(k0e1.m54977L(R.string.edit_ucp_prompt_cancel, xq00Var27), null, leu.m58818d(xq00Var27).f64974j, leu.m58815a(xq00Var27).f112824b.f138757a, null, null, 0, false, null, 0, null, xq00Var27, 0, 0, 2034);
                } else {
                    xq00Var27.m91757b0();
                }
                return w2a1Var;
            case 27:
                xq00 xq00Var28 = (xq00) obj;
                int iIntValue28 = ((Number) obj2).intValue();
                if (!xq00Var28.m91752Y(iIntValue28 & 1, (iIntValue28 & 3) != 2)) {
                    xq00Var28.m91757b0();
                }
                return w2a1Var;
            case 28:
                xq00 xq00Var29 = (xq00) obj;
                int iIntValue29 = ((Number) obj2).intValue();
                if (!xq00Var29.m91752Y(iIntValue29 & 1, (iIntValue29 & 3) != 2)) {
                    xq00Var29.m91757b0();
                }
                return w2a1Var;
            default:
                xq00 xq00Var30 = (xq00) obj;
                int iIntValue30 = ((Number) obj2).intValue();
                if (xq00Var30.m91752Y(iIntValue30 & 1, (iIntValue30 & 3) != 2)) {
                    ahf1.m25932d(k0e1.m54977L(R.string.button_login_otp, xq00Var30), null, null, 0L, null, null, 0, false, null, 0, null, xq00Var30, 0, 0, Entity.AUTOCOMPLETE_FIELD_NUMBER);
                } else {
                    xq00Var30.m91757b0();
                }
                return w2a1Var;
        }
    }
}
