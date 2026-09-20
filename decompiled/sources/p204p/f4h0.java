package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class f4h0 implements pv91, rv91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f65779a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ g4h0 f65780b;

    public f4h0(Integer num, String str, g4h0 g4h0Var) {
        this.f65780b = g4h0Var;
        yt91 yt91VarM96903c = g4h0Var.f76421b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("music_video_row", null, num, str, null));
        yt91VarM96903c.f276056j = true;
        this.f65779a = yt91VarM96903c.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        st91 st91Var2 = ((r2h0) this.f65780b.f76422c).f195144b;
        ArrayList arrayList = new ArrayList();
        if (st91Var2 != null) {
            arrayList.addAll(st91Var2.f213866a);
        }
        zt91 zt91Var = this.f65779a;
        return xl81.m91404m(zt91Var, "location", arrayList, zt91Var, arrayList);
    }

    @Override // p204p.rv91
    /* JADX INFO: renamed from: e */
    public final ou91 mo24514e() {
        nu91 nu91Var = new nu91();
        nu91Var.f248107a = this.f65779a;
        nu91Var.f248108b = ((r2h0) this.f65780b.f76422c).f195144b;
        nu91Var.f248109c = Long.valueOf(System.currentTimeMillis());
        return (ou91) nu91Var.m87248a();
    }
}
