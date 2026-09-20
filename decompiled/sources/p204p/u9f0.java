package p204p;

import com.spotify.esperanto.esperanto.ClientBase;
import io.reactivex.rxjava3.core.Single;
import spotify.mdata.proto.Mdata$LocalBatchedEntityRequest;

/* JADX INFO: loaded from: classes2.dex */
public final class u9f0 extends ClientBase {
    /* JADX INFO: renamed from: a */
    public final Single m82604a(Mdata$LocalBatchedEntityRequest mdata$LocalBatchedEntityRequest) {
        return callSingle("spotify.mdata_esperanto.proto.MetadataService", "Fetch", mdata$LocalBatchedEntityRequest).map(t6x0.f217637a1);
    }
}
