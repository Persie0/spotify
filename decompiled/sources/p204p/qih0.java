package p204p;

import com.spotify.player.model.ContextTrack;
import java.util.Collections;

/* JADX INFO: loaded from: classes10.dex */
public final class qih0 implements pv91 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f189015a;

    /* JADX INFO: renamed from: b */
    public final zt91 f189016b;

    public qih0(cbh0 cbh0Var) {
        this.f189015a = 5;
        yt91 yt91VarM96903c = cbh0Var.f36128b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("header", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        this.f189016b = yt91VarM96903c.m94607a();
    }

    /* JADX INFO: renamed from: a */
    public av91 m72857a(String str) {
        switch (this.f189015a) {
            case 3:
                dv91 dv91Var = new dv91("hit", 1);
                String string = str != null ? str.toString() : null;
                if (string == null) {
                    string = "";
                }
                return new av91("", "", dv91Var, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string)), this.f189016b, st91.f213865b, System.currentTimeMillis());
            default:
                dv91 dv91Var2 = new dv91("hit", 1);
                String string2 = str != null ? str.toString() : null;
                if (string2 == null) {
                    string2 = "";
                }
                return new av91("", "", dv91Var2, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string2)), this.f189016b, st91.f213865b, System.currentTimeMillis());
        }
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        int i = this.f189015a;
        zt91 zt91Var = this.f189016b;
        switch (i) {
            case 0:
                st91 st91Var = st91.f213865b;
                break;
            case 1:
                st91 st91Var2 = st91.f213865b;
                break;
            case 2:
                st91 st91Var3 = st91.f213865b;
                break;
            case 3:
                st91 st91Var4 = st91.f213865b;
                break;
            case 4:
                st91 st91Var5 = st91.f213865b;
                break;
            case 5:
                st91 st91Var6 = st91.f213865b;
                break;
            case 6:
                st91 st91Var7 = st91.f213865b;
                break;
            case 7:
                st91 st91Var8 = st91.f213865b;
                break;
            case 8:
                st91 st91Var9 = st91.f213865b;
                break;
            case 9:
                st91 st91Var10 = st91.f213865b;
                break;
            case 10:
                st91 st91Var11 = st91.f213865b;
                break;
            case 11:
                st91 st91Var12 = st91.f213865b;
                break;
            case 12:
                st91 st91Var13 = st91.f213865b;
                break;
            case 13:
                st91 st91Var14 = st91.f213865b;
                break;
            case 14:
                st91 st91Var15 = st91.f213865b;
                break;
            default:
                st91 st91Var16 = st91.f213865b;
                break;
        }
        return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
    }

    /* JADX INFO: renamed from: e */
    public qih0 m72858e() {
        return new qih0(this);
    }

    /* JADX INFO: renamed from: h */
    public qih0 m72859h(String str) {
        return new qih0(this, str, 2);
    }

    /* JADX INFO: renamed from: i */
    public qih0 m72860i(Integer num, String str) {
        return new qih0(this, num, str);
    }

    /* JADX INFO: renamed from: j */
    public av91 m72861j(String str) {
        dv91 dv91Var = new dv91("hit", 1);
        String string = str != null ? str.toString() : null;
        if (string == null) {
            string = "";
        }
        return new av91("", "", dv91Var, new bv91(ContextTrack.TrackAction.PAUSE, 1, Collections.singletonMap("item_to_be_paused", string)), this.f189016b, st91.f213865b, System.currentTimeMillis());
    }

    /* JADX INFO: renamed from: k */
    public av91 m72862k(String str) {
        dv91 dv91Var = new dv91("hit", 1);
        String string = str != null ? str.toString() : null;
        if (string == null) {
            string = "";
        }
        return new av91("", "", dv91Var, new bv91("play", 1, Collections.singletonMap("item_to_be_played", string)), this.f189016b, st91.f213865b, System.currentTimeMillis());
    }

    /* JADX INFO: renamed from: l */
    public av91 m72863l() {
        return new av91("", "", new dv91("hit", 1), new bv91("quick_scroll", 1, nau.f152117a), this.f189016b, st91.f213865b, System.currentTimeMillis());
    }

    /* JADX INFO: renamed from: m */
    public av91 m72864m(String str) {
        dv91 dv91Var = new dv91("hit", 1);
        String string = str != null ? str.toString() : null;
        if (string == null) {
            string = "";
        }
        return new av91("", "", dv91Var, new bv91("share", 2, kkc0.m56695h0(new pqm0("entity_to_be_shared", string), new pqm0("share_id", "venue-entity-share-id"))), this.f189016b, st91.f213865b, System.currentTimeMillis());
    }

    /* JADX INFO: renamed from: n */
    public av91 m72865n(String str, Integer num, Integer num2) {
        dv91 dv91Var = new dv91("hit", 1);
        String string = str != null ? str.toString() : null;
        if (string == null) {
            string = "";
        }
        return new av91("", "", dv91Var, new bv91("skip_to_next", 2, kkc0.m56695h0(new pqm0("item_to_be_skipped", string), new pqm0("position_ms", ""), new pqm0("total_content_ms", ""))), this.f189016b, st91.f213865b, System.currentTimeMillis());
    }

    /* JADX INFO: renamed from: o */
    public av91 m72866o(String str, Integer num, Integer num2) {
        dv91 dv91Var = new dv91("hit", 1);
        String string = str != null ? str.toString() : null;
        if (string == null) {
            string = "";
        }
        return new av91("", "", dv91Var, new bv91("skip_to_previous", 2, kkc0.m56695h0(new pqm0("item_to_be_skipped", string), new pqm0("position_ms", ""), new pqm0("total_content_ms", ""))), this.f189016b, st91.f213865b, System.currentTimeMillis());
    }

    /* JADX INFO: renamed from: p */
    public av91 m72867p() {
        return new av91("", "", new dv91("hit", 1), new bv91("ui_navigate_back", 1, nau.f152117a), this.f189016b, st91.f213865b, System.currentTimeMillis());
    }

    /* JADX INFO: renamed from: q */
    public av91 m72868q() {
        return new av91("", "", new dv91("hit", 1), new bv91("ui_reveal", 1, nau.f152117a), this.f189016b, st91.f213865b, System.currentTimeMillis());
    }

    /* JADX INFO: renamed from: r */
    public sxg0 m72869r() {
        return new sxg0(this);
    }

    /* JADX INFO: renamed from: s */
    public qih0 m72870s(String str) {
        return new qih0(this, str, 4);
    }

    public qih0(pkh0 pkh0Var, char c) {
        this.f189015a = 14;
        yt91 yt91VarM96903c = pkh0Var.f178463b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("error_dialog", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        this.f189016b = yt91VarM96903c.m94607a();
    }

    public qih0(cbh0 cbh0Var, byte b) {
        this.f189015a = 6;
        yt91 yt91VarM96903c = cbh0Var.f36128b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("confirm_vote_button", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        this.f189016b = yt91VarM96903c.m94607a();
    }

    public qih0(qih0 qih0Var) {
        this.f189015a = 1;
        yt91 yt91VarM96903c = qih0Var.f189016b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("back_button", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        this.f189016b = yt91VarM96903c.m94607a();
    }

    public qih0(ujh0 ujh0Var, int i) {
        this.f189015a = i;
        switch (i) {
            case 9:
                yt91 yt91VarM96903c = ujh0Var.f231034a.m96903c();
                yt91VarM96903c.f276055i.add(new bu91("skip_previous_button", null, null, null, null));
                yt91VarM96903c.f276056j = false;
                this.f189016b = yt91VarM96903c.m94607a();
                break;
            default:
                yt91 yt91VarM96903c2 = ujh0Var.f231034a.m96903c();
                yt91VarM96903c2.f276055i.add(new bu91("skip_next_button", null, null, null, null));
                yt91VarM96903c2.f276056j = false;
                this.f189016b = yt91VarM96903c2.m94607a();
                break;
        }
    }

    public qih0(pkh0 pkh0Var) {
        this.f189015a = 11;
        yt91 yt91VarM96903c = pkh0Var.f178463b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("header_deprecated", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        this.f189016b = yt91VarM96903c.m94607a();
    }

    public qih0(f9k0 f9k0Var) {
        this.f189015a = 15;
        yt91 yt91VarM96903c = f9k0Var.f67285a.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("hat_container", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        this.f189016b = yt91VarM96903c.m94607a();
    }

    public qih0(qih0 qih0Var, Integer num, String str) {
        this.f189015a = 3;
        yt91 yt91VarM96903c = qih0Var.f189016b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("concept_chip", null, num, str, null));
        yt91VarM96903c.f276056j = false;
        this.f189016b = yt91VarM96903c.m94607a();
    }

    public qih0(qih0 qih0Var, byte b) {
        this.f189015a = 10;
        yt91 yt91VarM96903c = qih0Var.f189016b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("play_button", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        this.f189016b = yt91VarM96903c.m94607a();
    }

    public qih0(qih0 qih0Var, String str, int i) {
        this.f189015a = i;
        switch (i) {
            case 4:
                yt91 yt91VarM96903c = qih0Var.f189016b.m96903c();
                yt91VarM96903c.f276055i.add(new bu91("share_button", "venue-entity-share-id", null, str, null));
                yt91VarM96903c.f276056j = false;
                this.f189016b = yt91VarM96903c.m94607a();
                break;
            default:
                yt91 yt91VarM96903c2 = qih0Var.f189016b.m96903c();
                yt91VarM96903c2.f276055i.add(new bu91("badge", str, null, null, null));
                yt91VarM96903c2.f276056j = false;
                this.f189016b = yt91VarM96903c2.m94607a();
                break;
        }
    }

    public qih0(pkh0 pkh0Var, int i) {
        this.f189015a = i;
        switch (i) {
            case 13:
                yt91 yt91VarM96903c = pkh0Var.f178463b.m96903c();
                yt91VarM96903c.f276055i.add(new bu91("error_dialog", null, null, null, null));
                yt91VarM96903c.f276056j = false;
                this.f189016b = yt91VarM96903c.m94607a();
                break;
            default:
                yt91 yt91VarM96903c2 = pkh0Var.f178463b.m96903c();
                yt91VarM96903c2.f276055i.add(new bu91("content_deprecated", null, null, null, null));
                yt91VarM96903c2.f276056j = false;
                this.f189016b = yt91VarM96903c2.m94607a();
                break;
        }
    }

    public qih0(cbh0 cbh0Var, String str) {
        this.f189015a = 0;
        yt91 yt91VarM96903c = cbh0Var.f36128b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("badge_bottom_sheet", str, null, null, null));
        yt91VarM96903c.f276056j = false;
        this.f189016b = yt91VarM96903c.m94607a();
    }

    public qih0(ndh0 ndh0Var) {
        this.f189015a = 7;
        yt91 yt91VarM96903c = ndh0Var.f152779b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("recommendations_section", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        this.f189016b = yt91VarM96903c.m94607a();
    }
}
