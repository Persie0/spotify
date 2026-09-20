package com.spotify.mobius;

import com.spotify.mobius.internal_util.Preconditions;
import com.spotify.mobius.runners.WorkRunner;
import p204p.fpr;

/* JADX INFO: loaded from: classes2.dex */
class MobiusLoopController<M, E, F> implements MobiusLoop.Controller<M, E>, ControllerActions<M, E> {

    /* JADX INFO: renamed from: a */
    public final MobiusLoop.Factory f5603a;

    /* JADX INFO: renamed from: b */
    public final Object f5604b;

    /* JADX INFO: renamed from: c */
    public final Init f5605c;

    /* JADX INFO: renamed from: d */
    public final WorkRunner f5606d;

    /* JADX INFO: renamed from: e */
    public ControllerStateBase f5607e;

    public MobiusLoopController(MobiusLoop.Factory factory, Object obj, Init init, WorkRunner workRunner) {
        Preconditions.m15649b(factory);
        this.f5603a = factory;
        Preconditions.m15649b(obj);
        this.f5604b = obj;
        if (init == null) {
            init = null;
        } else if (factory instanceof Mobius.Builder) {
            init = new LoggingInit(init, ((Mobius.Builder) factory).f5580g);
        }
        this.f5605c = init;
        this.f5606d = workRunner;
        synchronized (this) {
            this.f5607e = new ControllerStateInit(this, obj);
        }
    }

    @Override // com.spotify.mobius.MobiusLoop.Controller
    /* JADX INFO: renamed from: a */
    public final synchronized Object mo15602a() {
        return this.f5607e.mo15566e();
    }

    @Override // com.spotify.mobius.MobiusLoop.Controller
    /* JADX INFO: renamed from: b */
    public final synchronized void mo15603b(fpr fprVar) {
        this.f5607e.mo15567f(fprVar);
    }

    @Override // com.spotify.mobius.MobiusLoop.Controller
    /* JADX INFO: renamed from: c */
    public final synchronized void mo15604c(Connectable connectable) {
        ControllerStateBase controllerStateBase = this.f5607e;
        Preconditions.m15649b(connectable);
        controllerStateBase.mo15563b(connectable);
    }

    @Override // com.spotify.mobius.MobiusLoop.Controller
    public final synchronized void disconnect() {
        this.f5607e.mo15564c();
    }

    @Override // com.spotify.mobius.MobiusLoop.Controller
    public final synchronized boolean isRunning() {
        ControllerStateBase controllerStateBase;
        controllerStateBase = this.f5607e;
        controllerStateBase.getClass();
        return controllerStateBase instanceof ControllerStateRunning;
    }

    @Override // com.spotify.mobius.MobiusLoop.Controller
    public final synchronized void start() {
        this.f5607e.mo15568g();
    }

    @Override // com.spotify.mobius.MobiusLoop.Controller
    public final synchronized void stop() {
        this.f5607e.mo15569h();
    }
}
