package com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.effecthandlers;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DismissReason;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.Message;
import io.reactivex.rxjava3.functions.Consumer;
import java.lang.ref.WeakReference;
import kotlin.NoWhenBranchMatchedException;
import p204p.hwa;
import p204p.hxa;
import p204p.qte0;
import p204p.ygc1;
import p204p.yza;
import p204p.zza;

/* JADX INFO: renamed from: com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.effecthandlers.g */
/* JADX INFO: loaded from: classes2.dex */
public final class C0982g {

    /* JADX INFO: renamed from: a */
    public final hwa f5485a;

    /* JADX INFO: renamed from: b */
    public final yza f5486b;

    public C0982g(hwa hwaVar, yza yzaVar) {
        this.f5485a = hwaVar;
        this.f5486b = yzaVar;
    }

    /* JADX INFO: renamed from: a */
    public final Consumer m15308a() {
        return new Consumer() { // from class: com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.effecthandlers.DismissMessageViewEffectHandlerImpl$consumer$1
            @Override // io.reactivex.rxjava3.functions.Consumer
            public final void accept(hxa hxaVar) {
                long messageId;
                DismissReason dismissReason = hxaVar.f96171d;
                Message message = hxaVar.f96170c;
                if (message instanceof Message.CreativeMessage) {
                    messageId = ((Message.CreativeMessage) message).getLoggingData().getMessageId();
                } else {
                    if (!(message instanceof Message.JITMessageStub)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    messageId = -1;
                }
                WeakReference weakReference = (WeakReference) this.this$0.f5485a.f95894a.get(String.valueOf(messageId));
                qte0 qte0Var = weakReference != null ? (qte0) weakReference.get() : null;
                if (qte0Var != null) {
                    qte0Var.dismiss();
                }
                ((zza) this.this$0.f5486b).f287929a.accept(new ygc1(hxaVar.f96169b, message, dismissReason));
            }
        };
    }
}
