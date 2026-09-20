package androidx.car.app.model;

import android.annotation.SuppressLint;
import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.utils.AbstractC0042f;
import java.util.Objects;
import p204p.at50;
import p204p.fdl0;
import p204p.mal0;
import p204p.rzb;

/* JADX INFO: loaded from: classes3.dex */
@rzb
public class OnSelectedDelegateImpl implements fdl0 {
    private final IOnSelectedListener mStub;

    @rzb
    public static class OnSelectedListenerStub extends IOnSelectedListener.Stub {
        private final at50 mListener;

        public OnSelectedListenerStub(at50 at50Var) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$onSelected$0(int i) {
            throw null;
        }

        @Override // androidx.car.app.model.IOnSelectedListener
        public int getInterfaceVersion() {
            return 1;
        }

        @Override // androidx.car.app.model.IOnSelectedListener
        public void onSelected(int i, IOnDoneCallback iOnDoneCallback) {
            AbstractC0042f.m245b(iOnDoneCallback, "onSelectedListener", new C0028b(this, i, 1));
        }
    }

    private OnSelectedDelegateImpl(at50 at50Var) {
        this.mStub = new OnSelectedListenerStub(at50Var);
    }

    @SuppressLint({"ExecutorRegistration"})
    public static fdl0 create(at50 at50Var) {
        return new OnSelectedDelegateImpl(at50Var);
    }

    public void sendSelected(int i, mal0 mal0Var) {
        try {
            IOnSelectedListener iOnSelectedListener = this.mStub;
            Objects.requireNonNull(iOnSelectedListener);
            iOnSelectedListener.onSelected(i, AbstractC0042f.m244a(mal0Var));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    private OnSelectedDelegateImpl() {
        this.mStub = null;
    }
}
