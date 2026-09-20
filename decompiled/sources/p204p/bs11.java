package p204p;

import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.core.Single;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class bs11 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ epx f30213a;

    public bs11(epx epxVar) {
        this.f30213a = epxVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m30341a(String str, ibk ibkVar) {
        as11 as11Var;
        u140 u140Var;
        if (ibkVar instanceof as11) {
            as11Var = (as11) ibkVar;
            int i = as11Var.f19280d;
            if ((i & Integer.MIN_VALUE) != 0) {
                as11Var.f19280d = i - Integer.MIN_VALUE;
            } else {
                as11Var = new as11(this, ibkVar);
            }
        } else {
            as11Var = new as11(this, ibkVar);
        }
        Object objM96567o = as11Var.f19278b;
        int i2 = as11Var.f19280d;
        try {
            if (i2 == 0) {
                bga.m29073P(objM96567o);
                Single singleFirstOrError = ((jpx) this.f30213a).m53978b(new C1668ai("cn-context-player", new zpz0(str, 18))).timeout(3L, TimeUnit.SECONDS).firstOrError();
                as11Var.f19277a = str;
                as11Var.f19280d = 1;
                objM96567o = zn91.m96567o(singleFirstOrError, as11Var);
                yuk yukVar = yuk.f276404a;
                if (objM96567o == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = as11Var.f19277a;
                bga.m29073P(objM96567o);
            }
            v140 v140Var = (v140) ((gqx) objM96567o).mo45449a(v140.class, str).f72301b;
            if (v140Var == null || (u140Var = v140Var.f236247e) == null) {
                return null;
            }
            return u140Var.f225679b;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            Logger.m3966b("ShowUriResolver", th, edb.m38564m("Failed to resolve show URI for episode=", str));
            return null;
        }
    }
}
