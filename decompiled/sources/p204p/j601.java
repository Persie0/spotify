package p204p;

import com.spotify.base.java.logging.Logger;

/* JADX INFO: loaded from: classes6.dex */
public final class j601 implements ind0 {

    /* JADX INFO: renamed from: a */
    public final vac f109186a;

    /* JADX INFO: renamed from: b */
    public final er70 f109187b;

    /* JADX INFO: renamed from: c */
    public final wg61 f109188c;

    public j601(vac vacVar, se41 se41Var, er70 er70Var) {
        this.f109186a = vacVar;
        this.f109187b = er70Var;
        this.f109188c = new wg61(new l6t(0, 12, se41.class, se41Var, "mediaSessionWrapper", "getMediaSessionWrapper()Lcom/spotify/mediasession/wrapper/MediaSessionWrapper;"));
    }

    @Override // p204p.ind0
    /* JADX INFO: renamed from: a */
    public final void mo36150a() {
        if (((kzl0) this.f109186a).m57761b()) {
            ((rg50) this.f109188c.getValue()).mo53392h();
        }
    }

    @Override // p204p.ind0
    /* JADX INFO: renamed from: b */
    public final void mo36151b() {
        if (((kzl0) this.f109186a).m57761b()) {
            ((rg50) this.f109188c.getValue()).mo53390f((aqp) this.f109187b.get());
        } else {
            Logger.m3969e("GOS->Not binding media session to media router when Output Switcher is disabled", new Object[0]);
        }
    }
}
