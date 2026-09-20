package com.spotify.connect.mediarouteproviderapi;

import kotlin.Metadata;
import p204p.dmd0;
import p204p.f0a;
import p204p.lmd0;
import p204p.nmd0;
import p204p.opo;
import p204p.vac;
import p204p.wj50;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m24212d2 = {"Lcom/spotify/connect/mediarouteproviderapi/SpotifyMediaRouteProviderService;", "Lp/lmd0;", "<init>", "()V", "src_main_java_com_spotify_connect_mediarouteproviderapi-mediarouteproviderapi"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class SpotifyMediaRouteProviderService extends lmd0 {

    /* JADX INFO: renamed from: g */
    public vac f3433g;

    /* JADX INFO: renamed from: h */
    public f0a f3434h;

    /* JADX INFO: renamed from: i */
    public nmd0 f3435i;

    /* JADX INFO: renamed from: t */
    public dmd0 f3436t;

    @Override // android.app.Service
    public final void onCreate() {
        opo.m67560j(this);
        super.onCreate();
    }

    @Override // p204p.lmd0, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        dmd0 dmd0Var = this.f3436t;
        if (dmd0Var != null) {
            dmd0Var.m36414j();
        }
        this.f3436t = null;
        nmd0 nmd0Var = this.f3435i;
        if (nmd0Var != null) {
            nmd0Var.m64813b();
        } else {
            wj50.m88260d0("servicePlugins");
            throw null;
        }
    }
}
