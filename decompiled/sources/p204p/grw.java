package p204p;

import com.spotify.base.java.logging.Logger;
import com.spotify.player.esperanto.proto.EsPlayAsNextInQueueRequest$PlayAsNextInQueueRequest;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes9.dex */
public final class grw implements Function {

    /* JADX INFO: renamed from: a */
    public final hrw f83842a;

    public /* synthetic */ grw(hrw hrwVar) {
        this.f83842a = hrwVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public Object m45588a(ibk ibkVar) {
        bdn0 bdn0Var;
        if (ibkVar instanceof bdn0) {
            bdn0Var = (bdn0) ibkVar;
            int i = bdn0Var.f26187c;
            if ((i & Integer.MIN_VALUE) != 0) {
                bdn0Var.f26187c = i - Integer.MIN_VALUE;
            } else {
                bdn0Var = new bdn0(this, ibkVar);
            }
        } else {
            bdn0Var = new bdn0(this, ibkVar);
        }
        Object objM96567o = bdn0Var.f26185a;
        int i2 = bdn0Var.f26187c;
        try {
            if (i2 == 0) {
                bga.m29073P(objM96567o);
                Single singleMo48412a = this.f83842a.mo48412a(new u7p0("listening-activity", false));
                bdn0Var.f26187c = 1;
                objM96567o = zn91.m96567o(singleMo48412a, bdn0Var);
                yuk yukVar = yuk.f276404a;
                if (objM96567o == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM96567o);
            }
            wj50.m88279p(objM96567o);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            Logger.m3966b("PauseHandler", edb.m38564m("Pause failed: ", th.getMessage()));
        }
        return w2a1.f247311a;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        EsPlayAsNextInQueueRequest$PlayAsNextInQueueRequest esPlayAsNextInQueueRequest$PlayAsNextInQueueRequest = (EsPlayAsNextInQueueRequest$PlayAsNextInQueueRequest) obj;
        r7k r7kVar = this.f83842a.f94545a;
        wj50.m88279p(esPlayAsNextInQueueRequest$PlayAsNextInQueueRequest);
        return r7kVar.callSingle("spotify.player.esperanto.proto.ContextPlayer", "PlayAsNextInQueue", esPlayAsNextInQueueRequest$PlayAsNextInQueueRequest).map(use.f233594Q0).map(l6q.f130450Z0);
    }
}
