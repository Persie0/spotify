package p204p;

import android.content.DialogInterface;

/* JADX INFO: loaded from: classes3.dex */
public final class xal implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f259714a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ yal f259715b;

    public /* synthetic */ xal(yal yalVar, int i) {
        this.f259714a = i;
        this.f259715b = yalVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f259714a) {
            case 0:
                vhs0 vhs0Var = this.f259715b.f270943Q1;
                kv91 kv91Var = vhs0Var.f241554a;
                xxg0 xxg0Var = vhs0Var.f241555b;
                xxg0Var.getClass();
                yt91 yt91VarM96903c = xxg0Var.f267003b.m96903c();
                yt91VarM96903c.f276055i.add(new bu91("create_playlist_error_dialog", null, null, null, null));
                yt91VarM96903c.f276056j = true;
                yt91 yt91VarM96903c2 = yt91VarM96903c.m94607a().m96903c();
                yt91VarM96903c2.f276055i.add(new bu91("cancel_button", null, null, null, null));
                yt91VarM96903c2.f276056j = false;
                kv91Var.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("ui_hide", 1, nau.f152117a), yt91VarM96903c2.m94607a(), st91.f213865b, System.currentTimeMillis()), null);
                break;
            default:
                yal yalVar = this.f259715b;
                vhs0 vhs0Var2 = yalVar.f270943Q1;
                kv91 kv91Var2 = vhs0Var2.f241554a;
                xxg0 xxg0Var2 = vhs0Var2.f241555b;
                xxg0Var2.getClass();
                yt91 yt91VarM96903c3 = xxg0Var2.f267003b.m96903c();
                yt91VarM96903c3.f276055i.add(new bu91("create_playlist_error_dialog", null, null, null, null));
                yt91VarM96903c3.f276056j = true;
                yt91 yt91VarM96903c4 = yt91VarM96903c3.m94607a().m96903c();
                yt91VarM96903c4.f276055i.add(new bu91("try_again_button", null, null, null, null));
                yt91VarM96903c4.f276056j = false;
                kv91Var2.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("ui_hide", 1, nau.f152117a), yt91VarM96903c4.m94607a(), st91.f213865b, System.currentTimeMillis()), null);
                yalVar.m49699V0().mo15683g0().m31633h0("req_create_playlist_failure_fragment_key", pp91.m70529j(new pqm0("create_playlist_failure_fragment_result_key", wal.f249547a)));
                break;
        }
    }
}
