package p204p;

import com.spotify.player.model.ContextTrack;
import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes10.dex */
public final class f36 extends qe70 implements xh00 {

    /* JADX INFO: renamed from: L0 */
    public static final f36 f65363L0;

    /* JADX INFO: renamed from: M0 */
    public static final f36 f65364M0;

    /* JADX INFO: renamed from: N0 */
    public static final f36 f65365N0;

    /* JADX INFO: renamed from: O0 */
    public static final f36 f65366O0;

    /* JADX INFO: renamed from: P0 */
    public static final f36 f65367P0;

    /* JADX INFO: renamed from: Q0 */
    public static final f36 f65368Q0;

    /* JADX INFO: renamed from: R0 */
    public static final f36 f65369R0;

    /* JADX INFO: renamed from: S0 */
    public static final f36 f65370S0;

    /* JADX INFO: renamed from: T0 */
    public static final f36 f65371T0;

    /* JADX INFO: renamed from: U0 */
    public static final f36 f65372U0;

    /* JADX INFO: renamed from: V0 */
    public static final f36 f65373V0;

    /* JADX INFO: renamed from: W0 */
    public static final f36 f65374W0;

    /* JADX INFO: renamed from: X */
    public static final f36 f65375X;

    /* JADX INFO: renamed from: X0 */
    public static final f36 f65376X0;

    /* JADX INFO: renamed from: Y */
    public static final f36 f65377Y;

    /* JADX INFO: renamed from: Y0 */
    public static final f36 f65378Y0;

    /* JADX INFO: renamed from: Z */
    public static final f36 f65379Z;

    /* JADX INFO: renamed from: Z0 */
    public static final f36 f65380Z0;

    /* JADX INFO: renamed from: a1 */
    public static final f36 f65381a1;

    /* JADX INFO: renamed from: b */
    public static final f36 f65382b;

    /* JADX INFO: renamed from: b1 */
    public static final f36 f65383b1;

    /* JADX INFO: renamed from: c */
    public static final f36 f65384c;

    /* JADX INFO: renamed from: c1 */
    public static final f36 f65385c1;

    /* JADX INFO: renamed from: d */
    public static final f36 f65386d;

    /* JADX INFO: renamed from: e */
    public static final f36 f65387e;

    /* JADX INFO: renamed from: f */
    public static final f36 f65388f;

    /* JADX INFO: renamed from: g */
    public static final f36 f65389g;

    /* JADX INFO: renamed from: h */
    public static final f36 f65390h;

    /* JADX INFO: renamed from: i */
    public static final f36 f65391i;

    /* JADX INFO: renamed from: t */
    public static final f36 f65392t;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f65393a;

