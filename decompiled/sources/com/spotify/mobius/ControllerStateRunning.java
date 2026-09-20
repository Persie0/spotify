package com.spotify.mobius;

/* JADX INFO: loaded from: classes2.dex */
class ControllerStateRunning<M, E, F> extends ControllerStateBase<M, E> {

    /* JADX INFO: renamed from: b */
    public final ControllerActions f5540b;

    /* JADX INFO: renamed from: c */
    public final Connection f5541c;

    /* JADX INFO: renamed from: d */
    public final MobiusLoop f5542d;

    /* JADX INFO: renamed from: e */
    public final Object f5543e;

    public ControllerStateRunning(MobiusLoopController mobiusLoopController, Connection connection, MobiusLoop.Factory factory, Object obj, Init init) {
        this.f5540b = mobiusLoopController;
        this.f5541c = connection;
        if (init == null) {
            this.f5542d = ((Mobius.Builder) factory).mo15595g(obj);
            this.f5543e = obj;
        } else {
            AutoValue_First autoValue_First = (AutoValue_First) init.mo15576f0(obj);
            this.f5542d = ((Mobius.Builder) factory).mo15589a(autoValue_First.f5529a, autoValue_First.f5530b);
            this.f5543e = autoValue_First.f5529a;
        }
    }

    @Override // com.spotify.mobius.ControllerStateBase
    /* JADX INFO: renamed from: a */
    public final String mo15562a() {
        return "running";
    }

    @Override // com.spotify.mobius.ControllerStateBase
    /* JADX INFO: renamed from: d */
    public final void mo15565d(Object obj) {
        this.f5542d.m15600a(obj);
    }

    @Override // com.spotify.mobius.ControllerStateBase
    /* JADX INFO: renamed from: e */
    public final Object mo15566e() {
        Object obj = this.f5542d.f5591i;
        return obj != null ? obj : this.f5543e;
    }

    @Override // com.spotify.mobius.ControllerStateBase
    /* JADX INFO: renamed from: h */
    public final void mo15569h() {
        this.f5542d.dispose();
        Object obj = this.f5542d.f5591i;
        ControllerActions controllerActions = this.f5540b;
        Connection connection = this.f5541c;
        MobiusLoopController mobiusLoopController = (MobiusLoopController) controllerActions;
        synchronized (mobiusLoopController) {
            if (obj == null) {
                try {
                    obj = mobiusLoopController.f5604b;
                } catch (Throwable th) {
                    throw th;
                }
            }
            mobiusLoopController.f5607e = new ControllerStateCreated(mobiusLoopController, connection, obj);
        }
    }

    @Override // com.spotify.mobius.ControllerStateBase
    /* JADX INFO: renamed from: i */
    public final void mo15570i(Object obj) {
        this.f5541c.accept(obj);
    }
}
