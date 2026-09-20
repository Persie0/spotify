package p204p;

import com.spotify.esperanto.esperanto.ClientBase;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import spotify.your_library.esperanto.proto.IsCuratedRequest;
import spotify.your_library.esperanto.proto.YourLibraryContainsRequest;
import spotify.your_library.esperanto.proto.YourLibraryDecorateRequest;
import spotify.your_library.esperanto.proto.YourLibraryRequest;

/* JADX INFO: loaded from: classes2.dex */
public final class tre1 extends ClientBase {
    /* JADX INFO: renamed from: a */
    public final Single m81346a(YourLibraryContainsRequest yourLibraryContainsRequest) {
        return callSingle("spotify.your_library_esperanto.proto.YourLibraryService", "Contains", yourLibraryContainsRequest).map(onq0.f167330X0);
    }

    /* JADX INFO: renamed from: b */
    public final Observable m81347b(YourLibraryRequest yourLibraryRequest) {
        return callStream("spotify.your_library_esperanto.proto.YourLibraryService", "StreamAll", yourLibraryRequest).map(snq0.f211005Z0);
    }

    /* JADX INFO: renamed from: c */
    public final Observable m81348c(YourLibraryDecorateRequest yourLibraryDecorateRequest) {
        return callStream("spotify.your_library_esperanto.proto.YourLibraryService", "StreamDecorate", yourLibraryDecorateRequest).map(vnq0.f243213Z0);
    }

    /* JADX INFO: renamed from: d */
    public final Observable m81349d(IsCuratedRequest isCuratedRequest) {
        return callStream("spotify.your_library_esperanto.proto.YourLibraryService", "StreamIsCurated", isCuratedRequest).map(wnq0.f253252Z0);
    }
}
