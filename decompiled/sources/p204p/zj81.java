package p204p;

import com.google.protobuf.Any;
import io.reactivex.rxjava3.functions.Function;
import java.util.Collections;
import spotify.mdata.proto.Mdata$LocalBatchedExtensionResponse;

/* JADX INFO: loaded from: classes10.dex */
public final class zj81 implements Function {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ak81 f283393a;

    public zj81(ak81 ak81Var) {
        this.f283393a = ak81Var;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public final Object mo98394apply(Object obj) {
        Mdata$LocalBatchedExtensionResponse.EntityExtension entityExtension;
        byte[] bArrM45891s;
        gva gvaVarM1913r;
        Mdata$LocalBatchedExtensionResponse.Extension extension = (Mdata$LocalBatchedExtensionResponse.Extension) g6f.m43745s0(((Mdata$LocalBatchedExtensionResponse) obj).getExtensionList());
        ntx extensionKind = extension != null ? extension.getExtensionKind() : null;
        ntx ntxVar = ntx.ORIGINAL_VIDEO;
        lau lauVar = lau.f131415a;
        if (extensionKind != ntxVar) {
            return new hwl0(lauVar);
        }
        ae50 ae50VarM97632n = extension.m97632n();
        if (ae50VarM97632n == null || (entityExtension = (Mdata$LocalBatchedExtensionResponse.EntityExtension) g6f.m43745s0(ae50VarM97632n)) == null) {
            return new hwl0(lauVar);
        }
        int number = ntxVar.getNumber();
        Any anyM97630o = entityExtension.m97630o();
        if (anyM97630o == null || (gvaVarM1913r = anyM97630o.m1913r()) == null || (bArrM45891s = gvaVarM1913r.m45891s()) == null) {
            bArrM45891s = new byte[0];
        }
        hwl0 hwl0Var = (hwl0) this.f283393a.f16461b.m91727a(Collections.singletonList(new ptx(bArrM45891s, number))).mo30169a(hwl0.class);
        return hwl0Var == null ? new hwl0(lauVar) : hwl0Var;
    }
}
