package p204p;

import com.spotify.esperanto.esperanto.ClientBase;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import spotify.collection.esperanto.proto.CollectionAddRemoveItemsRequest;
import spotify.collection.esperanto.proto.CollectionDecorateRequest;
import spotify.collection.esperanto.proto.CollectionGetArtistViewRequest;

/* JADX INFO: loaded from: classes.dex */
public final class n5f extends ClientBase {
    /* JADX INFO: renamed from: a */
    public final Single m63720a(CollectionAddRemoveItemsRequest collectionAddRemoveItemsRequest) {
        return callSingle("spotify.collection_esperanto.proto.CollectionService", "Add", collectionAddRemoveItemsRequest).map(xzk.f267690X);
    }

    /* JADX INFO: renamed from: b */
    public final Single m63721b(CollectionDecorateRequest collectionDecorateRequest) {
        return callSingle("spotify.collection_esperanto.proto.CollectionService", "Decorate", collectionDecorateRequest).map(msz0.f146883O0);
    }

    /* JADX INFO: renamed from: c */
    public final Single m63722c(CollectionAddRemoveItemsRequest collectionAddRemoveItemsRequest) {
        return callSingle("spotify.collection_esperanto.proto.CollectionService", "Remove", collectionAddRemoveItemsRequest).map(uwk.f234666N0);
    }

    /* JADX INFO: renamed from: d */
    public final Observable m63723d(CollectionGetArtistViewRequest collectionGetArtistViewRequest) {
        return callStream("spotify.collection_esperanto.proto.CollectionService", "StreamArtistView", collectionGetArtistViewRequest).map(tp20.f222384M0);
    }

    /* JADX INFO: renamed from: e */
    public final Observable m63724e(CollectionDecorateRequest collectionDecorateRequest) {
        return callStream("spotify.collection_esperanto.proto.CollectionService", "StreamDecorate", collectionDecorateRequest).map(cve0.f42389L0);
    }
}
