package p204p;

import android.content.Context;
import com.spotify.music.R;
import com.spotify.searchview.proto.Entity;
import java.util.WeakHashMap;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes7.dex */
public final class b9h extends qe70 implements th00 {

    /* JADX INFO: renamed from: L0 */
    public static final b9h f24907L0;

    /* JADX INFO: renamed from: M0 */
    public static final b9h f24908M0;

    /* JADX INFO: renamed from: N0 */
    public static final b9h f24909N0;

    /* JADX INFO: renamed from: O0 */
    public static final b9h f24910O0;

    /* JADX INFO: renamed from: P0 */
    public static final b9h f24911P0;

    /* JADX INFO: renamed from: Q0 */
    public static final b9h f24912Q0;

    /* JADX INFO: renamed from: R0 */
    public static final b9h f24913R0;

    /* JADX INFO: renamed from: S0 */
    public static final b9h f24914S0;

    /* JADX INFO: renamed from: T0 */
    public static final b9h f24915T0;

    /* JADX INFO: renamed from: U0 */
    public static final b9h f24916U0;

    /* JADX INFO: renamed from: V0 */
    public static final b9h f24917V0;

    /* JADX INFO: renamed from: W0 */
    public static final b9h f24918W0;

    /* JADX INFO: renamed from: X */
    public static final b9h f24919X;

    /* JADX INFO: renamed from: X0 */
    public static final b9h f24920X0;

    /* JADX INFO: renamed from: Y */
    public static final b9h f24921Y;

    /* JADX INFO: renamed from: Y0 */
    public static final b9h f24922Y0;

    /* JADX INFO: renamed from: Z */
    public static final b9h f24923Z;

    /* JADX INFO: renamed from: Z0 */
    public static final b9h f24924Z0;

    /* JADX INFO: renamed from: a1 */
    public static final b9h f24925a1;

    /* JADX INFO: renamed from: b */
    public static final b9h f24926b;

    /* JADX INFO: renamed from: b1 */
    public static final b9h f24927b1;

    /* JADX INFO: renamed from: c */
    public static final b9h f24928c;

    /* JADX INFO: renamed from: c1 */
    public static final b9h f24929c1;

    /* JADX INFO: renamed from: d */
    public static final b9h f24930d;

    /* JADX INFO: renamed from: e */
    public static final b9h f24931e;

    /* JADX INFO: renamed from: f */
    public static final b9h f24932f;

    /* JADX INFO: renamed from: g */
    public static final b9h f24933g;

    /* JADX INFO: renamed from: h */
    public static final b9h f24934h;

    /* JADX INFO: renamed from: i */
    public static final b9h f24935i;

    /* JADX INFO: renamed from: t */
    public static final b9h f24936t;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f24937a;

