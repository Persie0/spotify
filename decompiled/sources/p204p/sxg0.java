package p204p;

import androidx.media3.session.legacy.MediaBrowserServiceCompat;
import com.spotify.player.model.ContextTrack;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes10.dex */
public final class sxg0 implements pv91 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f214888a;

    /* JADX INFO: renamed from: b */
    public final zt91 f214889b;

    public sxg0(ndh0 ndh0Var) {
        this.f214888a = 22;
        yt91 yt91VarM96903c = ndh0Var.f152779b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("toolbar", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        this.f214889b = yt91VarM96903c.m94607a();
    }

    /* JADX INFO: renamed from: a */
    public av91 m79594a(String str) {
        switch (this.f214888a) {
            case 26:
                dv91 dv91Var = new dv91("hit", 1);
                String string = str.toString();
                if (string == null) {
                    string = "";
                }
                return new av91("", "", dv91Var, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string)), this.f214889b, st91.f213865b, System.currentTimeMillis());
            default:
                dv91 dv91Var2 = new dv91("hit", 1);
                String string2 = str.toString();
                if (string2 == null) {
                    string2 = "";
                }
                return new av91("", "", dv91Var2, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string2)), this.f214889b, st91.f213865b, System.currentTimeMillis());
        }
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        int i = this.f214888a;
        lau lauVar = lau.f131415a;
        zt91 zt91Var = this.f214889b;
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
                st91 st91Var9 = st91.f213865b;
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(lauVar);
                ofg1.m66846o(zt91Var, "location");
                arrayList.add(zt91Var);
                return new st91(arrayList);
            case 8:
                st91 st91Var10 = st91.f213865b;
                st91 st91Var11 = st91.f213865b;
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(lauVar);
                ofg1.m66846o(zt91Var, "location");
                arrayList2.add(zt91Var);
                return new st91(arrayList2);
            case 9:
                st91 st91Var12 = st91.f213865b;
                st91 st91Var13 = st91.f213865b;
                ArrayList arrayList3 = new ArrayList();
                arrayList3.addAll(lauVar);
                ofg1.m66846o(zt91Var, "location");
                arrayList3.add(zt91Var);
                return new st91(arrayList3);
            case 10:
                st91 st91Var14 = st91.f213865b;
                return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
            case 11:
                st91 st91Var15 = st91.f213865b;
                return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
            case 12:
                st91 st91Var16 = st91.f213865b;
                return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
            case 13:
                st91 st91Var17 = st91.f213865b;
                return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
            case 14:
                st91 st91Var18 = st91.f213865b;
                return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
            case 15:
                st91 st91Var19 = st91.f213865b;
                return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
            case 16:
                st91 st91Var20 = st91.f213865b;
                st91 st91Var21 = st91.f213865b;
                ArrayList arrayList4 = new ArrayList();
                arrayList4.addAll(lauVar);
                ofg1.m66846o(zt91Var, "location");
                arrayList4.add(zt91Var);
                return new st91(arrayList4);
            case 17:
                st91 st91Var22 = st91.f213865b;
                return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
            case 18:
                st91 st91Var23 = st91.f213865b;
                return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
            case 19:
                st91 st91Var24 = st91.f213865b;
                return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
            case 20:
                st91 st91Var25 = st91.f213865b;
                return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
            case 21:
                st91 st91Var26 = st91.f213865b;
                return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
            case 22:
                st91 st91Var27 = st91.f213865b;
                return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
            case 23:
                st91 st91Var28 = st91.f213865b;
                return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
            case 24:
                st91 st91Var29 = st91.f213865b;
                return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
            case 25:
                st91 st91Var30 = st91.f213865b;
                return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
            case 26:
                st91 st91Var31 = st91.f213865b;
                st91 st91Var32 = st91.f213865b;
                ArrayList arrayList5 = new ArrayList();
                arrayList5.addAll(lauVar);
                ofg1.m66846o(zt91Var, "location");
                arrayList5.add(zt91Var);
                return new st91(arrayList5);
            case 27:
                st91 st91Var33 = st91.f213865b;
                st91 st91Var34 = st91.f213865b;
                ArrayList arrayList6 = new ArrayList();
                arrayList6.addAll(lauVar);
                ofg1.m66846o(zt91Var, "location");
                arrayList6.add(zt91Var);
                return new st91(arrayList6);
            case 28:
                st91 st91Var35 = st91.f213865b;
                return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
            default:
                st91 st91Var36 = st91.f213865b;
                return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
        }
    }

    /* JADX INFO: renamed from: e */
    public sxg0 m79595e() {
        return new sxg0(this, (byte) 0);
    }

    /* JADX INFO: renamed from: h */
    public sxg0 m79596h() {
        return new sxg0(this, 12, false);
    }

    /* JADX INFO: renamed from: i */
    public rxg0 m79597i() {
        return new rxg0(this, 28);
    }

    /* JADX INFO: renamed from: j */
    public sxg0 m79598j() {
        return new sxg0(this, 1);
    }

    /* JADX INFO: renamed from: k */
    public av91 m79599k(String str) {
        switch (this.f214888a) {
            case 18:
                dv91 dv91Var = new dv91("hit", 1);
                String string = str != null ? str.toString() : null;
                if (string == null) {
                    string = "";
                }
                return new av91("", "", dv91Var, new bv91("like", 1, Collections.singletonMap("item_to_be_liked", string)), this.f214889b, st91.f213865b, System.currentTimeMillis());
            case 19:
                dv91 dv91Var2 = new dv91("hit", 1);
                String string2 = str != null ? str.toString() : null;
                if (string2 == null) {
                    string2 = "";
                }
                return new av91("", "", dv91Var2, new bv91("like", 1, Collections.singletonMap("item_to_be_liked", string2)), this.f214889b, st91.f213865b, System.currentTimeMillis());
            default:
                dv91 dv91Var3 = new dv91("hit", 1);
                String string3 = str != null ? str.toString() : null;
                if (string3 == null) {
                    string3 = "";
                }
                return new av91("", "", dv91Var3, new bv91("like", 1, Collections.singletonMap("item_to_be_liked", string3)), this.f214889b, st91.f213865b, System.currentTimeMillis());
        }
    }

    /* JADX INFO: renamed from: l */
    public av91 m79600l(String str) {
        switch (this.f214888a) {
            case 28:
                dv91 dv91Var = new dv91("hit", 1);
                String string = str != null ? str.toString() : null;
                if (string == null) {
                    string = "";
                }
                return new av91("", "", dv91Var, new bv91("navigate_to_external_uri", 1, Collections.singletonMap("destination", string)), this.f214889b, st91.f213865b, System.currentTimeMillis());
            default:
                dv91 dv91Var2 = new dv91("hit", 1);
                String string2 = str != null ? str.toString() : null;
                if (string2 == null) {
                    string2 = "";
                }
                return new av91("", "", dv91Var2, new bv91("navigate_to_external_uri", 1, Collections.singletonMap("destination", string2)), this.f214889b, st91.f213865b, System.currentTimeMillis());
        }
    }

    /* JADX INFO: renamed from: m */
    public av91 m79601m(String str) {
        switch (this.f214888a) {
            case 18:
                dv91 dv91Var = new dv91("hit", 1);
                String string = str != null ? str.toString() : null;
                if (string == null) {
                    string = "";
                }
                return new av91("", "", dv91Var, new bv91("remove_like", 1, Collections.singletonMap("item_no_longer_liked", string)), this.f214889b, st91.f213865b, System.currentTimeMillis());
            case 19:
                dv91 dv91Var2 = new dv91("hit", 1);
                String string2 = str != null ? str.toString() : null;
                if (string2 == null) {
                    string2 = "";
                }
                return new av91("", "", dv91Var2, new bv91("remove_like", 1, Collections.singletonMap("item_no_longer_liked", string2)), this.f214889b, st91.f213865b, System.currentTimeMillis());
            default:
                dv91 dv91Var3 = new dv91("hit", 1);
                String string3 = str != null ? str.toString() : null;
                if (string3 == null) {
                    string3 = "";
                }
                return new av91("", "", dv91Var3, new bv91("remove_like", 1, Collections.singletonMap("item_no_longer_liked", string3)), this.f214889b, st91.f213865b, System.currentTimeMillis());
        }
    }

    /* JADX INFO: renamed from: n */
    public av91 m79602n() {
        switch (this.f214888a) {
            case 1:
                return new av91("", "", new dv91("hit", 1), new bv91("setting_disable", 1, nau.f152117a), this.f214889b, st91.f213865b, System.currentTimeMillis());
            default:
                return new av91("", "", new dv91("hit", 1), new bv91("setting_disable", 1, nau.f152117a), this.f214889b, st91.f213865b, System.currentTimeMillis());
        }
    }

    /* JADX INFO: renamed from: o */
    public av91 m79603o(Integer num, String str) {
        dv91 dv91Var = new dv91("hit", 1);
        String string = str != null ? str.toString() : null;
        if (string == null) {
            string = "";
        }
        pqm0 pqm0Var = new pqm0(ContextTrack.Metadata.KEY_ENTITY_URI, string);
        String strValueOf = String.valueOf(num.intValue());
        return new av91("", "", dv91Var, new bv91("submit_rating", 1, kkc0.m56695h0(pqm0Var, new pqm0("rating", strValueOf != null ? strValueOf : ""))), this.f214889b, st91.f213865b, System.currentTimeMillis());
    }

    /* JADX INFO: renamed from: p */
    public av91 m79604p() {
        switch (this.f214888a) {
            case 5:
                return new av91("", "", new dv91("hit", 1), new bv91("ui_hide", 1, nau.f152117a), this.f214889b, st91.f213865b, System.currentTimeMillis());
            case 6:
                return new av91("", "", new dv91("hit", 1), new bv91("ui_hide", 1, nau.f152117a), this.f214889b, st91.f213865b, System.currentTimeMillis());
            case 7:
                return new av91("", "", new dv91("hit", 1), new bv91("ui_hide", 1, nau.f152117a), this.f214889b, st91.f213865b, System.currentTimeMillis());
            default:
                return new av91("", "", new dv91("hit", 1), new bv91("ui_hide", 1, nau.f152117a), this.f214889b, st91.f213865b, System.currentTimeMillis());
        }
    }

    /* JADX INFO: renamed from: q */
    public av91 m79605q() {
        switch (this.f214888a) {
            case 12:
                return new av91("", "", new dv91("hit", 1), new bv91("ui_navigate_back", 1, nau.f152117a), this.f214889b, st91.f213865b, System.currentTimeMillis());
            default:
                return new av91("", "", new dv91("hit", 1), new bv91("ui_navigate_back", 1, nau.f152117a), this.f214889b, st91.f213865b, System.currentTimeMillis());
        }
    }

    /* JADX INFO: renamed from: r */
    public av91 m79606r() {
        switch (this.f214888a) {
            case 18:
                return new av91("", "", new dv91("hit", 1), new bv91("ui_reveal", 1, nau.f152117a), this.f214889b, st91.f213865b, System.currentTimeMillis());
            case 19:
                return new av91("", "", new dv91("hit", 1), new bv91("ui_reveal", 1, nau.f152117a), this.f214889b, st91.f213865b, System.currentTimeMillis());
            default:
                return new av91("", "", new dv91("hit", 1), new bv91("ui_reveal", 1, nau.f152117a), this.f214889b, st91.f213865b, System.currentTimeMillis());
        }
    }

    /* JADX INFO: renamed from: s */
    public sxg0 m79607s() {
        return new sxg0(this, 13, false);
    }

    /* JADX INFO: renamed from: t */
    public rxg0 m79608t() {
        return new rxg0(this, 29);
    }

    /* JADX INFO: renamed from: u */
    public sxg0 m79609u() {
        return new sxg0(this, 2);
    }

    /* JADX INFO: renamed from: v */
    public sxg0 m79610v() {
        return new sxg0(this, 14, false);
    }

    /* JADX INFO: renamed from: w */
    public av91 m79611w(String str, Integer num, Integer num2) {
        dv91 dv91Var = new dv91("swipe", 1);
        String string = str != null ? str.toString() : null;
        if (string == null) {
            string = "";
        }
        pqm0 pqm0Var = new pqm0("item_to_be_skipped", string);
        String strValueOf = String.valueOf(num.intValue());
        if (strValueOf == null) {
            strValueOf = "";
        }
        pqm0 pqm0Var2 = new pqm0("position_ms", strValueOf);
        String strValueOf2 = String.valueOf(num2.intValue());
        return new av91("", "", dv91Var, new bv91("skip_to_next", 2, kkc0.m56695h0(pqm0Var, pqm0Var2, new pqm0("total_content_ms", strValueOf2 != null ? strValueOf2 : ""))), this.f214889b, st91.f213865b, System.currentTimeMillis());
    }

    /* JADX INFO: renamed from: x */
    public av91 m79612x(String str, Integer num, Integer num2) {
        dv91 dv91Var = new dv91("swipe", 1);
        String string = str != null ? str.toString() : null;
        if (string == null) {
            string = "";
        }
        pqm0 pqm0Var = new pqm0("item_to_be_skipped", string);
        String strValueOf = String.valueOf(num.intValue());
        if (strValueOf == null) {
            strValueOf = "";
        }
        pqm0 pqm0Var2 = new pqm0("position_ms", strValueOf);
        String strValueOf2 = String.valueOf(num2.intValue());
        return new av91("", "", dv91Var, new bv91("skip_to_previous", 2, kkc0.m56695h0(pqm0Var, pqm0Var2, new pqm0("total_content_ms", strValueOf2 != null ? strValueOf2 : ""))), this.f214889b, st91.f213865b, System.currentTimeMillis());
    }

    public sxg0(xug0 xug0Var) {
        this.f214888a = 5;
        yt91 yt91VarM96903c = xug0Var.f266109b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("got_it_button", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        this.f214889b = yt91VarM96903c.m94607a();
    }

    public sxg0(xug0 xug0Var, byte b) {
        this.f214888a = 6;
        yt91 yt91VarM96903c = xug0Var.f266109b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("got_it_button", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        this.f214889b = yt91VarM96903c.m94607a();
    }

    public sxg0(xxg0 xxg0Var) {
        this.f214888a = 9;
        yt91 yt91VarM96903c = xxg0Var.f267003b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("remove_download_dialog", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        this.f214889b = yt91VarM96903c.m94607a();
    }

    public sxg0(xxg0 xxg0Var, byte b) {
        this.f214888a = 16;
        yt91 yt91VarM96903c = xxg0Var.f267003b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("device_list", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        this.f214889b = yt91VarM96903c.m94607a();
    }

    public sxg0(cbh0 cbh0Var) {
        this.f214888a = 23;
        yt91 yt91VarM96903c = cbh0Var.f36128b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("search_bar", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        this.f214889b = yt91VarM96903c.m94607a();
    }

    public sxg0(ahg0 ahg0Var, byte b) {
        this.f214888a = 4;
        yt91 yt91VarM96903c = ahg0Var.f15692b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("cover_art", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        this.f214889b = yt91VarM96903c.m94607a();
    }

    public sxg0(xug0 xug0Var, String str) {
        this.f214888a = 15;
        yt91 yt91VarM96903c = xug0Var.f266109b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("page", str, null, null, null));
        yt91VarM96903c.f276056j = false;
        this.f214889b = yt91VarM96903c.m94607a();
    }

    public sxg0(g4h0 g4h0Var) {
        this.f214888a = 21;
        yt91 yt91VarM96903c = g4h0Var.f76421b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("search_bar", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        this.f214889b = yt91VarM96903c.m94607a();
    }

    public sxg0(cbh0 cbh0Var, int i, byte b) {
        this.f214888a = i;
        switch (i) {
            case 27:
                yt91 yt91VarM96903c = cbh0Var.f36128b.m96903c();
                yt91VarM96903c.f276055i.add(new bu91("sign_up_button", null, null, null, null));
                yt91VarM96903c.f276056j = false;
                this.f214889b = yt91VarM96903c.m94607a();
                break;
            default:
                yt91 yt91VarM96903c2 = cbh0Var.f36128b.m96903c();
                yt91VarM96903c2.f276055i.add(new bu91("login_button", null, null, null, null));
                yt91VarM96903c2.f276056j = false;
                this.f214889b = yt91VarM96903c2.m94607a();
                break;
        }
    }

    public sxg0(sxg0 sxg0Var, int i, boolean z) {
        this.f214888a = i;
        switch (i) {
            case 13:
                yt91 yt91VarM96903c = sxg0Var.f214889b.m96903c();
                yt91VarM96903c.f276055i.add(new bu91("ok_button", null, null, null, null));
                yt91VarM96903c.f276056j = false;
                this.f214889b = yt91VarM96903c.m94607a();
                break;
            case 14:
                yt91 yt91VarM96903c2 = sxg0Var.f214889b.m96903c();
                yt91VarM96903c2.f276055i.add(new bu91("submit_button", null, null, null, null));
                yt91VarM96903c2.f276056j = false;
                this.f214889b = yt91VarM96903c2.m94607a();
                break;
            default:
                yt91 yt91VarM96903c3 = sxg0Var.f214889b.m96903c();
                yt91VarM96903c3.f276055i.add(new bu91("close_button", null, null, null, null));
                yt91VarM96903c3.f276056j = false;
                this.f214889b = yt91VarM96903c3.m94607a();
                break;
        }
    }

    public sxg0(sxg0 sxg0Var, byte b) {
        this.f214888a = 8;
        yt91 yt91VarM96903c = sxg0Var.f214889b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("cancel_button", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        this.f214889b = yt91VarM96903c.m94607a();
    }

    public sxg0(Integer num, String str, xug0 xug0Var) {
        this.f214888a = 11;
        yt91 yt91VarM96903c = xug0Var.f266109b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("participant", null, num, str, null));
        yt91VarM96903c.f276056j = false;
        this.f214889b = yt91VarM96903c.m94607a();
    }

    public sxg0(jgh0 jgh0Var) {
        this.f214888a = 25;
        yt91 yt91VarM96903c = jgh0Var.f112194a.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("auto_invite_nearby_row", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        this.f214889b = yt91VarM96903c.m94607a();
    }

    public sxg0(sxg0 sxg0Var, char c) {
        this.f214888a = 10;
        yt91 yt91VarM96903c = sxg0Var.f214889b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("context_menu_button", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        this.f214889b = yt91VarM96903c.m94607a();
    }

    public sxg0(cbh0 cbh0Var, int i) {
        String str;
        this.f214888a = 24;
        yt91 yt91VarM96903c = cbh0Var.f36128b.m96903c();
        if (i == 1) {
            str = "query";
        } else {
            if (i != 2) {
                throw null;
            }
            str = "recents";
        }
        yt91VarM96903c.f276055i.add(new bu91(MediaBrowserServiceCompat.KEY_SEARCH_RESULTS, null, null, null, str));
        yt91VarM96903c.f276056j = false;
        this.f214889b = yt91VarM96903c.m94607a();
    }

    public sxg0(u1h0 u1h0Var) {
        this.f214888a = 7;
        yt91 yt91VarM96903c = u1h0Var.f225823a.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("keep_previous_quality_button", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        this.f214889b = yt91VarM96903c.m94607a();
    }

    public sxg0(cbh0 cbh0Var, char c) {
        this.f214888a = 28;
        yt91 yt91VarM96903c = cbh0Var.f36128b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("address_row", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        this.f214889b = yt91VarM96903c.m94607a();
    }

    public sxg0(qih0 qih0Var) {
        this.f214888a = 29;
        yt91 yt91VarM96903c = qih0Var.f189016b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("link", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        this.f214889b = yt91VarM96903c.m94607a();
    }

    public sxg0(ahg0 ahg0Var, int i) {
        this.f214888a = i;
        switch (i) {
            case 3:
                yt91 yt91VarM96903c = ahg0Var.f15692b.m96903c();
                yt91VarM96903c.f276055i.add(new bu91("surveys_section", null, null, null, null));
                yt91VarM96903c.f276056j = false;
                this.f214889b = yt91VarM96903c.m94607a();
                break;
            default:
                yt91 yt91VarM96903c2 = ahg0Var.f15692b.m96903c();
                yt91VarM96903c2.f276055i.add(new bu91("spotify_offers_and_bundles_section", null, null, null, null));
                yt91VarM96903c2.f276056j = false;
                this.f214889b = yt91VarM96903c2.m94607a();
                break;
        }
    }

    public sxg0(pbh0 pbh0Var) {
        this.f214888a = 18;
        yt91 yt91VarM96903c = pbh0Var.f175845a.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("add_button", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        this.f214889b = yt91VarM96903c.m94607a();
    }

    public sxg0(cch0 cch0Var) {
        this.f214888a = 19;
        yt91 yt91VarM96903c = cch0Var.f36407a.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("add_button", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        this.f214889b = yt91VarM96903c.m94607a();
    }

    public sxg0(sxg0 sxg0Var, int i) {
        this.f214888a = i;
        switch (i) {
            case 2:
                yt91 yt91VarM96903c = sxg0Var.f214889b.m96903c();
                yt91VarM96903c.f276055i.add(new bu91("push_notification", null, null, null, null));
                yt91VarM96903c.f276056j = false;
                this.f214889b = yt91VarM96903c.m94607a();
                break;
            default:
                yt91 yt91VarM96903c2 = sxg0Var.f214889b.m96903c();
                yt91VarM96903c2.f276055i.add(new bu91("email_notification", null, null, null, null));
                yt91VarM96903c2.f276056j = false;
                this.f214889b = yt91VarM96903c2.m94607a();
                break;
        }
    }

    public sxg0(hch0 hch0Var) {
        this.f214888a = 20;
        yt91 yt91VarM96903c = hch0Var.f89791a.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("add_button", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        this.f214889b = yt91VarM96903c.m94607a();
    }

    public sxg0(ebg0 ebg0Var, String str) {
        this.f214888a = 17;
        yt91 yt91VarM96903c = ebg0Var.f57926b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("instant_mix_loading_page", null, null, str, null));
        yt91VarM96903c.f276056j = false;
        this.f214889b = yt91VarM96903c.m94607a();
    }
}
