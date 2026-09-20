package p204p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponse;
import io.reactivex.rxjava3.functions.Function;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes8.dex */
public final class tr40 implements Function {

    /* JADX INFO: renamed from: a */
    public static final tr40 f222965a = new tr40();

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public final Object mo98394apply(Object obj) {
        Object c6x0Var = (MessageResponse) obj;
        if (!(c6x0Var instanceof MessageResponse.Success)) {
            if (!(c6x0Var instanceof MessageResponse.Failure)) {
                throw new NoWhenBranchMatchedException();
            }
            c6x0Var = new c6x0(new Throwable("Failed to fetch inline card: " + ((MessageResponse.Failure) c6x0Var).getDiscardReason()));
        }
        return new s6x0(c6x0Var);
    }
}
