package p204p;

import com.google.protobuf.Empty;
import com.spotify.esperanto.esperanto.ClientBase;
import com.spotify.offline_esperanto.proto.EsOffline$DownloadRequest;
import com.spotify.offline_esperanto.proto.EsOffline$GetContextsRequest;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: classes2.dex */
public final class fwk0 extends ClientBase {
    /* JADX INFO: renamed from: a */
    public final Single m42967a(EsOffline$DownloadRequest esOffline$DownloadRequest) {
        return callSingle("spotify.offline_esperanto.proto.Offline", "AddDownload", esOffline$DownloadRequest).map(y4y.f269253S0);
    }

    /* JADX INFO: renamed from: b */
    public final Single m42968b(EsOffline$GetContextsRequest esOffline$GetContextsRequest) {
        return callSingle("spotify.offline_esperanto.proto.Offline", "GetContexts", esOffline$GetContextsRequest).map(wby.f249885R0);
    }

    /* JADX INFO: renamed from: c */
    public final Observable m42969c(EsOffline$GetContextsRequest esOffline$GetContextsRequest) {
        return callStream("spotify.offline_esperanto.proto.Offline", "SubscribeContexts", esOffline$GetContextsRequest).map(uty.f234011P0);
    }

    /* JADX INFO: renamed from: d */
    public final Observable m42970d(Empty empty) {
        return callStream("spotify.offline_esperanto.proto.Offline", "SubscribeTotalProgress", empty).map(r4z.f195884S0);
    }
}
