package p204p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageRequest;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;

/* JADX INFO: loaded from: classes8.dex */
public final class dhc1 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ nya f49056a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dhc1(nya nyaVar) {
        super(1);
        this.f49056a = nyaVar;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        nya nyaVar = this.f49056a;
        MessageRequest messageRequest = nyaVar.f159751b.getMessageRequest();
        MessageResponseToken messageResponseToken = nyaVar.f159751b;
        return new yte0(mwh0.m63059p(messageRequest, messageResponseToken.getRequestId()), messageResponseToken.getMessageData());
    }
}
