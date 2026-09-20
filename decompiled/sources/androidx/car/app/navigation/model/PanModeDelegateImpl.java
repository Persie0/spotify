package androidx.car.app.navigation.model;

import android.annotation.SuppressLint;
import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.utils.AbstractC0042f;
import java.util.Objects;
import p204p.irm0;
import p204p.jrm0;
import p204p.mal0;
import p204p.rzb;
import p204p.sew0;

/* JADX INFO: loaded from: classes3.dex */
@rzb
public class PanModeDelegateImpl implements irm0 {
    private final IPanModeListener mStub;

    @rzb
    public static class PanModeListenerStub extends IPanModeListener.Stub {
        private final jrm0 mListener;

        public PanModeListenerStub(jrm0 jrm0Var) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$onPanModeChanged$0(boolean z) {
            throw null;
        }

        @Override // androidx.car.app.navigation.model.IPanModeListener
        public int getInterfaceVersion() {
            return 1;
        }

        @Override // androidx.car.app.navigation.model.IPanModeListener
        public void onPanModeChanged(final boolean z, IOnDoneCallback iOnDoneCallback) {
            AbstractC0042f.m245b(iOnDoneCallback, "onPanModeChanged", new sew0() { // from class: androidx.car.app.navigation.model.a
                @Override // p204p.sew0
                /* JADX INFO: renamed from: b */
                public final Object mo205b() {
                    return this.f464a.lambda$onPanModeChanged$0(z);
                }
            });
        }
    }

    private PanModeDelegateImpl(jrm0 jrm0Var) {
        this.mStub = new PanModeListenerStub(jrm0Var);
    }

    @SuppressLint({"ExecutorRegistration"})
    public static irm0 create(jrm0 jrm0Var) {
        return new PanModeDelegateImpl(jrm0Var);
    }

    public void sendPanModeChanged(boolean z, mal0 mal0Var) {
        try {
            IPanModeListener iPanModeListener = this.mStub;
            Objects.requireNonNull(iPanModeListener);
            iPanModeListener.onPanModeChanged(z, AbstractC0042f.m244a(mal0Var));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    private PanModeDelegateImpl() {
        this.mStub = null;
    }
}
