package androidx.car.app.model;

import android.annotation.SuppressLint;
import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.utils.AbstractC0042f;
import java.util.Objects;
import p204p.k73;
import p204p.l73;
import p204p.mal0;
import p204p.rzb;

/* JADX INFO: loaded from: classes3.dex */
@rzb
public class AlertCallbackDelegateImpl implements l73 {
    private final IAlertCallback mCallback;

    @rzb
    public static class AlertCallbackStub extends IAlertCallback.Stub {
        private final k73 mCallback;

        public AlertCallbackStub(k73 k73Var) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$onAlertCancelled$0(int i) {
            throw null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$onAlertDismissed$1() {
            throw null;
        }

        @Override // androidx.car.app.model.IAlertCallback
        public int getInterfaceVersion() {
            return 1;
        }

        @Override // androidx.car.app.model.IAlertCallback
        public void onAlertCancelled(int i, IOnDoneCallback iOnDoneCallback) {
            AbstractC0042f.m245b(iOnDoneCallback, "onCancel", new C0028b(this, i, 0));
        }

        @Override // androidx.car.app.model.IAlertCallback
        public void onAlertDismissed(IOnDoneCallback iOnDoneCallback) {
            AbstractC0042f.m245b(iOnDoneCallback, "onDismiss", new C0027a(this, 0));
        }
    }

    private AlertCallbackDelegateImpl(k73 k73Var) {
        this.mCallback = new AlertCallbackStub(k73Var);
    }

    @SuppressLint({"ExecutorRegistration"})
    public static l73 create(k73 k73Var) {
        return new AlertCallbackDelegateImpl(k73Var);
    }

    public void sendCancel(int i, mal0 mal0Var) {
        try {
            IAlertCallback iAlertCallback = this.mCallback;
            Objects.requireNonNull(iAlertCallback);
            iAlertCallback.onAlertCancelled(i, AbstractC0042f.m244a(mal0Var));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public void sendDismiss(mal0 mal0Var) {
        try {
            IAlertCallback iAlertCallback = this.mCallback;
            Objects.requireNonNull(iAlertCallback);
            iAlertCallback.onAlertDismissed(AbstractC0042f.m244a(mal0Var));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    private AlertCallbackDelegateImpl() {
        this.mCallback = null;
    }
}
