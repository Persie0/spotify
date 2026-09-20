package p204p;

import android.content.Context;
import com.spotify.base.java.logging.Logger;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes6.dex */
public final class qac implements oac {

    /* JADX INFO: renamed from: a */
    public final Context f186840a;

    /* JADX INFO: renamed from: b */
    public final Executor f186841b;

    /* JADX INFO: renamed from: c */
    public final Executor f186842c;

    /* JADX INFO: renamed from: d */
    public final AtomicBoolean f186843d = new AtomicBoolean();

    /* JADX INFO: renamed from: e */
    public final guf f186844e = mlg1.m62210c();

    public qac(Context context, luk lukVar, Executor executor) {
        this.f186840a = context;
        this.f186841b = executor;
        this.f186842c = z2h1.m95212s(lukVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p204p.oac
    /* JADX INFO: renamed from: a */
    public final Object mo66545a(ibk ibkVar) throws Throwable {
        pac pacVar;
        if (ibkVar instanceof pac) {
            pacVar = (pac) ibkVar;
            int i = pacVar.f175470c;
            if ((i & Integer.MIN_VALUE) != 0) {
                pacVar.f175470c = i - Integer.MIN_VALUE;
            } else {
                pacVar = new pac(this, ibkVar);
            }
        } else {
            pacVar = new pac(this, ibkVar);
        }
        Object obj = pacVar.f175468a;
        int i2 = pacVar.f175470c;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(obj);
                return obj;
            }
            bga.m29073P(obj);
            m72436c();
            guf gufVar = this.f186844e;
            pacVar.f175470c = 1;
            Object objM38777P = gufVar.m38777P(pacVar);
            yuk yukVar = yuk.f276404a;
            return objM38777P == yukVar ? yukVar : objM38777P;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            Logger.m3966b("CastBasic->%s", edb.m38564m("getSessionManager() failed: ", e2.getMessage()));
            return null;
        }
    }

    @Override // p204p.oac
    /* JADX INFO: renamed from: b */
    public final int mo66546b(int i) {
        nac nacVarM63980a;
        try {
            try {
                nacVarM63980a = nac.m63980a();
            } catch (Exception e) {
                Logger.m3966b("CastBasic->%s", "castContext() failed: " + e.getMessage());
                nacVarM63980a = null;
            }
            if (nacVarM63980a == null) {
                return -1;
            }
            it9 it9Var = nacVarM63980a.f152040k;
            if (it9Var != null) {
                return it9Var.m51625p(i);
            }
            nac.f152027l.m83850c("castReasonCodes hasn't been initialized yet", new Object[0]);
            return 0;
        } catch (Exception e2) {
            Logger.m3966b("CastBasic->%s", edb.m38564m("getCastReasonCodeForCastStatusCode() failed: ", e2.getMessage()));
            return -1;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m72436c() {
        if (this.f186843d.compareAndSet(false, true)) {
            try {
                this.f186842c.execute(new n10(this, 21));
            } catch (Exception e) {
                Logger.m3966b("CastBasic->%s", edb.m38564m("startInitializationOnce() failed: ", e.getMessage()));
                this.f186844e.m45754w0(e);
            }
        }
    }
}
