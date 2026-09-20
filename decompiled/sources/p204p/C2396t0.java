package p204p;

import com.spotify.liveroom.listeningpartymessagesourceapi.api.OccupancyChannelEvent;

/* JADX INFO: renamed from: p.t0 */
/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class C2396t0 extends ri00 implements gh00 {

    /* JADX INFO: renamed from: h */
    public static final C2396t0 f215705h = new C2396t0(1, AbstractC2555x0.class, "toOccupancyMessageData", "toOccupancyMessageData(Lcom/spotify/liveroom/listeningpartymessagesourceimpl/AblyMessage;)Lcom/spotify/liveroom/listeningpartymessagesourceapi/api/OccupancyChannelEvent;", 1);

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        return (OccupancyChannelEvent) AbstractC2555x0.f256714a.m68703c(OccupancyChannelEvent.class).lenient().fromJson(((C2478v0) obj).f235863b);
    }
}
