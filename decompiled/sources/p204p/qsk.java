package p204p;

import com.spotify.prefs.prefsimpl.NativePrefs;

/* JADX INFO: loaded from: classes2.dex */
public final class qsk implements psk, fwz0 {

    /* JADX INFO: renamed from: a */
    public final NativePrefs f192142a = NativePrefs.INSTANCE.create();

    @Override // p204p.hgm
    public final void shutdown() {
        this.f192142a.destroy();
    }

    @Override // p204p.fwz0
    public final Object getApi() {
        return this;
    }
}
