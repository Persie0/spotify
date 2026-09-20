package p204p;

import io.reactivex.rxjava3.functions.Action;

/* JADX INFO: loaded from: classes5.dex */
public final class yk9 implements Action {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f273645a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ kv91 f273646b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ icg0 f273647c;

    public /* synthetic */ yk9(kv91 kv91Var, icg0 icg0Var, int i) {
        this.f273645a = i;
        this.f273646b = kv91Var;
        this.f273647c = icg0Var;
    }

    @Override // io.reactivex.rxjava3.functions.Action
    public final void run() {
        switch (this.f273645a) {
            case 0:
                icg0 icg0Var = this.f273647c;
                icg0Var.getClass();
                yt91 yt91VarM96903c = icg0Var.f100814a.m96903c();
                yt91VarM96903c.f276055i.add(new bu91("invite_button", null, null, null, null));
                yt91VarM96903c.f276056j = true;
                this.f273646b.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("ui_reveal", 1, nau.f152117a), yt91VarM96903c.m94607a(), st91.f213865b, System.currentTimeMillis()), null);
                break;
            case 1:
                icg0 icg0Var2 = this.f273647c;
                icg0Var2.getClass();
                yt91 yt91VarM96903c2 = icg0Var2.f100814a.m96903c();
                yt91VarM96903c2.f276055i.add(new bu91("face_pile_image", null, null, null, null));
                yt91VarM96903c2.f276056j = false;
                this.f273646b.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("ui_reveal", 1, nau.f152117a), yt91VarM96903c2.m94607a(), st91.f213865b, System.currentTimeMillis()), null);
                break;
            case 2:
                yt91 yt91VarM96903c3 = this.f273647c.f100814a.m96903c();
                yt91VarM96903c3.f276055i.add(new bu91("join_button", null, null, null, null));
                yt91VarM96903c3.f276056j = true;
                zt91 zt91VarM94607a = yt91VarM96903c3.m94607a();
                nu91 nu91Var = new nu91();
                nu91Var.f248107a = zt91VarM94607a;
                nu91Var.f248109c = Long.valueOf(System.currentTimeMillis());
                this.f273646b.mo57449i((ou91) nu91Var.m87248a(), null);
                break;
            case 3:
                yt91 yt91VarM96903c4 = this.f273647c.f100814a.m96903c();
                yt91VarM96903c4.f276055i.add(new bu91("join_button", null, null, null, null));
                yt91VarM96903c4.f276056j = true;
                this.f273646b.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("create_playlist", 1, nau.f152117a), yt91VarM96903c4.m94607a(), st91.f213865b, System.currentTimeMillis()), null);
                break;
            case 4:
                yt91 yt91VarM96903c5 = this.f273647c.f100814a.m96903c();
                yt91VarM96903c5.f276055i.add(new bu91("join_button", null, null, null, null));
                yt91VarM96903c5.f276056j = true;
                zt91 zt91VarM94607a2 = yt91VarM96903c5.m94607a();
                nu91 nu91Var2 = new nu91();
                nu91Var2.f248107a = zt91VarM94607a2;
                nu91Var2.f248109c = Long.valueOf(System.currentTimeMillis());
                this.f273646b.mo57449i((ou91) nu91Var2.m87248a(), null);
                break;
            case 5:
                yt91 yt91VarM96903c6 = this.f273647c.f100814a.m96903c();
                yt91VarM96903c6.f276055i.add(new bu91("join_button", null, null, null, null));
                yt91VarM96903c6.f276056j = true;
                this.f273646b.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("create_playlist", 1, nau.f152117a), yt91VarM96903c6.m94607a(), st91.f213865b, System.currentTimeMillis()), null);
                break;
            default:
                yt91 yt91VarM96903c7 = this.f273647c.f100814a.m96903c();
                yt91VarM96903c7.f276055i.add(new bu91("invite_button", null, null, null, null));
                yt91VarM96903c7.f276056j = true;
                this.f273646b.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("ui_reveal", 1, nau.f152117a), yt91VarM96903c7.m94607a(), st91.f213865b, System.currentTimeMillis()), null);
                break;
        }
    }
}
