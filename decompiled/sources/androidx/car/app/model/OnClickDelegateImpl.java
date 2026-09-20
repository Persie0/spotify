package androidx.car.app.model;

import android.annotation.SuppressLint;
import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.utils.AbstractC0042f;
import java.util.Objects;
import p204p.mal0;
import p204p.p7l0;
import p204p.q7l0;
import p204p.rzb;

/* JADX INFO: loaded from: classes3.dex */
@rzb
public class OnClickDelegateImpl implements p7l0 {
    private final boolean mIsParkedOnly;
    private final IOnClickListener mListener;

    public static class OnClickListenerStub extends IOnClickListener.Stub {
        private final q7l0 mOnClickListener;

        public OnClickListenerStub(q7l0 q7l0Var) {
            this.mOnClickListener = q7l0Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$onClick$0() {
            this.mOnClickListener.onClick();
            return null;
        }

        @Override // androidx.car.app.model.IOnClickListener
        public int getInterfaceVersion() {
            return 1;
        }

        @Override // androidx.car.app.model.IOnClickListener
        public void onClick(IOnDoneCallback iOnDoneCallback) {
            AbstractC0042f.m245b(iOnDoneCallback, "onClick", new C0027a(this, 1));
        }
    }

    private OnClickDelegateImpl(q7l0 q7l0Var, boolean z) {
        this.mListener = new OnClickListenerStub(q7l0Var);
        this.mIsParkedOnly = z;
    }

    @SuppressLint({"ExecutorRegistration"})
    public static p7l0 create(q7l0 q7l0Var) {
        return new OnClickDelegateImpl(q7l0Var, q7l0Var instanceof ParkedOnlyOnClickListener);
    }

    @Override // p204p.p7l0
    public boolean isParkedOnly() {
        return this.mIsParkedOnly;
    }

    public void sendClick(mal0 mal0Var) {
        try {
            IOnClickListener iOnClickListener = this.mListener;
            Objects.requireNonNull(iOnClickListener);
            iOnClickListener.onClick(AbstractC0042f.m244a(mal0Var));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    private OnClickDelegateImpl() {
        this.mListener = null;
        this.mIsParkedOnly = false;
    }
}
