package p204p;

import android.os.Bundle;
import com.spotify.music.SpotifyMainActivity;

/* JADX INFO: loaded from: classes.dex */
public final class elq implements yqa0, sg0 {

    /* JADX INFO: renamed from: a */
    public Bundle f60741a;

    /* JADX INFO: renamed from: b */
    public final i700 f60742b;

    public elq(SpotifyMainActivity spotifyMainActivity, w221 w221Var) {
        this.f60742b = new i700(spotifyMainActivity, spotifyMainActivity, spotifyMainActivity, spotifyMainActivity, spotifyMainActivity, spotifyMainActivity, w221Var, new edq(this, 10));
    }

    @Override // p204p.yqa0
    /* JADX INFO: renamed from: J */
    public final fxi mo15682J() {
        return this.f60742b.f99396e;
    }

    /* JADX INFO: renamed from: a */
    public final void m39395a() {
        i700 i700Var = this.f60742b;
        if (i700Var.f99398g.m95407w().f34659L) {
            throw new IllegalStateException("A torn-down DelayedFragmentManager cannot be reconnected");
        }
        if (i700Var.f99389X) {
            return;
        }
        i700Var.f99389X = true;
        i700Var.f99398g.m95390a();
        fxi fxiVar = i700Var.f99396e;
        oc80 oc80Var = i700Var.f99393b.f31643a;
        if (fxiVar.f74378a) {
            return;
        }
        fxiVar.f74379b = oc80Var;
        oc80Var.mo31986a(fxiVar.f74382e);
        fxiVar.f74378a = true;
    }

    @Override // p204p.sg0
    /* JADX INFO: renamed from: s */
    public final pg0 mo34132s() {
        return this.f60742b.f99401t.m30384Q();
    }
}
