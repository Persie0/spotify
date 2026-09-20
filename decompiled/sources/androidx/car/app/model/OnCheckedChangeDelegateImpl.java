package androidx.car.app.model;

import android.annotation.SuppressLint;
import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.utils.AbstractC0042f;
import java.util.Objects;
import p204p.mal0;
import p204p.o7l0;
import p204p.ox71;
import p204p.rzb;
import p204p.sew0;

/* JADX INFO: loaded from: classes3.dex */
@rzb
public class OnCheckedChangeDelegateImpl implements o7l0 {
    private final IOnCheckedChangeListener mStub;

    @rzb
    public static class OnCheckedChangeListenerStub extends IOnCheckedChangeListener.Stub {
        private final ox71 mListener;

        public OnCheckedChangeListenerStub(ox71 ox71Var) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$onCheckedChange$0(boolean z) {
            throw null;
        }

        @Override // androidx.car.app.model.IOnCheckedChangeListener
        public int getInterfaceVersion() {
            return 1;
        }

        @Override // androidx.car.app.model.IOnCheckedChangeListener
        public void onCheckedChange(final boolean z, IOnDoneCallback iOnDoneCallback) {
            AbstractC0042f.m245b(iOnDoneCallback, "onCheckedChange", new sew0() { // from class: androidx.car.app.model.d
                @Override // p204p.sew0
                /* JADX INFO: renamed from: b */
                public final Object mo205b() {
                    return this.f454a.lambda$onCheckedChange$0(z);
                }
            });
        }
    }

    private OnCheckedChangeDelegateImpl(ox71 ox71Var) {
        this.mStub = new OnCheckedChangeListenerStub(ox71Var);
    }

    @SuppressLint({"ExecutorRegistration"})
    public static o7l0 create(ox71 ox71Var) {
        return new OnCheckedChangeDelegateImpl(ox71Var);
    }

    public void sendCheckedChange(boolean z, mal0 mal0Var) {
        try {
            IOnCheckedChangeListener iOnCheckedChangeListener = this.mStub;
            Objects.requireNonNull(iOnCheckedChangeListener);
            iOnCheckedChangeListener.onCheckedChange(z, AbstractC0042f.m244a(mal0Var));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    private OnCheckedChangeDelegateImpl() {
        this.mStub = null;
    }
}