    static {
        int i = 2;
        f24926b = new b9h(i, 0);
        f24928c = new b9h(i, 1);
        f24930d = new b9h(i, 2);
        f24931e = new b9h(i, 3);
        f24932f = new b9h(i, 4);
        f24933g = new b9h(i, 5);
        f24934h = new b9h(i, 6);
        f24935i = new b9h(i, 7);
        f24936t = new b9h(i, 8);
        f24919X = new b9h(i, 9);
        f24921Y = new b9h(i, 10);
        f24923Z = new b9h(i, 11);
        f24907L0 = new b9h(i, 12);
        f24908M0 = new b9h(i, 13);
        f24909N0 = new b9h(i, 14);
        f24910O0 = new b9h(i, 15);
        f24911P0 = new b9h(i, 16);
        f24912Q0 = new b9h(i, 17);
        f24913R0 = new b9h(i, 18);
        f24914S0 = new b9h(i, 19);
        f24915T0 = new b9h(i, 20);
        f24916U0 = new b9h(i, 21);
        f24917V0 = new b9h(i, 22);
        f24918W0 = new b9h(i, 23);
        f24920X0 = new b9h(i, 24);
        f24922Y0 = new b9h(i, 25);
        f24924Z0 = new b9h(i, 26);
        f24925a1 = new b9h(i, 27);
        f24927b1 = new b9h(i, 28);
        f24929c1 = new b9h(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b9h(int i, int i2) {
        super(i);
        this.f24937a = i2;
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f24937a;
        cxh0 cxh0Var = cxh0.f43038a;
        w2a1 w2a1Var = w2a1.f247311a;
        switch (i) {
            case 0:
                xq00 xq00Var = (xq00) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (xq00Var.m91752Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ahf1.m25932d(k0e1.m54977L(R.string.parental_consent_screen_toolbar_title, xq00Var), null, leu.m58818d(xq00Var).f64972h, 0L, null, null, 0, false, null, 0, null, xq00Var, 0, 0, 2042);
                } else {
                    xq00Var.m91757b0();
                }
                return w2a1Var;
            case 1:
                xq00 xq00Var2 = (xq00) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (xq00Var2.m91752Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    fyf fyfVar = c9h.f35557a;
                    float f = y481.f269099a;
                    long j = n6f.f150870j;
                    gfp gfpVar = leu.f132721a;
                    w45.m87125a(fyfVar, null, null, null, 0.0f, null, y481.m92798f(j, ((fiu) ((u7q) iiu.f102631a.f258038c).f227741b).f69988v, leu.m58815a(xq00Var2).f112824b.f138757a, leu.m58815a(xq00Var2).f112824b.f138757a, leu.m58815a(xq00Var2).f112824b.f138757a, xq00Var2, 32), xq00Var2, 6, 190);
                } else {
                    xq00Var2.m91757b0();
                }
                return w2a1Var;
            case 2:
                xq00 xq00Var3 = (xq00) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                if (xq00Var3.m91752Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    y85.m93057b(avu.f20261c, qgj.f188480a, null, 0L, 0L, false, xq00Var3, avu.f20262d | 48, 60);
                } else {
                    xq00Var3.m91757b0();
                }
                return w2a1Var;
            case 3:
                xq00 xq00Var4 = (xq00) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                if (xq00Var4.m91752Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    y85.m93057b(avu.f20261c, qgj.f188480a, null, 0L, 0L, false, xq00Var4, avu.f20262d | 48, 60);
                } else {
                    xq00Var4.m91757b0();
                }
                return w2a1Var;
            case 4:
                xq00 xq00Var5 = (xq00) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                if (xq00Var5.m91752Y(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    ahf1.m25932d(k0e1.m54977L(R.string.skip_ad_title, xq00Var5), null, null, 0L, null, null, 0, false, null, 0, null, xq00Var5, 0, 0, Entity.AUTOCOMPLETE_FIELD_NUMBER);
                } else {
                    xq00Var5.m91757b0();
                }
                return w2a1Var;
            case 5:
                xq00 xq00Var6 = (xq00) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                if (xq00Var6.m91752Y(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    ahf1.m25932d(k0e1.m54977L(R.string.chapter_playback_confirmation_play_chapter, xq00Var6), null, null, 0L, null, null, 0, false, null, 0, null, xq00Var6, 0, 0, Entity.AUTOCOMPLETE_FIELD_NUMBER);
                } else {
                    xq00Var6.m91757b0();
                }
                return w2a1Var;
            case 6:
                xq00 xq00Var7 = (xq00) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                if (xq00Var7.m91752Y(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    y85.m93057b(psu.f180961c, qgj.f188480a, null, 0L, 0L, false, xq00Var7, psu.f180962d | 48, 60);
                } else {
                    xq00Var7.m91757b0();
                }
                return w2a1Var;
            case 7:
                xq00 xq00Var8 = (xq00) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                if (xq00Var8.m91752Y(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    y85.m93057b(jqu.f115003c, qgj.f188480a, null, 0L, 0L, false, xq00Var8, jqu.f115004d | 48, 60);
                } else {
                    xq00Var8.m91757b0();
                }
                return w2a1Var;
            case 8:
                xq00 xq00Var9 = (xq00) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                if (xq00Var9.m91752Y(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    ahf1.m25932d(k0e1.m54977L(R.string.skip_finished_episodes_title, xq00Var9), null, null, 0L, null, null, 0, false, null, 0, null, xq00Var9, 0, 0, Entity.AUTOCOMPLETE_FIELD_NUMBER);
                } else {
                    xq00Var9.m91757b0();
                }
                return w2a1Var;
            case 9:
                xq00 xq00Var10 = (xq00) obj;
                int iIntValue10 = ((Number) obj2).intValue();
                if (xq00Var10.m91752Y(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    ahf1.m25932d(k0e1.m54977L(R.string.skip_finished_episodes_subtitle, xq00Var10), null, null, 0L, null, null, 0, false, null, 0, null, xq00Var10, 0, 0, Entity.AUTOCOMPLETE_FIELD_NUMBER);
                } else {
                    xq00Var10.m91757b0();
                }
                return w2a1Var;
            case 10:
                xq00 xq00Var11 = (xq00) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                if (xq00Var11.m91752Y(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    y85.m93057b(psu.f180961c, qgj.f188480a, null, 0L, 0L, false, xq00Var11, psu.f180962d | 48, 60);
                } else {
                    xq00Var11.m91757b0();
                }
                return w2a1Var;
            case 11:
                xq00 xq00Var12 = (xq00) obj;
                int iIntValue12 = ((Number) obj2).intValue();
                if (xq00Var12.m91752Y(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    y85.m93057b(avu.f20261c, qgj.f188480a, null, 0L, 0L, false, xq00Var12, avu.f20262d | 48, 60);
                } else {
                    xq00Var12.m91757b0();
                }
                return w2a1Var;
            case 12:
                xq00 xq00Var13 = (xq00) obj;
                int iIntValue13 = ((Number) obj2).intValue();
                if (xq00Var13.m91752Y(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    ahf1.m25932d(k0e1.m54977L(R.string.ads_skip_next_isolated_button, xq00Var13), null, null, 0L, null, null, 0, false, null, 0, null, xq00Var13, 0, 0, Entity.AUTOCOMPLETE_FIELD_NUMBER);
                } else {
                    xq00Var13.m91757b0();
                }
                return w2a1Var;
            case 13:
                xq00 xq00Var14 = (xq00) obj;
                int iIntValue14 = ((Number) obj2).intValue();
                if (xq00Var14.m91752Y(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    y85.m93057b(avu.f20261c, new rgj(k0e1.m54977L(R.string.ads_skip_next_isolated_button, xq00Var14)), null, 0L, 0L, false, xq00Var14, avu.f20262d, 60);
                } else {
                    xq00Var14.m91757b0();
                }
                return w2a1Var;
            case 14:
                xq00 xq00Var15 = (xq00) obj;
                int iIntValue15 = ((Number) obj2).intValue();
                if (xq00Var15.m91752Y(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    ahf1.m25932d(k0e1.m54977L(R.string.slate_dismiss, xq00Var15), null, null, 0L, null, null, 0, false, null, 0, null, xq00Var15, 0, 0, Entity.AUTOCOMPLETE_FIELD_NUMBER);
                } else {
                    xq00Var15.m91757b0();
                }
                return w2a1Var;
            case 15:
                xq00 xq00Var16 = (xq00) obj;
                int iIntValue16 = ((Number) obj2).intValue();
                if (xq00Var16.m91752Y(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    jbr0.f110844M0.m52913b(6, xq00Var16);
                } else {
                    xq00Var16.m91757b0();
                }
                return w2a1Var;
            case 16:
                xq00 xq00Var17 = (xq00) obj;
                int iIntValue17 = ((Number) obj2).intValue();
                if (xq00Var17.m91752Y(iIntValue17 & 1, (iIntValue17 & 3) != 2)) {
                    jbr0.f110844M0.m52913b(6, xq00Var17);
                } else {
                    xq00Var17.m91757b0();
                }
                return w2a1Var;
            case 17:
                xq00 xq00Var18 = (xq00) obj;
                int iIntValue18 = ((Number) obj2).intValue();
                if (xq00Var18.m91752Y(iIntValue18 & 1, (iIntValue18 & 3) != 2)) {
                    ahf1.m25932d(k0e1.m54977L(R.string.slot_error_retry_button, xq00Var18), null, leu.m58818d(xq00Var18).f64975k, 0L, null, null, 0, false, null, 0, null, xq00Var18, 0, 0, 2042);
                } else {
                    xq00Var18.m91757b0();
                }
                return w2a1Var;
            case 18:
                xq00 xq00Var19 = (xq00) obj;
                int iIntValue19 = ((Number) obj2).intValue();
                if (xq00Var19.m91752Y(iIntValue19 & 1, (iIntValue19 & 3) != 2)) {
                    eug1.m40063d(((Context) xq00Var19.m91774k(tsh.f223313b)).getString(R.string.customwidget_slot_item_add), null, lf71.f132843a, 0, xq00Var19, 0, 10);
                } else {
                    xq00Var19.m91757b0();
                }
                return w2a1Var;
            case 19:
                xq00 xq00Var20 = (xq00) obj;
                int iIntValue20 = ((Number) obj2).intValue();
                if (xq00Var20.m91752Y(iIntValue20 & 1, (iIntValue20 & 3) != 2)) {
                    Object objM91750T = xq00Var20.m91750T();
                    if (objM91750T == t6x0.f217647t) {
                        objM91750T = byg.f32200Q0;
                        xq00Var20.m91793t0(objM91750T);
                    }
                    qag1.m72437a(fig1.m41720A(oe10.f164317a, (gh00) objM91750T), ew21.f63403d, ew21.f63404e, 0, xq00Var20, 432, 8);
                } else {
                    xq00Var20.m91757b0();
                }
                return w2a1Var;
            case 20:
                xq00 xq00Var21 = (xq00) obj;
                int iIntValue21 = ((Number) obj2).intValue();
                if (xq00Var21.m91752Y(iIntValue21 & 1, (iIntValue21 & 3) != 2)) {
                    ahf1.m25932d(k0e1.m54977L(R.string.play_mode_item_smart_shuffle_intro_dialog_positive_button, xq00Var21), null, null, 0L, null, null, 0, false, null, 0, null, xq00Var21, 0, 0, Entity.AUTOCOMPLETE_FIELD_NUMBER);
                } else {
                    xq00Var21.m91757b0();
                }
                return w2a1Var;
            case 21:
                xq00 xq00Var22 = (xq00) obj;
                int iIntValue22 = ((Number) obj2).intValue();
                if (xq00Var22.m91752Y(iIntValue22 & 1, (iIntValue22 & 3) != 2)) {
                    y85.m93057b(xru.f265409c, qgj.f188480a, epv0.m39673I("SNOOZE_RECOMMENDATIONS_BUTTON_ELEMENT_ICON_TEST_TAG", cxh0Var), leu.m58815a(xq00Var22).f112824b.f138758b, 0L, false, xq00Var22, xru.f265410d | 48, 48);
                } else {
                    xq00Var22.m91757b0();
                }
                return w2a1Var;
            case 22:
                xq00 xq00Var23 = (xq00) obj;
                int iIntValue23 = ((Number) obj2).intValue();
                if (xq00Var23.m91752Y(iIntValue23 & 1, (iIntValue23 & 3) != 2)) {
                    ahf1.m25932d(k0e1.m54977L(R.string.collection_snooze_recommendations_button_element_text, xq00Var23), mi21.m61814B(cxh0Var, null, 3), leu.m58818d(xq00Var23).f64975k, leu.m58815a(xq00Var23).f112824b.f138757a, new h171(5), null, 0, false, null, 0, null, xq00Var23, 0, 0, 2016);
                } else {
                    xq00Var23.m91757b0();
                }
                return w2a1Var;
            case 23:
                xq00 xq00Var24 = (xq00) obj;
                int iIntValue24 = ((Number) obj2).intValue();
                if (xq00Var24.m91752Y(iIntValue24 & 1, (iIntValue24 & 3) != 2)) {
                    ahf1.m25932d(k0e1.m54977L(R.string.song_dna_npv_button_text, xq00Var24), null, leu.m58818d(xq00Var24).f64975k, 0L, null, null, 0, false, null, 0, null, xq00Var24, 0, 0, 2042);
                } else {
                    xq00Var24.m91757b0();
                }
                return w2a1Var;
            case 24:
                xq00 xq00Var25 = (xq00) obj;
                int iIntValue25 = ((Number) obj2).intValue();
                if (xq00Var25.m91752Y(iIntValue25 & 1, (iIntValue25 & 3) != 2)) {
                    q350.m72049d(null, null, xq00Var25, 0, 3);
                } else {
                    xq00Var25.m91757b0();
                }
                return w2a1Var;
            case 25:
                xq00 xq00Var26 = (xq00) obj;
                int iIntValue26 = ((Number) obj2).intValue();
                if (xq00Var26.m91752Y(iIntValue26 & 1, (iIntValue26 & 3) != 2)) {
                    y85.m93057b(uuu.f234260c, new rgj(k0e1.m54977L(R.string.song_dna_share_button_content_description, xq00Var26)), null, 0L, 0L, false, xq00Var26, uuu.f234261d, 60);
                } else {
                    xq00Var26.m91757b0();
                }
                return w2a1Var;
            case 26:
                xq00 xq00Var27 = (xq00) obj;
                int iIntValue27 = ((Number) obj2).intValue();
                if (xq00Var27.m91752Y(iIntValue27 & 1, (iIntValue27 & 3) != 2)) {
                    ahf1.m25932d(k0e1.m54977L(R.string.song_dna_unavailable_button, xq00Var27), null, null, 0L, null, null, 0, false, null, 0, null, xq00Var27, 0, 0, Entity.AUTOCOMPLETE_FIELD_NUMBER);
                } else {
                    xq00Var27.m91757b0();
                }
                return w2a1Var;
            case 27:
                xq00 xq00Var28 = (xq00) obj;
                int iIntValue28 = ((Number) obj2).intValue();
                if (xq00Var28.m91752Y(iIntValue28 & 1, (iIntValue28 & 3) != 2)) {
                    c7l0 c7l0VarM35772a = dea0.m35772a(xq00Var28);
                    b7l0 b7l0VarMo31751N = c7l0VarM35772a != null ? c7l0VarM35772a.mo31751N() : null;
                    fxh0 fxh0VarM96830A = zsf1.m96830A(mi21.m61822f(1.0f, cxh0Var), leu.m58816b(xq00Var28).f117233e.f137887c, 0.0f, 2);
                    WeakHashMap weakHashMap = cxd1.f42984x;
                    fxh0 fxh0VarM19r = AbstractC0000a.m19r(bxd1.m30815d(xq00Var28).f42991g, 32, fxh0VarM96830A);
                    ub9 ub9Var = d7f0.f46145P0;
                    zi5 zi5Var = bj5.f27610a;
                    aaf aafVarM87496a = w9f.m87496a(bj5.m29370g(leu.m58816b(xq00Var28).f117230b.f224761d), ub9Var, xq00Var28, 0);
                    int iHashCode = Long.hashCode(xq00Var28.f264809T);
                    wpn0 wpn0VarM91778m = xq00Var28.m91778m();
                    fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var28, fxh0VarM19r);
                    soh.f211194A.getClass();
                    C2087le c2087le = roh.f201257b;
                    if (xq00Var28.f264811a == null) {
                        pmg1.m70360s();
                        throw null;
                    }
                    xq00Var28.m91779m0();
                    if (xq00Var28.f264808S) {
                        xq00Var28.m91776l(c2087le);
                    } else {
                        xq00Var28.m91799w0();
                    }
                    zsf1.m96835F(aafVarM87496a, roh.f201262g, xq00Var28);
                    zsf1.m96835F(wpn0VarM91778m, roh.f201261f, xq00Var28);
                    zsf1.m96835F(Integer.valueOf(iHashCode), roh.f201265j, xq00Var28);
                    zsf1.m96833D(roh.f201266k, xq00Var28);
                    zsf1.m96835F(fxh0VarM48286s, roh.f201259d, xq00Var28);
                    q350.m72049d(null, null, xq00Var28, 0, 3);
                    ahf1.m25932d(k0e1.m54977L(R.string.song_dna_unavailable_title, xq00Var28), null, leu.m58818d(xq00Var28).f64967c, leu.m58815a(xq00Var28).f112824b.f138759c, new h171(3), null, 0, false, null, 0, null, xq00Var28, 0, 0, 2018);
                    ahf1.m25932d(k0e1.m54977L(R.string.song_dna_unavailable_subtitle, xq00Var28), null, leu.m58818d(xq00Var28).f64974j, leu.m58815a(xq00Var28).f112824b.f138758b, new h171(3), null, 0, false, null, 0, null, xq00Var28, 0, 0, 2018);
                    boolean zM91770i = xq00Var28.m91770i(b7l0VarMo31751N);
                    Object objM91750T2 = xq00Var28.m91750T();
                    if (zM91770i || objM91750T2 == t6x0.f217647t) {
                        objM91750T2 = new jah(b7l0VarMo31751N, 0);
                        xq00Var28.m91793t0(objM91750T2);
                    }
                    dyu.m37371c(new peu(u40.f226523c, (eh00) objM91750T2), wgu.f251150c, null, null, null, null, null, null, null, null, kah.f120901a, xq00Var28, 0, 48, 2044);
                    xq00Var28.m91788r(true);
                } else {
                    xq00Var28.m91757b0();
                }
                return w2a1Var;
            case 28:
                xq00 xq00Var29 = (xq00) obj;
                int iIntValue29 = ((Number) obj2).intValue();
                if (xq00Var29.m91752Y(iIntValue29 & 1, (iIntValue29 & 3) != 2)) {
                    zuj0.m97040c(0, xq00Var29);
                } else {
                    xq00Var29.m91757b0();
                }
                return w2a1Var;
            default:
                xq00 xq00Var30 = (xq00) obj;
                int iIntValue30 = ((Number) obj2).intValue();
                if (xq00Var30.m91752Y(iIntValue30 & 1, (iIntValue30 & 3) != 2)) {
                    ahf1.m25932d(k0e1.m54977L(R.string.library_sort_row_edit_button, xq00Var30), null, null, 0L, null, null, 0, false, null, 0, null, xq00Var30, 0, 0, Entity.AUTOCOMPLETE_FIELD_NUMBER);
                } else {
                    xq00Var30.m91757b0();
                }
                return w2a1Var;
        }
    }
}
