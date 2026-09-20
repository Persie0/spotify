package p204p;

import com.google.protobuf.BytesValue;
import com.google.protobuf.Empty;
import com.spotify.connect.discovery.cast.esperanto.proto.CastMessages$ConnectionErrorRequest;
import com.spotify.connect.discovery.cast.esperanto.proto.CastMessages$DeviceId;
import com.spotify.connect.discovery.cast.esperanto.proto.CastMessages$PutDeviceRequest;
import com.spotify.connect.discovery.cast.esperanto.proto.CastMessages$Response;
import com.spotify.esperanto.esperanto.CoroutineClientBase;
import p196j$.util.Base64;

/* JADX INFO: loaded from: classes.dex */
public final class nbc extends CoroutineClientBase {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m64068a(CastMessages$DeviceId castMessages$DeviceId, ibk ibkVar) {
        fbc fbcVar;
        if (ibkVar instanceof fbc) {
            fbcVar = (fbc) ibkVar;
            int i = fbcVar.f67782c;
            if ((i & Integer.MIN_VALUE) != 0) {
                fbcVar.f67782c = i - Integer.MIN_VALUE;
            } else {
                fbcVar = new fbc(this, ibkVar);
            }
        } else {
            fbcVar = new fbc(this, ibkVar);
        }
        Object objCallSingle = fbcVar.f67780a;
        int i2 = fbcVar.f67782c;
        if (i2 == 0) {
            bga.m29073P(objCallSingle);
            fbcVar.f67782c = 1;
            objCallSingle = callSingle("spotify.connect.discovery.cast.esperanto.proto.CastService", "Connect", castMessages$DeviceId, fbcVar);
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
            return CastMessages$Response.m7296o(bArr);
        } catch (Exception e) {
            throw new RuntimeException(s571.m77251j("Unable to parse data as com.spotify.connect.discovery.cast.esperanto.proto.CastMessages.Response: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m64069b(CastMessages$ConnectionErrorRequest castMessages$ConnectionErrorRequest, ibk ibkVar) {
        gbc gbcVar;
        if (ibkVar instanceof gbc) {
            gbcVar = (gbc) ibkVar;
            int i = gbcVar.f78263c;
            if ((i & Integer.MIN_VALUE) != 0) {
                gbcVar.f78263c = i - Integer.MIN_VALUE;
            } else {
                gbcVar = new gbc(this, ibkVar);
            }
        } else {
            gbcVar = new gbc(this, ibkVar);
        }
        Object objCallSingle = gbcVar.f78261a;
        int i2 = gbcVar.f78263c;
        if (i2 == 0) {
            bga.m29073P(objCallSingle);
            gbcVar.f78263c = 1;
            objCallSingle = callSingle("spotify.connect.discovery.cast.esperanto.proto.CastService", "ConnectionError", castMessages$ConnectionErrorRequest, gbcVar);
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
    public final Object m64070c(CastMessages$DeviceId castMessages$DeviceId, ibk ibkVar) {
        hbc hbcVar;
        if (ibkVar instanceof hbc) {
            hbcVar = (hbc) ibkVar;
            int i = hbcVar.f89476c;
            if ((i & Integer.MIN_VALUE) != 0) {
                hbcVar.f89476c = i - Integer.MIN_VALUE;
            } else {
                hbcVar = new hbc(this, ibkVar);
            }
        } else {
            hbcVar = new hbc(this, ibkVar);
        }
        Object objCallSingle = hbcVar.f89474a;
        int i2 = hbcVar.f89476c;
        if (i2 == 0) {
            bga.m29073P(objCallSingle);
            hbcVar.f89476c = 1;
            objCallSingle = callSingle("spotify.connect.discovery.cast.esperanto.proto.CastService", "DeleteDevice", castMessages$DeviceId, hbcVar);
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
            return CastMessages$Response.m7296o(bArr);
        } catch (Exception e) {
            throw new RuntimeException(s571.m77251j("Unable to parse data as com.spotify.connect.discovery.cast.esperanto.proto.CastMessages.Response: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public final Object m64071d(CastMessages$PutDeviceRequest castMessages$PutDeviceRequest, ibk ibkVar) {
        jbc jbcVar;
        if (ibkVar instanceof jbc) {
            jbcVar = (jbc) ibkVar;
            int i = jbcVar.f110730c;
            if ((i & Integer.MIN_VALUE) != 0) {
                jbcVar.f110730c = i - Integer.MIN_VALUE;
            } else {
                jbcVar = new jbc(this, ibkVar);
            }
        } else {
            jbcVar = new jbc(this, ibkVar);
        }
        Object objCallSingle = jbcVar.f110728a;
        int i2 = jbcVar.f110730c;
        if (i2 == 0) {
            bga.m29073P(objCallSingle);
            jbcVar.f110730c = 1;
            objCallSingle = callSingle("spotify.connect.discovery.cast.esperanto.proto.CastService", "PutDevice", castMessages$PutDeviceRequest, jbcVar);
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
            return CastMessages$Response.m7296o(bArr);
        } catch (Exception e) {
            throw new RuntimeException(s571.m77251j("Unable to parse data as com.spotify.connect.discovery.cast.esperanto.proto.CastMessages.Response: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    public final Object m64072e(BytesValue bytesValue, ibk ibkVar) {
        kbc kbcVar;
        if (ibkVar instanceof kbc) {
            kbcVar = (kbc) ibkVar;
            int i = kbcVar.f121174c;
            if ((i & Integer.MIN_VALUE) != 0) {
                kbcVar.f121174c = i - Integer.MIN_VALUE;
            } else {
                kbcVar = new kbc(this, ibkVar);
            }
        } else {
            kbcVar = new kbc(this, ibkVar);
        }
        Object objCallSingle = kbcVar.f121172a;
        int i2 = kbcVar.f121174c;
        if (i2 == 0) {
            bga.m29073P(objCallSingle);
            kbcVar.f121174c = 1;
            objCallSingle = callSingle("spotify.connect.discovery.cast.esperanto.proto.CastService", "PutMessage", bytesValue, kbcVar);
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
            return CastMessages$Response.m7296o(bArr);
        } catch (Exception e) {
            throw new RuntimeException(s571.m77251j("Unable to parse data as com.spotify.connect.discovery.cast.esperanto.proto.CastMessages.Response: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
        }
    }
}
