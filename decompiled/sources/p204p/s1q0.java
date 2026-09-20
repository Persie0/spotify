package p204p;

import java.util.Collections;

/* JADX INFO: loaded from: classes8.dex */
public final class s1q0 implements ic81, cg81 {

    /* JADX INFO: renamed from: a */
    public final kv91 f204779a;

    /* JADX INFO: renamed from: b */
    public final xxg0 f204780b;

    public s1q0(kv91 kv91Var, xxg0 xxg0Var) {
        this.f204779a = kv91Var;
        this.f204780b = xxg0Var;
    }

    @Override // p204p.ic81
    /* JADX INFO: renamed from: a */
    public final av91 mo42676a(fc81 fc81Var, String str, am81 am81Var) {
        zt91 zt91Var = this.f204780b.f267003b;
        long j = am81Var.f17061b;
        long j2 = am81Var.f17060a;
        if (fc81Var == fc81.f68028a) {
            yt91 yt91VarM96903c = zt91Var.m96903c();
            yt91VarM96903c.f276055i.add(new bu91("cover_art", null, null, null, null));
            yt91VarM96903c.f276056j = false;
            zt91 zt91VarM94607a = yt91VarM96903c.m94607a();
            int i = (int) j2;
            int i2 = (int) j;
            dv91 dv91Var = new dv91("swipe", 1);
            String string = str.toString();
            if (string == null) {
                string = "";
            }
            pqm0 pqm0Var = new pqm0("item_to_be_skipped", string);
            String strValueOf = String.valueOf(i);
            if (strValueOf == null) {
                strValueOf = "";
            }
            pqm0 pqm0Var2 = new pqm0("position_ms", strValueOf);
            String strValueOf2 = String.valueOf(i2);
            return new av91("", "", dv91Var, new bv91("skip_to_next", 2, kkc0.m56695h0(pqm0Var, pqm0Var2, new pqm0("total_content_ms", strValueOf2 != null ? strValueOf2 : ""))), zt91VarM94607a, st91.f213865b, System.currentTimeMillis());
        }
        yt91 yt91VarM96903c2 = zt91Var.m96903c();
        yt91VarM96903c2.f276055i.add(new bu91("cover_art", null, null, null, null));
        yt91VarM96903c2.f276056j = false;
        zt91 zt91VarM94607a2 = yt91VarM96903c2.m94607a();
        int i3 = (int) j2;
        int i4 = (int) j;
        dv91 dv91Var2 = new dv91("swipe", 1);
        String string2 = str.toString();
        if (string2 == null) {
            string2 = "";
        }
        pqm0 pqm0Var3 = new pqm0("item_to_be_skipped", string2);
        String strValueOf3 = String.valueOf(i3);
        if (strValueOf3 == null) {
            strValueOf3 = "";
        }
        pqm0 pqm0Var4 = new pqm0("position_ms", strValueOf3);
        String strValueOf4 = String.valueOf(i4);
        return new av91("", "", dv91Var2, new bv91("skip_to_previous", 2, kkc0.m56695h0(pqm0Var3, pqm0Var4, new pqm0("total_content_ms", strValueOf4 != null ? strValueOf4 : ""))), zt91VarM94607a2, st91.f213865b, System.currentTimeMillis());
    }

    @Override // p204p.cg81
    /* JADX INFO: renamed from: b */
    public final d850 mo32684b(yf81 yf81Var, String str) {
        av91 av91Var;
        zt91 zt91Var = this.f204780b.f267003b;
        if (yf81Var == yf81.f272179a) {
            yt91 yt91VarM96903c = zt91Var.m96903c();
            yt91VarM96903c.f276055i.add(new bu91("podcast_information", null, null, null, null));
            yt91VarM96903c.f276056j = false;
            yt91 yt91VarM96903c2 = yt91VarM96903c.m94607a().m96903c();
            yt91VarM96903c2.f276055i.add(new bu91("labels", null, null, null, null));
            yt91VarM96903c2.f276056j = false;
            yt91 yt91VarM96903c3 = yt91VarM96903c2.m94607a().m96903c();
            yt91VarM96903c3.f276055i.add(new bu91("title_label", null, null, null, null));
            yt91VarM96903c3.f276056j = false;
            zt91 zt91VarM94607a = yt91VarM96903c3.m94607a();
            dv91 dv91Var = new dv91("hit", 1);
            String string = str.toString();
            av91Var = new av91("", "", dv91Var, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string != null ? string : "")), zt91VarM94607a, st91.f213865b, System.currentTimeMillis());
        } else {
            yt91 yt91VarM96903c4 = zt91Var.m96903c();
            yt91VarM96903c4.f276055i.add(new bu91("podcast_information", null, null, null, null));
            yt91VarM96903c4.f276056j = false;
            yt91 yt91VarM96903c5 = yt91VarM96903c4.m94607a().m96903c();
            yt91VarM96903c5.f276055i.add(new bu91("labels", null, null, null, null));
            yt91VarM96903c5.f276056j = false;
            yt91 yt91VarM96903c6 = yt91VarM96903c5.m94607a().m96903c();
            yt91VarM96903c6.f276055i.add(new bu91("artist_label", null, null, null, null));
            yt91VarM96903c6.f276056j = false;
            zt91 zt91VarM94607a2 = yt91VarM96903c6.m94607a();
            dv91 dv91Var2 = new dv91("hit", 1);
            String string2 = str.toString();
            av91Var = new av91("", "", dv91Var2, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string2 != null ? string2 : "")), zt91VarM94607a2, st91.f213865b, System.currentTimeMillis());
        }
        return this.f204779a.mo57453r(av91Var, null);
    }
}
