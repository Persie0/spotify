package p204p;

import io.reactivex.rxjava3.functions.Action;
import java.util.Collections;

/* JADX INFO: loaded from: classes8.dex */
public final class lbj0 implements Action {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f131676a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ nbj0 f131677b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Integer f131678c;

    public /* synthetic */ lbj0(nbj0 nbj0Var, Integer num, int i) {
        this.f131676a = i;
        this.f131677b = nbj0Var;
        this.f131678c = num;
    }

    @Override // io.reactivex.rxjava3.functions.Action
    public final void run() {
        switch (this.f131676a) {
            case 0:
                nbj0 nbj0Var = this.f131677b;
                yt91 yt91VarM96903c = nbj0Var.f152280b.f99785b.m96903c();
                yt91VarM96903c.f276055i.add(new bu91("dialog", null, this.f131678c, null, null));
                yt91VarM96903c.f276056j = true;
                yt91 yt91VarM96903c2 = yt91VarM96903c.m94607a().m96903c();
                yt91VarM96903c2.f276055i.add(new bu91("allow_button", null, null, null, null));
                yt91VarM96903c2.f276056j = false;
                nbj0Var.f152279a.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("permission_allow", 1, Collections.singletonMap("permission_id", "android.permission-group.NEARBY_DEVICES")), yt91VarM96903c2.m94607a(), st91.f213865b, System.currentTimeMillis()), null);
                break;
            default:
                nbj0 nbj0Var2 = this.f131677b;
                yt91 yt91VarM96903c3 = nbj0Var2.f152280b.f99785b.m96903c();
                yt91VarM96903c3.f276055i.add(new bu91("dialog", null, this.f131678c, null, null));
                yt91VarM96903c3.f276056j = true;
                yt91 yt91VarM96903c4 = yt91VarM96903c3.m94607a().m96903c();
                yt91VarM96903c4.f276055i.add(new bu91("deny_button", null, null, null, null));
                yt91VarM96903c4.f276056j = false;
                nbj0Var2.f152279a.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("permission_deny", 1, Collections.singletonMap("permission_id", "android.permission-group.NEARBY_DEVICES")), yt91VarM96903c4.m94607a(), st91.f213865b, System.currentTimeMillis()), null);
                break;
        }
    }
}
