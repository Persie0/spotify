package p204p;

import com.spotify.music.R;
import com.spotify.searchview.proto.Entity;

/* JADX INFO: loaded from: classes8.dex */
public final class tfh extends qe70 implements th00 {

    /* JADX INFO: renamed from: L0 */
    public static final tfh f219954L0;

    /* JADX INFO: renamed from: M0 */
    public static final tfh f219955M0;

    /* JADX INFO: renamed from: N0 */
    public static final tfh f219956N0;

    /* JADX INFO: renamed from: O0 */
    public static final tfh f219957O0;

    /* JADX INFO: renamed from: P0 */
    public static final tfh f219958P0;

    /* JADX INFO: renamed from: Q0 */
    public static final tfh f219959Q0;

    /* JADX INFO: renamed from: R0 */
    public static final tfh f219960R0;

    /* JADX INFO: renamed from: S0 */
    public static final tfh f219961S0;

    /* JADX INFO: renamed from: T0 */
    public static final tfh f219962T0;

    /* JADX INFO: renamed from: U0 */
    public static final tfh f219963U0;

    /* JADX INFO: renamed from: V0 */
    public static final tfh f219964V0;

    /* JADX INFO: renamed from: W0 */
    public static final tfh f219965W0;

    /* JADX INFO: renamed from: X */
    public static final tfh f219966X;

    /* JADX INFO: renamed from: X0 */
    public static final tfh f219967X0;

    /* JADX INFO: renamed from: Y */
    public static final tfh f219968Y;

    /* JADX INFO: renamed from: Y0 */
    public static final tfh f219969Y0;

    /* JADX INFO: renamed from: Z */
    public static final tfh f219970Z;

    /* JADX INFO: renamed from: Z0 */
    public static final tfh f219971Z0;

    /* JADX INFO: renamed from: a1 */
    public static final tfh f219972a1;

    /* JADX INFO: renamed from: b */
    public static final tfh f219973b;

    /* JADX INFO: renamed from: b1 */
    public static final tfh f219974b1;

    /* JADX INFO: renamed from: c */
    public static final tfh f219975c;

    /* JADX INFO: renamed from: c1 */
    public static final tfh f219976c1;

    /* JADX INFO: renamed from: d */
    public static final tfh f219977d;

    /* JADX INFO: renamed from: e */
    public static final tfh f219978e;

    /* JADX INFO: renamed from: f */
    public static final tfh f219979f;

    /* JADX INFO: renamed from: g */
    public static final tfh f219980g;

    /* JADX INFO: renamed from: h */
    public static final tfh f219981h;

    /* JADX INFO: renamed from: i */
    public static final tfh f219982i;

    /* JADX INFO: renamed from: t */
    public static final tfh f219983t;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f219984a;

