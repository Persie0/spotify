package p204p;

import com.spotify.ads.esperanto.proto.PostEventV2Request;
import com.spotify.ads.esperanto.proto.PostEventV2Response;
import com.spotify.esperanto.esperanto.CoroutineClientBase;
import p196j$.util.Base64;

/* JADX INFO: loaded from: classes4.dex */
public final class ss0 extends CoroutineClientBase {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m79169a(PostEventV2Request postEventV2Request, ibk ibkVar) {
        rs0 rs0Var;
        if (ibkVar instanceof rs0) {
            rs0Var = (rs0) ibkVar;
            int i = rs0Var.f202153c;
            if ((i & Integer.MIN_VALUE) != 0) {
                rs0Var.f202153c = i - Integer.MIN_VALUE;
            } else {
                rs0Var = new rs0(this, ibkVar);
            }
        } else {
            rs0Var = new rs0(this, ibkVar);
        }
        Object objCallSingle = rs0Var.f202151a;
        int i2 = rs0Var.f202153c;
        if (i2 == 0) {
            bga.m29073P(objCallSingle);
            rs0Var.f202153c = 1;
            objCallSingle = callSingle("spotify.ads.esperanto.proto.AdOpportunity", "postEventV2", postEventV2Request, rs0Var);
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
            return PostEventV2Response.m2675o(bArr);
        } catch (Exception e) {
            throw new RuntimeException(s571.m77251j("Unable to parse data as com.spotify.ads.esperanto.proto.PostEventV2Response: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
        }
    }
}
