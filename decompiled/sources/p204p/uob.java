package p204p;

import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.core.Completable;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes10.dex */
public final class uob {

    /* JADX INFO: renamed from: a */
    public final y3l0 f232371a;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public Object m83608a(hhl0 hhl0Var, ibk ibkVar) {
        tob tobVar;
        if (ibkVar instanceof tob) {
            tobVar = (tob) ibkVar;
            int i = tobVar.f222219d;
            if ((i & Integer.MIN_VALUE) != 0) {
                tobVar.f222219d = i - Integer.MIN_VALUE;
            } else {
                tobVar = new tob(this, ibkVar);
            }
        } else {
            tobVar = new tob(this, ibkVar);
        }
        Object obj = tobVar.f222217b;
        int i2 = tobVar.f222219d;
        cjl0 cjl0Var = cjl0.f38616a;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                hhl0 hhl0Var2 = tobVar.f222216a;
                bga.m29073P(obj);
                return cjl0Var;
            }
            bga.m29073P(obj);
            Completable completableM92768c = this.f232371a.m92768c(hhl0Var.f91414a, hhl0Var.f91415b);
            tobVar.f222216a = hhl0Var;
            tobVar.f222219d = 1;
            Object objM96565n = zn91.m96565n(completableM92768c, tobVar);
            yuk yukVar = yuk.f276404a;
            return objM96565n == yukVar ? yukVar : cjl0Var;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            Logger.m3966b(edb.m38564m("Cancel download failed for: ", hhl0Var.f91414a), e2);
            return cjl0Var;
        }
    }
}
