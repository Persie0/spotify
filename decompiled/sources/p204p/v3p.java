package p204p;

import android.content.Context;
import com.spotify.base.java.logging.Logger;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
public final class v3p implements oac {

    /* JADX INFO: renamed from: a */
    public final Context f236917a;

    /* JADX INFO: renamed from: b */
    public final Executor f236918b;

    /* JADX INFO: renamed from: c */
    public final guf f236919c = mlg1.m62210c();

    public v3p(Context context, luk lukVar) {
        this.f236917a = context;
        this.f236918b = z2h1.m95212s(lukVar);
    }

    /* JADX INFO: renamed from: c */
    public static nac m84623c() {
        try {
            return nac.m63980a();
        } catch (Exception e) {
            Logger.m3966b("CastBasic->%s", edb.m38564m("CastContext.getSharedInstance() failed: ", e.getMessage()));
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p204p.oac
    /* JADX INFO: renamed from: a */
    public final Object mo66545a(ibk ibkVar) throws Throwable {
        u3p u3pVar;
        if (ibkVar instanceof u3p) {
            u3pVar = (u3p) ibkVar;
            int i = u3pVar.f226418c;
            if ((i & Integer.MIN_VALUE) != 0) {
                u3pVar.f226418c = i - Integer.MIN_VALUE;
            } else {
                u3pVar = new u3p(this, ibkVar);
            }
        } else {
            u3pVar = new u3p(this, ibkVar);
        }
        Object obj = u3pVar.f226416a;
        int i2 = u3pVar.f226418c;
        guf gufVar = this.f236919c;
        yuk yukVar = yuk.f276404a;
        try {
            if (i2 == 0) {
                bga.m29073P(obj);
                if (!gufVar.mo26606t()) {
                    u3pVar.f226418c = 1;
                    if (m84624d(u3pVar) == yukVar) {
                    }
                }
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(obj);
                return obj;
            }
            bga.m29073P(obj);
            u3pVar.f226418c = 2;
            Object objM38777P = gufVar.m38777P(u3pVar);
            return objM38777P == yukVar ? yukVar : objM38777P;
        } catch (Exception e) {
            Logger.m3966b("CastBasic->%s", edb.m38564m("getSessionManager failed: ", e.getMessage()));
            return null;
        }
    }

    @Override // p204p.oac
    /* JADX INFO: renamed from: b */
    public final int mo66546b(int i) {
        try {
            nac nacVarM84623c = m84623c();
            if (nacVarM84623c == null) {
                return -1;
            }
            it9 it9Var = nacVarM84623c.f152040k;
            if (it9Var != null) {
                return it9Var.m51625p(i);
            }
            nac.f152027l.m83850c("castReasonCodes hasn't been initialized yet", new Object[0]);
            return 0;
        } catch (Exception e) {
            Logger.m3966b("CastBasic->%s", edb.m38564m("getCastReasonCodeForCastStatusCode failed: ", e.getMessage()));
            return -1;
        }
    }

    /* JADX INFO: renamed from: d */
    public final Object m84624d(u3p u3pVar) {
        hqb hqbVar = new hqb(1, seg1.m77914f(u3pVar));
        hqbVar.m48222q();
        try {
            nac.m63982c(this.f236917a, Executors.newSingleThreadExecutor()).m92991l(this.f236918b, new p7o(10, this, hqbVar));
        } catch (Exception e) {
            Logger.m3966b("CastBasic->%s", edb.m38564m("CastContext.getSharedInstance() threw: ", e.getMessage()));
            this.f236919c.m45754w0(e);
            hqbVar.resumeWith(new c6x0(e));
        }
        Object objM48221p = hqbVar.m48221p();
        return objM48221p == yuk.f276404a ? objM48221p : w2a1.f247311a;
    }
}
