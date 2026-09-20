package p204p;

import java.util.Collections;

/* JADX INFO: loaded from: classes8.dex */
public final class y1v implements zn90 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f268409a;

    /* JADX INFO: renamed from: b */
    public final zo90 f268410b;

    public /* synthetic */ y1v(zo90 zo90Var, int i) {
        this.f268409a = i;
        this.f268410b = zo90Var;
    }

    @Override // p204p.zn90
    /* JADX INFO: renamed from: a */
    public final void mo68864a() {
        switch (this.f268409a) {
            case 0:
                zo90 zo90Var = this.f268410b;
                kv91 kv91Var = zo90Var.f284728a;
                zm8 zm8Var = zo90Var.f284729b;
                yt91 yt91VarM96903c = zm8Var.f284180c.m96903c();
                yt91VarM96903c.f276055i.add(new bu91("end_session_dialog", null, null, null, null));
                yt91VarM96903c.f276056j = true;
                yt91 yt91VarM96903c2 = yt91VarM96903c.m94607a().m96903c();
                yt91VarM96903c2.f276055i.add(new bu91("end_session_link", null, null, null, null));
                yt91VarM96903c2.f276056j = false;
                zt91 zt91VarM94607a = yt91VarM96903c2.m94607a();
                String str = xoc1.f263839A0.f243453a;
                dv91 dv91Var = new dv91("hit", 1);
                String string = str != null ? str.toString() : null;
                if (string == null) {
                    string = "";
                }
                kv91Var.mo57453r(new av91("", "", dv91Var, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string)), zt91VarM94607a, zm8Var.f284179b, System.currentTimeMillis()), null);
                break;
            case 1:
                zo90 zo90Var2 = this.f268410b;
                kv91 kv91Var2 = zo90Var2.f284728a;
                zm8 zm8Var2 = zo90Var2.f284729b;
                yt91 yt91VarM96903c3 = zm8Var2.f284180c.m96903c();
                yt91VarM96903c3.f276055i.add(new bu91("join_session_dialog", null, null, null, null));
                yt91VarM96903c3.f276056j = true;
                yt91 yt91VarM96903c4 = yt91VarM96903c3.m94607a().m96903c();
                yt91VarM96903c4.f276055i.add(new bu91("join_session_button", null, null, null, null));
                yt91VarM96903c4.f276056j = false;
                zt91 zt91VarM94607a2 = yt91VarM96903c4.m94607a();
                String str2 = xoc1.f263839A0.f243453a;
                dv91 dv91Var2 = new dv91("hit", 1);
                String string2 = str2 != null ? str2.toString() : null;
                if (string2 == null) {
                    string2 = "";
                }
                kv91Var2.mo57453r(new av91("", "", dv91Var2, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string2)), zt91VarM94607a2, zm8Var2.f284179b, System.currentTimeMillis()), null);
                break;
            case 2:
                zo90 zo90Var3 = this.f268410b;
                kv91 kv91Var3 = zo90Var3.f284728a;
                zm8 zm8Var3 = zo90Var3.f284729b;
                yt91 yt91VarM96903c5 = zm8Var3.f284180c.m96903c();
                yt91VarM96903c5.f276055i.add(new bu91("start_new_session_dialog", null, null, null, null));
                yt91VarM96903c5.f276056j = true;
                yt91 yt91VarM96903c6 = yt91VarM96903c5.m94607a().m96903c();
                yt91VarM96903c6.f276055i.add(new bu91("start_new_session_button", null, null, null, null));
                yt91VarM96903c6.f276056j = false;
                zt91 zt91VarM94607a3 = yt91VarM96903c6.m94607a();
                String str3 = xoc1.f263839A0.f243453a;
                dv91 dv91Var3 = new dv91("hit", 1);
                String string3 = str3 != null ? str3.toString() : null;
                if (string3 == null) {
                    string3 = "";
                }
                kv91Var3.mo57453r(new av91("", "", dv91Var3, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string3)), zt91VarM94607a3, zm8Var3.f284179b, System.currentTimeMillis()), null);
                break;
            default:
                zo90 zo90Var4 = this.f268410b;
                kv91 kv91Var4 = zo90Var4.f284728a;
                zm8 zm8Var4 = zo90Var4.f284729b;
                yt91 yt91VarM96903c7 = zm8Var4.f284180c.m96903c();
                yt91VarM96903c7.f276055i.add(new bu91("upsell_dialog", null, null, null, null));
                yt91VarM96903c7.f276056j = true;
                yt91 yt91VarM96903c8 = yt91VarM96903c7.m94607a().m96903c();
                yt91VarM96903c8.f276055i.add(new bu91("upgrade_to_premium_button", null, null, null, null));
                yt91VarM96903c8.f276056j = false;
                zt91 zt91VarM94607a4 = yt91VarM96903c8.m94607a();
                String str4 = xoc1.f264033Z1.f243453a;
                dv91 dv91Var4 = new dv91("hit", 1);
                String string4 = str4 != null ? str4.toString() : null;
                if (string4 == null) {
                    string4 = "";
                }
                kv91Var4.mo57453r(new av91("", "", dv91Var4, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string4)), zt91VarM94607a4, zm8Var4.f284179b, System.currentTimeMillis()), null);
                break;
        }
    }

    @Override // p204p.zn90
    /* JADX INFO: renamed from: b */
    public final void mo92671b() {
        switch (this.f268409a) {
            case 0:
                zo90 zo90Var = this.f268410b;
                kv91 kv91Var = zo90Var.f284728a;
                zm8 zm8Var = zo90Var.f284729b;
                yt91 yt91VarM96903c = zm8Var.f284180c.m96903c();
                yt91VarM96903c.f276055i.add(new bu91("end_session_dialog", null, null, null, null));
                yt91VarM96903c.f276056j = true;
                yt91 yt91VarM96903c2 = yt91VarM96903c.m94607a().m96903c();
                yt91VarM96903c2.f276055i.add(new bu91("close_dialog_button", null, null, null, null));
                yt91VarM96903c2.f276056j = false;
                zt91 zt91VarM94607a = yt91VarM96903c2.m94607a();
                String str = xoc1.f263839A0.f243453a;
                dv91 dv91Var = new dv91("hit", 1);
                String string = str != null ? str.toString() : null;
                if (string == null) {
                    string = "";
                }
                kv91Var.mo57453r(new av91("", "", dv91Var, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string)), zt91VarM94607a, zm8Var.f284179b, System.currentTimeMillis()), null);
                break;
            case 1:
                zo90 zo90Var2 = this.f268410b;
                kv91 kv91Var2 = zo90Var2.f284728a;
                zm8 zm8Var2 = zo90Var2.f284729b;
                yt91 yt91VarM96903c3 = zm8Var2.f284180c.m96903c();
                yt91VarM96903c3.f276055i.add(new bu91("join_session_dialog", null, null, null, null));
                yt91VarM96903c3.f276056j = true;
                yt91 yt91VarM96903c4 = yt91VarM96903c3.m94607a().m96903c();
                yt91VarM96903c4.f276055i.add(new bu91("close_dialog_button", null, null, null, null));
                yt91VarM96903c4.f276056j = false;
                zt91 zt91VarM94607a2 = yt91VarM96903c4.m94607a();
                String str2 = xoc1.f263839A0.f243453a;
                dv91 dv91Var2 = new dv91("hit", 1);
                String string2 = str2 != null ? str2.toString() : null;
                if (string2 == null) {
                    string2 = "";
                }
                kv91Var2.mo57453r(new av91("", "", dv91Var2, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string2)), zt91VarM94607a2, zm8Var2.f284179b, System.currentTimeMillis()), null);
                break;
            case 2:
                zo90 zo90Var3 = this.f268410b;
                kv91 kv91Var3 = zo90Var3.f284728a;
                zm8 zm8Var3 = zo90Var3.f284729b;
                yt91 yt91VarM96903c5 = zm8Var3.f284180c.m96903c();
                yt91VarM96903c5.f276055i.add(new bu91("start_new_session_dialog", null, null, null, null));
                yt91VarM96903c5.f276056j = true;
                yt91 yt91VarM96903c6 = yt91VarM96903c5.m94607a().m96903c();
                yt91VarM96903c6.f276055i.add(new bu91("close_dialog_button", null, null, null, null));
                yt91VarM96903c6.f276056j = false;
                zt91 zt91VarM94607a3 = yt91VarM96903c6.m94607a();
                String str3 = xoc1.f263839A0.f243453a;
                dv91 dv91Var3 = new dv91("hit", 1);
                String string3 = str3 != null ? str3.toString() : null;
                if (string3 == null) {
                    string3 = "";
                }
                kv91Var3.mo57453r(new av91("", "", dv91Var3, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string3)), zt91VarM94607a3, zm8Var3.f284179b, System.currentTimeMillis()), null);
                break;
            default:
                zo90 zo90Var4 = this.f268410b;
                kv91 kv91Var4 = zo90Var4.f284728a;
                zm8 zm8Var4 = zo90Var4.f284729b;
                yt91 yt91VarM96903c7 = zm8Var4.f284180c.m96903c();
                yt91VarM96903c7.f276055i.add(new bu91("upsell_dialog", null, null, null, null));
                yt91VarM96903c7.f276056j = true;
                yt91 yt91VarM96903c8 = yt91VarM96903c7.m94607a().m96903c();
                yt91VarM96903c8.f276055i.add(new bu91("close_dialog_button", null, null, null, null));
                yt91VarM96903c8.f276056j = false;
                zt91 zt91VarM94607a4 = yt91VarM96903c8.m94607a();
                String str4 = xoc1.f263839A0.f243453a;
                dv91 dv91Var4 = new dv91("hit", 1);
                String string4 = str4 != null ? str4.toString() : null;
                if (string4 == null) {
                    string4 = "";
                }
                kv91Var4.mo57453r(new av91("", "", dv91Var4, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string4)), zt91VarM94607a4, zm8Var4.f284179b, System.currentTimeMillis()), null);
                break;
        }
    }

    @Override // p204p.zn90
    /* JADX INFO: renamed from: c */
    public final void mo68865c() {
        switch (this.f268409a) {
            case 0:
                zo90 zo90Var = this.f268410b;
                kv91 kv91Var = zo90Var.f284728a;
                zm8 zm8Var = zo90Var.f284729b;
                yt91 yt91VarM96903c = zm8Var.f284180c.m96903c();
                yt91VarM96903c.f276055i.add(new bu91("end_session_dialog", null, null, null, null));
                yt91VarM96903c.f276056j = true;
                zt91 zt91VarM94607a = yt91VarM96903c.m94607a();
                nu91 nu91Var = new nu91();
                nu91Var.f248107a = zt91VarM94607a;
                nu91Var.f248108b = zm8Var.f284179b;
                nu91Var.f248109c = Long.valueOf(System.currentTimeMillis());
                kv91Var.mo57449i((ou91) nu91Var.m87248a(), null);
                break;
            case 1:
                zo90 zo90Var2 = this.f268410b;
                kv91 kv91Var2 = zo90Var2.f284728a;
                zm8 zm8Var2 = zo90Var2.f284729b;
                yt91 yt91VarM96903c2 = zm8Var2.f284180c.m96903c();
                yt91VarM96903c2.f276055i.add(new bu91("join_session_dialog", null, null, null, null));
                yt91VarM96903c2.f276056j = true;
                zt91 zt91VarM94607a2 = yt91VarM96903c2.m94607a();
                nu91 nu91Var2 = new nu91();
                nu91Var2.f248107a = zt91VarM94607a2;
                nu91Var2.f248108b = zm8Var2.f284179b;
                nu91Var2.f248109c = Long.valueOf(System.currentTimeMillis());
                kv91Var2.mo57449i((ou91) nu91Var2.m87248a(), null);
                break;
            case 2:
                zo90 zo90Var3 = this.f268410b;
                kv91 kv91Var3 = zo90Var3.f284728a;
                zm8 zm8Var3 = zo90Var3.f284729b;
                yt91 yt91VarM96903c3 = zm8Var3.f284180c.m96903c();
                yt91VarM96903c3.f276055i.add(new bu91("start_new_session_dialog", null, null, null, null));
                yt91VarM96903c3.f276056j = true;
                zt91 zt91VarM94607a3 = yt91VarM96903c3.m94607a();
                nu91 nu91Var3 = new nu91();
                nu91Var3.f248107a = zt91VarM94607a3;
                nu91Var3.f248108b = zm8Var3.f284179b;
                nu91Var3.f248109c = Long.valueOf(System.currentTimeMillis());
                kv91Var3.mo57449i((ou91) nu91Var3.m87248a(), null);
                break;
            default:
                zo90 zo90Var4 = this.f268410b;
                kv91 kv91Var4 = zo90Var4.f284728a;
                zm8 zm8Var4 = zo90Var4.f284729b;
                yt91 yt91VarM96903c4 = zm8Var4.f284180c.m96903c();
                yt91VarM96903c4.f276055i.add(new bu91("upsell_dialog", null, null, null, null));
                yt91VarM96903c4.f276056j = true;
                zt91 zt91VarM94607a4 = yt91VarM96903c4.m94607a();
                nu91 nu91Var4 = new nu91();
                nu91Var4.f248107a = zt91VarM94607a4;
                nu91Var4.f248108b = zm8Var4.f284179b;
                nu91Var4.f248109c = Long.valueOf(System.currentTimeMillis());
                kv91Var4.mo57449i((ou91) nu91Var4.m87248a(), null);
                break;
        }
    }
}
