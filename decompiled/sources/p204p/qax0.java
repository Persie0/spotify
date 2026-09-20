package p204p;

import com.spotify.esperanto.esperanto.CoroutineClientBase;
import p196j$.util.Base64;
import spotify.progress_playback_esperanto.proto.ProgressPlaybackEsperanto$OnUpdateRequest;
import spotify.progress_playback_esperanto.proto.ProgressPlaybackEsperanto$OnUpdateResponse;

/* JADX INFO: loaded from: classes3.dex */
public final class qax0 extends CoroutineClientBase {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m72477a(ProgressPlaybackEsperanto$OnUpdateRequest progressPlaybackEsperanto$OnUpdateRequest, ibk ibkVar) {
        pax0 pax0Var;
        if (ibkVar instanceof pax0) {
            pax0Var = (pax0) ibkVar;
            int i = pax0Var.f175647c;
            if ((i & Integer.MIN_VALUE) != 0) {
                pax0Var.f175647c = i - Integer.MIN_VALUE;
            } else {
                pax0Var = new pax0(this, ibkVar);
            }
        } else {
            pax0Var = new pax0(this, ibkVar);
        }
        Object objCallSingle = pax0Var.f175645a;
        int i2 = pax0Var.f175647c;
        if (i2 == 0) {
            bga.m29073P(objCallSingle);
            pax0Var.f175647c = 1;
            objCallSingle = callSingle("spotify.progress_playback_esperanto.proto.ResumptionProgressPlayback", "OnUpdate", progressPlaybackEsperanto$OnUpdateRequest, pax0Var);
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
            return ProgressPlaybackEsperanto$OnUpdateResponse.m97835n(bArr);
        } catch (Exception e) {
            throw new RuntimeException(s571.m77251j("Unable to parse data as spotify.progress_playback_esperanto.proto.ProgressPlaybackEsperanto.OnUpdateResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
        }
    }
}
