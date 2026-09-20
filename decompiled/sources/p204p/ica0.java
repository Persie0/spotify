package p204p;

import com.google.protobuf.Empty;
import com.spotify.esperanto.esperanto.CoroutineClientBase;
import com.spotify.local_files_esperanto.proto.EsLocalFiles$DefaultSource;
import com.spotify.local_files_esperanto.proto.EsLocalFiles$Folder;
import com.spotify.local_files_esperanto.proto.EsLocalFiles$GetLocalFilePathRequest;
import com.spotify.local_files_esperanto.proto.EsLocalFiles$GetLocalFilePathResponse;
import com.spotify.local_files_esperanto.proto.EsLocalFiles$GetSourcesResponse;
import com.spotify.local_files_esperanto.proto.EsLocalFiles$MutateSourceResponse;
import p196j$.util.Base64;

/* JADX INFO: loaded from: classes2.dex */
public final class ica0 extends CoroutineClientBase implements aca0 {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m50243a(EsLocalFiles$GetLocalFilePathRequest esLocalFiles$GetLocalFilePathRequest, ibk ibkVar) {
        bca0 bca0Var;
        if (ibkVar instanceof bca0) {
            bca0Var = (bca0) ibkVar;
            int i = bca0Var.f25816c;
            if ((i & Integer.MIN_VALUE) != 0) {
                bca0Var.f25816c = i - Integer.MIN_VALUE;
            } else {
                bca0Var = new bca0(this, ibkVar);
            }
        } else {
            bca0Var = new bca0(this, ibkVar);
        }
        Object objCallSingle = bca0Var.f25814a;
        int i2 = bca0Var.f25816c;
        if (i2 == 0) {
            bga.m29073P(objCallSingle);
            bca0Var.f25816c = 1;
            objCallSingle = callSingle("spotify.local_files_esperanto.proto.LocalFiles", "GetLocalFilePath", esLocalFiles$GetLocalFilePathRequest, bca0Var);
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
            return EsLocalFiles$GetLocalFilePathResponse.m13147o(bArr);
        } catch (Exception e) {
            throw new RuntimeException(s571.m77251j("Unable to parse data as com.spotify.local_files_esperanto.proto.EsLocalFiles.GetLocalFilePathResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m50244b(Empty empty, ibk ibkVar) {
        cca0 cca0Var;
        if (ibkVar instanceof cca0) {
            cca0Var = (cca0) ibkVar;
            int i = cca0Var.f36365c;
            if ((i & Integer.MIN_VALUE) != 0) {
                cca0Var.f36365c = i - Integer.MIN_VALUE;
            } else {
                cca0Var = new cca0(this, ibkVar);
            }
        } else {
            cca0Var = new cca0(this, ibkVar);
        }
        Object objCallSingle = cca0Var.f36363a;
        int i2 = cca0Var.f36365c;
        if (i2 == 0) {
            bga.m29073P(objCallSingle);
            cca0Var.f36365c = 1;
            objCallSingle = callSingle("spotify.local_files_esperanto.proto.LocalFiles", "GetSources", empty, cca0Var);
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
            return EsLocalFiles$GetSourcesResponse.m13149p(bArr);
        } catch (Exception e) {
            throw new RuntimeException(s571.m77251j("Unable to parse data as com.spotify.local_files_esperanto.proto.EsLocalFiles.GetSourcesResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m50245c(EsLocalFiles$DefaultSource esLocalFiles$DefaultSource, ibk ibkVar) {
        dca0 dca0Var;
        if (ibkVar instanceof dca0) {
            dca0Var = (dca0) ibkVar;
            int i = dca0Var.f47480c;
            if ((i & Integer.MIN_VALUE) != 0) {
                dca0Var.f47480c = i - Integer.MIN_VALUE;
            } else {
                dca0Var = new dca0(this, ibkVar);
            }
        } else {
            dca0Var = new dca0(this, ibkVar);
        }
        Object objCallSingle = dca0Var.f47478a;
        int i2 = dca0Var.f47480c;
        if (i2 == 0) {
            bga.m29073P(objCallSingle);
            dca0Var.f47480c = 1;
            objCallSingle = callSingle("spotify.local_files_esperanto.proto.LocalFiles", "MutateDefaultSource", esLocalFiles$DefaultSource, dca0Var);
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
            return EsLocalFiles$MutateSourceResponse.m13158n(bArr);
        } catch (Exception e) {
            throw new RuntimeException(s571.m77251j("Unable to parse data as com.spotify.local_files_esperanto.proto.EsLocalFiles.MutateSourceResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public final Object m50246d(Empty empty, ibk ibkVar) {
        eca0 eca0Var;
        if (ibkVar instanceof eca0) {
            eca0Var = (eca0) ibkVar;
            int i = eca0Var.f58281c;
            if ((i & Integer.MIN_VALUE) != 0) {
                eca0Var.f58281c = i - Integer.MIN_VALUE;
            } else {
                eca0Var = new eca0(this, ibkVar);
            }
        } else {
            eca0Var = new eca0(this, ibkVar);
        }
        Object objCallSingle = eca0Var.f58279a;
        int i2 = eca0Var.f58281c;
        if (i2 == 0) {
            bga.m29073P(objCallSingle);
            eca0Var.f58281c = 1;
            objCallSingle = callSingle("spotify.local_files_esperanto.proto.LocalFiles", "NotifyDefaultSources", empty, eca0Var);
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
    /* JADX INFO: renamed from: e */
    public final Object m50247e(EsLocalFiles$Folder esLocalFiles$Folder, ibk ibkVar) {
        fca0 fca0Var;
        if (ibkVar instanceof fca0) {
            fca0Var = (fca0) ibkVar;
            int i = fca0Var.f68045c;
            if ((i & Integer.MIN_VALUE) != 0) {
                fca0Var.f68045c = i - Integer.MIN_VALUE;
            } else {
                fca0Var = new fca0(this, ibkVar);
            }
        } else {
            fca0Var = new fca0(this, ibkVar);
        }
        Object objCallSingle = fca0Var.f68043a;
        int i2 = fca0Var.f68045c;
        if (i2 == 0) {
            bga.m29073P(objCallSingle);
            fca0Var.f68045c = 1;
            objCallSingle = callSingle("spotify.local_files_esperanto.proto.LocalFiles", "RemoveFolder", esLocalFiles$Folder, fca0Var);
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
            return EsLocalFiles$MutateSourceResponse.m13158n(bArr);
        } catch (Exception e) {
            throw new RuntimeException(s571.m77251j("Unable to parse data as com.spotify.local_files_esperanto.proto.EsLocalFiles.MutateSourceResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
        }
    }
}
