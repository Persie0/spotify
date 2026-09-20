package p204p;

import com.spotify.player.model.ContextTrack;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class l4h0 implements pv91, rv91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f129682a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ g4h0 f129683b;

    public l4h0(g4h0 g4h0Var, int i) {
        String str;
        this.f129683b = g4h0Var;
        yt91 yt91VarM96903c = g4h0Var.f76421b.m96903c();
        if (i == 1) {
            str = ContextTrack.MediaType.MIXED;
        } else {
            if (i != 2) {
                throw null;
            }
            str = "regular";
        }
        yt91VarM96903c.f276055i.add(new bu91("refresh_button", null, null, null, str));
        yt91VarM96903c.f276056j = true;
        this.f129682a = yt91VarM96903c.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        st91 st91Var2 = ((m4h0) this.f129683b.f76422c).f139965a;
        ArrayList arrayList = new ArrayList();
        if (st91Var2 != null) {
            arrayList.addAll(st91Var2.f213866a);
        }
        zt91 zt91Var = this.f129682a;
        return xl81.m91404m(zt91Var, "location", arrayList, zt91Var, arrayList);
    }

    @Override // p204p.rv91
    /* JADX INFO: renamed from: e */
    public final ou91 mo24514e() {
        nu91 nu91Var = new nu91();
        nu91Var.f248107a = this.f129682a;
        m4h0 m4h0Var = (m4h0) this.f129683b.f76422c;
        nu91Var.f248108b = m4h0Var.f139965a;
        nu91Var.f248109c = Long.valueOf(System.currentTimeMillis());
        nu91Var.f158542f = m4h0Var.f139967c;
        return (ou91) nu91Var.m87248a();
    }
}
