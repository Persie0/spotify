package p204p;

import com.spotify.playback_settings.esperanto.proto.PlaybackSettingsEsperantoService$GetSettingsRequest;
import com.spotify.playback_settings.esperanto.proto.PlaybackSettingsEsperantoService$SetSettingsRequest;
import com.spotify.playback_settings.esperanto.proto.PlaybackSettingsEsperantoService$StreamSettingChangesRequest;

/* JADX INFO: loaded from: classes10.dex */
public final class g3p0 implements fwz0 {

    /* JADX INFO: renamed from: a */
    public final n2p0 f76263a;

    public g3p0(n2p0 n2p0Var) {
        this.f76263a = n2p0Var;
    }

    /* JADX INFO: renamed from: a */
    public final Object m43510a(String str, boolean z, q2p0[] q2p0VarArr, ibk ibkVar) {
        u2p0 u2p0VarM17588r = PlaybackSettingsEsperantoService$GetSettingsRequest.m17588r();
        u2p0VarM17588r.m82255m(bk5.m29620k1(q2p0VarArr));
        u2p0VarM17588r.m82258s(z);
        if (str != null) {
            u2p0VarM17588r.m82256q(str);
        }
        return this.f76263a.m63566a((PlaybackSettingsEsperantoService$GetSettingsRequest) u2p0VarM17588r.build(), ibkVar);
    }

    /* JADX INFO: renamed from: b */
    public final luk0 m43511b(q2p0... q2p0VarArr) {
        a3p0 a3p0VarM17618p = PlaybackSettingsEsperantoService$StreamSettingChangesRequest.m17618p();
        a3p0VarM17618p.m24643m(bk5.m29620k1(q2p0VarArr));
        return new luk0(this.f76263a.callStream("spotify.playback_settings.esperanto.proto.PlaybackSettings", "StreamSettingChanges", (PlaybackSettingsEsperantoService$StreamSettingChangesRequest) a3p0VarM17618p.build()), 20);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m43512c(PlaybackSettingsEsperantoService$SetSettingsRequest playbackSettingsEsperantoService$SetSettingsRequest, ibk ibkVar) {
        f3p0 f3p0Var;
        if (ibkVar instanceof f3p0) {
            f3p0Var = (f3p0) ibkVar;
            int i = f3p0Var.f65565c;
            if ((i & Integer.MIN_VALUE) != 0) {
                f3p0Var.f65565c = i - Integer.MIN_VALUE;
            } else {
                f3p0Var = new f3p0(this, ibkVar);
            }
        } else {
            f3p0Var = new f3p0(this, ibkVar);
        }
        Object obj = f3p0Var.f65563a;
        int i2 = f3p0Var.f65565c;
        if (i2 == 0) {
            bga.m29073P(obj);
            f3p0Var.f65565c = 1;
            Object objM63567b = this.f76263a.m63567b(playbackSettingsEsperantoService$SetSettingsRequest, f3p0Var);
            yuk yukVar = yuk.f276404a;
            if (objM63567b == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
        }
        return w2a1.f247311a;
    }

    @Override // p204p.fwz0
    public final Object getApi() {
        return this;
    }

    @Override // p204p.hgm
    public final void shutdown() {
    }
}
