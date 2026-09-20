package p204p;

import com.google.protobuf.Empty;
import com.spotify.esperanto.esperanto.CoroutineClientBase;
import com.spotify.playback_settings.esperanto.proto.PlaybackSettingsEsperantoService$GetSettingsRequest;
import com.spotify.playback_settings.esperanto.proto.PlaybackSettingsEsperantoService$GetSettingsResponse;
import com.spotify.playback_settings.esperanto.proto.PlaybackSettingsEsperantoService$SetSettingsRequest;
import p196j$.util.Base64;

/* JADX INFO: loaded from: classes9.dex */
public final class n2p0 extends CoroutineClientBase {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m63566a(PlaybackSettingsEsperantoService$GetSettingsRequest playbackSettingsEsperantoService$GetSettingsRequest, ibk ibkVar) {
        k2p0 k2p0Var;
        if (ibkVar instanceof k2p0) {
            k2p0Var = (k2p0) ibkVar;
            int i = k2p0Var.f118683c;
            if ((i & Integer.MIN_VALUE) != 0) {
                k2p0Var.f118683c = i - Integer.MIN_VALUE;
            } else {
                k2p0Var = new k2p0(this, ibkVar);
            }
        } else {
            k2p0Var = new k2p0(this, ibkVar);
        }
        Object objCallSingle = k2p0Var.f118681a;
        int i2 = k2p0Var.f118683c;
        if (i2 == 0) {
            bga.m29073P(objCallSingle);
            k2p0Var.f118683c = 1;
            objCallSingle = callSingle("spotify.playback_settings.esperanto.proto.PlaybackSettings", "GetSettings", playbackSettingsEsperantoService$GetSettingsRequest, k2p0Var);
            Object obj = yuk.f276404a;
            if (objCallSingle == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objCallSingle);
        }
        byte[] bArr = (byte[]) objCallSingle;
        try {
            return PlaybackSettingsEsperantoService$GetSettingsResponse.m17590r(bArr);
        } catch (Exception e) {
            throw new RuntimeException(s571.m77251j("Unable to parse data as com.spotify.playback_settings.esperanto.proto.PlaybackSettingsEsperantoService.GetSettingsResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m63567b(PlaybackSettingsEsperantoService$SetSettingsRequest playbackSettingsEsperantoService$SetSettingsRequest, ibk ibkVar) {
        l2p0 l2p0Var;
        if (ibkVar instanceof l2p0) {
            l2p0Var = (l2p0) ibkVar;
            int i = l2p0Var.f129064c;
            if ((i & Integer.MIN_VALUE) != 0) {
                l2p0Var.f129064c = i - Integer.MIN_VALUE;
            } else {
                l2p0Var = new l2p0(this, ibkVar);
            }
        } else {
            l2p0Var = new l2p0(this, ibkVar);
        }
        Object objCallSingle = l2p0Var.f129062a;
        int i2 = l2p0Var.f129064c;
        if (i2 == 0) {
            bga.m29073P(objCallSingle);
            l2p0Var.f129064c = 1;
            objCallSingle = callSingle("spotify.playback_settings.esperanto.proto.PlaybackSettings", "SetSettings", playbackSettingsEsperantoService$SetSettingsRequest, l2p0Var);
            Object obj = yuk.f276404a;
            if (objCallSingle == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objCallSingle);
        }
        byte[] bArr = (byte[]) objCallSingle;
        try {
            return Empty.m1936q(bArr);
        } catch (Exception e) {
            throw new RuntimeException(s571.m77251j("Unable to parse data as com.google.protobuf.Empty: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
        }
    }
}
