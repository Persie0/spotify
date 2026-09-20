package p204p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.FormatType;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponse;
import io.reactivex.rxjava3.functions.Predicate;

/* JADX INFO: loaded from: classes2.dex */
public final class fue0 implements Predicate {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ FormatType f73473a;

    public fue0(FormatType formatType) {
        this.f73473a = formatType;
    }

    @Override // io.reactivex.rxjava3.functions.Predicate
    public final boolean test(Object obj) {
        MessageResponse messageResponse = (MessageResponse) obj;
        return (messageResponse instanceof MessageResponse.Success) && mwh0.m63045b(((MessageResponse.Success) messageResponse).getToken().getMessageData()) == this.f73473a;
    }
}
