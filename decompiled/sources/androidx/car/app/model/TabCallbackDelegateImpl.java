package androidx.car.app.model;

import android.annotation.SuppressLint;
import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.utils.AbstractC0042f;
import java.util.Objects;
import p204p.li61;
import p204p.mal0;
import p204p.on61;
import p204p.pn61;
import p204p.rzb;

/* JADX INFO: loaded from: classes3.dex */
@rzb
public class TabCallbackDelegateImpl implements li61 {
    private final ITabCallback mStubCallback;

    @rzb
    public static class TabCallbackStub extends ITabCallback.Stub {
        private final on61 mCallback;

        public TabCallbackStub(on61 on61Var) {
            this.mCallback = on61Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Object lambda$onTabSelected$0(String str) {
            ((pn61) this.mCallback).f179327a.invoke(str);
            return null;
        }

        @Override // androidx.car.app.model.ITabCallback
        public int getInterfaceVersion() {
            return 1;
        }

        @Override // androidx.car.app.model.ITabCallback
        public void onTabSelected(String str, IOnDoneCallback iOnDoneCallback) {
            AbstractC0042f.m245b(iOnDoneCallback, "onTabSelected", new C0029c(this, str, 2));
        }
    }

    private TabCallbackDelegateImpl(on61 on61Var) {
        this.mStubCallback = new TabCallbackStub(on61Var);
    }

    @SuppressLint({"ExecutorRegistration"})
    public static li61 create(on61 on61Var) {
        return new TabCallbackDelegateImpl(on61Var);
    }

    public void sendTabSelected(String str, mal0 mal0Var) {
        try {
            ITabCallback iTabCallback = this.mStubCallback;
            Objects.requireNonNull(iTabCallback);
            iTabCallback.onTabSelected(str, AbstractC0042f.m244a(mal0Var));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    private TabCallbackDelegateImpl() {
        this.mStubCallback = null;
    }
}
