package p204p;

import java.util.Collections;

/* JADX INFO: loaded from: classes10.dex */
public final class ofh0 implements pv91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f164765a;

    public ofh0(tfh0 tfh0Var) {
        yt91 yt91VarM96903c = tfh0Var.f219985a.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("profile_header", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        this.f164765a = yt91VarM96903c.m94607a();
    }

    /* JADX INFO: renamed from: a */
    public final av91 m66851a(String str) {
        return new av91("", "", new dv91("hit", 1), new bv91("ui_navigate", 1, Collections.singletonMap("destination", "spotify:user")), this.f164765a, st91.f213865b, System.currentTimeMillis());
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        zt91 zt91Var = this.f164765a;
        return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
    }
}
