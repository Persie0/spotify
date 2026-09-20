package p204p;

import com.google.protobuf.Empty;
import com.spotify.ads.esperanto.proto.CapabilityRequest;
import com.spotify.esperanto.esperanto.CoroutineClientBase;
import p196j$.util.Base64;

/* JADX INFO: loaded from: classes.dex */
public final class jtb extends CoroutineClientBase {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m54280a(CapabilityRequest capabilityRequest, ibk ibkVar) {
        htb htbVar;
        if (ibkVar instanceof htb) {
            htbVar = (htb) ibkVar;
            int i = htbVar.f94973c;
            if ((i & Integer.MIN_VALUE) != 0) {
                htbVar.f94973c = i - Integer.MIN_VALUE;
            } else {
                htbVar = new htb(this, ibkVar);
            }
        } else {
            htbVar = new htb(this, ibkVar);
        }
        Object objCallSingle = htbVar.f94971a;
        int i2 = htbVar.f94973c;
        if (i2 == 0) {
            bga.m29073P(objCallSingle);
            htbVar.f94973c = 1;
            objCallSingle = callSingle("spotify.ads.esperanto.proto.Capabilities", "addCapability", capabilityRequest, htbVar);
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
    public final Object m54281b(CapabilityRequest capabilityRequest, ibk ibkVar) {
        itb itbVar;
        if (ibkVar instanceof itb) {
            itbVar = (itb) ibkVar;
            int i = itbVar.f105497c;
            if ((i & Integer.MIN_VALUE) != 0) {
                itbVar.f105497c = i - Integer.MIN_VALUE;
            } else {
                itbVar = new itb(this, ibkVar);
            }
        } else {
            itbVar = new itb(this, ibkVar);
        }
        Object objCallSingle = itbVar.f105495a;
        int i2 = itbVar.f105497c;
        if (i2 == 0) {
            bga.m29073P(objCallSingle);
            itbVar.f105497c = 1;
            objCallSingle = callSingle("spotify.ads.esperanto.proto.Capabilities", "removeCapability", capabilityRequest, itbVar);
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
