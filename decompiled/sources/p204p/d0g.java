package p204p;

import android.net.Uri;
import com.spotify.music.R;
import com.spotify.searchview.proto.Entity;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes5.dex */
public final class d0g extends qe70 implements vh00 {

    /* JADX INFO: renamed from: L0 */
    public static final d0g f43863L0;

    /* JADX INFO: renamed from: M0 */
    public static final d0g f43864M0;

    /* JADX INFO: renamed from: N0 */
    public static final d0g f43865N0;

    /* JADX INFO: renamed from: O0 */
    public static final d0g f43866O0;

    /* JADX INFO: renamed from: P0 */
    public static final d0g f43867P0;

    /* JADX INFO: renamed from: Q0 */
    public static final d0g f43868Q0;

    /* JADX INFO: renamed from: R0 */
    public static final d0g f43869R0;

    /* JADX INFO: renamed from: S0 */
    public static final d0g f43870S0;

    /* JADX INFO: renamed from: T0 */
    public static final d0g f43871T0;

    /* JADX INFO: renamed from: U0 */
    public static final d0g f43872U0;

    /* JADX INFO: renamed from: V0 */
    public static final d0g f43873V0;

    /* JADX INFO: renamed from: W0 */
    public static final d0g f43874W0;

    /* JADX INFO: renamed from: X */
    public static final d0g f43875X;

    /* JADX INFO: renamed from: X0 */
    public static final d0g f43876X0;

    /* JADX INFO: renamed from: Y */
    public static final d0g f43877Y;

    /* JADX INFO: renamed from: Y0 */
    public static final d0g f43878Y0;

    /* JADX INFO: renamed from: Z */
    public static final d0g f43879Z;

    /* JADX INFO: renamed from: Z0 */
    public static final d0g f43880Z0;

    /* JADX INFO: renamed from: a1 */
    public static final d0g f43881a1;

    /* JADX INFO: renamed from: b */
    public static final d0g f43882b;

    /* JADX INFO: renamed from: b1 */
    public static final d0g f43883b1;

    /* JADX INFO: renamed from: c */
    public static final d0g f43884c;

    /* JADX INFO: renamed from: c1 */
    public static final d0g f43885c1;

    /* JADX INFO: renamed from: d */
    public static final d0g f43886d;

    /* JADX INFO: renamed from: e */
    public static final d0g f43887e;

    /* JADX INFO: renamed from: f */
    public static final d0g f43888f;

    /* JADX INFO: renamed from: g */
    public static final d0g f43889g;

    /* JADX INFO: renamed from: h */
    public static final d0g f43890h;

    /* JADX INFO: renamed from: i */
    public static final d0g f43891i;

    /* JADX INFO: renamed from: t */
    public static final d0g f43892t;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f43893a;

