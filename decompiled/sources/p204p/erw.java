package p204p;

import com.spotify.base.java.logging.Logger;
import com.spotify.player.model.command.SkipToPrevTrackCommand;
import io.reactivex.rxjava3.core.Single;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes9.dex */
public final class erw implements wh00 {

    /* JADX INFO: renamed from: a */
    public final hrw f62212a;

    public /* synthetic */ erw(hrw hrwVar) {
        this.f62212a = hrwVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public Object m39835a(ibk ibkVar) {
        w8x0 w8x0Var;
        if (ibkVar instanceof w8x0) {
            w8x0Var = (w8x0) ibkVar;
            int i = w8x0Var.f249033c;
            if ((i & Integer.MIN_VALUE) != 0) {
                w8x0Var.f249033c = i - Integer.MIN_VALUE;
            } else {
                w8x0Var = new w8x0(this, ibkVar);
            }
        } else {
            w8x0Var = new w8x0(this, ibkVar);
        }
        Object objM96567o = w8x0Var.f249031a;
        int i2 = w8x0Var.f249033c;
        try {
            if (i2 == 0) {
                bga.m29073P(objM96567o);
                Single singleMo48412a = this.f62212a.mo48412a(new x7p0("listening-activity", false));
                w8x0Var.f249033c = 1;
                objM96567o = zn91.m96567o(singleMo48412a, w8x0Var);
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
            Logger.m3966b("ResumeHandler", edb.m38564m("Resume failed: ", th.getMessage()));
        }
        return w2a1.f247311a;
    }

    @Override // p204p.wh00, io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        SkipToPrevTrackCommand skipToPrevTrackCommand = ((f8p0) obj).f67028a;
        hrw hrwVar = this.f62212a;
        return hrwVar.m48413b(new xcw(7, skipToPrevTrackCommand, hrwVar)).flatMap(new brw(hrwVar, 1));
    }
}
