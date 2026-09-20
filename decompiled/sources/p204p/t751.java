package p204p;

import com.spotify.player.model.ContextTrack;
import java.util.Collections;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes10.dex */
public final class t751 extends qe70 implements xh00 {

    /* JADX INFO: renamed from: L0 */
    public static final t751 f217683L0;

    /* JADX INFO: renamed from: M0 */
    public static final t751 f217684M0;

    /* JADX INFO: renamed from: N0 */
    public static final t751 f217685N0;

    /* JADX INFO: renamed from: O0 */
    public static final t751 f217686O0;

    /* JADX INFO: renamed from: P0 */
    public static final t751 f217687P0;

    /* JADX INFO: renamed from: Q0 */
    public static final t751 f217688Q0;

    /* JADX INFO: renamed from: R0 */
    public static final t751 f217689R0;

    /* JADX INFO: renamed from: S0 */
    public static final t751 f217690S0;

    /* JADX INFO: renamed from: T0 */
    public static final t751 f217691T0;

    /* JADX INFO: renamed from: U0 */
    public static final t751 f217692U0;

    /* JADX INFO: renamed from: V0 */
    public static final t751 f217693V0;

    /* JADX INFO: renamed from: W0 */
    public static final t751 f217694W0;

    /* JADX INFO: renamed from: X */
    public static final t751 f217695X;

    /* JADX INFO: renamed from: X0 */
    public static final t751 f217696X0;

    /* JADX INFO: renamed from: Y */
    public static final t751 f217697Y;

    /* JADX INFO: renamed from: Y0 */
    public static final t751 f217698Y0;

    /* JADX INFO: renamed from: Z */
    public static final t751 f217699Z;

    /* JADX INFO: renamed from: Z0 */
    public static final t751 f217700Z0;

    /* JADX INFO: renamed from: a1 */
    public static final t751 f217701a1;

    /* JADX INFO: renamed from: b */
    public static final t751 f217702b;

    /* JADX INFO: renamed from: b1 */
    public static final t751 f217703b1;

    /* JADX INFO: renamed from: c */
    public static final t751 f217704c;

    /* JADX INFO: renamed from: c1 */
    public static final t751 f217705c1;

    /* JADX INFO: renamed from: d */
    public static final t751 f217706d;

    /* JADX INFO: renamed from: e */
    public static final t751 f217707e;

    /* JADX INFO: renamed from: f */
    public static final t751 f217708f;

    /* JADX INFO: renamed from: g */
    public static final t751 f217709g;

    /* JADX INFO: renamed from: h */
    public static final t751 f217710h;

    /* JADX INFO: renamed from: i */
    public static final t751 f217711i;

    /* JADX INFO: renamed from: t */
    public static final t751 f217712t;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f217713a;

