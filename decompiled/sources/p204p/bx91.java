package p204p;

import com.spotify.playback_settings.esperanto.proto.PlaybackSettingsEsperantoService$GetDeviceSettingsRequest;
import com.spotify.playback_settings.esperanto.proto.PlaybackSettingsEsperantoService$GetDeviceSettingsResponse;
import com.spotify.playback_settings.esperanto.proto.PlaybackSettingsEsperantoService$SetDeviceStreamQualityRequest;
import com.spotify.playback_settings.esperanto.proto.PlaybackSettingsEsperantoService$StatusResponse;
import io.reactivex.rxjava3.core.SingleSource;

/* JADX INFO: loaded from: classes10.dex */
public final class bx91 {

    /* JADX INFO: renamed from: a */
    public final j2p0 f31807a;

    /* JADX INFO: renamed from: b */
    public final hb11 f31808b = j0g1.m52092t(0, 0, 0, 7);

    public bx91(j2p0 j2p0Var) {
        this.f31807a = j2p0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m30765a(String str, ibk ibkVar) {
        xw91 xw91Var;
        if (ibkVar instanceof xw91) {
            xw91Var = (xw91) ibkVar;
            int i = xw91Var.f266622c;
            if ((i & Integer.MIN_VALUE) != 0) {
                xw91Var.f266622c = i - Integer.MIN_VALUE;
            } else {
                xw91Var = new xw91(this, ibkVar);
            }
        } else {
            xw91Var = new xw91(this, ibkVar);
        }
        Object objM96567o = xw91Var.f266620a;
        int i2 = xw91Var.f266622c;
        if (i2 == 0) {
            bga.m29073P(objM96567o);
            t2p0 t2p0VarM17580o = PlaybackSettingsEsperantoService$GetDeviceSettingsRequest.m17580o();
            t2p0VarM17580o.m79930m(str);
            PlaybackSettingsEsperantoService$GetDeviceSettingsRequest playbackSettingsEsperantoService$GetDeviceSettingsRequest = (PlaybackSettingsEsperantoService$GetDeviceSettingsRequest) t2p0VarM17580o.build();
            wj50.m88279p(playbackSettingsEsperantoService$GetDeviceSettingsRequest);
            SingleSource map = this.f31807a.callSingle("spotify.playback_settings.esperanto.proto.PlaybackSettings", "GetDeviceSettings", playbackSettingsEsperantoService$GetDeviceSettingsRequest).map(gyx.f85771X0);
            xw91Var.f266622c = 1;
            objM96567o = zn91.m96567o(map, xw91Var);
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
        PlaybackSettingsEsperantoService$GetDeviceSettingsResponse playbackSettingsEsperantoService$GetDeviceSettingsResponse = (PlaybackSettingsEsperantoService$GetDeviceSettingsResponse) objM96567o;
        return playbackSettingsEsperantoService$GetDeviceSettingsResponse.m17583o() == z2p0.OK ? new t4d0(playbackSettingsEsperantoService$GetDeviceSettingsResponse.m17582n().m17568n().m17571o()) : s4d0.f205575a;
    }

    /* JADX INFO: renamed from: b */
    public final vjz m30766b(String str) {
        return new vjz(new xjz0(new gso0(this.f31808b, str, 8), 18), new oj71(str, this, (fbk) null, 8));
    }

    /* JADX WARN: Code duplicated, block: B:30:0x009a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m30767c(int i, String str, ibk ibkVar) {
        ax91 ax91Var;
        int i2;
        int i3;
        if (ibkVar instanceof ax91) {
            ax91Var = (ax91) ibkVar;
            int i4 = ax91Var.f20818f;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                ax91Var.f20818f = i4 - Integer.MIN_VALUE;
            } else {
                ax91Var = new ax91(this, ibkVar);
            }
        } else {
            ax91Var = new ax91(this, ibkVar);
        }
        Object objM96567o = ax91Var.f20816d;
        int i5 = ax91Var.f20818f;
        yuk yukVar = yuk.f276404a;
        if (i5 != 0) {
            if (i5 == 1) {
                i = ax91Var.f20814b;
                str = ax91Var.f20813a;
                bga.m29073P(objM96567o);
            } else {
                if (i5 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i3 = ax91Var.f20815c;
                bga.m29073P(objM96567o);
            }
            i2 = i3;
            return Boolean.valueOf(i2 != 0);
        }
        bga.m29073P(objM96567o);
        w2p0 w2p0VarM17596p = PlaybackSettingsEsperantoService$SetDeviceStreamQualityRequest.m17596p();
        w2p0VarM17596p.m87080m(str);
        w2p0VarM17596p.m87081q(i);
        PlaybackSettingsEsperantoService$SetDeviceStreamQualityRequest playbackSettingsEsperantoService$SetDeviceStreamQualityRequest = (PlaybackSettingsEsperantoService$SetDeviceStreamQualityRequest) w2p0VarM17596p.build();
        wj50.m88279p(playbackSettingsEsperantoService$SetDeviceStreamQualityRequest);
        SingleSource map = this.f31807a.callSingle("spotify.playback_settings.esperanto.proto.PlaybackSettings", "SetDeviceStreamQuality", playbackSettingsEsperantoService$SetDeviceStreamQualityRequest).map(yyx.f277610W0);
        ax91Var.f20813a = str;
        ax91Var.f20814b = i;
        ax91Var.f20818f = 1;
        objM96567o = zn91.m96567o(map, ax91Var);
        if (objM96567o != yukVar) {
        }
        return yukVar;
        i2 = ((PlaybackSettingsEsperantoService$StatusResponse) objM96567o).m17611n() == z2p0.OK ? 1 : 0;
        if (i2 != 0) {
            ww91 ww91Var = new ww91(str, i);
            ax91Var.f20813a = null;
            ax91Var.f20814b = i;
            ax91Var.f20815c = i2;
            ax91Var.f20818f = 2;
            if (this.f31808b.emit(ww91Var, ax91Var) != yukVar) {
                i3 = i2;
                i2 = i3;
            }
            return yukVar;
        }
        return Boolean.valueOf(i2 != 0);
    }
}
