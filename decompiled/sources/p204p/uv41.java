package p204p;

import com.google.protobuf.Empty;
import com.spotify.ads.esperanto.proto.PutStateRequest;
import com.spotify.ads.esperanto.proto.StateRequest;
import com.spotify.ads.esperanto.proto.StateResponse;
import com.spotify.esperanto.esperanto.CoroutineClientBase;
import p196j$.util.Base64;

/* JADX INFO: loaded from: classes.dex */
public final class uv41 extends CoroutineClientBase {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m84049a(StateRequest stateRequest, ibk ibkVar) {
        sv41 sv41Var;
        if (ibkVar instanceof sv41) {
            sv41Var = (sv41) ibkVar;
            int i = sv41Var.f214324c;
            if ((i & Integer.MIN_VALUE) != 0) {
                sv41Var.f214324c = i - Integer.MIN_VALUE;
            } else {
                sv41Var = new sv41(this, ibkVar);
            }
        } else {
            sv41Var = new sv41(this, ibkVar);
        }
        Object objCallSingle = sv41Var.f214322a;
        int i2 = sv41Var.f214324c;
        if (i2 == 0) {
            bga.m29073P(objCallSingle);
            sv41Var.f214324c = 1;
            objCallSingle = callSingle("spotify.ads.esperanto.proto.State", "GetState", stateRequest, sv41Var);
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
            return StateResponse.m2699o(bArr);
        } catch (Exception e) {
            throw new RuntimeException(s571.m77251j("Unable to parse data as com.spotify.ads.esperanto.proto.StateResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m84050b(PutStateRequest putStateRequest, ibk ibkVar) {
        tv41 tv41Var;
        if (ibkVar instanceof tv41) {
            tv41Var = (tv41) ibkVar;
            int i = tv41Var.f224054c;
            if ((i & Integer.MIN_VALUE) != 0) {
                tv41Var.f224054c = i - Integer.MIN_VALUE;
            } else {
                tv41Var = new tv41(this, ibkVar);
            }
        } else {
            tv41Var = new tv41(this, ibkVar);
        }
        Object objCallSingle = tv41Var.f224052a;
        int i2 = tv41Var.f224054c;
        if (i2 == 0) {
            bga.m29073P(objCallSingle);
            tv41Var.f224054c = 1;
            objCallSingle = callSingle("spotify.ads.esperanto.proto.State", "PutState", putStateRequest, tv41Var);
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
