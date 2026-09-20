package p204p;

import com.google.protobuf.Empty;
import com.spotify.ads.esperanto.proto.DeleteRequestHeadersRequest;
import com.spotify.ads.esperanto.proto.SetRequestHeadersRequest;
import com.spotify.ads.esperanto.proto.UpdateSlotEnabledRequest;
import com.spotify.ads.esperanto.proto.UpdateSlotResponse;
import com.spotify.esperanto.esperanto.CoroutineClientBase;
import p196j$.util.Base64;

/* JADX INFO: loaded from: classes.dex */
public final class i801 extends CoroutineClientBase {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m49899a(DeleteRequestHeadersRequest deleteRequestHeadersRequest, ibk ibkVar) {
        f801 f801Var;
        if (ibkVar instanceof f801) {
            f801Var = (f801) ibkVar;
            int i = f801Var.f66824c;
            if ((i & Integer.MIN_VALUE) != 0) {
                f801Var.f66824c = i - Integer.MIN_VALUE;
            } else {
                f801Var = new f801(this, ibkVar);
            }
        } else {
            f801Var = new f801(this, ibkVar);
        }
        Object objCallSingle = f801Var.f66822a;
        int i2 = f801Var.f66824c;
        if (i2 == 0) {
            bga.m29073P(objCallSingle);
            f801Var.f66824c = 1;
            objCallSingle = callSingle("spotify.ads.esperanto.proto.Settings", "deleteRequestHeaders", deleteRequestHeadersRequest, f801Var);
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

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m49900b(SetRequestHeadersRequest setRequestHeadersRequest, ibk ibkVar) {
        g801 g801Var;
        if (ibkVar instanceof g801) {
            g801Var = (g801) ibkVar;
            int i = g801Var.f77383c;
            if ((i & Integer.MIN_VALUE) != 0) {
                g801Var.f77383c = i - Integer.MIN_VALUE;
            } else {
                g801Var = new g801(this, ibkVar);
            }
        } else {
            g801Var = new g801(this, ibkVar);
        }
        Object objCallSingle = g801Var.f77381a;
        int i2 = g801Var.f77383c;
        if (i2 == 0) {
            bga.m29073P(objCallSingle);
            g801Var.f77383c = 1;
            objCallSingle = callSingle("spotify.ads.esperanto.proto.Settings", "setRequestHeaders", setRequestHeadersRequest, g801Var);
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

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m49901c(UpdateSlotEnabledRequest updateSlotEnabledRequest, ibk ibkVar) {
        h801 h801Var;
        if (ibkVar instanceof h801) {
            h801Var = (h801) ibkVar;
            int i = h801Var.f88588c;
            if ((i & Integer.MIN_VALUE) != 0) {
                h801Var.f88588c = i - Integer.MIN_VALUE;
            } else {
                h801Var = new h801(this, ibkVar);
            }
        } else {
            h801Var = new h801(this, ibkVar);
        }
        Object objCallSingle = h801Var.f88586a;
        int i2 = h801Var.f88588c;
        if (i2 == 0) {
            bga.m29073P(objCallSingle);
            h801Var.f88588c = 1;
            objCallSingle = callSingle("spotify.ads.esperanto.proto.Settings", "updateSlotEnabled", updateSlotEnabledRequest, h801Var);
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
            return UpdateSlotResponse.m2754p(bArr);
        } catch (Exception e) {
            throw new RuntimeException(s571.m77251j("Unable to parse data as com.spotify.ads.esperanto.proto.UpdateSlotResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
        }
    }
}