    static {
        int i = 2;
        f219973b = new tfh(i, 0);
        f219975c = new tfh(i, 1);
        f219977d = new tfh(i, 2);
        f219978e = new tfh(i, 3);
        f219979f = new tfh(i, 4);
        f219980g = new tfh(i, 5);
        f219981h = new tfh(i, 6);
        f219982i = new tfh(i, 7);
        f219983t = new tfh(i, 8);
        f219966X = new tfh(i, 9);
        f219968Y = new tfh(i, 10);
        f219970Z = new tfh(i, 11);
        f219954L0 = new tfh(i, 12);
        f219955M0 = new tfh(i, 13);
        f219956N0 = new tfh(i, 14);
        f219957O0 = new tfh(i, 15);
        f219958P0 = new tfh(i, 16);
        f219959Q0 = new tfh(i, 17);
        f219960R0 = new tfh(i, 18);
        f219961S0 = new tfh(i, 19);
        f219962T0 = new tfh(i, 20);
        f219963U0 = new tfh(i, 21);
        f219964V0 = new tfh(i, 22);
        f219965W0 = new tfh(i, 23);
        f219967X0 = new tfh(i, 24);
        f219969Y0 = new tfh(i, 25);
        f219971Z0 = new tfh(i, 26);
        f219972a1 = new tfh(i, 27);
        f219974b1 = new tfh(i, 28);
        f219976c1 = new tfh(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tfh(int i, int i2) {
        super(i);
        this.f219984a = i2;
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f219984a) {
            case 0:
                xq00 xq00Var = (xq00) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (xq00Var.m91752Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ahf1.m25932d(k0e1.m54977L(R.string.verification_start_go_back_button, xq00Var), null, leu.m58818d(xq00Var).f64972h, 0L, new h171(5), null, 0, false, null, 0, null, xq00Var, 0, 0, 2026);
                } else {
                    xq00Var.m91757b0();
                }
                return w2a1.f247311a;
            case 1:
                xq00 xq00Var2 = (xq00) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (xq00Var2.m91752Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ahf1.m25932d(k0e1.m54977L(R.string.verification_success_done_button, xq00Var2), null, leu.m58818d(xq00Var2).f64972h, 0L, new h171(5), null, 0, false, null, 0, null, xq00Var2, 0, 0, 2026);
                } else {
                    xq00Var2.m91757b0();
                }
                return w2a1.f247311a;
            case 2:
                xq00 xq00Var3 = (xq00) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                if (xq00Var3.m91752Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    ahf1.m25932d(k0e1.m54977L(R.string.version_sunsetting_dialog_cta_learn_more, xq00Var3), null, null, 0L, null, null, 0, false, null, 0, null, xq00Var3, 0, 0, Entity.AUTOCOMPLETE_FIELD_NUMBER);
                } else {
                    xq00Var3.m91757b0();
                }
                return w2a1.f247311a;
            case 3:
                xq00 xq00Var4 = (xq00) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                if (xq00Var4.m91752Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    ahf1.m25932d(k0e1.m54977L(R.string.version_sunsetting_dialog_cta_update, xq00Var4), null, null, 0L, null, null, 0, false, null, 0, null, xq00Var4, 0, 0, Entity.AUTOCOMPLETE_FIELD_NUMBER);
                } else {
                    xq00Var4.m91757b0();
                }
                return w2a1.f247311a;
            case 4:
                xq00 xq00Var5 = (xq00) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                if (xq00Var5.m91752Y(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    ahf1.m25932d(k0e1.m54977L(R.string.show_results_button, xq00Var5), null, null, 0L, null, null, 0, false, null, 0, null, xq00Var5, 0, 0, Entity.AUTOCOMPLETE_FIELD_NUMBER);
                } else {
                    xq00Var5.m91757b0();
                }
                return w2a1.f247311a;
            case 5:
                xq00 xq00Var6 = (xq00) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                if (xq00Var6.m91752Y(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    y85.m93057b(bsu.f30386c, qgj.f188480a, null, leu.m58815a(xq00Var6).f112824b.f138758b, 0L, false, xq00Var6, bsu.f30387d | 48, 52);
                } else {
                    xq00Var6.m91757b0();
                }
                return w2a1.f247311a;
            case 6:
                xq00 xq00Var7 = (xq00) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                if (xq00Var7.m91752Y(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    long j = leu.m58815a(xq00Var7).f112823a.f229876c;
                    fmx0 fmx0Var = hmx0.f93097a;
                    cxh0 cxh0Var = cxh0.f43038a;
                    fxh0 fxh0VarM64246i = nec.m64246i(cxh0Var, j, fmx0Var);
                    m6d0 m6d0VarM36007d = dha.m36007d(d7f0.f46166e, false);
                    int iHashCode = Long.hashCode(xq00Var7.f264809T);
                    wpn0 wpn0VarM91778m = xq00Var7.m91778m();
                    fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var7, fxh0VarM64246i);
                    soh.f211194A.getClass();
                    C2087le c2087le = roh.f201257b;
                    if (xq00Var7.f264811a == null) {
                        pmg1.m70360s();
                        throw null;
                    }
                    xq00Var7.m91779m0();
                    if (xq00Var7.f264808S) {
                        xq00Var7.m91776l(c2087le);
                    } else {
                        xq00Var7.m91799w0();
                    }
                    zsf1.m96835F(m6d0VarM36007d, roh.f201262g, xq00Var7);
                    zsf1.m96835F(wpn0VarM91778m, roh.f201261f, xq00Var7);
                    zsf1.m96835F(Integer.valueOf(iHashCode), roh.f201265j, xq00Var7);
                    zsf1.m96833D(roh.f201266k, xq00Var7);
                    zsf1.m96835F(fxh0VarM48286s, roh.f201259d, xq00Var7);
                    y85.m93057b(psu.f180961c, qgj.f188480a, pha.f177517a.mo66945a(zsf1.m96865y(8, mi21.m61834r(leu.m58816b(xq00Var7).f117235g.f159606d, cxh0Var)), d7f0.f46174i), 0L, 0L, false, xq00Var7, psu.f180962d | 48, 56);
                    xq00Var7.m91788r(true);
                } else {
                    xq00Var7.m91757b0();
                }
                return w2a1.f247311a;
            case 7:
                xq00 xq00Var8 = (xq00) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                if (xq00Var8.m91752Y(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    y85.m93057b(mou.f145743c, qgj.f188480a, null, 0L, 0L, false, xq00Var8, mou.f145744d | 48, 60);
                } else {
                    xq00Var8.m91757b0();
                }
                return w2a1.f247311a;
            case 8:
                xq00 xq00Var9 = (xq00) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                if (xq00Var9.m91752Y(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    mqg1.m62545e(mi21.m61822f(1.0f, cxh0.f43038a), xq00Var9, 0);
                } else {
                    xq00Var9.m91757b0();
                }
                return w2a1.f247311a;
            case 9:
                xq00 xq00Var10 = (xq00) obj;
                int iIntValue10 = ((Number) obj2).intValue();
                if (xq00Var10.m91752Y(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    y85.m93057b(jnu.f114200c, new rgj(k0e1.m54977L(R.string.video_settings_back, xq00Var10)), null, 0L, 0L, false, xq00Var10, jnu.f114201d, 60);
                } else {
                    xq00Var10.m91757b0();
                }
                return w2a1.f247311a;
            case 10:
                xq00 xq00Var11 = (xq00) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                if (xq00Var11.m91752Y(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    ahf1.m25932d(k0e1.m54977L(R.string.video_settings_title, xq00Var11), null, leu.m58818d(xq00Var11).f64972h, 0L, null, null, 0, false, null, 0, null, xq00Var11, 0, 0, 2042);
                } else {
                    xq00Var11.m91757b0();
                }
                return w2a1.f247311a;
            case 11:
                xq00 xq00Var12 = (xq00) obj;
                int iIntValue12 = ((Number) obj2).intValue();
                if (xq00Var12.m91752Y(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    y85.m93057b(jqu.f115003c, new rgj(k0e1.m54977L(R.string.np_content_desc_video_settings, xq00Var12)), null, 0L, 0L, false, xq00Var12, jqu.f115004d, 60);
                } else {
                    xq00Var12.m91757b0();
                }
                return w2a1.f247311a;
            case 12:
                xq00 xq00Var13 = (xq00) obj;
                int iIntValue13 = ((Number) obj2).intValue();
                if (xq00Var13.m91752Y(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    y85.m93057b(knu.f124473c, qgj.f188480a, null, 0L, 0L, false, xq00Var13, knu.f124474d | 48, 60);
                } else {
                    xq00Var13.m91757b0();
                }
                return w2a1.f247311a;
            case 13:
                xq00 xq00Var14 = (xq00) obj;
                int iIntValue14 = ((Number) obj2).intValue();
                if (xq00Var14.m91752Y(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    y0v.m92603a(2, ehh.f59590a, xq00Var14, 390, 2);
                } else {
                    xq00Var14.m91757b0();
                }
                return w2a1.f247311a;
            case 14:
                xq00 xq00Var15 = (xq00) obj;
                int iIntValue15 = ((Number) obj2).intValue();
                if (xq00Var15.m91752Y(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    ahf1.m25932d("Not found", null, null, 0L, null, null, 0, false, null, 0, null, xq00Var15, 6, 0, Entity.AUTOCOMPLETE_FIELD_NUMBER);
                } else {
                    xq00Var15.m91757b0();
                }
                return w2a1.f247311a;
            case 15:
                xq00 xq00Var16 = (xq00) obj;
                int iIntValue16 = ((Number) obj2).intValue();
                if (xq00Var16.m91752Y(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    p271.m68899b(null, 0, 0L, 0L, xq00Var16, 0, 15);
                } else {
                    xq00Var16.m91757b0();
                }
                return w2a1.f247311a;
            case 16:
                xq00 xq00Var17 = (xq00) obj;
                int iIntValue17 = ((Number) obj2).intValue();
                if (xq00Var17.m91752Y(iIntValue17 & 1, (iIntValue17 & 3) != 2)) {
                    Object objM91750T = xq00Var17.m91750T();
                    if (objM91750T == t6x0.f217647t) {
                        objM91750T = y2e.f268581Z0;
                        xq00Var17.m91793t0(objM91750T);
                    }
                    hxg1.m49003p("Try out the book", "Listen to samples, clips and more.", "", (eh00) objM91750T, true, null, null, xq00Var17, 224694);
                } else {
                    xq00Var17.m91757b0();
                }
                return w2a1.f247311a;
            case 17:
                xq00 xq00Var18 = (xq00) obj;
                int iIntValue18 = ((Number) obj2).intValue();
                if (xq00Var18.m91752Y(iIntValue18 & 1, (iIntValue18 & 3) != 2)) {
                    Object objM91750T2 = xq00Var18.m91750T();
                    if (objM91750T2 == t6x0.f217647t) {
                        objM91750T2 = y2e.f268582a1;
                        xq00Var18.m91793t0(objM91750T2);
                    }
                    jxg1.m54657s("Try out the book", "Listen to samples, clips and more.", "", (eh00) objM91750T2, true, null, null, xq00Var18, 224694);
                } else {
                    xq00Var18.m91757b0();
                }
                return w2a1.f247311a;
            case 18:
                xq00 xq00Var19 = (xq00) obj;
                int iIntValue19 = ((Number) obj2).intValue();
                if (xq00Var19.m91752Y(iIntValue19 & 1, (iIntValue19 & 3) != 2)) {
                    ahf1.m25932d(k0e1.m54977L(R.string.retry_load_next_page_button_label, xq00Var19), null, null, 0L, null, null, 0, false, null, 0, null, xq00Var19, 0, 0, Entity.AUTOCOMPLETE_FIELD_NUMBER);
                } else {
                    xq00Var19.m91757b0();
                }
                return w2a1.f247311a;
            case 19:
                xq00 xq00Var20 = (xq00) obj;
                int iIntValue20 = ((Number) obj2).intValue();
                if (xq00Var20.m91752Y(iIntValue20 & 1, (iIntValue20 & 3) != 2)) {
                    aaf aafVarM87496a = w9f.m87496a(bj5.f27612c, d7f0.f46144O0, xq00Var20, 0);
                    int iHashCode2 = Long.hashCode(xq00Var20.f264809T);
                    wpn0 wpn0VarM91778m2 = xq00Var20.m91778m();
                    cxh0 cxh0Var2 = cxh0.f43038a;
                    fxh0 fxh0VarM48286s2 = hqg1.m48286s(xq00Var20, cxh0Var2);
                    soh.f211194A.getClass();
                    C2087le c2087le2 = roh.f201257b;
                    if (xq00Var20.f264811a == null) {
                        pmg1.m70360s();
                        throw null;
                    }
                    xq00Var20.m91779m0();
                    if (xq00Var20.f264808S) {
                        xq00Var20.m91776l(c2087le2);
                    } else {
                        xq00Var20.m91799w0();
                    }
                    zsf1.m96835F(aafVarM87496a, roh.f201262g, xq00Var20);
                    zsf1.m96835F(wpn0VarM91778m2, roh.f201261f, xq00Var20);
                    zsf1.m96835F(Integer.valueOf(iHashCode2), roh.f201265j, xq00Var20);
                    zsf1.m96833D(roh.f201266k, xq00Var20);
                    zsf1.m96835F(fxh0VarM48286s2, roh.f201259d, xq00Var20);
                    riw0.m75615i(xq00Var20, mi21.m61824h(56, cxh0Var2));
                    uyg1.m84224m(mi21.m61824h(70, cxh0Var2), xq00Var20, 0);
                    xq00Var20.m91788r(true);
                } else {
                    xq00Var20.m91757b0();
                }
                return w2a1.f247311a;
            case 20:
                xq00 xq00Var21 = (xq00) obj;
                int iIntValue21 = ((Number) obj2).intValue();
                if (xq00Var21.m91752Y(iIntValue21 & 1, (iIntValue21 & 3) != 2)) {
                    ahf1.m25932d(k0e1.m54977L(R.string.webview_button_retry, xq00Var21), null, null, 0L, null, null, 0, false, null, 0, null, xq00Var21, 0, 0, Entity.AUTOCOMPLETE_FIELD_NUMBER);
                } else {
                    xq00Var21.m91757b0();
                }
                return w2a1.f247311a;
            case 21:
                xq00 xq00Var22 = (xq00) obj;
                int iIntValue22 = ((Number) obj2).intValue();
                if (xq00Var22.m91752Y(iIntValue22 & 1, (iIntValue22 & 3) != 2)) {
                    ahf1.m25932d(k0e1.m54977L(R.string.parental_consent_welcome_continue, xq00Var22), null, null, 0L, null, null, 0, false, null, 0, null, xq00Var22, 0, 0, Entity.AUTOCOMPLETE_FIELD_NUMBER);
                } else {
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
                    y85.m93057b(uwu.f234734c, new rgj(k0e1.m54977L(R.string.close_button_accessibility, xq00Var24)), null, 0L, 0L, false, xq00Var24, uwu.f234735d, 60);
                } else {
                    xq00Var24.m91757b0();
                }
                return w2a1.f247311a;
            case 24:
                xq00 xq00Var25 = (xq00) obj;
                int iIntValue25 = ((Number) obj2).intValue();
                if (xq00Var25.m91752Y(iIntValue25 & 1, (iIntValue25 & 3) != 2)) {
                    ahf1.m25932d(k0e1.m54977L(R.string.workout_banner_button_text, xq00Var25), null, leu.m58818d(xq00Var25).f64975k, leu.m58815a(xq00Var25).f112824b.f138757a, null, null, 0, false, null, 0, null, xq00Var25, 0, 0, 2034);
                } else {
                    xq00Var25.m91757b0();
                }
                return w2a1.f247311a;
            case 25:
                xq00 xq00Var26 = (xq00) obj;
                int iIntValue26 = ((Number) obj2).intValue();
                if (xq00Var26.m91752Y(iIntValue26 & 1, (iIntValue26 & 3) != 2)) {
                    iz30.m51966a(kmg1.m56924v(R.drawable.ic_workouts, 0, xq00Var26), null, leu.m58815a(xq00Var26).f112824b.f138757a, xq00Var26, 56, 4);
                } else {
                    xq00Var26.m91757b0();
                }
                return w2a1.f247311a;
            case 26:
                xq00 xq00Var27 = (xq00) obj;
                int iIntValue27 = ((Number) obj2).intValue();
                if (xq00Var27.m91752Y(iIntValue27 & 1, (iIntValue27 & 3) != 2)) {
                    y85.m93057b(bpu.f29605c, new rgj(k0e1.m54977L(R.string.prompted_world_section_delete, xq00Var27)), mi21.m61834r(16, cxh0.f43038a), leu.m58815a(xq00Var27).f112824b.f138758b, 0L, false, xq00Var27, bpu.f29606d, 48);
                } else {
                    xq00Var27.m91757b0();
                }
                return w2a1.f247311a;
            case 27:
                xq00 xq00Var28 = (xq00) obj;
                int iIntValue28 = ((Number) obj2).intValue();
                if (xq00Var28.m91752Y(iIntValue28 & 1, (iIntValue28 & 3) != 2)) {
                    y85.m93057b(kuu.f126680c, new rgj(k0e1.m54977L(R.string.prompted_world_section_refresh, xq00Var28)), mi21.m61834r(16, cxh0.f43038a), leu.m58815a(xq00Var28).f112824b.f138758b, 0L, false, xq00Var28, kuu.f126681d, 48);
                } else {
                    xq00Var28.m91757b0();
                }
                return w2a1.f247311a;
            case 28:
                xq00 xq00Var29 = (xq00) obj;
                int iIntValue29 = ((Number) obj2).intValue();
                if (xq00Var29.m91752Y(iIntValue29 & 1, (iIntValue29 & 3) != 2)) {
                    irx0 irx0VarM36744a = drx0.m36744a(bj5.f27610a, d7f0.f46142M0, xq00Var29, 0);
                    int iHashCode3 = Long.hashCode(xq00Var29.f264809T);
                    wpn0 wpn0VarM91778m3 = xq00Var29.m91778m();
                    cxh0 cxh0Var3 = cxh0.f43038a;
                    fxh0 fxh0VarM48286s3 = hqg1.m48286s(xq00Var29, cxh0Var3);
                    soh.f211194A.getClass();
                    C2087le c2087le3 = roh.f201257b;
                    if (xq00Var29.f264811a == null) {
                        pmg1.m70360s();
                        throw null;
                    }
                    xq00Var29.m91779m0();
                    if (xq00Var29.f264808S) {
                        xq00Var29.m91776l(c2087le3);
                    } else {
                        xq00Var29.m91799w0();
                    }
                    zsf1.m96835F(irx0VarM36744a, roh.f201262g, xq00Var29);
                    zsf1.m96835F(wpn0VarM91778m3, roh.f201261f, xq00Var29);
                    zsf1.m96835F(Integer.valueOf(iHashCode3), roh.f201265j, xq00Var29);
                    zsf1.m96833D(roh.f201266k, xq00Var29);
                    zsf1.m96835F(fxh0VarM48286s3, roh.f201259d, xq00Var29);
                    String strM54977L = k0e1.m54977L(R.string.prompted_world_section_edit_section, xq00Var29);
                    y85.m93057b(tou.f222320c, new rgj(strM54977L), mi21.m61834r(12, cxh0Var3), 0L, 0L, false, xq00Var29, tou.f222321d, 56);
                    ahf1.m25932d(strM54977L, null, fr0.m42472p(cxh0Var3, 8, xq00Var29, xq00Var29).f64975k, 0L, null, null, 0, false, null, 0, null, xq00Var29, 0, 0, 2042);
                    xq00Var29.m91788r(true);
                } else {
                    xq00Var29.m91757b0();
                }
                return w2a1.f247311a;
            default:
                xq00 xq00Var30 = (xq00) obj;
                int iIntValue30 = ((Number) obj2).intValue();
                if (xq00Var30.m91752Y(iIntValue30 & 1, (iIntValue30 & 3) != 2)) {
                    y85.m93057b(knu.f124473c, qgj.f188480a, null, 0L, 0L, false, xq00Var30, knu.f124474d | 48, 60);
                } else {
                    xq00Var30.m91757b0();
                }
                return w2a1.f247311a;
        }
    }
}
