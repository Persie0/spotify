package p204p;

import android.content.Intent;
import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.core.Completable;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class x23 implements wbq0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f257343a = 1;

    /* JADX INFO: renamed from: b */
    public final yz80 f257344b;

    /* JADX INFO: renamed from: c */
    public final Object f257345c;

    /* JADX INFO: renamed from: d */
    public final Object f257346d;

    public x23(Intent intent, String str, yz80 yz80Var) {
        this.f257345c = str;
        this.f257344b = yz80Var;
        Set set = dd41.f47702f;
        bd41 bd41VarM35719q = r46.m74726U(intent.getDataString()).m35719q();
        Object pqm0Var = null;
        if (bd41VarM35719q != null) {
            String str2 = bd41VarM35719q.f26010a;
            String str3 = bd41VarM35719q.f26011b;
            pqm0Var = new pqm0(str2, str3 != null ? gva.m45890l(str3) : null);
        }
        this.f257346d = pqm0Var;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0020  */
    @Override // p204p.wbq0
    /* JADX INFO: renamed from: a */
    public final Object mo31808a(fbk fbkVar) {
        n221 n221Var;
        Object c6x0Var;
        switch (this.f257343a) {
            case 0:
                Object objM96565n = zn91.m96565n((Completable) this.f257346d, fbkVar);
                return objM96565n == yuk.f276404a ? objM96565n : w2a1.f247311a;
            default:
                String str = (String) this.f257345c;
                pqm0 pqm0Var = (pqm0) this.f257346d;
                if (fbkVar instanceof n221) {
                    n221Var = (n221) fbkVar;
                    int i = n221Var.f149610c;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        n221Var.f149610c = i - Integer.MIN_VALUE;
                    } else {
                        n221Var = new n221(this, (ibk) fbkVar);
                    }
                } else {
                    n221Var = new n221(this, (ibk) fbkVar);
                }
                Object objM63324u = n221Var.f149608a;
                int i2 = n221Var.f149610c;
                w2a1 w2a1Var = w2a1.f247311a;
                try {
                    if (i2 == 0) {
                        bga.m29073P(objM63324u);
                        if (pqm0Var == null) {
                            return w2a1Var;
                        }
                        yz80 yz80Var = this.f257344b;
                        List listSingletonList = Collections.singletonList(new rz80((String) pqm0Var.f180350a, (gva) pqm0Var.f180351b, (gva) null, 4));
                        n221Var.f149610c = 1;
                        objM63324u = ((n090) yz80Var).m63324u(str, listSingletonList, lau.f131415a, n221Var);
                        yuk yukVar = yuk.f276404a;
                        if (objM63324u == yukVar) {
                            return yukVar;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bga.m29073P(objM63324u);
                    }
                    ((p2x0) objM63324u).m68971d();
                    c6x0Var = w2a1Var;
                } catch (Throwable th) {
                    c6x0Var = new c6x0(th);
                }
                Throwable thM77348a = s6x0.m77348a(c6x0Var);
                if (thM77348a == null) {
                    return w2a1Var;
                }
                Logger.m3967c(thM77348a, "SignalingPreLoader: Failed to send signal " + pqm0Var.f180350a + " for " + str, new Object[0]);
                return w2a1Var;
        }
    }

    public x23(String str, qwx0 qwx0Var, yz80 yz80Var, luv0 luv0Var) {
        this.f257344b = yz80Var;
        this.f257345c = luv0Var;
        this.f257346d = ((rwx0) qwx0Var).f203428a.distinctUntilChanged().take(1L).flatMapCompletable(new fw40(14, this, str));
    }
}
