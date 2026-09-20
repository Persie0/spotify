package p204p;

import com.google.protobuf.Empty;
import com.spotify.connectivity.traffic.esperanto.proto.EsTrafficEvents$TrafficEvent;
import com.spotify.esperanto.esperanto.CoroutineClientBase;
import p196j$.util.Base64;

/* JADX INFO: loaded from: classes.dex */
public final class c400 extends CoroutineClientBase {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public Object m31417a(EsTrafficEvents$TrafficEvent esTrafficEvents$TrafficEvent, fbk fbkVar) {
        eu81 eu81Var;
        if (fbkVar instanceof eu81) {
            eu81Var = (eu81) fbkVar;
            int i = eu81Var.f62915c;
            if ((i & Integer.MIN_VALUE) != 0) {
                eu81Var.f62915c = i - Integer.MIN_VALUE;
            } else {
                eu81Var = new eu81(this, fbkVar);
            }
        } else {
            eu81Var = new eu81(this, fbkVar);
        }
        Object objCallSingle = eu81Var.f62913a;
        int i2 = eu81Var.f62915c;
        if (i2 == 0) {
            bga.m29073P(objCallSingle);
            eu81Var.f62915c = 1;
            objCallSingle = callSingle("spotify.connectivity.traffic.esperanto.proto.TrafficAdapter", "notifyTrafficEvent", esTrafficEvents$TrafficEvent, eu81Var);
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
