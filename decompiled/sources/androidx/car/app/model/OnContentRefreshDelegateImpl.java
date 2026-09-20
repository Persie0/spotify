package androidx.car.app.model;

import android.annotation.SuppressLint;
import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.utils.AbstractC0042f;
import java.util.Objects;
import p204p.mal0;
import p204p.rzb;
import p204p.u7l0;
import p204p.v7l0;

/* JADX INFO: loaded from: classes3.dex */
@rzb
public class OnContentRefreshDelegateImpl implements u7l0 {
    private final IOnContentRefreshListener mListener;

    @rzb
    public static class OnContentRefreshListenerStub extends IOnContentRefreshListener.Stub {
        private final v7l0 mOnContentRefreshListener;

        public OnContentRefreshListenerStub(v7l0 v7l0Var) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$onContentRefreshRequested$0() {
            throw null;
        }

        @Override // androidx.car.app.model.IOnContentRefreshListener
        public int getInterfaceVersion() {
            return 1;
        }

        @Override // androidx.car.app.model.IOnContentRefreshListener
        public void onContentRefreshRequested(IOnDoneCallback iOnDoneCallback) {
            AbstractC0042f.m245b(iOnDoneCallback, "onClick", new C0027a(this, 2));
        }
    }

    private OnContentRefreshDelegateImpl(v7l0 v7l0Var) {
        this.mListener = new OnContentRefreshListenerStub(v7l0Var);
    }

    @SuppressLint({"ExecutorRegistration"})
    public static u7l0 create(v7l0 v7l0Var) {
        return new OnContentRefreshDelegateImpl(v7l0Var);
    }

    public void sendContentRefreshRequested(mal0 mal0Var) {
        try {
            IOnContentRefreshListener iOnContentRefreshListener = this.mListener;
            Objects.requireNonNull(iOnContentRefreshListener);
            iOnContentRefreshListener.onContentRefreshRequested(AbstractC0042f.m244a(mal0Var));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    private OnContentRefreshDelegateImpl() {
        this.mListener = null;
    }
}
