package androidx.car.app.model;

import android.annotation.SuppressLint;
import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.utils.AbstractC0042f;
import java.util.Objects;
import p204p.mal0;
import p204p.rzb;
import p204p.sew0;
import p204p.wal0;
import p204p.zs50;

/* JADX INFO: loaded from: classes3.dex */
@rzb
public class OnItemVisibilityChangedDelegateImpl implements wal0 {
    private final IOnItemVisibilityChangedListener mStub;

    public static class OnItemVisibilityChangedListenerStub extends IOnItemVisibilityChangedListener.Stub {
        private final zs50 mListener;

        public OnItemVisibilityChangedListenerStub(zs50 zs50Var) {
            this.mListener = zs50Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$onItemVisibilityChanged$0(int i, int i2) {
            this.mListener.mo42543f();
            return null;
        }

        @Override // androidx.car.app.model.IOnItemVisibilityChangedListener
        public int getInterfaceVersion() {
            return 1;
        }

        @Override // androidx.car.app.model.IOnItemVisibilityChangedListener
        public void onItemVisibilityChanged(final int i, final int i2, IOnDoneCallback iOnDoneCallback) {
            AbstractC0042f.m245b(iOnDoneCallback, "onItemVisibilityChanged", new sew0() { // from class: androidx.car.app.model.e
                @Override // p204p.sew0
                /* JADX INFO: renamed from: b */
                public final Object mo205b() {
                    return this.f456a.lambda$onItemVisibilityChanged$0(i, i2);
                }
            });
        }
    }

    private OnItemVisibilityChangedDelegateImpl(zs50 zs50Var) {
        this.mStub = new OnItemVisibilityChangedListenerStub(zs50Var);
    }

    @SuppressLint({"ExecutorRegistration"})
    public static wal0 create(zs50 zs50Var) {
        return new OnItemVisibilityChangedDelegateImpl(zs50Var);
    }

    @Override // p204p.wal0
    public void sendItemVisibilityChanged(int i, int i2, mal0 mal0Var) {
        try {
            IOnItemVisibilityChangedListener iOnItemVisibilityChangedListener = this.mStub;
            Objects.requireNonNull(iOnItemVisibilityChangedListener);
            iOnItemVisibilityChangedListener.onItemVisibilityChanged(i, i2, AbstractC0042f.m244a(mal0Var));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    private OnItemVisibilityChangedDelegateImpl() {
        this.mStub = null;
    }
}
