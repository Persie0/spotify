package p204p;

import com.comscore.streaming.ContentType;
import com.spotify.music.R;
import java.util.ArrayList;
import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes9.dex */
public final class k1h extends qe70 implements xh00 {

    /* JADX INFO: renamed from: L0 */
    public static final k1h f118320L0;

    /* JADX INFO: renamed from: M0 */
    public static final k1h f118321M0;

    /* JADX INFO: renamed from: N0 */
    public static final k1h f118322N0;

    /* JADX INFO: renamed from: O0 */
    public static final k1h f118323O0;

    /* JADX INFO: renamed from: P0 */
    public static final k1h f118324P0;

    /* JADX INFO: renamed from: Q0 */
    public static final k1h f118325Q0;

    /* JADX INFO: renamed from: R0 */
    public static final k1h f118326R0;

    /* JADX INFO: renamed from: S0 */
    public static final k1h f118327S0;

    /* JADX INFO: renamed from: T0 */
    public static final k1h f118328T0;

    /* JADX INFO: renamed from: U0 */
    public static final k1h f118329U0;

    /* JADX INFO: renamed from: V0 */
    public static final k1h f118330V0;

    /* JADX INFO: renamed from: W0 */
    public static final k1h f118331W0;

    /* JADX INFO: renamed from: X */
    public static final k1h f118332X;

    /* JADX INFO: renamed from: X0 */
    public static final k1h f118333X0;

    /* JADX INFO: renamed from: Y */
    public static final k1h f118334Y;

    /* JADX INFO: renamed from: Y0 */
    public static final k1h f118335Y0;

    /* JADX INFO: renamed from: Z */
    public static final k1h f118336Z;

    /* JADX INFO: renamed from: Z0 */
    public static final k1h f118337Z0;

    /* JADX INFO: renamed from: a1 */
    public static final k1h f118338a1;

    /* JADX INFO: renamed from: b */
    public static final k1h f118339b;

    /* JADX INFO: renamed from: b1 */
    public static final k1h f118340b1;

    /* JADX INFO: renamed from: c */
    public static final k1h f118341c;

    /* JADX INFO: renamed from: c1 */
    public static final k1h f118342c1;

    /* JADX INFO: renamed from: d */
    public static final k1h f118343d;

    /* JADX INFO: renamed from: e */
    public static final k1h f118344e;

    /* JADX INFO: renamed from: f */
    public static final k1h f118345f;

    /* JADX INFO: renamed from: g */
    public static final k1h f118346g;

    /* JADX INFO: renamed from: h */
    public static final k1h f118347h;

    /* JADX INFO: renamed from: i */
    public static final k1h f118348i;

    /* JADX INFO: renamed from: t */
    public static final k1h f118349t;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f118350a;

