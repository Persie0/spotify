package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class p201 implements zn90 {

    /* JADX INFO: renamed from: a */
    public final zo90 f173205a;

    public p201(zo90 zo90Var) {
        this.f173205a = zo90Var;
    }

    @Override // p204p.zn90
    /* JADX INFO: renamed from: a */
    public final void mo68864a() {
        zo90 zo90Var = this.f173205a;
        kv91 kv91Var = zo90Var.f284728a;
        zm8 zm8Var = zo90Var.f284729b;
        yt91 yt91VarM96903c = zm8Var.f284180c.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("session_recorded_dialog", null, null, null, null));
        yt91VarM96903c.f276056j = true;
        yt91 yt91VarM96903c2 = yt91VarM96903c.m94607a().m96903c();
        yt91VarM96903c2.f276055i.add(new bu91("close_dialog_button", null, null, null, null));
        yt91VarM96903c2.f276056j = false;
        kv91Var.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("ui_hide", 1, nau.f152117a), yt91VarM96903c2.m94607a(), zm8Var.f284179b, System.currentTimeMillis()), null);
    }

    @Override // p204p.zn90
    /* JADX INFO: renamed from: c */
    public final void mo68865c() {
        zo90 zo90Var = this.f173205a;
        kv91 kv91Var = zo90Var.f284728a;
        zm8 zm8Var = zo90Var.f284729b;
        yt91 yt91VarM96903c = zm8Var.f284180c.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("session_recorded_dialog", null, null, null, null));
        yt91VarM96903c.f276056j = true;
        zt91 zt91VarM94607a = yt91VarM96903c.m94607a();
        nu91 nu91Var = new nu91();
        nu91Var.f248107a = zt91VarM94607a;
        nu91Var.f248108b = zm8Var.f284179b;
        nu91Var.f248109c = Long.valueOf(System.currentTimeMillis());
        kv91Var.mo57449i((ou91) nu91Var.m87248a(), null);
    }
}
