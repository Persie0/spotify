package p204p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DiscardReason;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.Message;

/* JADX INFO: loaded from: classes2.dex */
public final class jal0 {

    /* JADX INFO: renamed from: a */
    public final yza f110481a;

    public jal0(yza yzaVar) {
        this.f110481a = yzaVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m52842a(v2a1 v2a1Var, Message message, DiscardReason discardReason) {
        ((zza) this.f110481a).f287929a.accept(new xgc1(v2a1Var, message, discardReason));
    }
}
