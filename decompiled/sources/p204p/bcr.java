package p204p;

import com.spotify.ads.esperanto.proto.SetDeviceVolumeRequest;
import com.spotify.ads.esperanto.proto.SetDeviceVolumeResponse;
import com.spotify.esperanto.esperanto.CoroutineClientBase;
import p196j$.util.Base64;

/* JADX INFO: loaded from: classes.dex */
public final class bcr extends CoroutineClientBase {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m28780a(SetDeviceVolumeRequest setDeviceVolumeRequest, ibk ibkVar) {
        acr acrVar;
        if (ibkVar instanceof acr) {
            acrVar = (acr) ibkVar;
            int i = acrVar.f14415c;
            if ((i & Integer.MIN_VALUE) != 0) {
                acrVar.f14415c = i - Integer.MIN_VALUE;
            } else {
                acrVar = new acr(this, ibkVar);
            }
        } else {
            acrVar = new acr(this, ibkVar);
        }
        Object objCallSingle = acrVar.f14413a;
        int i2 = acrVar.f14415c;
        if (i2 == 0) {
            bga.m29073P(objCallSingle);
            acrVar.f14415c = 1;
            objCallSingle = callSingle("spotify.ads.esperanto.proto.DeviceState", "SetDeviceVolume", setDeviceVolumeRequest, acrVar);
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
            return SetDeviceVolumeResponse.m2693p(bArr);
        } catch (Exception e) {
            throw new RuntimeException(s571.m77251j("Unable to parse data as com.spotify.ads.esperanto.proto.SetDeviceVolumeResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
        }
    }
}
