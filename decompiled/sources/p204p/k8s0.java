package p204p;

import android.net.Uri;
import androidx.media3.common.PriorityTaskManager$PriorityTooLowException;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class k8s0 implements ubs {

    /* JADX INFO: renamed from: a */
    public final Executor f120418a;

    /* JADX INFO: renamed from: b */
    public final sjo f120419b;

    /* JADX INFO: renamed from: c */
    public final e3b f120420c;

    /* JADX INFO: renamed from: d */
    public final s4b f120421d;

    /* JADX INFO: renamed from: e */
    public g7s f120422e;

    /* JADX INFO: renamed from: f */
    public volatile j8s0 f120423f;

    /* JADX INFO: renamed from: g */
    public volatile boolean f120424g;

    public k8s0(ufd0 ufd0Var, d3b d3bVar, Executor executor, long j, long j2) {
        executor.getClass();
        this.f120418a = executor;
        ofd0 ofd0Var = ufd0Var.f229763b;
        ofd0Var.getClass();
        Map map = Collections.EMPTY_MAP;
        Uri uri = ofd0Var.f164727a;
        String str = ofd0Var.f164732f;
        c95.m31848n(uri, "The uri must be set.");
        sjo sjoVar = new sjo(uri, 0L, 1, null, map, j, j2, str, 4, null);
        this.f120419b = sjoVar;
        qio qioVar = d3bVar.f44835e;
        e3b e3bVarM34813a = d3bVar.m34813a(qioVar != null ? qioVar.mo30418p0() : null, 1);
        this.f120420c = e3bVarM34813a;
        this.f120421d = new s4b(e3bVarM34813a, sjoVar, null, new g4n0(this, 23));
    }

    @Override // p204p.ubs
    /* JADX INFO: renamed from: a */
    public final void mo55754a(g7s g7sVar) {
        this.f120422e = g7sVar;
        boolean z = false;
        while (!z) {
            try {
                if (this.f120424g) {
                    break;
                }
                this.f120423f = new j8s0(this);
                this.f120418a.execute(this.f120423f);
                try {
                    this.f120423f.get();
                    z = true;
                } catch (ExecutionException e) {
                    Throwable cause = e.getCause();
                    cause.getClass();
                    if (!(cause instanceof PriorityTaskManager$PriorityTooLowException)) {
                        if (cause instanceof IOException) {
                            throw ((IOException) cause);
                        }
                        String str = h0b1.f86200a;
                        throw cause;
                    }
                }
            } catch (Throwable th) {
                j8s0 j8s0Var = this.f120423f;
                j8s0Var.getClass();
                j8s0Var.m81597c();
                throw th;
            }
        }
        j8s0 j8s0Var2 = this.f120423f;
        j8s0Var2.getClass();
        j8s0Var2.m81597c();
    }

    @Override // p204p.ubs
    public final void cancel() {
        this.f120424g = true;
        j8s0 j8s0Var = this.f120423f;
        if (j8s0Var != null) {
            j8s0Var.cancel(true);
        }
    }

    @Override // p204p.ubs
    public final void remove() {
        e3b e3bVar = this.f120420c;
        ((ob21) e3bVar.f55722a).m66597l(e3bVar.f55726e.mo60230c(this.f120419b));
    }
}
