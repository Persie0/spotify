package p204p;

import com.spotify.liveroom.listeningpartymessagesourceapi.api.LifecycleChannelEvent$ArchivePartyEvent;
import com.spotify.liveroom.listeningpartymessagesourceapi.api.LifecycleChannelEvent$ClosePartyEvent;
import com.spotify.liveroom.listeningpartymessagesourceapi.api.LifecycleChannelEvent$GoLiveEvent;

/* JADX INFO: renamed from: p.q0 */
/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class C2276q0 extends ri00 implements gh00 {

    /* JADX INFO: renamed from: h */
    public static final C2276q0 f183870h = new C2276q0(1, AbstractC2555x0.class, "toLifecycleMessageData", "toLifecycleMessageData(Lcom/spotify/liveroom/listeningpartymessagesourceimpl/AblyMessage;)Lcom/spotify/liveroom/listeningpartymessagesourceapi/api/LifecycleChannelEvent;", 1);

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        C2478v0 c2478v0 = (C2478v0) obj;
        p0i0 p0i0Var = AbstractC2555x0.f256714a;
        String str = c2478v0.f235863b;
        String str2 = c2478v0.f235862a;
        int i = 0;
        for (int i2 : edb.m38551G(3)) {
            if (AbstractC1650a0.m24305b(i2).equalsIgnoreCase(str2)) {
                i = i2;
                break;
            }
        }
        int i3 = i == 0 ? -1 : AbstractC2516w0.f246605b[edb.m38547C(i)];
        if (i3 == 1) {
            return (tb80) p0i0Var.m68703c(LifecycleChannelEvent$GoLiveEvent.class).lenient().fromJson(str);
        }
        if (i3 == 2) {
            return (tb80) p0i0Var.m68703c(LifecycleChannelEvent$ClosePartyEvent.class).lenient().fromJson(str);
        }
        if (i3 != 3) {
            return null;
        }
        return (tb80) p0i0Var.m68703c(LifecycleChannelEvent$ArchivePartyEvent.class).lenient().fromJson(str);
    }
}