    static {
        int i = 4;
        f118339b = new k1h(i, 0);
        f118341c = new k1h(i, 1);
        f118343d = new k1h(i, 2);
        f118344e = new k1h(i, 3);
        f118345f = new k1h(i, 4);
        f118346g = new k1h(i, 5);
        f118347h = new k1h(i, 6);
        f118348i = new k1h(i, 7);
        f118349t = new k1h(i, 8);
        f118332X = new k1h(i, 9);
        f118334Y = new k1h(i, 10);
        f118336Z = new k1h(i, 11);
        f118320L0 = new k1h(i, 12);
        f118321M0 = new k1h(i, 13);
        f118322N0 = new k1h(i, 14);
        f118323O0 = new k1h(i, 15);
        f118324P0 = new k1h(i, 16);
        f118325Q0 = new k1h(i, 17);
        f118326R0 = new k1h(i, 18);
        f118327S0 = new k1h(i, 19);
        f118328T0 = new k1h(i, 20);
        f118329U0 = new k1h(i, 21);
        f118330V0 = new k1h(i, 22);
        f118331W0 = new k1h(i, 23);
        f118333X0 = new k1h(i, 24);
        f118335Y0 = new k1h(i, 25);
        f118337Z0 = new k1h(i, 26);
        f118338a1 = new k1h(i, 27);
        f118340b1 = new k1h(i, 28);
        f118342c1 = new k1h(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k1h(int i, int i2) {
        super(i);
        this.f118350a = i2;
    }

    /* JADX WARN: Code duplicated, block: B:180:0x0533  */
    /* JADX WARN: Code duplicated, block: B:181:0x0538  */
    /* JADX WARN: Code duplicated, block: B:184:0x053c  */
    @Override // p204p.xh00
    /* JADX INFO: renamed from: M */
    public final Object mo24818M(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        int i3;
        av91 av91Var;
        av91 av91Var2;
        av91 av91Var3;
        String string;
        String string2;
        int i4 = this.f118350a;
        nau nauVar = nau.f152117a;
        w2a1 w2a1Var = w2a1.f247311a;
        int i5 = 1;
        switch (i4) {
            case 0:
                boolean z = true;
                myq0 myq0Var = (myq0) obj;
                gh00 gh00Var = (gh00) obj2;
                xq00 xq00Var = (xq00) obj3;
                int iIntValue = ((Number) obj4).intValue();
                if ((iIntValue & 6) == 0) {
                    i = iIntValue | (xq00Var.m91766g(myq0Var) ? 4 : 2);
                } else {
                    i = iIntValue;
                }
                if ((iIntValue & 48) == 0) {
                    i |= xq00Var.m91770i(gh00Var) ? 32 : 16;
                }
                if ((i & 147) == 146) {
                    z = false;
                }
                if (xq00Var.m91752Y(i & 1, z)) {
                    ljf1.m59150b(myq0Var, gh00Var, null, xq00Var, i & 126);
                } else {
                    xq00Var.m91757b0();
                }
                return w2a1Var;
            case 1:
                g15 g15Var = (g15) obj;
                z601 z601Var = (z601) obj2;
                xq00 xq00Var2 = (xq00) obj3;
                ((Number) obj4).intValue();
                String strM54977L = k0e1.m54977L(R.string.settings_item_private_session_learn_more, xq00Var2);
                boolean zM91770i = xq00Var2.m91770i(z601Var);
                Object objM91750T = xq00Var2.m91750T();
                if (zM91770i || objM91750T == t6x0.f217647t) {
                    objM91750T = new vgf(z601Var, 13);
                    xq00Var2.m91793t0(objM91750T);
                }
                vie.m85608a(g15Var, strM54977L, "learn_more", vie.f241686a, (gh00) objM91750T);
                return w2a1Var;
            case 2:
                boolean z2 = true;
                float fFloatValue = ((Number) obj).floatValue();
                fxh0 fxh0Var = (fxh0) obj2;
                xq00 xq00Var3 = (xq00) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                if ((iIntValue2 & 6) == 0) {
                    i2 = iIntValue2 | (xq00Var3.m91760d(fFloatValue) ? 4 : 2);
                } else {
                    i2 = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i2 |= xq00Var3.m91766g(fxh0Var) ? 32 : 16;
                }
                if ((i2 & 147) == 146) {
                    z2 = false;
                }
                if (xq00Var3.m91752Y(i2 & 1, z2)) {
                    z9g1.m95657g(fFloatValue, fxh0Var, 0L, 0L, xq00Var3, i2 & 126);
                } else {
                    xq00Var3.m91757b0();
                }
                return w2a1Var;
            case 3:
                xq00 xq00Var4 = (xq00) obj3;
                ((Number) obj4).intValue();
                if (((v3c1) obj2) instanceof p3c1) {
                    xq00Var4.m91771i0(-2027422215);
                    qiu.m72876b(18, s3h.f205286a, xq00Var4, 54);
                    xq00Var4.m91788r(false);
                } else {
                    xq00Var4.m91771i0(1575044094);
                    xq00Var4.m91788r(false);
                }
                return w2a1Var;
            case 4:
                svh0 svh0Var = (svh0) obj;
                gh00 gh00Var2 = (gh00) obj2;
                xq00 xq00Var5 = (xq00) obj3;
                int iIntValue3 = ((Number) obj4).intValue();
                if ((iIntValue3 & 6) == 0) {
                    i3 = iIntValue3 | (xq00Var5.m91766g(svh0Var) ? 4 : 2);
                } else {
                    i3 = iIntValue3;
                }
                if ((iIntValue3 & 48) == 0) {
                    i3 |= xq00Var5.m91770i(gh00Var2) ? 32 : 16;
                }
                if (xq00Var5.m91752Y(i3 & 1, (i3 & 147) != 146)) {
                    wj50.m88279p(svh0Var);
                    bnf1.m29969e(svh0Var, gh00Var2, null, xq00Var5, i3 & ContentType.LONG_FORM_ON_DEMAND);
                } else {
                    xq00Var5.m91757b0();
                }
                return w2a1Var;
            case 5:
                return new zeh0(Integer.valueOf(((Number) obj3).intValue()), ((qh11) obj).f188598d, (st91) obj4);
            case 6:
                zeh0 zeh0Var = (zeh0) obj;
                qh11 qh11Var = (qh11) obj2;
                tnh tnhVar = (tnh) obj4;
                if (tnhVar instanceof rnh) {
                    return zeh0Var.m95984a(qh11Var.f188595a);
                }
                if (tnhVar instanceof snh) {
                    return zeh0Var.m95985g();
                }
                throw new NoWhenBranchMatchedException();
            case 7:
                dxh dxhVar = (dxh) obj2;
                ((Number) obj3).intValue();
                return new ggg0(hxh.m49019f(dxhVar), dxhVar.f53978a, (st91) obj4);
            case 8:
                ggg0 ggg0Var = (ggg0) obj;
                dxh dxhVar2 = (dxh) obj3;
                cxh cxhVar = (cxh) obj4;
                zt91 zt91Var = ggg0Var.f79673b;
                String str = dxhVar2.f53978a;
                if (cxhVar.equals(qwh.f193345a)) {
                    yt91 yt91VarM96903c = zt91Var.m96903c();
                    yt91VarM96903c.f276055i.add(new bu91("button_row", null, null, null, null));
                    yt91VarM96903c.f276056j = false;
                    yt91 yt91VarM96903c2 = yt91VarM96903c.m94607a().m96903c();
                    yt91VarM96903c2.f276055i.add(new bu91("join_waitlist_button", null, null, null, null));
                    yt91VarM96903c2.f276056j = false;
                    zt91 zt91VarM94607a = yt91VarM96903c2.m94607a();
                    dv91 dv91Var = new dv91("hit", 1);
                    String string3 = str != null ? str.toString() : null;
                    av91Var2 = new av91("", "", dv91Var, new bv91("follow", 1, Collections.singletonMap("item_to_be_followed", string3 != null ? string3 : "")), zt91VarM94607a, ggg0Var.f79672a, System.currentTimeMillis());
                } else if (cxhVar.equals(wwh.f255767a)) {
                    if (dxhVar2.f53989l) {
                        yt91 yt91VarM96903c3 = zt91Var.m96903c();
                        yt91VarM96903c3.f276055i.add(new bu91("button_row", null, null, null, null));
                        yt91VarM96903c3.f276056j = false;
                        yt91 yt91VarM96903c4 = yt91VarM96903c3.m94607a().m96903c();
                        yt91VarM96903c4.f276055i.add(new bu91("remind_me_button", null, null, null, null));
                        yt91VarM96903c4.f276056j = false;
                        zt91 zt91VarM94607a2 = yt91VarM96903c4.m94607a();
                        dv91 dv91Var2 = new dv91("hit", 1);
                        String string4 = str != null ? str.toString() : null;
                        av91Var2 = new av91("", "", dv91Var2, new bv91("unfollow", 1, Collections.singletonMap("item_to_be_unfollowed", string4 != null ? string4 : "")), zt91VarM94607a2, ggg0Var.f79672a, System.currentTimeMillis());
                    } else {
                        yt91 yt91VarM96903c5 = zt91Var.m96903c();
                        yt91VarM96903c5.f276055i.add(new bu91("button_row", null, null, null, null));
                        yt91VarM96903c5.f276056j = false;
                        yt91 yt91VarM96903c6 = yt91VarM96903c5.m94607a().m96903c();
                        yt91VarM96903c6.f276055i.add(new bu91("remind_me_button", null, null, null, null));
                        yt91VarM96903c6.f276056j = false;
                        zt91 zt91VarM94607a3 = yt91VarM96903c6.m94607a();
                        dv91 dv91Var3 = new dv91("hit", 1);
                        String string5 = str != null ? str.toString() : null;
                        av91Var2 = new av91("", "", dv91Var3, new bv91("follow", 1, Collections.singletonMap("item_to_be_followed", string5 != null ? string5 : "")), zt91VarM94607a3, ggg0Var.f79672a, System.currentTimeMillis());
                    }
                } else {
                    if (!cxhVar.equals(twh.f224441a)) {
                        if (cxhVar.equals(axh.f20869a)) {
                            yt91 yt91VarM96903c7 = zt91Var.m96903c();
                            yt91VarM96903c7.f276055i.add(new bu91("button_row", null, null, null, null));
                            yt91VarM96903c7.f276056j = false;
                            yt91 yt91VarM96903c8 = yt91VarM96903c7.m94607a().m96903c();
                            yt91VarM96903c8.f276055i.add(new bu91("cant_attend_button", null, null, null, null));
                            yt91VarM96903c8.f276056j = false;
                            av91Var = new av91("", "", new dv91("hit", 1), new bv91("ui_reveal", 1, nauVar), yt91VarM96903c8.m94607a(), ggg0Var.f79672a, System.currentTimeMillis());
                        } else if (cxhVar.equals(lwh.f137572a)) {
                            yt91 yt91VarM96903c9 = zt91Var.m96903c();
                            yt91VarM96903c9.f276055i.add(new bu91("cant_attend_confirmation_dialog", null, null, null, null));
                            yt91VarM96903c9.f276056j = false;
                            zt91 zt91VarM94607a4 = yt91VarM96903c9.m94607a();
                            dv91 dv91Var4 = new dv91("hit", 1);
                            String string6 = str != null ? str.toString() : null;
                            av91Var2 = new av91("", "", dv91Var4, new bv91("dislike", 1, Collections.singletonMap("item_to_be_disliked", string6 != null ? string6 : "")), zt91VarM94607a4, ggg0Var.f79672a, System.currentTimeMillis());
                        } else {
                            if (cxhVar.equals(owh.f170714a)) {
                                yt91 yt91VarM96903c10 = zt91Var.m96903c();
                                yt91VarM96903c10.f276055i.add(new bu91("cant_attend_confirmation_dialog", null, null, null, null));
                                yt91VarM96903c10.f276056j = false;
                                return new av91("", "", new dv91("hit", 1), new bv91("ui_hide", 1, nauVar), yt91VarM96903c10.m94607a(), ggg0Var.f79672a, System.currentTimeMillis());
                            }
                            if (cxhVar instanceof kwh) {
                                yt91 yt91VarM96903c11 = zt91Var.m96903c();
                                yt91VarM96903c11.f276055i.add(new bu91("button_row", null, null, null, null));
                                yt91VarM96903c11.f276056j = false;
                                yt91 yt91VarM96903c12 = yt91VarM96903c11.m94607a().m96903c();
                                yt91VarM96903c12.f276055i.add(new bu91("buy_tickets_button", null, null, null, null));
                                yt91VarM96903c12.f276056j = false;
                                zt91 zt91VarM94607a5 = yt91VarM96903c12.m94607a();
                                String str2 = ((kwh) cxhVar).f127094a;
                                dv91 dv91Var5 = new dv91("hit", 1);
                                String string7 = str2 != null ? str2.toString() : null;
                                av91Var2 = new av91("", "", dv91Var5, new bv91("navigate_to_external_uri", 1, Collections.singletonMap("destination", string7 != null ? string7 : "")), zt91VarM94607a5, ggg0Var.f79672a, System.currentTimeMillis());
                            } else if (cxhVar instanceof bxh) {
                                yt91 yt91VarM96903c13 = zt91Var.m96903c();
                                yt91VarM96903c13.f276055i.add(new bu91("button_row", null, null, null, null));
                                yt91VarM96903c13.f276056j = false;
                                yt91 yt91VarM96903c14 = yt91VarM96903c13.m94607a().m96903c();
                                yt91VarM96903c14.f276055i.add(new bu91("see_all_events_button", null, null, null, null));
                                yt91VarM96903c14.f276056j = false;
                                zt91 zt91VarM94607a6 = yt91VarM96903c14.m94607a();
                                String str3 = ((bxh) cxhVar).f31864a;
                                dv91 dv91Var6 = new dv91("hit", 1);
                                String string8 = str3 != null ? str3.toString() : null;
                                av91Var2 = new av91("", "", dv91Var6, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string8 != null ? string8 : "")), zt91VarM94607a6, ggg0Var.f79672a, System.currentTimeMillis());
                            } else {
                                if (!(cxhVar instanceof zwh)) {
                                    if ((cxhVar instanceof nwh) || (cxhVar instanceof mwh) || (cxhVar instanceof rwh) || (cxhVar instanceof swh) || (cxhVar instanceof uwh) || (cxhVar instanceof xwh) || (cxhVar instanceof pwh) || (cxhVar instanceof ywh) || (cxhVar instanceof vwh)) {
                                        return null;
                                    }
                                    throw new NoWhenBranchMatchedException();
                                }
                                yt91 yt91VarM96903c15 = zt91Var.m96903c();
                                yt91VarM96903c15.f276055i.add(new bu91("share_button", null, null, null, null));
                                yt91VarM96903c15.f276056j = false;
                                av91Var = new av91("", "", new dv91("hit", 1), new bv91("ui_reveal", 1, nauVar), yt91VarM96903c15.m94607a(), ggg0Var.f79672a, System.currentTimeMillis());
                            }
                        }
                        return av91Var;
                    }
                    yt91 yt91VarM96903c16 = zt91Var.m96903c();
                    yt91VarM96903c16.f276055i.add(new bu91("button_row", null, null, null, null));
                    yt91VarM96903c16.f276056j = false;
                    yt91 yt91VarM96903c17 = yt91VarM96903c16.m94607a().m96903c();
                    yt91VarM96903c17.f276055i.add(new bu91("not_interested_button", null, null, null, null));
                    yt91VarM96903c17.f276056j = false;
                    zt91 zt91VarM94607a7 = yt91VarM96903c17.m94607a();
                    dv91 dv91Var7 = new dv91("hit", 1);
                    String string9 = str != null ? str.toString() : null;
                    av91Var2 = new av91("", "", dv91Var7, new bv91("dislike", 1, Collections.singletonMap("item_to_be_disliked", string9 != null ? string9 : "")), zt91VarM94607a7, ggg0Var.f79672a, System.currentTimeMillis());
                }
                return av91Var2;
            case 9:
                ((Number) obj3).intValue();
                return new hgg0(new l9g0(((ezh) obj).f64378a, 25));
            case 10:
                hgg0 hgg0Var = (hgg0) obj;
                dzh dzhVar = (dzh) obj4;
                String str4 = ((ezh) obj2).f64378a;
                if (dzhVar.equals(zyh.f287589a)) {
                    st91 st91VarMo24361d = hgg0Var.mo24361d();
                    zt91 zt91Var2 = zt91.f286105i;
                    yt91 yt91VarM50626j = ihf1.m50626j();
                    yt91VarM50626j.f276054h = "music";
                    yt91VarM50626j.f276047a = "mobile-close-button";
                    yt91VarM50626j.f276052f = "1.0.0";
                    yt91VarM50626j.f276053g = "20.0.5";
                    zt91 zt91VarM94607a8 = yt91VarM50626j.m94607a();
                    h6f.m46715L("song-dna", "artists-dna", "blend-dna");
                    return new av91("", "", new dv91("hit", 1), new bv91("ui_hide", 1, nauVar), zt91VarM94607a8, st91VarMo24361d, System.currentTimeMillis());
                }
                if (dzhVar.equals(czh.f43564a)) {
                    st91 st91VarMo24361d2 = hgg0Var.mo24361d();
                    zt91 zt91Var3 = zt91.f286105i;
                    yt91 yt91VarM50626j2 = ihf1.m50626j();
                    yt91VarM50626j2.f276054h = "music";
                    yt91VarM50626j2.f276047a = "mobile-share-button";
                    yt91VarM50626j2.f276052f = "1.0.0";
                    yt91VarM50626j2.f276053g = "20.0.5";
                    zt91 zt91VarM94607a9 = yt91VarM50626j2.m94607a();
                    dv91 dv91Var8 = new dv91("hit", 1);
                    String string10 = str4 != null ? str4.toString() : null;
                    return new av91("", "", dv91Var8, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string10 != null ? string10 : "")), zt91VarM94607a9, st91VarMo24361d2, System.currentTimeMillis());
                }
                if (!dzhVar.equals(azh.f21607a)) {
                    if (!(dzhVar instanceof bzh)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    s8g0 s8g0Var = new s8g0(new tmg0(hgg0Var.mo24361d()), str4);
                    return ((bzh) dzhVar).f32497a ? s8g0Var.m77492r(str4) : s8g0Var.m77489o(str4);
                }
                st91 st91VarMo24361d3 = hgg0Var.mo24361d();
                zt91 zt91Var4 = zt91.f286105i;
                yt91 yt91VarM50626j3 = ihf1.m50626j();
                yt91VarM50626j3.f276054h = "music";
                yt91VarM50626j3.f276047a = "mobile-context-menu-button";
                yt91VarM50626j3.f276052f = "2.0.0";
                yt91VarM50626j3.f276053g = "20.0.5";
                return new av91("", "", new dv91("hit", 1), new bv91("ui_reveal", 1, nauVar), yt91VarM50626j3.m94607a(), st91VarMo24361d3, System.currentTimeMillis());
            case 11:
                agg0 agg0Var = (agg0) obj;
                e1i e1iVar = (e1i) obj3;
                y0i y0iVar = (y0i) obj4;
                zt91 zt91Var5 = agg0Var.f15370b;
                String str5 = ((p1i) obj2).f173085a;
                if (y0iVar.equals(t0i.f215893a)) {
                    agg0Var.getClass();
                    dv91 dv91Var9 = new dv91("hit", 1);
                    String string11 = str5 != null ? str5.toString() : null;
                    av91Var3 = new av91("", "", dv91Var9, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string11 != null ? string11 : "")), agg0Var.f15370b, agg0Var.f15369a, System.currentTimeMillis());
                } else if (y0iVar instanceof u0i) {
                    int iOrdinal = ((u0i) y0iVar).f225515a.ordinal();
                    if (iOrdinal == 0 || iOrdinal == 1) {
                        yt91 yt91VarM96903c18 = zt91Var5.m96903c();
                        yt91VarM96903c18.f276055i.add(new bu91("see_tickets_button", null, null, null, null));
                        yt91VarM96903c18.f276056j = false;
                        zt91 zt91VarM94607a10 = yt91VarM96903c18.m94607a();
                        dv91 dv91Var10 = new dv91("hit", 1);
                        if (str5 != null) {
                            string = str5.toString();
                        } else {
                            string = null;
                        }
                        av91Var3 = new av91("", "", dv91Var10, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string != null ? string : "")), zt91VarM94607a10, agg0Var.f15369a, System.currentTimeMillis());
                    } else {
                        if (iOrdinal != 2) {
                            if (iOrdinal != 3) {
                                if (iOrdinal != 4) {
                                    if (iOrdinal != 5) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                }
                                yt91 yt91VarM96903c19 = zt91Var5.m96903c();
                                yt91VarM96903c19.f276055i.add(new bu91("see_tickets_button", null, null, null, null));
                                yt91VarM96903c19.f276056j = false;
                                zt91 zt91VarM94607a11 = yt91VarM96903c19.m94607a();
                                dv91 dv91Var11 = new dv91("hit", 1);
                                if (str5 != null) {
                                    string = str5.toString();
                                } else {
                                    string = null;
                                }
                                av91Var3 = new av91("", "", dv91Var11, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string != null ? string : "")), zt91VarM94607a11, agg0Var.f15369a, System.currentTimeMillis());
                            }
                            return null;
                        }
                        yt91 yt91VarM96903c20 = zt91Var5.m96903c();
                        yt91VarM96903c20.f276055i.add(new bu91("join_waitlist_button", null, null, null, null));
                        yt91VarM96903c20.f276056j = false;
                        zt91 zt91VarM94607a12 = yt91VarM96903c20.m94607a();
                        dv91 dv91Var12 = new dv91("hit", 1);
                        String string12 = str5 != null ? str5.toString() : null;
                        av91Var3 = new av91("", "", dv91Var12, new bv91("follow", 1, Collections.singletonMap("item_to_be_followed", string12 != null ? string12 : "")), zt91VarM94607a12, agg0Var.f15369a, System.currentTimeMillis());
                    }
                } else {
                    if (y0iVar.equals(w0i.f246741a)) {
                        yt91 yt91VarM96903c21 = zt91Var5.m96903c();
                        yt91VarM96903c21.f276055i.add(new bu91("context_menu_button", null, null, null, null));
                        yt91VarM96903c21.f276056j = false;
                        return new av91("", "", new dv91("hit", 1), new bv91("ui_reveal", 1, nauVar), yt91VarM96903c21.m94607a(), agg0Var.f15369a, System.currentTimeMillis());
                    }
                    if (!y0iVar.equals(x0i.f256885a)) {
                        if (!y0iVar.equals(v0i.f236006a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        if ((e1iVar instanceof c1i) && ((c1i) e1iVar).f33125y) {
                            yt91 yt91VarM96903c22 = zt91Var5.m96903c();
                            yt91VarM96903c22.f276055i.add(new bu91("expand_toggle_button", null, null, null, null));
                            yt91VarM96903c22.f276056j = false;
                            return new av91("", "", new dv91("hit", 1), new bv91("ui_reveal", 1, nauVar), yt91VarM96903c22.m94607a(), agg0Var.f15369a, System.currentTimeMillis());
                        }
                        yt91 yt91VarM96903c23 = zt91Var5.m96903c();
                        yt91VarM96903c23.f276055i.add(new bu91("expand_toggle_button", null, null, null, null));
                        yt91VarM96903c23.f276056j = false;
                        return new av91("", "", new dv91("hit", 1), new bv91("ui_hide", 1, nauVar), yt91VarM96903c23.m94607a(), agg0Var.f15369a, System.currentTimeMillis());
                    }
                    yt91 yt91VarM96903c24 = agg0Var.f15370b.m96903c();
                    yt91VarM96903c24.f276055i.add(new bu91("share_button", null, null, null, null));
                    yt91VarM96903c24.f276056j = false;
                    zt91 zt91VarM94607a13 = yt91VarM96903c24.m94607a();
                    String strM26938f = arg1.m26938f(e1iVar);
                    dv91 dv91Var13 = new dv91("hit", 1);
                    String string13 = strM26938f != null ? strM26938f.toString() : null;
                    av91Var3 = new av91("", "", dv91Var13, new bv91("share", 2, kkc0.m56695h0(new pqm0("entity_to_be_shared", string13 != null ? string13 : ""), new pqm0("share_id", "share-campaign-promo-card"))), zt91VarM94607a13, agg0Var.f15369a, System.currentTimeMillis());
                }
                return av91Var3;
            case 12:
                ach0 ach0Var = (ach0) obj;
                x1i x1iVar = (x1i) obj2;
                if (((w1i) obj4) instanceof w1i) {
                    return ach0Var.m25473a(x1iVar.f257196a);
                }
                throw new NoWhenBranchMatchedException();
            case 13:
                return new m2i((luh) obj, (pfa0) obj2, (v140) obj3, (erc1) obj4);
            case 14:
                s2i s2iVar = (s2i) obj;
                int iIntValue4 = ((Number) obj3).intValue();
                st91 st91Var = (st91) obj4;
                String str6 = s2iVar.f205012a;
                int iM38547C = edb.m38547C(s2iVar.f205013b);
                if (iM38547C == 0) {
                    i5 = 2;
                } else if (iM38547C == 1) {
                    i5 = 3;
                } else if (iM38547C != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                String str7 = s2iVar.f205015d;
                if (str7 == null) {
                    return new oug0(i5, Integer.valueOf(iIntValue4), str6, st91Var);
                }
                Integer num = s2iVar.f205016e;
                zt91 zt91Var6 = zt91.f286105i;
                yt91 yt91VarM50626j4 = ihf1.m50626j();
                yt91VarM50626j4.f276054h = "music";
                yt91VarM50626j4.f276047a = "mobile-shelf-section";
                yt91VarM50626j4.f276052f = "6.0.0";
                yt91VarM50626j4.f276053g = "20.0.5";
                yt91VarM50626j4.f276048b = str7;
                yt91VarM50626j4.f276049c = num;
                yt91VarM50626j4.f276051e = null;
                zt91 zt91VarM94607a14 = yt91VarM50626j4.m94607a();
                Integer num2 = s2iVar.f205017f;
                st91 st91Var2 = st91.f213865b;
                ArrayList arrayList = new ArrayList();
                if (st91Var != null) {
                    arrayList.addAll(st91Var.f213866a);
                }
                return new oug0(i5, num2, str6, nap.m64023p(arrayList, zt91VarM94607a14, arrayList));
            case 15:
                oug0 oug0Var = (oug0) obj;
                t2i t2iVar = (t2i) obj3;
                q2i q2iVar = (q2i) obj4;
                String str8 = t2iVar.f216558a;
                if (q2iVar.equals(n2i.f149769a)) {
                    dv91 dv91Var14 = new dv91("hit", 1);
                    string2 = str8 != null ? str8.toString() : null;
                    return new av91("", "", dv91Var14, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string2 != null ? string2 : "")), oug0Var.f170287b, oug0Var.f170286a, System.currentTimeMillis());
                }
                if (!q2iVar.equals(o2i.f161054a)) {
                    if (q2iVar.equals(p2i.f173359a)) {
                        return null;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                if (t2iVar.f216565h) {
                    dv91 dv91Var15 = new dv91("hit", 1);
                    string2 = str8 != null ? str8.toString() : null;
                    return new av91("", "", dv91Var15, new bv91("remove_like", 1, Collections.singletonMap("item_no_longer_liked", string2 != null ? string2 : "")), oug0Var.f170287b, oug0Var.f170286a, System.currentTimeMillis());
                }
                dv91 dv91Var16 = new dv91("hit", 1);
                string2 = str8 != null ? str8.toString() : null;
                return new av91("", "", dv91Var16, new bv91("like", 1, Collections.singletonMap("item_to_be_liked", string2 != null ? string2 : "")), oug0Var.f170287b, oug0Var.f170286a, System.currentTimeMillis());
            case 16:
                Integer numValueOf = Integer.valueOf(((Number) obj3).intValue());
                ((x2i) obj).getClass();
                return new yeh0(numValueOf, "concert_carousel", "unranked", (st91) obj4);
            case 17:
                return null;
            case 18:
                hch0 hch0Var = (hch0) obj;
                e3i e3iVar = (e3i) obj2;
                if (((d3i) obj4) instanceof d3i) {
                    return hch0Var.m47117a(e3iVar.f55802a);
                }
                throw new NoWhenBranchMatchedException();
            case 19:
                cch0 cch0Var = (cch0) obj;
                e3i e3iVar2 = (e3i) obj2;
                if (((d3i) obj4) instanceof d3i) {
                    return cch0Var.m32248a(e3iVar2.f55802a);
                }
                throw new NoWhenBranchMatchedException();
            case 20:
                return new egg0(Integer.valueOf(((Number) obj3).intValue()), ((n4i) obj).f150348a, (st91) obj4);
            case 21:
                egg0 egg0Var = (egg0) obj;
                o4i o4iVar = (o4i) obj3;
                l4i l4iVar = (l4i) obj4;
                String str9 = o4iVar.f161678e;
                if (l4iVar.equals(j4i.f108707a)) {
                    return egg0Var.m38866a(str9);
                }
                if (l4iVar.equals(k4i.f119226a)) {
                    return o4iVar.f161677d ? egg0Var.m38868i(str9) : egg0Var.m38867h(str9);
                }
                throw new NoWhenBranchMatchedException();
            case 22:
                cgg0 cgg0Var = (cgg0) obj;
                gfi gfiVar = (gfi) obj3;
                if (!(((jtw) obj4) instanceof jtw)) {
                    throw new NoWhenBranchMatchedException();
                }
                String str10 = gfiVar.f79355a;
                dv91 dv91Var17 = new dv91("hit", 1);
                string2 = str10 != null ? str10.toString() : null;
                return new av91("", "", dv91Var17, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string2 != null ? string2 : "")), cgg0Var.f37659b, cgg0Var.f37658a, System.currentTimeMillis());
            case 23:
                ((Number) obj3).intValue();
                return new dgg0((st91) obj4);
            case 24:
                dgg0 dgg0Var = (dgg0) obj;
                wei weiVar = (wei) obj4;
                if (!(weiVar instanceof wei)) {
                    throw new NoWhenBranchMatchedException();
                }
                Integer numValueOf2 = Integer.valueOf(weiVar.f250541b);
                yt91 yt91VarM96903c25 = dgg0Var.f48794b.m96903c();
                yt91VarM96903c25.f276055i.add(new bu91("ticket_provider", null, numValueOf2, null, null));
                yt91VarM96903c25.f276056j = false;
                yt91 yt91VarM96903c26 = yt91VarM96903c25.m94607a().m96903c();
                yt91VarM96903c26.f276055i.add(new bu91("purchase_action_button", null, null, null, null));
                yt91VarM96903c26.f276056j = true;
                zt91 zt91VarM94607a15 = yt91VarM96903c26.m94607a();
                String str11 = weiVar.f250540a;
                dv91 dv91Var18 = new dv91("hit", 1);
                String string14 = str11.toString();
                return new av91("", "", dv91Var18, new bv91("navigate_to_external_uri", 1, Collections.singletonMap("destination", string14 != null ? string14 : "")), zt91VarM94607a15, dgg0Var.f48793a, System.currentTimeMillis());
            case 25:
                return new ofi((luh) obj, (v140) obj3, (pfa0) obj2, (erc1) obj4, false);
            case 26:
                sfi sfiVar = (sfi) obj;
                int iIntValue5 = ((Number) obj3).intValue();
                st91 st91Var3 = (st91) obj4;
                String str12 = sfiVar.f208588a;
                String str13 = sfiVar.f208599l;
                if (str13 == null) {
                    return new egg0(Integer.valueOf(iIntValue5), str12, st91Var3);
                }
                Integer num3 = sfiVar.f208600m;
                zt91 zt91Var7 = zt91.f286105i;
                yt91 yt91VarM50626j5 = ihf1.m50626j();
                yt91VarM50626j5.f276054h = "music";
                yt91VarM50626j5.f276047a = "mobile-shelf-section";
                yt91VarM50626j5.f276052f = "6.0.0";
                yt91VarM50626j5.f276053g = "20.0.5";
                yt91VarM50626j5.f276048b = str13;
                yt91VarM50626j5.f276049c = num3;
                yt91VarM50626j5.f276051e = null;
                zt91 zt91VarM94607a16 = yt91VarM50626j5.m94607a();
                Integer num4 = sfiVar.f208601n;
                st91 st91Var4 = st91.f213865b;
                ArrayList arrayList2 = new ArrayList();
                if (st91Var3 != null) {
                    arrayList2.addAll(st91Var3.f213866a);
                }
                return new egg0(num4, str12, nap.m64023p(arrayList2, zt91VarM94607a16, arrayList2));
            case 27:
                egg0 egg0Var2 = (egg0) obj;
                pfi pfiVar = (pfi) obj3;
                nfi nfiVar = (nfi) obj4;
                String str14 = pfiVar.f177059a;
                if (nfiVar.equals(lfi.f132955a)) {
                    return egg0Var2.m38866a(str14);
                }
                if (nfiVar.equals(mfi.f143072a)) {
                    return pfiVar.f177066h ? egg0Var2.m38868i(str14) : egg0Var2.m38867h(str14);
                }
                throw new NoWhenBranchMatchedException();
            case 28:
                return new yeh0(Integer.valueOf(((Number) obj3).intValue()), ((ggi) obj).f79677a, "", (st91) obj4);
            default:
                return null;
        }
    }
}
