package p204p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;

/* JADX INFO: loaded from: classes2.dex */
public final class bdl0 implements adl0 {

    /* JADX INFO: renamed from: a */
    public final yza f26130a;

    public bdl0(yza yzaVar) {
        this.f26130a = yzaVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m28838a(MessageResponseToken messageResponseToken) {
        ((zza) this.f26130a).f287929a.accept(new zgc1(mwh0.m63059p(messageResponseToken.getMessageRequest(), messageResponseToken.getRequestId()), messageResponseToken.getMessageData()));
    }
}
