package p204p;

import com.spotify.playback_settings.esperanto.proto.PlaybackSettingsEsperantoService$ContentSettingUpdate;
import com.spotify.playback_settings.esperanto.proto.PlaybackSettingsEsperantoService$ContentSettings;
import com.spotify.playback_settings.esperanto.proto.PlaybackSettingsEsperantoService$FieldUpdate;
import com.spotify.playback_settings.esperanto.proto.PlaybackSettingsEsperantoService$FieldValue;
import com.spotify.playback_settings.esperanto.proto.PlaybackSettingsEsperantoService$GetSettingsRequest;
import com.spotify.playback_settings.esperanto.proto.PlaybackSettingsEsperantoService$GetSettingsResponse;
import com.spotify.playback_settings.esperanto.proto.PlaybackSettingsEsperantoService$SetSettingsRequest;
import java.io.Serializable;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes9.dex */
public final class k7q {

    /* JADX INFO: renamed from: a */
    public final n2p0 f120176a;

    public k7q(n2p0 n2p0Var) {
        this.f120176a = n2p0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Serializable m55695a(String str, ibk ibkVar) throws Throwable {
        i7q i7qVar;
        Serializable c6x0Var;
        if (ibkVar instanceof i7q) {
            i7qVar = (i7q) ibkVar;
            int i = i7qVar.f99606d;
            if ((i & Integer.MIN_VALUE) != 0) {
                i7qVar.f99606d = i - Integer.MIN_VALUE;
            } else {
                i7qVar = new i7q(this, ibkVar);
            }
        } else {
            i7qVar = new i7q(this, ibkVar);
        }
        Object objM63566a = i7qVar.f99604b;
        int i2 = i7qVar.f99606d;
        try {
            if (i2 == 0) {
                bga.m29073P(objM63566a);
                u2p0 u2p0VarM17588r = PlaybackSettingsEsperantoService$GetSettingsRequest.m17588r();
                u2p0VarM17588r.m82257r(q2p0.SKIP_FINISHED_EPISODES);
                u2p0VarM17588r.m82256q(str);
                PlaybackSettingsEsperantoService$GetSettingsRequest playbackSettingsEsperantoService$GetSettingsRequest = (PlaybackSettingsEsperantoService$GetSettingsRequest) u2p0VarM17588r.build();
                n2p0 n2p0Var = this.f120176a;
                wj50.m88279p(playbackSettingsEsperantoService$GetSettingsRequest);
                i7qVar.f99603a = str;
                i7qVar.f99606d = 1;
                objM63566a = n2p0Var.m63566a(playbackSettingsEsperantoService$GetSettingsRequest, i7qVar);
                yuk yukVar = yuk.f276404a;
                if (objM63566a == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = i7qVar.f99603a;
                bga.m29073P(objM63566a);
            }
            PlaybackSettingsEsperantoService$ContentSettings playbackSettingsEsperantoService$ContentSettings = (PlaybackSettingsEsperantoService$ContentSettings) ((PlaybackSettingsEsperantoService$GetSettingsResponse) objM63566a).m17591o().get(str);
            c6x0Var = Boolean.valueOf(playbackSettingsEsperantoService$ContentSettings != null ? playbackSettingsEsperantoService$ContentSettings.m17565o() : false);
        } catch (Throwable th) {
            c6x0Var = new c6x0(th);
        }
        Throwable thM77348a = s6x0.m77348a(c6x0Var);
        if (thM77348a == null || !(thM77348a instanceof CancellationException)) {
            return c6x0Var instanceof c6x0 ? Boolean.FALSE : c6x0Var;
        }
        throw thM77348a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m55696b(String str, ibk ibkVar, boolean z) {
        j7q j7qVar;
        Object c6x0Var;
        if (ibkVar instanceof j7q) {
            j7qVar = (j7q) ibkVar;
            int i = j7qVar.f109649c;
            if ((i & Integer.MIN_VALUE) != 0) {
                j7qVar.f109649c = i - Integer.MIN_VALUE;
            } else {
                j7qVar = new j7q(this, ibkVar);
            }
        } else {
            j7qVar = new j7q(this, ibkVar);
        }
        Object obj = j7qVar.f109647a;
        int i2 = j7qVar.f109649c;
        try {
            if (i2 == 0) {
                bga.m29073P(obj);
                n2p0 n2p0Var = this.f120176a;
                x2p0 x2p0VarM17600q = PlaybackSettingsEsperantoService$SetSettingsRequest.m17600q();
                o2p0 o2p0VarM17563p = PlaybackSettingsEsperantoService$ContentSettingUpdate.m17563p();
                o2p0VarM17563p.m66137q(str);
                r2p0 r2p0VarM17574p = PlaybackSettingsEsperantoService$FieldUpdate.m17574p();
                r2p0VarM17574p.m74560m(q2p0.SKIP_FINISHED_EPISODES);
                s2p0 s2p0VarM17578q = PlaybackSettingsEsperantoService$FieldValue.m17578q();
                s2p0VarM17578q.m77094m(z);
                r2p0VarM17574p.m74561q((PlaybackSettingsEsperantoService$FieldValue) s2p0VarM17578q.build());
                o2p0VarM17563p.m66136m((PlaybackSettingsEsperantoService$FieldUpdate) r2p0VarM17574p.build());
                x2p0VarM17600q.m89767q((PlaybackSettingsEsperantoService$ContentSettingUpdate) o2p0VarM17563p.build());
                PlaybackSettingsEsperantoService$SetSettingsRequest playbackSettingsEsperantoService$SetSettingsRequest = (PlaybackSettingsEsperantoService$SetSettingsRequest) x2p0VarM17600q.build();
                j7qVar.f109649c = 1;
                Object objM63567b = n2p0Var.m63567b(playbackSettingsEsperantoService$SetSettingsRequest, j7qVar);
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
            c6x0Var = w2a1.f247311a;
        } catch (Throwable th) {
            c6x0Var = new c6x0(th);
        }
        Throwable thM77348a = s6x0.m77348a(c6x0Var);
        if (thM77348a == null || !(thM77348a instanceof CancellationException)) {
            return c6x0Var;
        }
        throw thM77348a;
    }
}
