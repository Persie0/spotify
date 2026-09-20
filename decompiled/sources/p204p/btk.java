package p204p;

import com.spotify.core.coreimpl.ApplicationScopeConfiguration;
import com.spotify.core.coreimpl.NativeApplicationScopeImpl;
import com.spotify.cosmos.sharedcosmosrouterapi.SharedCosmosRouterApi;
import com.spotify.esperanto.esperantoimpl.SchedulingTransport;
import com.spotify.eventsender.api.EventSenderCoreBridge;

/* JADX INFO: loaded from: classes.dex */
public final class btk implements fwz0 {

    /* JADX INFO: renamed from: a */
    public final xtk f30880a;

    /* JADX INFO: renamed from: b */
    public final ztk f30881b;

    /* JADX INFO: renamed from: c */
    public final psk f30882c;

    /* JADX INFO: renamed from: d */
    public final ApplicationScopeConfiguration f30883d;

    /* JADX INFO: renamed from: e */
    public final EventSenderCoreBridge f30884e;

    /* JADX INFO: renamed from: f */
    public final bwy f30885f;

    /* JADX INFO: renamed from: g */
    public NativeApplicationScopeImpl f30886g;

    /* JADX INFO: renamed from: h */
    public SchedulingTransport f30887h;

    public btk(xtk xtkVar, ztk ztkVar, psk pskVar, ApplicationScopeConfiguration applicationScopeConfiguration, SharedCosmosRouterApi sharedCosmosRouterApi, EventSenderCoreBridge eventSenderCoreBridge, bwy bwyVar) {
        this.f30880a = xtkVar;
        this.f30881b = ztkVar;
        this.f30882c = pskVar;
        this.f30883d = applicationScopeConfiguration;
        this.f30884e = eventSenderCoreBridge;
        this.f30885f = bwyVar;
        ((auk) xtkVar).f19950c.runBlocking(new atk(this, sharedCosmosRouterApi));
    }

    @Override // p204p.hgm
    public final void shutdown() {
        ((auk) this.f30880a).f19950c.runBlocking(new eph(this, 5));
    }

    @Override // p204p.fwz0
    public final Object getApi() {
        return this;
    }
}
