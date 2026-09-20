package p204p;

import com.spotify.esperanto.esperanto.CoroutineClientBase;
import p196j$.util.Base64;
import spotify.your_library.esperanto.proto.TransferProgressRequest;
import spotify.your_library.esperanto.proto.YourLibraryContainsRequest;
import spotify.your_library.esperanto.proto.YourLibraryContainsResponse;
import spotify.your_library.esperanto.proto.YourLibraryDecorateRequest;
import spotify.your_library.esperanto.proto.YourLibraryRequest;
import spotify.your_library.esperanto.proto.YourLibraryResponse;

/* JADX INFO: loaded from: classes2.dex */
public final class zre1 extends CoroutineClientBase {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m96760a(YourLibraryRequest yourLibraryRequest, ibk ibkVar) {
        ure1 ure1Var;
        if (ibkVar instanceof ure1) {
            ure1Var = (ure1) ibkVar;
            int i = ure1Var.f233344c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ure1Var.f233344c = i - Integer.MIN_VALUE;
            } else {
                ure1Var = new ure1(this, ibkVar);
            }
        } else {
            ure1Var = new ure1(this, ibkVar);
        }
        Object objCallSingle = ure1Var.f233342a;
        int i2 = ure1Var.f233344c;
        if (i2 == 0) {
            bga.m29073P(objCallSingle);
            ure1Var.f233344c = 1;
            objCallSingle = callSingle("spotify.your_library_esperanto.proto.YourLibraryService", "All", yourLibraryRequest, ure1Var);
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
            return YourLibraryResponse.m98194s(bArr);
        } catch (Exception e) {
            throw new RuntimeException(s571.m77251j("Unable to parse data as spotify.your_library.esperanto.proto.YourLibraryResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m96761b(YourLibraryContainsRequest yourLibraryContainsRequest, ibk ibkVar) {
        vre1 vre1Var;
        if (ibkVar instanceof vre1) {
            vre1Var = (vre1) ibkVar;
            int i = vre1Var.f244198c;
            if ((i & Integer.MIN_VALUE) != 0) {
                vre1Var.f244198c = i - Integer.MIN_VALUE;
            } else {
                vre1Var = new vre1(this, ibkVar);
            }
        } else {
            vre1Var = new vre1(this, ibkVar);
        }
        Object objCallSingle = vre1Var.f244196a;
        int i2 = vre1Var.f244198c;
        if (i2 == 0) {
            bga.m29073P(objCallSingle);
            vre1Var.f244198c = 1;
            objCallSingle = callSingle("spotify.your_library_esperanto.proto.YourLibraryService", "Contains", yourLibraryContainsRequest, vre1Var);
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
            return YourLibraryContainsResponse.m98152q(bArr);
        } catch (Exception e) {
            throw new RuntimeException(s571.m77251j("Unable to parse data as spotify.your_library.esperanto.proto.YourLibraryContainsResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
        }
    }

    /* JADX INFO: renamed from: c */
    public final std1 m96762c(YourLibraryRequest yourLibraryRequest) {
        return new std1(callStream("spotify.your_library_esperanto.proto.YourLibraryService", "StreamAll", yourLibraryRequest), 7);
    }

    /* JADX INFO: renamed from: d */
    public final std1 m96763d(YourLibraryDecorateRequest yourLibraryDecorateRequest) {
        return new std1(callStream("spotify.your_library_esperanto.proto.YourLibraryService", "StreamDecorate", yourLibraryDecorateRequest), 8);
    }

    /* JADX INFO: renamed from: e */
    public final std1 m96764e(TransferProgressRequest transferProgressRequest) {
        return new std1(callStream("spotify.your_library_esperanto.proto.YourLibraryService", "StreamTransferProgress", transferProgressRequest), 9);
    }
}
