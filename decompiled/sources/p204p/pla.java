package p204p;

import com.spotify.music.R;

/* JADX INFO: loaded from: classes4.dex */
public final class pla implements jrr {

    /* JADX INFO: renamed from: a */
    public final z9j0 f178677a;

    public /* synthetic */ pla(z9j0 z9j0Var) {
        this.f178677a = z9j0Var;
    }

    /* JADX INFO: renamed from: a */
    public f5k m70259a(String str, String str2) {
        return new f5k("artist_browse", (wwu) nnu.f156491c, (c5k) null, Integer.valueOf(R.string.context_menu_browse_artist), (String) null, false, (p221) null, new e5k(x4k.f258140b, 1, new d5k(f7a.f66608S0, new bm9(str, 10)), new vy5(this, str, str2, 17)), 244);
    }

    @Override // p204p.jrr
    public void dismiss() {
        this.f178677a.mo47345e();
    }

    public pla(z9j0 z9j0Var, d67 d67Var) {
        this.f178677a = z9j0Var;
    }
}
