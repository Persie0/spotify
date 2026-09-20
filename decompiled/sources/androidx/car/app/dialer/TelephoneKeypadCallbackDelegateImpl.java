package androidx.car.app.dialer;

import android.annotation.SuppressLint;
import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.model.ITelephoneKeypadCallback;
import androidx.car.app.utils.AbstractC0042f;
import java.util.Objects;
import p204p.mal0;
import p204p.my61;
import p204p.ny61;
import p204p.rzb;

/* JADX INFO: loaded from: classes3.dex */
@rzb
@SuppressLint({"UnsafeOptInUsageError"})
public class TelephoneKeypadCallbackDelegateImpl implements ny61 {
    private final ITelephoneKeypadCallback mBinder;

    @rzb
    public static class TelephoneKeypadCallbackStub extends ITelephoneKeypadCallback.Stub {
        private final my61 mTelephoneKeypadCallback;

        public TelephoneKeypadCallbackStub(my61 my61Var) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$onKeyDown$1(int i) {
            throw null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$onKeyLongPress$0(int i) {
            throw null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$onKeyUp$2(int i) {
            throw null;
        }

        @Override // androidx.car.app.model.ITelephoneKeypadCallback
        public int getInterfaceVersion() {
            return 1;
        }

        @Override // androidx.car.app.model.ITelephoneKeypadCallback
        public void onKeyDown(int i, IOnDoneCallback iOnDoneCallback) {
            AbstractC0042f.m245b(iOnDoneCallback, "TelephoneKeypadCallback#onKeyDown", new C0017a(this, i, 1));
        }

        @Override // androidx.car.app.model.ITelephoneKeypadCallback
        public void onKeyLongPress(int i, IOnDoneCallback iOnDoneCallback) {
            AbstractC0042f.m245b(iOnDoneCallback, "TelephoneKeypadCallback#onKeyLongPress", new C0017a(this, i, 0));
        }

        @Override // androidx.car.app.model.ITelephoneKeypadCallback
        public void onKeyUp(int i, IOnDoneCallback iOnDoneCallback) {
            AbstractC0042f.m245b(iOnDoneCallback, "TelephoneKeypadCallback#onKeyUp", new C0017a(this, i, 2));
        }
    }

    @SuppressLint({"ExecutorRegistration"})
    private TelephoneKeypadCallbackDelegateImpl(my61 my61Var) {
        this.mBinder = new TelephoneKeypadCallbackStub(my61Var);
    }

    public static ny61 create(my61 my61Var) {
        return new TelephoneKeypadCallbackDelegateImpl(my61Var);
    }

    @SuppressLint({"ExecutorRegistration"})
    public void sendKeyDown(int i, mal0 mal0Var) {
        try {
            ITelephoneKeypadCallback iTelephoneKeypadCallback = this.mBinder;
            Objects.requireNonNull(iTelephoneKeypadCallback);
            iTelephoneKeypadCallback.onKeyDown(i, AbstractC0042f.m244a(mal0Var));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    @SuppressLint({"ExecutorRegistration"})
    public void sendKeyLongPress(int i, mal0 mal0Var) {
        try {
            ITelephoneKeypadCallback iTelephoneKeypadCallback = this.mBinder;
            Objects.requireNonNull(iTelephoneKeypadCallback);
            iTelephoneKeypadCallback.onKeyLongPress(i, AbstractC0042f.m244a(mal0Var));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    @SuppressLint({"ExecutorRegistration"})
    public void sendKeyUp(int i, mal0 mal0Var) {
        try {
            ITelephoneKeypadCallback iTelephoneKeypadCallback = this.mBinder;
            Objects.requireNonNull(iTelephoneKeypadCallback);
            iTelephoneKeypadCallback.onKeyUp(i, AbstractC0042f.m244a(mal0Var));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    private TelephoneKeypadCallbackDelegateImpl() {
        this.mBinder = null;
    }
}
