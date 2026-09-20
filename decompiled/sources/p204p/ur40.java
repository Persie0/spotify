package p204p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DiscardReason;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageRequest;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponse;
import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: loaded from: classes8.dex */
public final class ur40 implements Function {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f233219a;

    public ur40(String str) {
        this.f233219a = str;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public final Object mo98394apply(Object obj) {
        return new MessageResponse.Failure(new MessageRequest(this.f233219a, null, null, null, null, null, null, null, null, 510, null), "messageRequestId", DiscardReason.RequestTimedOut.INSTANCE);
    }
}
