package p204p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DismissReason;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;

/* JADX INFO: loaded from: classes2.dex */
public final class lal0 implements kal0 {

    /* JADX INFO: renamed from: a */
    public final yza f131374a;

    public lal0(yza yzaVar) {
        this.f131374a = yzaVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m58572a(MessageResponseToken messageResponseToken, DismissReason dismissReason) {
        ((zza) this.f131374a).f287929a.accept(new ygc1(mwh0.m63059p(messageResponseToken.getMessageRequest(), messageResponseToken.getRequestId()), messageResponseToken.getMessageData(), dismissReason));
    }
}
