package p204p;

import com.spotify.base.java.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class si7 implements fwz0 {

    /* JADX INFO: renamed from: a */
    public final p0j f209365a;

    /* JADX INFO: renamed from: b */
    public final wg61 f209366b = new wg61(new so5(this, 16));

    public si7(p0j p0jVar) {
        this.f209365a = p0jVar;
    }

    @Override // p204p.hgm
    public final void shutdown() {
        Logger.m3969e("AuthStorageApi shutdown", new Object[0]);
    }

    @Override // p204p.fwz0
    public final Object getApi() {
        return this;
    }
}
