package p204p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponse;
import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: loaded from: classes2.dex */
public final class gue0 implements Function {

    /* JADX INFO: renamed from: a */
    public static final gue0 f84462a = new gue0();

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public final Object mo98394apply(Object obj) {
        return (MessageResponse.Success) ((MessageResponse) obj);
    }
}
