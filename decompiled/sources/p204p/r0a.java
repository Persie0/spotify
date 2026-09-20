package p204p;

import com.spotify.base.java.logging.Logger;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: loaded from: classes5.dex */
public final class r0a {

    /* JADX INFO: renamed from: a */
    public final int f194413a;

    /* JADX INFO: renamed from: b */
    public final fiz f194414b;

    /* JADX INFO: renamed from: c */
    public final mb61 f194415c;

    /* JADX INFO: renamed from: d */
    public final AtomicBoolean f194416d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ y0a f194417e;

    /* JADX WARN: Multi-variable type inference failed */
    public r0a(y0a y0aVar, int i, hqi0 hqi0Var, gh00 gh00Var) {
        this.f194417e = y0aVar;
        this.f194413a = i;
        this.f194414b = hqi0Var;
        this.f194415c = (mb61) gh00Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code duplicated, block: B:81:0x0102 A[DONT_GENERATE] */
    /* JADX WARN: Type inference failed for: r9v28, types: [p.gh00, p.mb61] */
    /* JADX INFO: renamed from: a */
    public final Object m74366a(ibk ibkVar) {
        q0a q0aVar;
        w2a1 w2a1Var = w2a1.f247311a;
        if (ibkVar instanceof q0a) {
            q0aVar = (q0a) ibkVar;
            int i = q0aVar.f183936c;
            if ((i & Integer.MIN_VALUE) != 0) {
                q0aVar.f183936c = i - Integer.MIN_VALUE;
            } else {
                q0aVar = new q0a(this, ibkVar);
            }
        } else {
            q0aVar = new q0a(this, ibkVar);
        }
        Object obj = q0aVar.f183934a;
        yuk yukVar = yuk.f276404a;
        int i2 = q0aVar.f183936c;
        try {
            try {
                try {
                    if (i2 == 0) {
                        bga.m29073P(obj);
                        if (this.f194416d.compareAndSet(false, true)) {
                            ?? r9 = this.f194415c;
                            q0aVar.f183936c = 1;
                            if (r9.invoke(q0aVar) == yukVar) {
                                return yukVar;
                            }
                        }
                        return w2a1Var;
                    }
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                    ((pz6) this.f194417e.f267940b).m71696g(this.f194413a);
                } catch (Exception e) {
                    Logger.m3974j(e, "Failed to restore audio mode after Bluetooth microphone capture", new Object[0]);
                } finally {
                    if (this.f194417e.f267942d == this) {
                        this.f194417e.f267942d = null;
                    }
                }
            } catch (Throwable th) {
                try {
                    ((pz6) this.f194417e.f267940b).m71696g(this.f194413a);
                } catch (Exception e2) {
                    Logger.m3974j(e2, "Failed to restore audio mode after Bluetooth microphone capture", new Object[0]);
                } finally {
                    if (this.f194417e.f267942d == this) {
                        this.f194417e.f267942d = null;
                    }
                }
                throw th;
            }
        } catch (TimeoutCancellationException e3) {
            Logger.m3974j(e3, "Bluetooth microphone route release timed out", new Object[0]);
            try {
                ((pz6) this.f194417e.f267940b).m71696g(this.f194413a);
            } catch (Exception e4) {
                Logger.m3974j(e4, "Failed to restore audio mode after Bluetooth microphone capture", new Object[0]);
            } finally {
                if (this.f194417e.f267942d == this) {
                    this.f194417e.f267942d = null;
                }
            }
        } catch (CancellationException e5) {
            throw e5;
        } catch (Exception e6) {
            Logger.m3974j(e6, "Bluetooth microphone route release failed", new Object[0]);
            try {
                ((pz6) this.f194417e.f267940b).m71696g(this.f194413a);
            } catch (Exception e7) {
                Logger.m3974j(e7, "Failed to restore audio mode after Bluetooth microphone capture", new Object[0]);
            } finally {
                if (this.f194417e.f267942d == this) {
                    this.f194417e.f267942d = null;
                }
            }
            return w2a1Var;
        }
    }
}
