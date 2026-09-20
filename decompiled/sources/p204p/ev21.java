package p204p;

import com.google.protobuf.Empty;
import com.spotify.ads.esperanto.proto.ClearSlotRequest;
import com.spotify.ads.esperanto.proto.CreateSlotRequest;
import com.spotify.ads.esperanto.proto.CreateSlotResponse;
import com.spotify.ads.esperanto.proto.PrepareSlotRequest;
import com.spotify.ads.esperanto.proto.PrepareSlotResponse;
import com.spotify.ads.esperanto.proto.TriggerSlotRequest;
import com.spotify.ads.esperanto.proto.TriggerSlotResponse;
import com.spotify.esperanto.esperanto.CoroutineClientBase;
import p196j$.util.Base64;

/* JADX INFO: loaded from: classes.dex */
public final class ev21 extends CoroutineClientBase {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m40081a(ClearSlotRequest clearSlotRequest, ibk ibkVar) {
        yu21 yu21Var;
        if (ibkVar instanceof yu21) {
            yu21Var = (yu21) ibkVar;
            int i = yu21Var.f276267c;
            if ((i & Integer.MIN_VALUE) != 0) {
                yu21Var.f276267c = i - Integer.MIN_VALUE;
            } else {
                yu21Var = new yu21(this, ibkVar);
            }
        } else {
            yu21Var = new yu21(this, ibkVar);
        }
        Object objCallSingle = yu21Var.f276265a;
        int i2 = yu21Var.f276267c;
        if (i2 == 0) {
            bga.m29073P(objCallSingle);
            yu21Var.f276267c = 1;
            objCallSingle = callSingle("spotify.ads.esperanto.proto.Slots", "ClearAllAds", clearSlotRequest, yu21Var);
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
    public final Object m40082b(ClearSlotRequest clearSlotRequest, ibk ibkVar) {
        zu21 zu21Var;
        if (ibkVar instanceof zu21) {
            zu21Var = (zu21) ibkVar;
            int i = zu21Var.f286332c;
            if ((i & Integer.MIN_VALUE) != 0) {
                zu21Var.f286332c = i - Integer.MIN_VALUE;
            } else {
                zu21Var = new zu21(this, ibkVar);
            }
        } else {
            zu21Var = new zu21(this, ibkVar);
        }
        Object objCallSingle = zu21Var.f286330a;
        int i2 = zu21Var.f286332c;
        if (i2 == 0) {
            bga.m29073P(objCallSingle);
            zu21Var.f286332c = 1;
            objCallSingle = callSingle("spotify.ads.esperanto.proto.Slots", "ClearAvailableAds", clearSlotRequest, zu21Var);
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
    public final Object m40083c(CreateSlotRequest createSlotRequest, ibk ibkVar) {
        av21 av21Var;
        if (ibkVar instanceof av21) {
            av21Var = (av21) ibkVar;
            int i = av21Var.f20078c;
            if ((i & Integer.MIN_VALUE) != 0) {
                av21Var.f20078c = i - Integer.MIN_VALUE;
            } else {
                av21Var = new av21(this, ibkVar);
            }
        } else {
            av21Var = new av21(this, ibkVar);
        }
        Object objCallSingle = av21Var.f20076a;
        int i2 = av21Var.f20078c;
        if (i2 == 0) {
            bga.m29073P(objCallSingle);
            av21Var.f20078c = 1;
            objCallSingle = callSingle("spotify.ads.esperanto.proto.Slots", "CreateSlot", createSlotRequest, av21Var);
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
            return CreateSlotResponse.m2638q(bArr);
        } catch (Exception e) {
            throw new RuntimeException(s571.m77251j("Unable to parse data as com.spotify.ads.esperanto.proto.CreateSlotResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public final Object m40084d(PrepareSlotRequest prepareSlotRequest, ibk ibkVar) {
        bv21 bv21Var;
        if (ibkVar instanceof bv21) {
            bv21Var = (bv21) ibkVar;
            int i = bv21Var.f31262c;
            if ((i & Integer.MIN_VALUE) != 0) {
                bv21Var.f31262c = i - Integer.MIN_VALUE;
            } else {
                bv21Var = new bv21(this, ibkVar);
            }
        } else {
            bv21Var = new bv21(this, ibkVar);
        }
        Object objCallSingle = bv21Var.f31260a;
        int i2 = bv21Var.f31262c;
        if (i2 == 0) {
            bga.m29073P(objCallSingle);
            bv21Var.f31262c = 1;
            objCallSingle = callSingle("spotify.ads.esperanto.proto.Slots", "FetchSlot", prepareSlotRequest, bv21Var);
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
            return PrepareSlotResponse.m2680p(bArr);
        } catch (Exception e) {
            throw new RuntimeException(s571.m77251j("Unable to parse data as com.spotify.ads.esperanto.proto.PrepareSlotResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    public final Object m40085e(TriggerSlotRequest triggerSlotRequest, ibk ibkVar) {
        dv21 dv21Var;
        if (ibkVar instanceof dv21) {
            dv21Var = (dv21) ibkVar;
            int i = dv21Var.f53347c;
            if ((i & Integer.MIN_VALUE) != 0) {
                dv21Var.f53347c = i - Integer.MIN_VALUE;
            } else {
                dv21Var = new dv21(this, ibkVar);
            }
        } else {
            dv21Var = new dv21(this, ibkVar);
        }
        Object objCallSingle = dv21Var.f53345a;
        int i2 = dv21Var.f53347c;
        if (i2 == 0) {
            bga.m29073P(objCallSingle);
            dv21Var.f53347c = 1;
            objCallSingle = callSingle("spotify.ads.esperanto.proto.Slots", "TriggerSlot", triggerSlotRequest, dv21Var);
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
            return TriggerSlotResponse.m2733p(bArr);
        } catch (Exception e) {
            throw new RuntimeException(s571.m77251j("Unable to parse data as com.spotify.ads.esperanto.proto.TriggerSlotResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
        }
    }
}