    static {
        int i = 3;
        f43882b = new d0g(i, 0);
        f43884c = new d0g(i, 1);
        f43886d = new d0g(i, 2);
        f43887e = new d0g(i, 3);
        f43888f = new d0g(i, 4);
        f43889g = new d0g(i, 5);
        f43890h = new d0g(i, 6);
        f43891i = new d0g(i, 7);
        f43892t = new d0g(i, 8);
        f43875X = new d0g(i, 9);
        f43877Y = new d0g(i, 10);
        f43879Z = new d0g(i, 11);
        f43863L0 = new d0g(i, 12);
        f43864M0 = new d0g(i, 13);
        f43865N0 = new d0g(i, 14);
        f43866O0 = new d0g(i, 15);
        f43867P0 = new d0g(i, 16);
        f43868Q0 = new d0g(i, 17);
        f43869R0 = new d0g(i, 18);
        f43870S0 = new d0g(i, 19);
        f43871T0 = new d0g(i, 20);
        f43872U0 = new d0g(i, 21);
        f43873V0 = new d0g(i, 22);
        f43874W0 = new d0g(i, 23);
        f43876X0 = new d0g(i, 24);
        f43878Y0 = new d0g(i, 25);
        f43880Z0 = new d0g(i, 26);
        f43881a1 = new d0g(i, 27);
        f43883b1 = new d0g(i, 28);
        f43885c1 = new d0g(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d0g(int i, int i2) {
        super(i);
        this.f43893a = i2;
    }

    @Override // p204p.vh00
    /* JADX INFO: renamed from: D0 */
    public final Object mo24510D0(Object obj, Object obj2, Object obj3) {
        int i = this.f43893a;
        cxh0 cxh0Var = cxh0.f43038a;
        boolean z = false;
        w2a1 w2a1Var = w2a1.f247311a;
        switch (i) {
            case 0:
                xq00 xq00Var = (xq00) obj2;
                ((Number) obj3).intValue();
                ahf1.m25932d(k0e1.m54977L(R.string.campfire_chat_members_page_add_members, xq00Var), null, leu.m58818d(xq00Var).f64971g, leu.m58815a(xq00Var).f112824b.f138757a, null, null, 0, false, null, 0, null, xq00Var, 0, 0, 2034);
                return w2a1Var;
            case 1:
                xq00 xq00Var2 = (xq00) obj2;
                ((Number) obj3).intValue();
                ahf1.m25932d(k0e1.m54977L(R.string.playlist_add_more_section_add_to_this_playlist_button, xq00Var2), null, null, 0L, null, null, 2, false, new ol80(1), 0, null, xq00Var2, 0, 0, 1726);
                return w2a1Var;
            case 2:
                xq00 xq00Var3 = (xq00) obj2;
                ((Number) obj3).intValue();
                Uri uri = Uri.EMPTY;
                xyu xyuVarM55216r = k2z0.m55216r(ztu.f286267c, 0L, 0L, xq00Var3, ztu.f286268d, 30);
                l0y0.m57821c(uri, qgj.f188480a, null, null, null, null, null, null, null, new cxu(xyuVarM55216r, xyuVarM55216r), false, false, xq00Var3, 1073766448, 0, 3564);
                return w2a1Var;
            case 3:
                xq00 xq00Var4 = (xq00) obj2;
                ((Number) obj3).intValue();
                tsg1.m81422g(zsf1.m96830A(cxh0Var, 16, 0.0f, 2), 1, leu.m58815a(xq00Var4).f112823a.f229875b.f123094b, xq00Var4, 0, 0);
                return w2a1Var;
            case 4:
                xq00 xq00Var5 = (xq00) obj2;
                ((Number) obj3).intValue();
                tsg1.m81422g(zsf1.m96830A(cxh0Var, 16, 0.0f, 2), 1, leu.m58815a(xq00Var5).f112823a.f229875b.f123094b, xq00Var5, 0, 0);
                return w2a1Var;
            case 5:
                xq00 xq00Var6 = (xq00) obj2;
                int iIntValue = ((Number) obj3).intValue();
                if (xq00Var6.m91752Y(iIntValue & 1, (iIntValue & 17) != 16)) {
                    ahf1.m25932d(k0e1.m54977L(R.string.chat_share_suggested_users_title, xq00Var6), zsf1.m96832C(zsf1.m96830A(cxh0Var, leu.m58816b(xq00Var6).f117230b.f224763f, 0.0f, 2), 0.0f, leu.m58816b(xq00Var6).f117230b.f224763f, 0.0f, leu.m58816b(xq00Var6).f117230b.f224761d, 5), leu.m58818d(xq00Var6).f64969e, leu.m58815a(xq00Var6).f112824b.f138757a, new h171(5), null, 0, false, null, 0, null, xq00Var6, 0, 0, 2016);
                } else {
                    xq00Var6.m91757b0();
                }
                return w2a1Var;
            case 6:
                xq00 xq00Var7 = (xq00) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                if (xq00Var7.m91752Y(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    sxg1.m79631n(0, k0e1.m54977L(R.string.add_to_playlist_new_playlist_button_text, xq00Var7), xq00Var7);
                } else {
                    xq00Var7.m91757b0();
                }
                return w2a1Var;
            case 7:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                xq00 xq00Var8 = (xq00) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= xq00Var8.m91768h(zBooleanValue) ? 4 : 2;
                }
                if (xq00Var8.m91752Y(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    qgj qgjVar = qgj.f188480a;
                    if (zBooleanValue) {
                        xq00Var8.m91771i0(228663509);
                        y85.m93057b(kou.f124911c, qgjVar, null, leu.m58815a(xq00Var8).f112824b.f138759c, 0L, false, xq00Var8, kou.f124912d | 48, 52);
                        xq00Var8.m91788r(false);
                    } else {
                        xq00Var8.m91771i0(228876479);
                        y85.m93057b(auu.f20028c, qgjVar, null, leu.m58815a(xq00Var8).f112824b.f138758b, 0L, false, xq00Var8, auu.f20029d | 48, 52);
                        xq00Var8.m91788r(false);
                    }
                } else {
                    xq00Var8.m91757b0();
                }
                return w2a1Var;
            case 8:
                xq00 xq00Var9 = (xq00) obj2;
                int iIntValue4 = ((Number) obj3).intValue();
                if (xq00Var9.m91752Y(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    l0y0.m57824f(k2z0.m55216r(ztu.f286267c, 0L, 0L, xq00Var9, ztu.f286268d, 30), new rgj(k0e1.m54977L(R.string.add_to_playlist_playlist_artwork_content_description, xq00Var9)), null, null, null, null, null, null, null, xq00Var9, 8, 508);
                } else {
                    xq00Var9.m91757b0();
                }
                return w2a1Var;
            case 9:
                xq00 xq00Var10 = (xq00) obj2;
                int iIntValue5 = ((Number) obj3).intValue();
                if (xq00Var10.m91752Y(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    l0y0.m57824f(k2z0.m55216r(fqu.f72260c, 0L, 0L, xq00Var10, fqu.f72261d, 30), new rgj(k0e1.m54977L(R.string.add_to_playlist_playlist_artwork_content_description, xq00Var10)), null, null, null, null, null, null, null, xq00Var10, 8, 508);
                } else {
                    xq00Var10.m91757b0();
                }
                return w2a1Var;
            case 10:
                xq00 xq00Var11 = (xq00) obj2;
                int iIntValue6 = ((Number) obj3).intValue();
                if (xq00Var11.m91752Y(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    tsg1.m81422g(zsf1.m96830A(epv0.m39673I("curated_divider", cxh0Var), 0.0f, leu.m58816b(xq00Var11).f117230b.f224759b, 1), (float) 0.5d, leu.m58815a(xq00Var11).f112823a.f229875b.f123094b, xq00Var11, 48, 0);
                } else {
                    xq00Var11.m91757b0();
                }
                return w2a1Var;
            case 11:
                xq00 xq00Var12 = (xq00) obj2;
                int iIntValue7 = ((Number) obj3).intValue();
                if (xq00Var12.m91752Y(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    fxh0 fxh0VarM61842z = mi21.m61842z(mi21.m61822f(1.0f, cxh0Var), null, 3);
                    vb9 vb9Var = d7f0.f46142M0;
                    zi5 zi5Var = bj5.f27610a;
                    irx0 irx0VarM36744a = drx0.m36744a(bj5.m29370g(leu.m58816b(xq00Var12).f117230b.f224761d), vb9Var, xq00Var12, 48);
                    int iHashCode = Long.hashCode(xq00Var12.f264809T);
                    wpn0 wpn0VarM91778m = xq00Var12.m91778m();
                    fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var12, fxh0VarM61842z);
                    soh.f211194A.getClass();
                    C2087le c2087le = roh.f201257b;
                    if (xq00Var12.f264811a == null) {
                        pmg1.m70360s();
                        throw null;
                    }
                    xq00Var12.m91779m0();
                    if (xq00Var12.f264808S) {
                        xq00Var12.m91776l(c2087le);
                    } else {
                        xq00Var12.m91799w0();
                    }
                    zsf1.m96835F(irx0VarM36744a, roh.f201262g, xq00Var12);
                    zsf1.m96835F(wpn0VarM91778m, roh.f201261f, xq00Var12);
                    zsf1.m96835F(Integer.valueOf(iHashCode), roh.f201265j, xq00Var12);
                    zsf1.m96833D(roh.f201266k, xq00Var12);
                    zsf1.m96835F(fxh0VarM48286s, roh.f201259d, xq00Var12);
                    y85.m93057b(bqu.f29881c, qgj.f188480a, mi21.m61834r(leu.m58816b(xq00Var12).f117235g.f159604b, cxh0Var), leu.m58815a(xq00Var12).f112824b.f138761e, 0L, true, xq00Var12, bqu.f29882d | 196656, 16);
                    ahf1.m25932d(k0e1.m54977L(R.string.share_sheet_age_assurance_required_banner_text, xq00Var12), null, leu.m58818d(xq00Var12).f64974j, 0L, null, null, 0, false, null, 0, null, xq00Var12, 0, 0, 2042);
                    xq00Var12.m91788r(true);
                } else {
                    xq00Var12.m91757b0();
                }
                return w2a1Var;
            case 12:
                xq00 xq00Var13 = (xq00) obj2;
                ((Number) obj3).intValue();
                l0y0.m57823e(fgg1.m41584D(R.drawable.chat_permission_image, xq00Var13), zsf1.m96832C(((baf) obj).mo28582b(d7f0.f46145P0, mi21.m61834r(leu.m58816b(xq00Var13).f117235g.f159616n, cxh0Var)), 0.0f, 0.0f, 0.0f, leu.m58816b(xq00Var13).f117230b.f224761d, 7), null, null, null, null, null, null, xq00Var13, 48, 504);
                return w2a1Var;
            case 13:
                xq00 xq00Var14 = (xq00) obj2;
                ((Number) obj3).intValue();
                y85.m93057b(bqu.f29881c, qgj.f188480a, null, leu.m58815a(xq00Var14).f112824b.f138761e, 0L, true, xq00Var14, bqu.f29882d | 196656, 20);
                return w2a1Var;
            case 14:
                xq00 xq00Var15 = (xq00) obj2;
                ((Number) obj3).intValue();
                ahf1.m25932d(k0e1.m54977L(R.string.sidedrawer_item_age_assurance_required, xq00Var15), null, leu.m58818d(xq00Var15).f64974j, 0L, null, null, 0, false, null, 0, null, xq00Var15, 0, 0, 2042);
                return w2a1Var;
            case 15:
                th00 th00Var = (th00) obj;
                xq00 xq00Var16 = (xq00) obj2;
                int iIntValue8 = ((Number) obj3).intValue();
                if ((iIntValue8 & 6) == 0) {
                    iIntValue8 |= xq00Var16.m91770i(th00Var) ? 4 : 2;
                }
                if (xq00Var16.m91752Y(iIntValue8 & 1, (iIntValue8 & 19) != 18)) {
                    vb9 vb9Var2 = d7f0.f46142M0;
                    vi5 vi5Var = bj5.f27616g;
                    fxh0 fxh0VarM96830A = zsf1.m96830A(mi21.m61822f(1.0f, cxh0Var), 16, 0.0f, 2);
                    irx0 irx0VarM36744a2 = drx0.m36744a(vi5Var, vb9Var2, xq00Var16, 0);
                    int iHashCode2 = Long.hashCode(xq00Var16.f264809T);
                    wpn0 wpn0VarM91778m2 = xq00Var16.m91778m();
                    fxh0 fxh0VarM48286s2 = hqg1.m48286s(xq00Var16, fxh0VarM96830A);
                    soh.f211194A.getClass();
                    eh00 eh00Var = roh.f201257b;
                    if (xq00Var16.f264811a == null) {
                        pmg1.m70360s();
                        throw null;
                    }
                    xq00Var16.m91779m0();
                    if (xq00Var16.f264808S) {
                        xq00Var16.m91776l(eh00Var);
                    } else {
                        xq00Var16.m91799w0();
                    }
                    zsf1.m96835F(irx0VarM36744a2, roh.f201262g, xq00Var16);
                    zsf1.m96835F(wpn0VarM91778m2, roh.f201261f, xq00Var16);
                    zsf1.m96835F(Integer.valueOf(iHashCode2), roh.f201265j, xq00Var16);
                    zsf1.m96833D(roh.f201266k, xq00Var16);
                    zsf1.m96835F(fxh0VarM48286s2, roh.f201259d, xq00Var16);
                    th00Var.invoke(xq00Var16, Integer.valueOf(iIntValue8 & 14));
                    gz30.m46187c(kmg1.m56924v(R.drawable.ic_chevron_down, 0, xq00Var16), null, null, 0L, xq00Var16, 56, 12);
                    xq00Var16.m91788r(true);
                } else {
                    xq00Var16.m91757b0();
                }
                return w2a1Var;
            case 16:
                ((Number) obj3).intValue();
                y85.m93057b(pou.f179785c, qgj.f188480a, null, 0L, 0L, false, (xq00) obj2, pou.f179786d | 48, 60);
                return w2a1Var;
            case 17:
                xq00 xq00Var17 = (xq00) obj2;
                ((Number) obj3).intValue();
                ahf1.m25932d(k0e1.m54977L(R.string.all_followers_toggle_title, xq00Var17), null, null, 0L, null, null, 0, false, null, 0, null, xq00Var17, 0, 0, Entity.AUTOCOMPLETE_FIELD_NUMBER);
                return w2a1Var;
            case 18:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                xq00 xq00Var18 = (xq00) obj2;
                int iIntValue9 = ((Number) obj3).intValue();
                if ((iIntValue9 & 6) == 0) {
                    iIntValue9 |= xq00Var18.m91768h(zBooleanValue2) ? 4 : 2;
                }
                if (!xq00Var18.m91752Y(iIntValue9 & 1, (iIntValue9 & 19) != 18)) {
                    xq00Var18.m91757b0();
                } else if (zBooleanValue2) {
                    xq00Var18.m91771i0(685058738);
                    Object objM91750T = xq00Var18.m91750T();
                    if (objM91750T == t6x0.f217647t) {
                        objM91750T = y2e.f268568P0;
                        xq00Var18.m91793t0(objM91750T);
                    }
                    mif1.m61869b(new cpa((eh00) objM91750T), q3s0.f184940a, null, null, xq00Var18, 48, 12);
                    xq00Var18.m91788r(false);
                } else {
                    xq00Var18.m91771i0(685251899);
                    xq00Var18.m91788r(false);
                }
                return w2a1Var;
            case 19:
                xq00 xq00Var19 = (xq00) obj2;
                ((Number) obj3).intValue();
                qiu.m72880f(rkk.m75772x(-713247320, new g2g((y631) obj, z ? 1 : 0), xq00Var19), xq00Var19, 6);
                return w2a1Var;
            case 20:
                xq00 xq00Var20 = (xq00) obj2;
                ((Number) obj3).intValue();
                ahf1.m25932d(k0e1.m54977L(R.string.creator_artist_rank_label, xq00Var20), null, null, leu.m58815a(xq00Var20).f112824b.f138757a, null, null, 0, false, null, 0, null, xq00Var20, 0, 0, 2038);
                return w2a1Var;
            case 21:
                xq00 xq00Var21 = (xq00) obj2;
                ((Number) obj3).intValue();
                fxh0 fxh0VarM61822f = mi21.m61822f(1.0f, cxh0Var);
                WeakHashMap weakHashMap = cxd1.f42984x;
                dha.m36004a(xfg1.m90478H(fxh0VarM61822f, new ni80(bxd1.m30815d(xq00Var21).f42991g, 32)), xq00Var21, 0);
                return w2a1Var;
            case 22:
                ((Number) obj3).intValue();
                return w2a1Var;
            case 23:
                xq00 xq00Var22 = (xq00) obj2;
                ((Number) obj3).intValue();
                ahf1.m25932d(k0e1.m54977L(R.string.audience_add_friends_section_title, xq00Var22), null, leu.m58818d(xq00Var22).f64969e, 0L, null, null, 0, false, null, 0, null, xq00Var22, 0, 0, 2042);
                return w2a1Var;
            case 24:
                xq00 xq00Var23 = (xq00) obj2;
                ((Number) obj3).intValue();
                ahf1.m25932d(k0e1.m54977L(R.string.audience_add_friends_title, xq00Var23), null, null, 0L, null, null, 0, false, null, 0, null, xq00Var23, 0, 0, Entity.AUTOCOMPLETE_FIELD_NUMBER);
                return w2a1Var;
            case 25:
                xq00 xq00Var24 = (xq00) obj2;
                ((Number) obj3).intValue();
                ahf1.m25932d(k0e1.m54977L(R.string.audience_add_friends_section_subtitle, xq00Var24), null, leu.m58818d(xq00Var24).f64974j, leu.m58815a(xq00Var24).f112824b.f138758b, null, null, 0, false, null, 0, null, xq00Var24, 0, 0, 2034);
                return w2a1Var;
            case 26:
                xq00 xq00Var25 = (xq00) obj2;
                ((Number) obj3).intValue();
                fxh0 fxh0VarM61834r = mi21.m61834r(leu.m58816b(xq00Var25).f117235g.f159608f, nec.m64246i(r9g1.m75068p(cxh0Var, hmx0.f93097a), leu.m58815a(xq00Var25).f112823a.f229875b.f123093a, kxf1.f127485a));
                m6d0 m6d0VarM36007d = dha.m36007d(d7f0.f46174i, false);
                int iHashCode3 = Long.hashCode(xq00Var25.f264809T);
                wpn0 wpn0VarM91778m3 = xq00Var25.m91778m();
                fxh0 fxh0VarM48286s3 = hqg1.m48286s(xq00Var25, fxh0VarM61834r);
                soh.f211194A.getClass();
                C2087le c2087le2 = roh.f201257b;
                if (xq00Var25.f264811a == null) {
                    pmg1.m70360s();
                    throw null;
                }
                xq00Var25.m91779m0();
                if (xq00Var25.f264808S) {
                    xq00Var25.m91776l(c2087le2);
                } else {
                    xq00Var25.m91799w0();
                }
                zsf1.m96835F(m6d0VarM36007d, roh.f201262g, xq00Var25);
                zsf1.m96835F(wpn0VarM91778m3, roh.f201261f, xq00Var25);
                zsf1.m96835F(Integer.valueOf(iHashCode3), roh.f201265j, xq00Var25);
                zsf1.m96833D(roh.f201266k, xq00Var25);
                zsf1.m96835F(fxh0VarM48286s3, roh.f201259d, xq00Var25);
                y85.m93057b(ztu.f286267c, qgj.f188480a, null, 0L, 0L, false, xq00Var25, ztu.f286268d | 48, 60);
                xq00Var25.m91788r(true);
                return w2a1Var;
            case 27:
                ((Number) obj3).intValue();
                y85.m93057b(cwu.f42827c, qgj.f188480a, null, 0L, 0L, false, (xq00) obj2, cwu.f42828d | 48, 60);
                return w2a1Var;
            case 28:
                xq00 xq00Var26 = (xq00) obj2;
                ((Number) obj3).intValue();
                ahf1.m25932d(k0e1.m54977L(R.string.video_audio_selection_button_title, xq00Var26), null, null, 0L, null, null, 0, false, null, 0, null, xq00Var26, 0, 0, Entity.AUTOCOMPLETE_FIELD_NUMBER);
                return w2a1Var;
            default:
                xq00 xq00Var27 = (xq00) obj2;
                ((Number) obj3).intValue();
                y85.m93057b(pou.f179785c, qgj.f188480a, mi21.m61834r(leu.m58816b(xq00Var27).f117235g.f159604b, cxh0Var), 0L, 0L, false, xq00Var27, pou.f179786d | 48, 56);
                return w2a1Var;
        }
    }
}
