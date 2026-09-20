package p204p;

import com.spotify.player.model.ContextTrack;

/* JADX INFO: loaded from: classes9.dex */
public final class haq implements gaq {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f89262a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ cdn f89263b;

    public /* synthetic */ haq(cdn cdnVar, int i) {
        this.f89262a = i;
        this.f89263b = cdnVar;
    }

    @Override // p204p.gaq
    /* JADX INFO: renamed from: a */
    public final void mo44180a(ContextTrack contextTrack) {
        switch (this.f89262a) {
            case 0:
                cdn cdnVar = this.f89263b;
                kv91 kv91Var = (kv91) cdnVar.f36916c;
                gag0 gag0Var = (gag0) cdnVar.f36917d;
                yt91 yt91VarM96903c = gag0Var.f78050c.m96903c();
                yt91VarM96903c.f276055i.add(new bu91("dismiss_area", null, null, null, null));
                yt91VarM96903c.f276056j = false;
                kv91Var.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("ui_hide", 1, nau.f152117a), yt91VarM96903c.m94607a(), gag0Var.f78049b, System.currentTimeMillis()), null);
                break;
            default:
                cdn cdnVar2 = this.f89263b;
                ((kv91) cdnVar2.f36916c).mo57449i(((gag0) cdnVar2.f36917d).mo24514e(), null);
                break;
        }
    }
}
