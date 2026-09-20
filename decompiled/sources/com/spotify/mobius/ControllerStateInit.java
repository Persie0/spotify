package com.spotify.mobius;

import com.spotify.mobius.functions.Consumer;
import com.spotify.mobius.internal_util.Preconditions;
import p204p.fpr;

/* JADX INFO: loaded from: classes2.dex */
class ControllerStateInit<M, E, F> extends ControllerStateBase<M, E> {

    /* JADX INFO: renamed from: b */
    public final MobiusLoopController f5538b;

    /* JADX INFO: renamed from: c */
    public Object f5539c;

    public ControllerStateInit(MobiusLoopController mobiusLoopController, Object obj) {
        this.f5538b = mobiusLoopController;
        this.f5539c = obj;
    }

    @Override // com.spotify.mobius.ControllerStateBase
    /* JADX INFO: renamed from: a */
    public final String mo15562a() {
        return "init";
    }

    @Override // com.spotify.mobius.ControllerStateBase
    /* JADX INFO: renamed from: b */
    public final void mo15563b(Connectable connectable) {
        final MobiusLoopController mobiusLoopController = this.f5538b;
        Object obj = this.f5539c;
        mobiusLoopController.getClass();
        Preconditions.m15649b(connectable);
        Connection connectionMo3269P = new DiscardAfterDisposeConnectable(connectable).mo3269P(new Consumer<Object>() { // from class: com.spotify.mobius.MobiusLoopController.2
            public C10252() {
            }

            @Override // com.spotify.mobius.functions.Consumer
            public final void accept(Object obj2) {
                MobiusLoopController.this.f5607e.mo15565d(obj2);
            }
        });
        synchronized (mobiusLoopController) {
            if (obj == null) {
                try {
                    obj = mobiusLoopController.f5604b;
                } catch (Throwable th) {
                    throw th;
                }
            }
            mobiusLoopController.f5607e = new ControllerStateCreated(mobiusLoopController, connectionMo3269P, obj);
        }
    }

    @Override // com.spotify.mobius.ControllerStateBase
    /* JADX INFO: renamed from: e */
    public final Object mo15566e() {
        return this.f5539c;
    }

    @Override // com.spotify.mobius.ControllerStateBase
    /* JADX INFO: renamed from: f */
    public final void mo15567f(fpr fprVar) {
        this.f5539c = fprVar;
    }
}