    static {
        int i = 4;
        f65382b = new f36(i, 0);
        f65384c = new f36(i, 1);
        f65386d = new f36(i, 2);
        f65387e = new f36(i, 3);
        f65388f = new f36(i, 4);
        f65389g = new f36(i, 5);
        f65390h = new f36(i, 6);
        f65391i = new f36(i, 7);
        f65392t = new f36(i, 8);
        f65375X = new f36(i, 9);
        f65377Y = new f36(i, 10);
        f65379Z = new f36(i, 11);
        f65363L0 = new f36(i, 12);
        f65364M0 = new f36(i, 13);
        f65365N0 = new f36(i, 14);
        f65366O0 = new f36(i, 15);
        f65367P0 = new f36(i, 16);
        f65368Q0 = new f36(i, 17);
        f65369R0 = new f36(i, 18);
        f65370S0 = new f36(i, 19);
        f65371T0 = new f36(i, 20);
        f65372U0 = new f36(i, 21);
        f65373V0 = new f36(i, 22);
        f65374W0 = new f36(i, 23);
        f65376X0 = new f36(i, 24);
        f65378Y0 = new f36(i, 25);
        f65380Z0 = new f36(i, 26);
        f65381a1 = new f36(i, 27);
        f65383b1 = new f36(i, 28);
        f65385c1 = new f36(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f36(int i, int i2) {
        super(i);
        this.f65393a = i2;
    }

    @Override // p204p.xh00
    /* JADX INFO: renamed from: M */
    public final Object mo24818M(Object obj, Object obj2, Object obj3, Object obj4) {
        av91 av91Var;
        av91 av91Var2;
        String string;
        av91 av91Var3;
        switch (this.f65393a) {
            case 0:
                z26 z26Var = (z26) obj;
                return new t6h0(new r6h0(new u6h0(z26Var.f278499a), 2), Integer.valueOf(((Number) obj3).intValue()), z26Var.f278500b);
            case 1:
                return new nug0(Integer.valueOf(((Number) obj3).intValue()), ((x26) obj).f257364a, (st91) obj4);
            case 2:
                i7h0 i7h0Var = (i7h0) obj;
                if (wj50.m88271j(((s26) obj4).f204902a, vkn0.f242251d)) {
                    return new av91("gui", "user", new dv91("long_hit", 1), new bv91("ui_reveal", 1, nau.f152117a), i7h0Var.f99561a, st91.f213865b, System.currentTimeMillis());
                }
                return null;
            case 3:
                return null;
            case 4:
                pbh0 pbh0Var = (pbh0) obj;
                c36 c36Var = (c36) obj3;
                u26 u26Var = (u26) obj4;
                String str = ((a36) obj2).f11873a;
                if (u26Var instanceof q26) {
                    return c36Var.f33574g ? pbh0Var.m69525j() : pbh0Var.m69521a(str);
                }
                if (u26Var.equals(o26.f160947a)) {
                    return c36Var.f33575h ? pbh0Var.m69526k(str) : pbh0Var.m69523h(str);
                }
                throw new NoWhenBranchMatchedException();
            case 5:
                return new y9g0(new zm8((st91) obj4, 10), Integer.valueOf(((Number) obj3).intValue()), ((b36) obj).f22908a);
            case 6:
                y9g0 y9g0Var = (y9g0) obj;
                b36 b36Var = (b36) obj2;
                if (!((r26) obj4).equals(r26.f195067a)) {
                    throw new NoWhenBranchMatchedException();
                }
                String str2 = b36Var.f22908a;
                dv91 dv91Var = new dv91("hit", 1);
                String string2 = str2 != null ? str2.toString() : null;
                if (string2 == null) {
                    string2 = "";
                }
                return new av91("", "", dv91Var, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string2)), y9g0Var.f270588a, y9g0Var.f270589b.f284179b, System.currentTimeMillis());
            case 7:
                return new d56((v140) obj, (erc1) obj2, (hz80) obj3, (hz80) obj4);
            case 8:
                ((Number) obj3).intValue();
                return new kgh0((st91) obj4);
            case 9:
                return null;
            case 10:
                ((Number) obj3).intValue();
                return new tqg0((st91) obj4);
            case 11:
                tqg0 tqg0Var = (tqg0) obj;
                d86 d86Var = (d86) obj4;
                zt91 zt91Var = tqg0Var.f222813b;
                boolean z = d86Var instanceof b86;
                nau nauVar = nau.f152117a;
                if (z) {
                    Integer numValueOf = Integer.valueOf(((b86) d86Var).f24500b);
                    yt91 yt91VarM96903c = zt91Var.m96903c();
                    yt91VarM96903c.f276055i.add(new bu91("artwork_item", null, numValueOf, null, null));
                    yt91VarM96903c.f276056j = false;
                    return new av91("", "", new dv91("hit", 1), new bv91("ui_select", 1, nauVar), yt91VarM96903c.m94607a(), tqg0Var.f222812a, System.currentTimeMillis());
                }
                if (d86Var instanceof a86) {
                    yt91 yt91VarM96903c2 = zt91Var.m96903c();
                    yt91VarM96903c2.f276055i.add(new bu91("edit_button", null, null, null, null));
                    yt91VarM96903c2.f276056j = false;
                    av91Var = new av91("", "", new dv91("hit", 1), new bv91("ui_reveal", 1, nauVar), yt91VarM96903c2.m94607a(), tqg0Var.f222812a, System.currentTimeMillis());
                } else {
                    if (!d86Var.equals(c86.f35115a)) {
                        if (!d86Var.equals(z76.f280102a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        yt91 yt91VarM96903c3 = zt91Var.m96903c();
                        yt91VarM96903c3.f276055i.add(new bu91("delete_button", null, null, null, null));
                        yt91VarM96903c3.f276056j = false;
                        return new av91("", "", new dv91("hit", 1), new bv91("ui_select", 1, nauVar), yt91VarM96903c3.m94607a(), tqg0Var.f222812a, System.currentTimeMillis());
                    }
                    yt91 yt91VarM96903c4 = zt91Var.m96903c();
                    yt91VarM96903c4.f276055i.add(new bu91("upload_button", null, null, null, null));
                    yt91VarM96903c4.f276056j = false;
                    av91Var = new av91("", "", new dv91("hit", 1), new bv91("ui_reveal", 1, nauVar), yt91VarM96903c4.m94607a(), tqg0Var.f222812a, System.currentTimeMillis());
                }
                return av91Var;
            case 12:
                return null;
            case 13:
                jbg0 jbg0Var = (jbg0) obj;
                if (((vc6) obj4).equals(vc6.f240064a)) {
                    return new av91("", "", new dv91("hit", 1), new bv91("ui_reveal", 1, nau.f152117a), jbg0Var.f110797a, st91.f213865b, System.currentTimeMillis());
                }
                throw new NoWhenBranchMatchedException();
            case 14:
                return null;
            case 15:
                return null;
            case 16:
                xg6 xg6Var = (xg6) obj;
                return new gbg0(xg6Var.f261223j, Integer.valueOf(((Number) obj3).intValue()), xg6Var.f261215b.getUri());
            case 17:
                gbg0 gbg0Var = (gbg0) obj;
                xg6 xg6Var2 = (xg6) obj2;
                yg6 yg6Var = (yg6) obj3;
                wg6 wg6Var = (wg6) obj4;
                zt91 zt91Var2 = gbg0Var.f78301a;
                String str3 = xg6Var2.f261214a;
                AbstractC1961i abstractC1961i = xg6Var2.f261215b;
                if (wg6Var.equals(tg6.f220126a)) {
                    yt91 yt91VarM96903c5 = zt91Var2.m96903c();
                    yt91VarM96903c5.f276055i.add(new bu91("add_button", null, null, null, null));
                    yt91VarM96903c5.f276056j = false;
                    zt91 zt91VarM94607a = yt91VarM96903c5.m94607a();
                    if (xg6Var2.f261224k == fg6.f69232b) {
                        String uri = abstractC1961i.getUri();
                        dv91 dv91Var2 = new dv91("hit", 1);
                        string = uri != null ? uri.toString() : null;
                        return new av91("", "", dv91Var2, new bv91("select_entity_in_list", 1, Collections.singletonMap("entity_to_be_selected", string != null ? string : "")), zt91VarM94607a, st91.f213865b, System.currentTimeMillis());
                    }
                    String uri2 = abstractC1961i.getUri();
                    dv91 dv91Var3 = new dv91("hit", 1);
                    String string3 = str3.toString();
                    if (string3 == null) {
                        string3 = "";
                    }
                    pqm0 pqm0Var = new pqm0("playlist", string3);
                    string = uri2 != null ? uri2.toString() : null;
                    return new av91("", "", dv91Var3, new bv91("add_to_playlist", 2, kkc0.m56695h0(pqm0Var, new pqm0("item_to_be_added", string != null ? string : ""))), zt91VarM94607a, st91.f213865b, System.currentTimeMillis());
                }
                if (wg6Var.equals(ug6.f229991a)) {
                    yt91 yt91VarM96903c6 = zt91Var2.m96903c();
                    yt91VarM96903c6.f276055i.add(new bu91("add_button", null, null, null, null));
                    yt91VarM96903c6.f276056j = false;
                    zt91 zt91VarM94607a2 = yt91VarM96903c6.m94607a();
                    String uri3 = abstractC1961i.getUri();
                    dv91 dv91Var4 = new dv91("hit", 1);
                    string = uri3 != null ? uri3.toString() : null;
                    if (string == null) {
                        string = "";
                    }
                    pqm0 pqm0Var2 = new pqm0("item_to_be_removed_from_playlist", string);
                    String string4 = str3.toString();
                    return new av91("", "", dv91Var4, new bv91("remove_item_from_playlist", 2, kkc0.m56695h0(pqm0Var2, new pqm0("playlist", string4 != null ? string4 : ""))), zt91VarM94607a2, st91.f213865b, System.currentTimeMillis());
                }
                if (!wg6Var.equals(vg6.f241147a)) {
                    throw new NoWhenBranchMatchedException();
                }
                bep0 bep0Var = yg6Var.f272498g;
                if ((bep0Var instanceof xdp0) || (bep0Var instanceof udp0)) {
                    String uri4 = abstractC1961i.getUri();
                    dv91 dv91Var5 = new dv91("hit", 1);
                    string = uri4 != null ? uri4.toString() : null;
                    av91Var2 = new av91("", "", dv91Var5, new bv91("play_preview", 1, Collections.singletonMap("item_to_be_previewed", string != null ? string : "")), gbg0Var.f78301a, st91.f213865b, System.currentTimeMillis());
                } else {
                    if (!(bep0Var instanceof aep0) && !(bep0Var instanceof tdp0)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    String uri5 = abstractC1961i.getUri();
                    dv91 dv91Var6 = new dv91("hit", 1);
                    string = uri5 != null ? uri5.toString() : null;
                    av91Var2 = new av91("", "", dv91Var6, new bv91(ContextTrack.TrackAction.PAUSE, 1, Collections.singletonMap("item_to_be_paused", string != null ? string : "")), gbg0Var.f78301a, st91.f213865b, System.currentTimeMillis());
                }
                return av91Var2;
            case 18:
                ((Number) obj3).intValue();
                return new ntg0((st91) obj4);
            case 19:
                ntg0 ntg0Var = (ntg0) obj;
                if (((xr6) obj4).equals(xr6.f265272a)) {
                    return new av91("", "", new dv91("hit", 1), new bv91("ui_navigate", 1, Collections.singletonMap("destination", "spotify:chat-trusted-circle")), ntg0Var.f158067b, ntg0Var.f158066a, System.currentTimeMillis());
                }
                throw new NoWhenBranchMatchedException();
            case 20:
                return new ptg0(Integer.valueOf(((Number) obj3).intValue()), hf41.m47325a(((js6) obj).f115402a), (st91) obj4);
            case 21:
                ptg0 ptg0Var = (ptg0) obj;
                js6 js6Var = (js6) obj2;
                is6 is6Var = (is6) obj4;
                zt91 zt91Var3 = ptg0Var.f181153b;
                if (is6Var.equals(fs6.f72775a)) {
                    yt91 yt91VarM96903c7 = zt91Var3.m96903c();
                    yt91VarM96903c7.f276055i.add(new bu91("row_tapped", null, null, null, null));
                    yt91VarM96903c7.f276056j = false;
                    zt91 zt91VarM94607a3 = yt91VarM96903c7.m94607a();
                    String strM47325a = hf41.m47325a(js6Var.f115402a);
                    dv91 dv91Var7 = new dv91("hit", 1);
                    String string5 = strM47325a != null ? strM47325a.toString() : null;
                    if (string5 == null) {
                        string5 = "";
                    }
                    av91Var3 = new av91("", "", dv91Var7, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string5)), zt91VarM94607a3, ptg0Var.f181152a, System.currentTimeMillis());
                } else {
                    if (!(is6Var instanceof es6)) {
                        return null;
                    }
                    boolean z2 = ((es6) is6Var).f62294a;
                    nau nauVar2 = nau.f152117a;
                    if (z2) {
                        yt91 yt91VarM96903c8 = zt91Var3.m96903c();
                        yt91VarM96903c8.f276055i.add(new bu91("listening_activity_toggle", null, null, null, null));
                        yt91VarM96903c8.f276056j = false;
                        av91Var3 = new av91("", "", new dv91("hit", 1), new bv91("setting_disable", 1, nauVar2), yt91VarM96903c8.m94607a(), ptg0Var.f181152a, System.currentTimeMillis());
                    } else {
                        yt91 yt91VarM96903c9 = zt91Var3.m96903c();
                        yt91VarM96903c9.f276055i.add(new bu91("listening_activity_toggle", null, null, null, null));
                        yt91VarM96903c9.f276056j = false;
                        av91Var3 = new av91("", "", new dv91("hit", 1), new bv91("setting_enable", 1, nauVar2), yt91VarM96903c9.m94607a(), ptg0Var.f181152a, System.currentTimeMillis());
                    }
                }
                return av91Var3;
            case 22:
                ((Number) obj3).intValue();
                st91 st91Var = (st91) obj4;
                p5a0 p5a0Var = ((czs0) obj).f43616a;
                boolean z3 = p5a0Var instanceof q6a0;
                q6a0 q6a0Var = z3 ? (q6a0) p5a0Var : null;
                Integer numValueOf2 = q6a0Var != null ? Integer.valueOf(q6a0Var.f185712a) : null;
                q6a0 q6a0Var2 = z3 ? (q6a0) p5a0Var : null;
                return new w3h0(numValueOf2, q6a0Var2 != null ? q6a0Var2.f185714c : null, st91Var);
            case 23:
                return null;
            case 24:
                ((Number) obj3).intValue();
                return new cyg0((st91) obj4);
            case 25:
                cyg0 cyg0Var = (cyg0) obj;
                return new av91("", "", new dv91("hit", 1), new bv91("ui_navigate", 1, Collections.singletonMap("destination", "VIDEO_SETTINGS_AUDIO_LANGUAGE")), cyg0Var.f43276b, cyg0Var.f43275a, System.currentTimeMillis());
            case 26:
                ((Number) obj3).intValue();
                return new nbg0((st91) obj4);
            case 27:
                nbg0 nbg0Var = (nbg0) obj;
                py6 py6Var = (py6) obj4;
                if (!(py6Var instanceof oy6)) {
                    if (py6Var.equals(ny6.f159725a)) {
                        return nbg0Var.m64076h();
                    }
                    throw new NoWhenBranchMatchedException();
                }
                String str4 = ((oy6) py6Var).f171673a;
                yt91 yt91VarM96903c10 = nbg0Var.f152269b.m96903c();
                yt91VarM96903c10.f276055i.add(new bu91("audio_rows", str4, null, null, null));
                yt91VarM96903c10.f276056j = false;
                return new av91("", "", new dv91("hit", 1), new bv91("ui_select", 1, nau.f152117a), yt91VarM96903c10.m94607a(), nbg0Var.f152268a, System.currentTimeMillis());
            case 28:
                ((Number) obj3).intValue();
                return new nbg0((st91) obj4);
            default:
                nbg0 nbg0Var2 = (nbg0) obj;
                hg70 hg70Var = (hg70) obj4;
                if (hg70Var.equals(eg70.f59236a)) {
                    return nbg0Var2.m64076h();
                }
                if (!(hg70Var instanceof fg70)) {
                    if (hg70Var.equals(gg70.f79565a)) {
                        return null;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                String str5 = ((fg70) hg70Var).f69239a;
                yt91 yt91VarM96903c11 = nbg0Var2.f152269b.m96903c();
                yt91VarM96903c11.f276055i.add(new bu91("audio_rows", str5, null, null, null));
                yt91VarM96903c11.f276056j = false;
                return new av91("", "", new dv91("hit", 1), new bv91("ui_select", 1, nau.f152117a), yt91VarM96903c11.m94607a(), nbg0Var2.f152268a, System.currentTimeMillis());
        }
    }
}
