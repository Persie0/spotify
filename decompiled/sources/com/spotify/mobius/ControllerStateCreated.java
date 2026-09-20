package com.spotify.mobius;

import com.spotify.mobius.functions.Consumer;
import p204p.fpr;

/* JADX INFO: loaded from: classes2.dex */
class ControllerStateCreated<M, E, F> extends ControllerStateBase<M, E> {

    /* JADX INFO: renamed from: b */
    public final MobiusLoopController f5535b;

    /* JADX INFO: renamed from: c */
    public final Connection f5536c;

    /* JADX INFO: renamed from: d */
    public Object f5537d;

    public ControllerStateCreated(MobiusLoopController mobiusLoopController, Connection connection, Object obj) {
        this.f5535b = mobiusLoopController;
        this.f5536c = connection;
        this.f5537d = obj;
    }

    @Override // com.spotify.mobius.ControllerStateBase
    /* JADX INFO: renamed from: a */
    public final String mo15562a() {
        return "created";
    }

    @Override // com.spotify.mobius.ControllerStateBase
    /* JADX INFO: renamed from: c */
    public final void mo15564c() {
        this.f5536c.dispose();
        MobiusLoopController mobiusLoopController = this.f5535b;
        Object obj = this.f5537d;
        synchronized (mobiusLoopController) {
            mobiusLoopController.f5607e = new ControllerStateInit(mobiusLoopController, obj);
        }
    }

    @Override // com.spotify.mobius.ControllerStateBase
    /* JADX INFO: renamed from: e */
    public final Object mo15566e() {
        return this.f5537d;
    }

    @Override // com.spotify.mobius.ControllerStateBase
    /* JADX INFO: renamed from: f */
    public final void mo15567f(fpr fprVar) {
        this.f5537d = fprVar;
    }

    @Override // com.spotify.mobius.ControllerStateBase
    /* JADX INFO: renamed from: g */
    public final void mo15568g() {
        MobiusLoopController mobiusLoopController = this.f5535b;
        Connection connection = this.f5536c;
        Object obj = this.f5537d;
        synchronized (mobiusLoopController) {
            final ControllerStateRunning controllerStateRunning = new ControllerStateRunning(mobiusLoopController, connection, mobiusLoopController.f5603a, obj, mobiusLoopController.f5605c);
            mobiusLoopController.f5607e = controllerStateRunning;
            controllerStateRunning.f5542d.m15601b(new Consumer<Object>() { // from class: com.spotify.mobius.ControllerStateRunning.1
                @Override // com.spotify.mobius.functions.Consumer
                public final void accept(final Object obj2) {
                    final MobiusLoopController mobiusLoopController2 = (MobiusLoopController) ControllerStateRunning.this.f5540b;
                    mobiusLoopController2.f5606d.post(new Runnable() { // from class: com.spotify.mobius.MobiusLoopController.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            MobiusLoopController.this.f5607e.mo15570i(obj2);
                        }
                    });
                }
            });
        }
    }
}
