package p204p;

import com.spotify.libraryimportservice.tmm.GetTransferResultsBannerResponse;
import java.io.IOException;
import java.util.concurrent.CancellationException;
import retrofit2.HttpException;

/* JADX INFO: loaded from: classes7.dex */
public final class y980 {

    /* JADX INFO: renamed from: a */
    public final vmz f270528a;

    /* JADX INFO: renamed from: b */
    public final q980 f270529b;

    /* JADX INFO: renamed from: c */
    public volatile Long f270530c;

    /* JADX INFO: renamed from: d */
    public volatile u980 f270531d;

    public y980(vmz vmzVar, q980 q980Var) {
        this.f270528a = vmzVar;
        this.f270529b = q980Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: a */
    public static final Object m93149a(y980 y980Var, ibk ibkVar) {
        w980 w980Var;
        t980 t980Var = t980.f218212a;
        if (ibkVar instanceof w980) {
            w980Var = (w980) ibkVar;
            int i = w980Var.f249114c;
            if ((i & Integer.MIN_VALUE) != 0) {
                w980Var.f249114c = i - Integer.MIN_VALUE;
            } else {
                w980Var = new w980(y980Var, ibkVar);
            }
        } else {
            w980Var = new w980(y980Var, ibkVar);
        }
        Object objM72356a = w980Var.f249112a;
        yuk yukVar = yuk.f276404a;
        int i2 = w980Var.f249114c;
        try {
            try {
                if (i2 == 0) {
                    bga.m29073P(objM72356a);
                    q980 q980Var = y980Var.f270529b;
                    w980Var.f249114c = 1;
                    objM72356a = q980Var.m72356a(w980Var);
                    if (objM72356a == yukVar) {
                        return yukVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(objM72356a);
                }
                v980 v980VarM63616e = n3h1.m63616e((GetTransferResultsBannerResponse) objM72356a);
                if (!v980VarM63616e.equals(y980Var.f270531d)) {
                    y980Var.f270531d = null;
                    return v980VarM63616e;
                }
            } catch (IOException | HttpException unused) {
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            na6.m63972t("Unexpected error fetching library import match result banner", e2);
        }
        return t980Var;
    }
}
