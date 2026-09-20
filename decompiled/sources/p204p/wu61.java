package p204p;

import com.spotify.ads.esperanto.proto.PutTargetingRequest;
import com.spotify.ads.esperanto.proto.TargetingResponse;
import com.spotify.esperanto.esperanto.CoroutineClientBase;
import p196j$.util.Base64;

/* JADX INFO: loaded from: classes.dex */
public final class wu61 extends CoroutineClientBase {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m89014a(PutTargetingRequest putTargetingRequest, ibk ibkVar) {
        vu61 vu61Var;
        if (ibkVar instanceof vu61) {
            vu61Var = (vu61) ibkVar;
            int i = vu61Var.f244880c;
            if ((i & Integer.MIN_VALUE) != 0) {
                vu61Var.f244880c = i - Integer.MIN_VALUE;
            } else {
                vu61Var = new vu61(this, ibkVar);
            }
        } else {
            vu61Var = new vu61(this, ibkVar);
        }
        Object objCallSingle = vu61Var.f244878a;
        int i2 = vu61Var.f244880c;
        if (i2 == 0) {
            bga.m29073P(objCallSingle);
            vu61Var.f244880c = 1;
            objCallSingle = callSingle("spotify.ads.esperanto.proto.Targeting", "PutTargeting", putTargetingRequest, vu61Var);
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
            return TargetingResponse.m2729p(bArr);
        } catch (Exception e) {
            throw new RuntimeException(s571.m77251j("Unable to parse data as com.spotify.ads.esperanto.proto.TargetingResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
        }
    }
}
