package p204p;

import com.spotify.cosmos.sharedcosmosrouterapi.SharedCosmosRouterApi;
import com.spotify.settings.settings.SettingsDelegate;
import com.spotify.settings.settingsimpl.NativeSettings;

/* JADX INFO: loaded from: classes2.dex */
public final class zd01 implements fwz0 {

    /* JADX INFO: renamed from: a */
    public final xtk f281604a;

    /* JADX INFO: renamed from: b */
    public NativeSettings f281605b;

    public zd01(xtk xtkVar, SharedCosmosRouterApi sharedCosmosRouterApi, psk pskVar, p0j p0jVar, String str, SettingsDelegate settingsDelegate) {
        this.f281604a = xtkVar;
        ((auk) xtkVar).f19950c.runBlocking(new yd01(this, sharedCosmosRouterApi, pskVar, p0jVar, str, settingsDelegate));
    }

    @Override // p204p.hgm
    public final void shutdown() {
        ((auk) this.f281604a).f19950c.runBlocking(new cjs0(this, 17));
    }

    @Override // p204p.fwz0
    public final Object getApi() {
        return this;
    }
}
