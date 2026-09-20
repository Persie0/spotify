package p204p;

import com.spotify.ads.esperanto.proto.GetAdsRequest;
import com.spotify.ads.esperanto.proto.GetAdsResponse;
import com.spotify.esperanto.esperanto.CoroutineClientBase;
import p196j$.util.Base64;

/* JADX INFO: loaded from: classes.dex */
public final class zy1 extends CoroutineClientBase {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m97218a(GetAdsRequest getAdsRequest, ibk ibkVar) {
        yy1 yy1Var;
        if (ibkVar instanceof yy1) {
            yy1Var = (yy1) ibkVar;
            int i = yy1Var.f277377c;
            if ((i & Integer.MIN_VALUE) != 0) {
                yy1Var.f277377c = i - Integer.MIN_VALUE;
            } else {
                yy1Var = new yy1(this, ibkVar);
            }
        } else {
            yy1Var = new yy1(this, ibkVar);
        }
        Object objCallSingle = yy1Var.f277375a;
        int i2 = yy1Var.f277377c;
        if (i2 == 0) {
            bga.m29073P(objCallSingle);
            yy1Var.f277377c = 1;
            objCallSingle = callSingle("spotify.ads.esperanto.proto.Ads", "GetAds", getAdsRequest, yy1Var);
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
            return GetAdsResponse.m2657r(bArr);
        } catch (Exception e) {
            throw new RuntimeException(s571.m77251j("Unable to parse data as com.spotify.ads.esperanto.proto.GetAdsResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
        }
    }
}
