package p204p;

import com.google.protobuf.Empty;
import com.spotify.ads.esperanto.proto.EventRequest;
import com.spotify.ads.esperanto.proto.EventResponse;
import com.spotify.ads.esperanto.proto.UnmanagedEventRequest;
import com.spotify.esperanto.esperanto.CoroutineClientBase;
import p196j$.util.Base64;

/* JADX INFO: loaded from: classes.dex */
public final class s9x extends CoroutineClientBase {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m77598a(EventRequest eventRequest, ibk ibkVar) {
        p9x p9xVar;
        if (ibkVar instanceof p9x) {
            p9xVar = (p9x) ibkVar;
            int i = p9xVar.f175323c;
            if ((i & Integer.MIN_VALUE) != 0) {
                p9xVar.f175323c = i - Integer.MIN_VALUE;
            } else {
                p9xVar = new p9x(this, ibkVar);
            }
        } else {
            p9xVar = new p9x(this, ibkVar);
        }
        Object objCallSingle = p9xVar.f175321a;
        int i2 = p9xVar.f175323c;
        if (i2 == 0) {
            bga.m29073P(objCallSingle);
            p9xVar.f175323c = 1;
            objCallSingle = callSingle("spotify.ads.esperanto.proto.Events", "postEvent", eventRequest, p9xVar);
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
            return EventResponse.m2652o(bArr);
        } catch (Exception e) {
            throw new RuntimeException(s571.m77251j("Unable to parse data as com.spotify.ads.esperanto.proto.EventResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m77599b(UnmanagedEventRequest unmanagedEventRequest, ibk ibkVar) {
        q9x q9xVar;
        if (ibkVar instanceof q9x) {
            q9xVar = (q9x) ibkVar;
            int i = q9xVar.f186683c;
            if ((i & Integer.MIN_VALUE) != 0) {
                q9xVar.f186683c = i - Integer.MIN_VALUE;
            } else {
                q9xVar = new q9x(this, ibkVar);
            }
        } else {
            q9xVar = new q9x(this, ibkVar);
        }
        Object objCallSingle = q9xVar.f186681a;
        int i2 = q9xVar.f186683c;
        if (i2 == 0) {
            bga.m29073P(objCallSingle);
            q9xVar.f186683c = 1;
            objCallSingle = callSingle("spotify.ads.esperanto.proto.Events", "postUnmanagedEvent", unmanagedEventRequest, q9xVar);
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
