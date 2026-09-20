package p204p;

import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import com.spotify.core.http.CronetRuntime;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: classes.dex */
public final class kbc0 implements fwz0 {

    /* JADX INFO: renamed from: a */
    public final nvu0 f121175a;

    /* JADX INFO: renamed from: b */
    public final CronetRuntime f121176b;

    /* JADX INFO: renamed from: c */
    public final u1b0 f121177c;

    /* JADX INFO: renamed from: d */
    public final z4l0 f121178d;

    /* JADX INFO: renamed from: e */
    public final z4l0 f121179e;

    /* JADX INFO: renamed from: f */
    public final z4l0 f121180f;

    /* JADX INFO: renamed from: g */
    public final RetrofitMaker f121181g;

    static {
        new zy5(16);
    }

    public kbc0(nvu0 nvu0Var, nd70 nd70Var, s0i0 s0i0Var, Scheduler scheduler, wwi0 wwi0Var, CronetRuntime cronetRuntime, u1b0 u1b0Var, je41 je41Var) {
        this.f121175a = nvu0Var;
        this.f121176b = cronetRuntime;
        this.f121177c = u1b0Var;
        hcj0 hcj0Var = new hcj0(29);
        twy twyVar = wwi0Var.f255777d;
        if (twyVar == null) {
            wj50.m88260d0("accessTokenClient");
            throw null;
        }
        z4l0 z4l0VarM97220a = zy5.m97220a(je41Var.f111452b, new xja(hcj0Var, twyVar));
        this.f121178d = z4l0VarM97220a;
        this.f121179e = je41Var.f111453c;
        this.f121180f = je41Var.f111454d;
        this.f121181g = new RetrofitMaker(wj50.m88252Q(z4l0VarM97220a, "spclient.wg.spotify.com", nd70Var, s0i0Var, scheduler), maz.f141737Z);
    }

    @Override // p204p.hgm
    public final void shutdown() {
        this.f121178d.f279270a.m67750a();
        this.f121179e.f279270a.m67750a();
        this.f121180f.f279270a.m67750a();
        jbc0 jbc0Var = new jbc0(this, 0);
        u1b0 u1b0Var = this.f121177c;
        u1b0Var.m82201a(jbc0Var);
        u1b0Var.m82201a(new jbc0(this, 1));
    }

    @Override // p204p.fwz0
    public final Object getApi() {
        return this;
    }
}
