package p204p;

import com.spotify.player.model.ContextTrack;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class q4h0 implements pv91, rv91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f185178a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ r2h0 f185179b;

    public q4h0(r2h0 r2h0Var, int i) {
        String str;
        this.f185179b = r2h0Var;
        yt91 yt91VarM96903c = r2h0Var.f195145c.m96903c();
        if (i == 1) {
            str = x09.f256833e;
        } else if (i == 2) {
            str = x09.f256832d;
        } else {
            if (i != 3) {
                throw null;
            }
            str = ContextTrack.Metadata.KEY_HIDDEN;
        }
        yt91VarM96903c.f276055i.add(new bu91("reorder_onboarding", str, null, null, null));
        yt91VarM96903c.f276056j = true;
        this.f185178a = yt91VarM96903c.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        st91 st91Var2 = this.f185179b.f195144b;
        ArrayList arrayList = new ArrayList();
        if (st91Var2 != null) {
            arrayList.addAll(st91Var2.f213866a);
        }
        zt91 zt91Var = this.f185178a;
        return xl81.m91404m(zt91Var, "location", arrayList, zt91Var, arrayList);
    }

    @Override // p204p.rv91
    /* JADX INFO: renamed from: e */
    public final ou91 mo24514e() {
        nu91 nu91Var = new nu91();
        nu91Var.f248107a = this.f185178a;
        nu91Var.f248108b = this.f185179b.f195144b;
        nu91Var.f248109c = Long.valueOf(System.currentTimeMillis());
        return (ou91) nu91Var.m87248a();
    }
}
