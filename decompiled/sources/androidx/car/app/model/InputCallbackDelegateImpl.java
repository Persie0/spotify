package androidx.car.app.model;

import android.annotation.SuppressLint;
import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.utils.AbstractC0042f;
import java.util.Objects;
import p204p.mal0;
import p204p.rzb;
import p204p.xu40;
import p204p.yu40;

/* JADX INFO: loaded from: classes3.dex */
@rzb
public class InputCallbackDelegateImpl implements yu40 {
    private final IInputCallback mCallback;

    @rzb
    public static class OnInputCallbackStub extends IInputCallback.Stub {
        private final xu40 mCallback;

        public OnInputCallbackStub(xu40 xu40Var) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$onInputSubmitted$0(String str) {
            throw null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$onInputTextChanged$1(String str) {
            throw null;
        }

        @Override // androidx.car.app.model.IInputCallback
        public int getInterfaceVersion() {
            return 1;
        }

        @Override // androidx.car.app.model.IInputCallback
        public void onInputSubmitted(String str, IOnDoneCallback iOnDoneCallback) {
            AbstractC0042f.m245b(iOnDoneCallback, "onInputSubmitted", new C0029c(this, str, 1));
        }

        @Override // androidx.car.app.model.IInputCallback
        public void onInputTextChanged(String str, IOnDoneCallback iOnDoneCallback) {
            AbstractC0042f.m245b(iOnDoneCallback, "onInputTextChanged", new C0029c(this, str, 0));
        }
    }

    private InputCallbackDelegateImpl(xu40 xu40Var) {
        this.mCallback = new OnInputCallbackStub(xu40Var);
    }

    @SuppressLint({"ExecutorRegistration"})
    public static yu40 create(xu40 xu40Var) {
        Objects.requireNonNull(xu40Var);
        throw new ClassCastException();
    }

    public void sendInputSubmitted(String str, mal0 mal0Var) {
        try {
            IInputCallback iInputCallback = this.mCallback;
            Objects.requireNonNull(iInputCallback);
            iInputCallback.onInputSubmitted(str, AbstractC0042f.m244a(mal0Var));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public void sendInputTextChanged(String str, mal0 mal0Var) {
        try {
            IInputCallback iInputCallback = this.mCallback;
            Objects.requireNonNull(iInputCallback);
            iInputCallback.onInputTextChanged(str, AbstractC0042f.m244a(mal0Var));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    private InputCallbackDelegateImpl() {
        this.mCallback = null;
    }
}