    static {
        int i = 4;
        f217702b = new t751(i, 0);
        f217704c = new t751(i, 1);
        f217706d = new t751(i, 2);
        f217707e = new t751(i, 3);
        f217708f = new t751(i, 4);
        f217709g = new t751(i, 5);
        f217710h = new t751(i, 6);
        f217711i = new t751(i, 7);
        f217712t = new t751(i, 8);
        f217695X = new t751(i, 9);
        f217697Y = new t751(i, 10);
        f217699Z = new t751(i, 11);
        f217683L0 = new t751(i, 12);
        f217684M0 = new t751(i, 13);
        f217685N0 = new t751(i, 14);
        f217686O0 = new t751(i, 15);
        f217687P0 = new t751(i, 16);
        f217688Q0 = new t751(i, 17);
        f217689R0 = new t751(i, 18);
        f217690S0 = new t751(i, 19);
        f217691T0 = new t751(i, 20);
        f217692U0 = new t751(i, 21);
        f217693V0 = new t751(i, 22);
        f217694W0 = new t751(i, 23);
        f217696X0 = new t751(i, 24);
        f217698Y0 = new t751(i, 25);
        f217700Z0 = new t751(i, 26);
        f217701a1 = new t751(i, 27);
        f217703b1 = new t751(i, 28);
        f217705c1 = new t751(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t751(int i, int i2) {
        super(i);
        this.f217713a = i2;
    }

    @Override // p204p.xh00
    /* JADX INFO: renamed from: M */
    public final Object mo24818M(Object obj, Object obj2, Object obj3, Object obj4) {
        av91 av91Var;
        String str;
        String string;
        av91 av91Var2;
        String str2;
        List list;
        la61 la61Var;
        Float fValueOf;
        int i = this.f217713a;
        int i2 = 2;
        nau nauVar = nau.f152117a;
        switch (i) {
            case 0:
                qdh0 qdh0Var = (qdh0) obj;
                o751 o751Var = (o751) obj4;
                zt91 zt91Var = qdh0Var.f187692a;
                if (o751Var instanceof n751) {
                    char c = ((n751) o751Var).f151084a.f196444b ? (char) 1 : (char) 2;
                    dv91 dv91Var = new dv91("hit", 1);
                    pqm0 pqm0Var = new pqm0("setting_name", "storage_location");
                    if (c == 1) {
                        str = "device_storage";
                    } else {
                        if (c != 2) {
                            throw null;
                        }
                        str = "sd_card";
                    }
                    av91Var = new av91("", "", dv91Var, new bv91("set_multiple_choice_setting", 1, kkc0.m56695h0(pqm0Var, new pqm0("option_selected", str))), qdh0Var.f187692a, st91.f213865b, System.currentTimeMillis());
                } else {
                    if ((o751Var instanceof m751) || (o751Var instanceof l751)) {
                        return null;
                    }
                    if (o751Var instanceof k751) {
                        yt91 yt91VarM96903c = zt91Var.m96903c();
                        yt91VarM96903c.f276055i.add(new bu91("confirmation_dialog", null, null, null, null));
                        yt91VarM96903c.f276056j = false;
                        yt91 yt91VarM96903c2 = yt91VarM96903c.m94607a().m96903c();
                        yt91VarM96903c2.f276055i.add(new bu91("confirm_button", null, null, null, null));
                        yt91VarM96903c2.f276056j = false;
                        av91Var = new av91("", "", new dv91("hit", 1), new bv91("ui_select", 1, nauVar), yt91VarM96903c2.m94607a(), st91.f213865b, System.currentTimeMillis());
                    } else {
                        if (!(o751Var instanceof j751)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        yt91 yt91VarM96903c3 = zt91Var.m96903c();
                        yt91VarM96903c3.f276055i.add(new bu91("confirmation_dialog", null, null, null, null));
                        yt91VarM96903c3.f276056j = false;
                        yt91 yt91VarM96903c4 = yt91VarM96903c3.m94607a().m96903c();
                        yt91VarM96903c4.f276055i.add(new bu91("cancel_button", null, null, null, null));
                        yt91VarM96903c4.f276056j = false;
                        av91Var = new av91("", "", new dv91("hit", 1), new bv91("ui_select", 1, nauVar), yt91VarM96903c4.m94607a(), st91.f213865b, System.currentTimeMillis());
                    }
                }
                return av91Var;
            case 1:
                ((Number) obj3).intValue();
                return new phh0((st91) obj4);
            case 2:
                phh0 phh0Var = (phh0) obj;
                if (vp51.f243600a[((sp51) obj4).ordinal()] != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                String str3 = xoc1.f263957O6.f243453a;
                dv91 dv91Var2 = new dv91("hit", 1);
                string = str3 != null ? str3.toString() : null;
                return new av91("", "", dv91Var2, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string != null ? string : "")), phh0Var.f177665b, phh0Var.f177664a, System.currentTimeMillis());
            case 3:
                ((Number) obj3).intValue();
                return iaz.m50106d(0, ((au51) obj).f19865q, "");
            case 4:
                st51 st51Var = (st51) obj4;
                if (st51Var instanceof st51) {
                    return iaz.m50108k(0, st51Var.f213820a, st51Var.f213821b);
                }
                throw new NoWhenBranchMatchedException();
            case 5:
                ((Number) obj3).intValue();
                return new vhh0((st91) obj4);
            case 6:
                vhh0 vhh0Var = (vhh0) obj;
                hg70 hg70Var = (hg70) obj4;
                zt91 zt91Var2 = vhh0Var.f241523b;
                if (hg70Var.equals(eg70.f59236a)) {
                    return vhh0Var.m85571h();
                }
                if (hg70Var instanceof fg70) {
                    String str4 = ((fg70) hg70Var).f69239a;
                    yt91 yt91VarM96903c5 = zt91Var2.m96903c();
                    yt91VarM96903c5.f276055i.add(new bu91("subtitles_row", str4, null, null, null));
                    yt91VarM96903c5.f276056j = false;
                    return new av91("", "", new dv91("hit", 1), new bv91("ui_select", 1, nauVar), yt91VarM96903c5.m94607a(), vhh0Var.f241522a, System.currentTimeMillis());
                }
                if (!hg70Var.equals(gg70.f79565a)) {
                    throw new NoWhenBranchMatchedException();
                }
                yt91 yt91VarM96903c6 = zt91Var2.m96903c();
                yt91VarM96903c6.f276055i.add(new bu91("subtitles_row", "off", null, null, null));
                yt91VarM96903c6.f276056j = false;
                return new av91("", "", new dv91("hit", 1), new bv91("ui_select", 1, nauVar), yt91VarM96903c6.m94607a(), vhh0Var.f241522a, System.currentTimeMillis());
            case 7:
                ((Number) obj3).intValue();
                return new vhh0((st91) obj4);
            case 8:
                vhh0 vhh0Var2 = (vhh0) obj;
                vx51 vx51Var = (vx51) obj4;
                zt91 zt91Var3 = vhh0Var2.f241523b;
                if (vx51Var instanceof tx51) {
                    String str5 = ((tx51) vx51Var).f224572a;
                    yt91 yt91VarM96903c7 = zt91Var3.m96903c();
                    yt91VarM96903c7.f276055i.add(new bu91("subtitles_row", str5, null, null, null));
                    yt91VarM96903c7.f276056j = false;
                    return new av91("", "", new dv91("hit", 1), new bv91("ui_select", 1, nauVar), yt91VarM96903c7.m94607a(), vhh0Var2.f241522a, System.currentTimeMillis());
                }
                if (vx51Var.equals(sx51.f214821a)) {
                    return vhh0Var2.m85571h();
                }
                if (!vx51Var.equals(ux51.f234828a)) {
                    throw new NoWhenBranchMatchedException();
                }
                yt91 yt91VarM96903c8 = zt91Var3.m96903c();
                yt91VarM96903c8.f276055i.add(new bu91("subtitles_row", "off", null, null, null));
                yt91VarM96903c8.f276056j = false;
                return new av91("", "", new dv91("hit", 1), new bv91("ui_select", 1, nauVar), yt91VarM96903c8.m94607a(), vhh0Var2.f241522a, System.currentTimeMillis());
            case 9:
                ((Number) obj3).intValue();
                hy51 hy51Var = ((iy51) obj2).f106852a;
                return new q1h0(hy51Var.f96469b, String.valueOf(hy51Var.f96471d), hy51Var.f96470c);
            case 10:
                if (obj4 == null) {
                    return null;
                }
                throw new ClassCastException();
            case 11:
                ((Number) obj3).intValue();
                return new teh0(new g4h0(new ueh0((st91) obj4)));
            case 12:
                teh0 teh0Var = (teh0) obj;
                yt91 yt91VarM96903c9 = teh0Var.f219701a.m96903c();
                yt91VarM96903c9.f276055i.add(new bu91("go_to_settings_button", null, null, null, null));
                yt91VarM96903c9.f276056j = false;
                zt91 zt91VarM94607a = yt91VarM96903c9.m94607a();
                String str6 = xoc1.f264072e1.f243453a;
                dv91 dv91Var3 = new dv91("hit", 1);
                string = str6 != null ? str6.toString() : null;
                return new av91("", "", dv91Var3, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string != null ? string : "")), zt91VarM94607a, ((ueh0) teh0Var.f219702b.f76422c).f229540a, System.currentTimeMillis());
            case 13:
                yy51 yy51Var = (yy51) obj;
                int iIntValue = ((Number) obj3).intValue();
                a7h0 a7h0Var = new a7h0(new e7h0(), 2);
                Integer numValueOf = Integer.valueOf(iIntValue);
                switch (edb.m38547C(yy51Var.f277416g)) {
                    case 0:
                        i2 = 8;
                        break;
                    case 1:
                        i2 = 3;
                        break;
                    case 2:
                        break;
                    case 3:
                        i2 = 1;
                        break;
                    case 4:
                        i2 = 6;
                        break;
                    case 5:
                        i2 = 4;
                        break;
                    case 6:
                        i2 = 5;
                        break;
                    case 7:
                        i2 = 7;
                        break;
                    case 8:
                        i2 = 9;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                return new d7h0(a7h0Var, numValueOf, i2, yy51Var.f277410a);
            case 14:
                zt91 zt91Var4 = ((d7h0) obj).f46198a;
                wkn0 wkn0Var = ((xy51) obj4).f267226a;
                if (wkn0Var instanceof ukn0) {
                    if (!wj50.m88271j(((ukn0) wkn0Var).f231322a, okn0.f166419b)) {
                        return null;
                    }
                    yt91 yt91VarM96903c10 = zt91Var4.m96903c();
                    yt91VarM96903c10.f276055i.add(new bu91("add_button", null, null, null, null));
                    yt91VarM96903c10.f276056j = false;
                    return new av91("", "", new dv91("hit", 1), new bv91("ui_select", 1, nauVar), yt91VarM96903c10.m94607a(), st91.f213865b, System.currentTimeMillis());
                }
                if (!wj50.m88271j(wkn0Var, vkn0.f242248a)) {
                    return null;
                }
                yt91 yt91VarM96903c11 = zt91Var4.m96903c();
                yt91VarM96903c11.f276055i.add(new bu91("context_menu_button", null, null, null, null));
                yt91VarM96903c11.f276056j = false;
                return new av91("", "", new dv91("hit", 1), new bv91("ui_reveal", 1, nauVar), yt91VarM96903c11.m94607a(), st91.f213865b, System.currentTimeMillis());
            case 15:
                f061 f061Var = (f061) obj;
                ((Number) obj3).intValue();
                return new m7h0(f061Var.f64556a.f247244a, Integer.valueOf(f061Var.f64557b), (st91) obj4);
            case 16:
                m7h0 m7h0Var = (m7h0) obj;
                if (((e061) obj4).equals(e061.f54885a)) {
                    return new av91("", "", new dv91("hit", 1), new bv91("text_edit", 1, Collections.singletonMap("field_to_be_changed", "")), m7h0Var.f140781b, m7h0Var.f140780a, System.currentTimeMillis());
                }
                throw new NoWhenBranchMatchedException();
            case 17:
                ((Number) obj3).intValue();
                return new x7h0(Integer.valueOf(((q061) obj).f183918b), (st91) obj4);
            case 18:
                x7h0 x7h0Var = (x7h0) obj;
                p061 p061Var = (p061) obj4;
                if (p061Var.equals(n061.f148919a)) {
                    return new av91("", "", new dv91("hit", 1), new bv91("text_edit", 1, Collections.singletonMap("field_to_be_changed", "")), x7h0Var.f258924b, x7h0Var.f258923a, System.currentTimeMillis());
                }
                if (p061Var.equals(o061.f160248a)) {
                    return new av91("", "", new dv91("hit", 1), new bv91("copy_to_clipboard", 1, nauVar), x7h0Var.f258924b, x7h0Var.f258923a, System.currentTimeMillis());
                }
                throw new NoWhenBranchMatchedException();
            case 19:
                ((Number) obj3).intValue();
                return new y7h0(Integer.valueOf(((d161) obj).f44172b), (st91) obj4);
            case 20:
                y7h0 y7h0Var = (y7h0) obj;
                if (((c161) obj4).equals(c161.f33002a)) {
                    return new av91("", "", new dv91("hit", 1), new bv91("ui_reveal", 1, nauVar), y7h0Var.f270084b, y7h0Var.f270083a, System.currentTimeMillis());
                }
                throw new NoWhenBranchMatchedException();
            case 21:
                whh0 whh0Var = (whh0) obj;
                u161 u161Var = (u161) obj2;
                if (!(((t161) obj4) instanceof t161)) {
                    throw new NoWhenBranchMatchedException();
                }
                mzn0 mzn0Var = u161Var.f225688a;
                if (mzn0Var.f148740j) {
                    return new av91("", "", new dv91("hit", 1), new bv91("refresh_content", 1, nauVar), whh0Var.f251355b, whh0Var.f251354a, System.currentTimeMillis());
                }
                String str7 = mzn0Var.f148736f;
                return str7 != null ? whh0Var.m88145a(str7) : whh0Var.m88146h();
            case 22:
                return null;
            case 23:
                return null;
            case 24:
                ta61 ta61Var = (ta61) obj2;
                ((Number) obj3).intValue();
                st91 st91Var = (st91) obj4;
                String strM78600e = so0.m78600e(ta61Var.f218466a);
                String str8 = ta61Var.f218472g;
                return new m9g0(str8 != null ? str8 : "", strM78600e, st91Var);
            case 25:
                m9g0 m9g0Var = (m9g0) obj;
                ta61 ta61Var2 = (ta61) obj3;
                ia61 ia61Var = (ia61) obj4;
                zt91 zt91Var5 = m9g0Var.f141307b;
                if (ia61Var instanceof fa61) {
                    List list2 = ta61Var2.f218467b;
                    fa61 fa61Var = (fa61) ia61Var;
                    int i3 = fa61Var.f67447b;
                    ma61 ma61Var = (ma61) g6f.m43747t0(fa61Var.f67446a, list2);
                    if (ma61Var == null || (list = ma61Var.f141486e) == null || (la61Var = (la61) g6f.m43747t0(i3, list)) == null || (str2 = la61Var.f131282b) == null) {
                        str2 = "unknown";
                    }
                    String str9 = str2;
                    Integer numValueOf2 = Integer.valueOf(i3);
                    yt91 yt91VarM96903c12 = zt91Var5.m96903c();
                    yt91VarM96903c12.f276055i.add(new bu91("survey_option", null, numValueOf2, null, str9));
                    yt91VarM96903c12.f276056j = false;
                    av91Var2 = new av91("", "", new dv91("hit", 1), new bv91("ui_select", 1, nauVar), yt91VarM96903c12.m94607a(), m9g0Var.f141306a, System.currentTimeMillis());
                } else {
                    if (!(ia61Var instanceof ha61)) {
                        if ((ia61Var instanceof ea61) || (ia61Var instanceof ga61) || (ia61Var instanceof ca61) || (ia61Var instanceof da61)) {
                            return null;
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    yt91 yt91VarM96903c13 = zt91Var5.m96903c();
                    yt91VarM96903c13.f276055i.add(new bu91("submit_button", null, null, null, null));
                    yt91VarM96903c13.f276056j = false;
                    av91Var2 = new av91("", "", new dv91("hit", 1), new bv91("ui_reveal", 1, nauVar), yt91VarM96903c13.m94607a(), m9g0Var.f141306a, System.currentTimeMillis());
                }
                return av91Var2;
            case 26:
                reh0 reh0Var = (reh0) obj;
                if (((lc61) obj4) instanceof lc61) {
                    return new av91("", "", new dv91("hit", 1), new bv91("ui_select", 1, nauVar), reh0Var.f198369a, reh0Var.f198370b.f240134b, System.currentTimeMillis());
                }
                throw new NoWhenBranchMatchedException();
            case 27:
                pv91 pv91Var = (pv91) obj;
                of61 of61Var = (of61) obj4;
                u9h0 u9h0Var = pv91Var instanceof u9h0 ? (u9h0) pv91Var : null;
                if (!of61Var.equals(of61.f164656a)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (u9h0Var != null) {
                    return new av91("", "", new dv91("hit", 1), new bv91("ui_select", 1, nauVar), u9h0Var.f228200a, u9h0Var.f228201b.f238949b.f249179b.f280780a, System.currentTimeMillis());
                }
                return null;
            case 28:
                ((Number) obj3).intValue();
                return new b1h0(((kg61) obj).f122306a, (st91) obj4);
            default:
                b1h0 b1h0Var = (b1h0) obj;
                kg61 kg61Var = (kg61) obj2;
                lg61 lg61Var = (lg61) obj3;
                if (!((jg61) obj4).equals(jg61.f112094a)) {
                    throw new NoWhenBranchMatchedException();
                }
                Float f = lg61Var.f133105d;
                if (f != null) {
                    float fFloatValue = f.floatValue();
                    Float f2 = lg61Var.f133102a.f122307b;
                    fValueOf = Float.valueOf(fFloatValue * (f2 != null ? f2.floatValue() : 1.0f));
                } else {
                    fValueOf = null;
                }
                if (fValueOf == null) {
                    return null;
                }
                st91 st91VarMo24361d = b1h0Var.mo24361d();
                zt91 zt91Var6 = zt91.f286105i;
                yt91 yt91VarM50626j = ihf1.m50626j();
                yt91VarM50626j.f276054h = "music";
                yt91VarM50626j.f276047a = "mobile-playlist-speed-sync-button";
                yt91VarM50626j.f276052f = "1.0.0";
                yt91VarM50626j.f276053g = "20.0.5";
                yt91 yt91VarM96903c14 = yt91VarM50626j.m94607a().m96903c();
                yt91VarM96903c14.f276055i.add(new bu91("sync_button", null, null, null, null));
                yt91VarM96903c14.f276056j = false;
                zt91 zt91VarM94607a2 = yt91VarM96903c14.m94607a();
                String str10 = kg61Var.f122306a;
                int iM72083N = q3d0.m72083N(fValueOf.floatValue());
                dv91 dv91Var4 = new dv91("hit", 1);
                string = str10 != null ? str10.toString() : null;
                if (string == null) {
                    string = "";
                }
                pqm0 pqm0Var2 = new pqm0("currently_played_item", string);
                String strValueOf = String.valueOf(iM72083N);
                return new av91("", "", dv91Var4, new bv91("set_playback_speed", 1, kkc0.m56695h0(pqm0Var2, new pqm0(ContextTrack.Metadata.KEY_PLAYBACK_SPEED, strValueOf != null ? strValueOf : ""))), zt91VarM94607a2, st91VarMo24361d, System.currentTimeMillis());
        }
    }
}
