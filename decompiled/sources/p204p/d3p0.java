package p204p;

import com.spotify.playback_settings.esperanto.proto.PlaybackSettingsEsperantoService$GetSettingsRequest;
import com.spotify.playback_settings.esperanto.proto.PlaybackSettingsEsperantoService$GetSettingsResponse;
import io.reactivex.rxjava3.core.SingleSource;

/* JADX INFO: loaded from: classes2.dex */
public final class d3p0 {

    /* JADX INFO: renamed from: a */
    public final mi80 f44961a;

    /* JADX INFO: renamed from: b */
    public final j2p0 f44962b;

    public d3p0(mi80 mi80Var, j2p0 j2p0Var) {
        this.f44961a = mi80Var;
        this.f44962b = j2p0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m34888a(ibk ibkVar) {
        b3p0 b3p0Var;
        if (ibkVar instanceof b3p0) {
            b3p0Var = (b3p0) ibkVar;
            int i = b3p0Var.f23094c;
            if ((i & Integer.MIN_VALUE) != 0) {
                b3p0Var.f23094c = i - Integer.MIN_VALUE;
            } else {
                b3p0Var = new b3p0(this, ibkVar);
            }
        } else {
            b3p0Var = new b3p0(this, ibkVar);
        }
        Object objM96567o = b3p0Var.f23092a;
        int i2 = b3p0Var.f23094c;
        if (i2 == 0) {
            bga.m29073P(objM96567o);
            u2p0 u2p0VarM17588r = PlaybackSettingsEsperantoService$GetSettingsRequest.m17588r();
            u2p0VarM17588r.m82257r(q2p0.DISABLE_SMART_SHUFFLE);
            u2p0VarM17588r.m82258s(true);
            SingleSource map = this.f44962b.callSingle("spotify.playback_settings.esperanto.proto.PlaybackSettings", "GetSettings", (PlaybackSettingsEsperantoService$GetSettingsRequest) u2p0VarM17588r.build()).map(hcj0.f89823g);
            b3p0Var.f23094c = 1;
            objM96567o = zn91.m96567o(map, b3p0Var);
            yuk yukVar = yuk.f276404a;
            if (objM96567o == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM96567o);
        }
        PlaybackSettingsEsperantoService$GetSettingsResponse playbackSettingsEsperantoService$GetSettingsResponse = (PlaybackSettingsEsperantoService$GetSettingsResponse) objM96567o;
        if (playbackSettingsEsperantoService$GetSettingsResponse.m17593q() && playbackSettingsEsperantoService$GetSettingsResponse.m17592p().m17637v()) {
            return qyg1.m74178H(playbackSettingsEsperantoService$GetSettingsResponse.m17592p().m17633r());
        }
        return null;
    }
}
