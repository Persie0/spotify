package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class xih0 implements pv91, rv91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f261878a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ g4h0 f261879b;

    public xih0(g4h0 g4h0Var, int i) {
        String str;
        this.f261879b = g4h0Var;
        yt91 yt91VarM96903c = g4h0Var.f76421b.m96903c();
        switch (i) {
            case 1:
                str = "available";
                break;
            case 2:
                str = "available_votes_used";
                break;
            case 3:
                str = "closed";
                break;
            case 4:
                str = "ineligible";
                break;
            case 5:
                str = "prerelease";
                break;
            case 6:
                str = "results";
                break;
            default:
                throw null;
        }
        yt91VarM96903c.f276055i.add(new bu91("voting_playlist_banner", str, null, null, null));
        yt91VarM96903c.f276056j = true;
        this.f261878a = yt91VarM96903c.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        st91 st91Var2 = ((zih0) this.f261879b.f76422c).f283169a;
        ArrayList arrayList = new ArrayList();
        if (st91Var2 != null) {
            arrayList.addAll(st91Var2.f213866a);
        }
        zt91 zt91Var = this.f261878a;
        return xl81.m91404m(zt91Var, "location", arrayList, zt91Var, arrayList);
    }

    @Override // p204p.rv91
    /* JADX INFO: renamed from: e */
    public final ou91 mo24514e() {
        nu91 nu91Var = new nu91();
        nu91Var.f248107a = this.f261878a;
        zih0 zih0Var = (zih0) this.f261879b.f76422c;
        nu91Var.f248108b = zih0Var.f283169a;
        nu91Var.f248109c = Long.valueOf(System.currentTimeMillis());
        nu91Var.f158542f = zih0Var.f283171c;
        return (ou91) nu91Var.m87248a();
    }
}
