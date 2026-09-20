package p204p;

import com.spotify.player.model.ContextTrack;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes10.dex */
public final class x9g0 implements pv91 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f259362a;

    /* JADX INFO: renamed from: b */
    public final zt91 f259363b;

    public x9g0(ahg0 ahg0Var) {
        this.f259362a = 25;
        yt91 yt91VarM96903c = ahg0Var.f15692b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("last_visited_page_shortcut", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        this.f259363b = yt91VarM96903c.m94607a();
    }

    /* JADX INFO: renamed from: a */
    public av91 m90246a(String str) {
        switch (this.f259362a) {
            case 1:
                dv91 dv91Var = new dv91("hit", 1);
                String string = str != null ? str.toString() : null;
                if (string == null) {
                    string = "";
                }
                return new av91("", "", dv91Var, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string)), this.f259363b, st91.f213865b, System.currentTimeMillis());
            case 25:
                dv91 dv91Var2 = new dv91("hit", 1);
                String string2 = str.toString();
                if (string2 == null) {
                    string2 = "";
                }
                return new av91("", "", dv91Var2, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string2)), this.f259363b, st91.f213865b, System.currentTimeMillis());
            default:
                dv91 dv91Var3 = new dv91("hit", 1);
                String string3 = str != null ? str.toString() : null;
                if (string3 == null) {
                    string3 = "";
                }
                return new av91("", "", dv91Var3, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string3)), this.f259363b, st91.f213865b, System.currentTimeMillis());
        }
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        int i = this.f259362a;
        lau lauVar = lau.f131415a;
        zt91 zt91Var = this.f259363b;
        switch (i) {
            case 0:
                st91 st91Var = st91.f213865b;
                return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
            case 1:
                st91 st91Var2 = st91.f213865b;
                return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
            case 2:
                st91 st91Var3 = st91.f213865b;
                return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
            case 3:
                st91 st91Var4 = st91.f213865b;
                return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
            case 4:
                st91 st91Var5 = st91.f213865b;
                return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
            case 5:
                st91 st91Var6 = st91.f213865b;
                return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
            case 6:
                st91 st91Var7 = st91.f213865b;
                return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
            case 7:
                st91 st91Var8 = st91.f213865b;
                return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
            case 8:
                st91 st91Var9 = st91.f213865b;
                return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
            case 9:
                st91 st91Var10 = st91.f213865b;
                return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
            case 10:
                st91 st91Var11 = st91.f213865b;
                st91 st91Var12 = st91.f213865b;
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(lauVar);
                ofg1.m66846o(zt91Var, "location");
                arrayList.add(zt91Var);
                return new st91(arrayList);
            case 11:
                st91 st91Var13 = st91.f213865b;
                return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
            case 12:
                st91 st91Var14 = st91.f213865b;
                st91 st91Var15 = st91.f213865b;
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(lauVar);
                ofg1.m66846o(zt91Var, "location");
                arrayList2.add(zt91Var);
                return new st91(arrayList2);
            case 13:
                st91 st91Var16 = st91.f213865b;
                st91 st91Var17 = st91.f213865b;
                ArrayList arrayList3 = new ArrayList();
                arrayList3.addAll(lauVar);
                ofg1.m66846o(zt91Var, "location");
                arrayList3.add(zt91Var);
                return new st91(arrayList3);
            case 14:
                st91 st91Var18 = st91.f213865b;
                return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
            case 15:
                st91 st91Var19 = st91.f213865b;
                return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
            case 16:
                st91 st91Var20 = st91.f213865b;
                return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
            case 17:
                st91 st91Var21 = st91.f213865b;
                return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
            case 18:
                st91 st91Var22 = st91.f213865b;
                st91 st91Var23 = st91.f213865b;
                ArrayList arrayList4 = new ArrayList();
                arrayList4.addAll(lauVar);
                ofg1.m66846o(zt91Var, "location");
                arrayList4.add(zt91Var);
                return new st91(arrayList4);
            case 19:
                st91 st91Var24 = st91.f213865b;
                return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
            case 20:
                st91 st91Var25 = st91.f213865b;
                st91 st91Var26 = st91.f213865b;
                ArrayList arrayList5 = new ArrayList();
                arrayList5.addAll(lauVar);
                ofg1.m66846o(zt91Var, "location");
                arrayList5.add(zt91Var);
                return new st91(arrayList5);
            case 21:
                st91 st91Var27 = st91.f213865b;
                return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
            case 22:
                st91 st91Var28 = st91.f213865b;
                return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
            case 23:
                st91 st91Var29 = st91.f213865b;
                return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
            case 24:
                st91 st91Var30 = st91.f213865b;
                st91 st91Var31 = st91.f213865b;
                ArrayList arrayList6 = new ArrayList();
                arrayList6.addAll(lauVar);
                ofg1.m66846o(zt91Var, "location");
                arrayList6.add(zt91Var);
                return new st91(arrayList6);
            case 25:
                st91 st91Var32 = st91.f213865b;
                return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
            case 26:
                st91 st91Var33 = st91.f213865b;
                return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
            case 27:
                st91 st91Var34 = st91.f213865b;
                return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
            case 28:
                st91 st91Var35 = st91.f213865b;
                return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
            default:
                st91 st91Var36 = st91.f213865b;
                return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
        }
    }

    /* JADX INFO: renamed from: e */
    public x9g0 m90247e(String str) {
        return new x9g0(this, str);
    }

    /* JADX INFO: renamed from: h */
    public x9g0 m90248h() {
        return new x9g0(this, (short) 0);
    }

    /* JADX INFO: renamed from: i */
    public x9g0 m90249i() {
        return new x9g0(this, 27, false);
    }

    /* JADX INFO: renamed from: j */
    public av91 m90250j() {
        return new av91("", "", new dv91("hit", 1), new bv91("filter", 1, nau.f152117a), this.f259363b, st91.f213865b, System.currentTimeMillis());
    }

    /* JADX INFO: renamed from: k */
    public av91 m90251k(String str) {
        dv91 dv91Var = new dv91("hit", 1);
        String string = str != null ? str.toString() : null;
        if (string == null) {
            string = "";
        }
        return new av91("", "", dv91Var, new bv91("navigate_to_external_uri", 1, Collections.singletonMap("destination", string)), this.f259363b, st91.f213865b, System.currentTimeMillis());
    }

    /* JADX INFO: renamed from: l */
    public av91 m90252l(String str) {
        return new av91("", "", new dv91("hit", 1), new bv91(ContextTrack.TrackAction.PAUSE, 1, Collections.singletonMap("item_to_be_paused", "")), this.f259363b, st91.f213865b, System.currentTimeMillis());
    }

    /* JADX INFO: renamed from: m */
    public av91 m90253m(String str) {
        return new av91("", "", new dv91("hit", 1), new bv91("play", 1, Collections.singletonMap("item_to_be_played", "")), this.f259363b, st91.f213865b, System.currentTimeMillis());
    }

    /* JADX INFO: renamed from: n */
    public av91 m90254n() {
        return new av91("", "", new dv91("hit", 1), new bv91("skip_to_next", 1, Collections.singletonMap("item_to_be_skipped", "")), this.f259363b, st91.f213865b, System.currentTimeMillis());
    }

    /* JADX INFO: renamed from: o */
    public av91 m90255o() {
        return new av91("", "", new dv91("hit", 1), new bv91("skip_to_previous", 1, Collections.singletonMap("item_to_be_skipped", "")), this.f259363b, st91.f213865b, System.currentTimeMillis());
    }

    /* JADX INFO: renamed from: p */
    public av91 m90256p() {
        return new av91("", "", new dv91("hit", 1), new bv91("ui_select", 1, nau.f152117a), this.f259363b, st91.f213865b, System.currentTimeMillis());
    }

    /* JADX INFO: renamed from: q */
    public x9g0 m90257q() {
        return new x9g0(this, 3);
    }

    /* JADX INFO: renamed from: r */
    public x9g0 m90258r() {
        return new x9g0(this, (char) 0);
    }

    /* JADX INFO: renamed from: s */
    public x9g0 m90259s() {
        return new x9g0(this, 28, false);
    }

    /* JADX INFO: renamed from: t */
    public x9g0 m90260t() {
        return new x9g0(this, 4);
    }

    /* JADX INFO: renamed from: u */
    public x9g0 m90261u() {
        return new x9g0(this, 5);
    }

    public x9g0(l9g0 l9g0Var, Integer num) {
        this.f259362a = 23;
        yt91 yt91VarM96903c = l9g0Var.f131086b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("sections", null, num, null, null));
        yt91VarM96903c.f276056j = false;
        this.f259363b = yt91VarM96903c.m94607a();
    }

    public x9g0(i8g0 i8g0Var, char c) {
        this.f259362a = 10;
        yt91 yt91VarM96903c = i8g0Var.f99785b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("plans", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        this.f259363b = yt91VarM96903c.m94607a();
    }

    public x9g0(l9g0 l9g0Var, boolean z, short s) {
        this.f259362a = 22;
        yt91 yt91VarM96903c = l9g0Var.f131086b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("back_button", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        this.f259363b = yt91VarM96903c.m94607a();
    }

    public x9g0(i8g0 i8g0Var) {
        this.f259362a = 2;
        yt91 yt91VarM96903c = i8g0Var.f99785b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("carousel", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        this.f259363b = yt91VarM96903c.m94607a();
    }

    public x9g0(l9g0 l9g0Var, short s) {
        this.f259362a = 16;
        yt91 yt91VarM96903c = l9g0Var.f131086b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("toolbar", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        this.f259363b = yt91VarM96903c.m94607a();
    }

    public x9g0(i8g0 i8g0Var, byte b) {
        this.f259362a = 8;
        yt91 yt91VarM96903c = i8g0Var.f99785b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("vertical_container", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        this.f259363b = yt91VarM96903c.m94607a();
    }

    public x9g0(teg0 teg0Var) {
        this.f259362a = 19;
        yt91 yt91VarM96903c = teg0Var.f219697a.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("chats", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        this.f259363b = yt91VarM96903c.m94607a();
    }

    public x9g0(tcg0 tcg0Var) {
        this.f259362a = 11;
        yt91 yt91VarM96903c = tcg0Var.f219082a.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("header", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        this.f259363b = yt91VarM96903c.m94607a();
    }

    public x9g0(l9g0 l9g0Var, byte b) {
        this.f259362a = 9;
        yt91 yt91VarM96903c = l9g0Var.f131086b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("toolbar", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        this.f259363b = yt91VarM96903c.m94607a();
    }

    public x9g0(l9g0 l9g0Var, int i) {
        this.f259362a = i;
        switch (i) {
            case 1:
                yt91 yt91VarM96903c = l9g0Var.f131086b.m96903c();
                yt91VarM96903c.f276055i.add(new bu91("disclaimer_text", null, null, null, null));
                yt91VarM96903c.f276056j = false;
                this.f259363b = yt91VarM96903c.m94607a();
                break;
            default:
                yt91 yt91VarM96903c2 = l9g0Var.f131086b.m96903c();
                yt91VarM96903c2.f276055i.add(new bu91("continue_button", null, null, null, null));
                yt91VarM96903c2.f276056j = false;
                this.f259363b = yt91VarM96903c2.m94607a();
                break;
        }
    }

    public x9g0(ipg0 ipg0Var) {
        this.f259362a = 29;
        yt91 yt91VarM96903c = ipg0Var.f104499b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("toolbar", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        this.f259363b = yt91VarM96903c.m94607a();
    }

    public x9g0(keg0 keg0Var) {
        this.f259362a = 17;
        yt91 yt91VarM96903c = keg0Var.f121888b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("chats", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        this.f259363b = yt91VarM96903c.m94607a();
    }

    public x9g0(ylg0 ylg0Var, int i) {
        String str;
        this.f259362a = 24;
        yt91 yt91VarM96903c = ylg0Var.f274013a.m96903c();
        if (i == 1) {
            str = "jam_active_as_host";
        } else if (i == 2) {
            str = "jam_active_as_member";
        } else {
            if (i != 3) {
                throw null;
            }
            str = "personalized_recommendations_disabled";
        }
        yt91VarM96903c.f276055i.add(new bu91("dialog", str, null, null, null));
        yt91VarM96903c.f276056j = false;
        this.f259363b = yt91VarM96903c.m94607a();
    }

    public x9g0(x9g0 x9g0Var, short s) {
        this.f259362a = 7;
        yt91 yt91VarM96903c = x9g0Var.f259363b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("controls_container", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        this.f259363b = yt91VarM96903c.m94607a();
    }

    public x9g0(peg0 peg0Var) {
        this.f259362a = 18;
        yt91 yt91VarM96903c = peg0Var.f176746a.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("members_list", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        this.f259363b = yt91VarM96903c.m94607a();
    }

    public x9g0(i8g0 i8g0Var, short s) {
        this.f259362a = 20;
        yt91 yt91VarM96903c = i8g0Var.f99785b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("shared_by_sheet", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        this.f259363b = yt91VarM96903c.m94607a();
    }

    public x9g0(i8g0 i8g0Var, int i) {
        this.f259362a = 12;
        yt91 yt91VarM96903c = i8g0Var.f99785b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("suggested_users_list", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        this.f259363b = yt91VarM96903c.m94607a();
    }

    public x9g0(idg0 idg0Var) {
        this.f259362a = 13;
        yt91 yt91VarM96903c = idg0Var.f101133a.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("existing_groups", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        this.f259363b = yt91VarM96903c.m94607a();
    }

    public x9g0(x9g0 x9g0Var, char c) {
        this.f259362a = 6;
        yt91 yt91VarM96903c = x9g0Var.f259363b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("playback_controls", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        this.f259363b = yt91VarM96903c.m94607a();
    }

    public x9g0(x9g0 x9g0Var, int i) {
        this.f259362a = i;
        switch (i) {
            case 4:
                yt91 yt91VarM96903c = x9g0Var.f259363b.m96903c();
                yt91VarM96903c.f276055i.add(new bu91("skip_next", null, null, null, null));
                yt91VarM96903c.f276056j = false;
                this.f259363b = yt91VarM96903c.m94607a();
                break;
            case 5:
                yt91 yt91VarM96903c2 = x9g0Var.f259363b.m96903c();
                yt91VarM96903c2.f276055i.add(new bu91("skip_prev", null, null, null, null));
                yt91VarM96903c2.f276056j = false;
                this.f259363b = yt91VarM96903c2.m94607a();
                break;
            default:
                yt91 yt91VarM96903c3 = x9g0Var.f259363b.m96903c();
                yt91VarM96903c3.f276055i.add(new bu91("play_pause", null, null, null, null));
                yt91VarM96903c3.f276056j = false;
                this.f259363b = yt91VarM96903c3.m94607a();
                break;
        }
    }

    public x9g0(l9g0 l9g0Var, char c) {
        this.f259362a = 14;
        yt91 yt91VarM96903c = l9g0Var.f131086b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("group_chat_header", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        this.f259363b = yt91VarM96903c.m94607a();
    }

    public x9g0(x9g0 x9g0Var, int i, boolean z) {
        this.f259362a = i;
        switch (i) {
            case 28:
                yt91 yt91VarM96903c = x9g0Var.f259363b.m96903c();
                yt91VarM96903c.f276055i.add(new bu91("profile_icon", null, null, null, null));
                yt91VarM96903c.f276056j = false;
                this.f259363b = yt91VarM96903c.m94607a();
                break;
            default:
                yt91 yt91VarM96903c2 = x9g0Var.f259363b.m96903c();
                yt91VarM96903c2.f276055i.add(new bu91("filters", null, null, null, null));
                yt91VarM96903c2.f276056j = false;
                this.f259363b = yt91VarM96903c2.m94607a();
                break;
        }
    }

    public x9g0(x9g0 x9g0Var, String str) {
        this.f259362a = 26;
        yt91 yt91VarM96903c = x9g0Var.f259363b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("chip", str, 0, null, null));
        yt91VarM96903c.f276056j = false;
        this.f259363b = yt91VarM96903c.m94607a();
    }

    public x9g0(sag0 sag0Var) {
        this.f259362a = 21;
        yt91 yt91VarM96903c = sag0Var.f207208b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("learn_even_more", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        this.f259363b = yt91VarM96903c.m94607a();
    }

    public x9g0(geg0 geg0Var) {
        this.f259362a = 15;
        yt91 yt91VarM96903c = geg0Var.f79118a.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("toolbar", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        this.f259363b = yt91VarM96903c.m94607a();
    }
}
