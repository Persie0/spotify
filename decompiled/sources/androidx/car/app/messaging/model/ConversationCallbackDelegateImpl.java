package androidx.car.app.messaging.model;

import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.utils.AbstractC0042f;
import java.util.Objects;
import p204p.ank;
import p204p.mal0;
import p204p.rzb;
import p204p.sew0;
import p204p.zmk;

/* JADX INFO: loaded from: classes3.dex */
@rzb
class ConversationCallbackDelegateImpl implements ank {
    private final IConversationCallback mConversationCallbackBinder;

    @rzb
    public static class ConversationCallbackStub extends IConversationCallback.Stub {
        private final zmk mConversationCallback;

        public ConversationCallbackStub(zmk zmkVar) {
            this.mConversationCallback = zmkVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$onMarkAsRead$0() {
            this.mConversationCallback.getClass();
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$onTextReply$1(String str) {
            this.mConversationCallback.getClass();
            return null;
        }

        @Override // androidx.car.app.messaging.model.IConversationCallback
        public int getInterfaceVersion() {
            return 1;
        }

        @Override // androidx.car.app.messaging.model.IConversationCallback
        public void onMarkAsRead(IOnDoneCallback iOnDoneCallback) {
            AbstractC0042f.m245b(iOnDoneCallback, "onMarkAsRead", new sew0() { // from class: androidx.car.app.messaging.model.b
                @Override // p204p.sew0
                /* JADX INFO: renamed from: b */
                public final Object mo205b() {
                    return this.f445a.lambda$onMarkAsRead$0();
                }
            });
        }

        @Override // androidx.car.app.messaging.model.IConversationCallback
        public void onTextReply(IOnDoneCallback iOnDoneCallback, final String str) {
            AbstractC0042f.m245b(iOnDoneCallback, "onReply", new sew0() { // from class: androidx.car.app.messaging.model.a
                @Override // p204p.sew0
                /* JADX INFO: renamed from: b */
                public final Object mo205b() {
                    return this.f443a.lambda$onTextReply$1(str);
                }
            });
        }
    }

    public ConversationCallbackDelegateImpl(zmk zmkVar) {
        this.mConversationCallbackBinder = new ConversationCallbackStub(zmkVar);
    }

    public void sendMarkAsRead(mal0 mal0Var) {
        try {
            IConversationCallback iConversationCallback = this.mConversationCallbackBinder;
            Objects.requireNonNull(iConversationCallback);
            iConversationCallback.onMarkAsRead(AbstractC0042f.m244a(mal0Var));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public void sendTextReply(String str, mal0 mal0Var) {
        try {
            IConversationCallback iConversationCallback = this.mConversationCallbackBinder;
            Objects.requireNonNull(iConversationCallback);
            iConversationCallback.onTextReply(AbstractC0042f.m244a(mal0Var), str);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    private ConversationCallbackDelegateImpl() {
        this.mConversationCallbackBinder = null;
    }
}
