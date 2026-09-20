package p204p;

import com.spotify.esperanto.esperanto.ClientBase;
import io.reactivex.rxjava3.core.Observable;
import spotify.autodownload.esperanto.proto.EnabledShowsCountRequest;

/* JADX INFO: loaded from: classes.dex */
public final class mt7 extends ClientBase {
    /* JADX INFO: renamed from: a */
    public final Observable m62812a(EnabledShowsCountRequest enabledShowsCountRequest) {
        return callStream("spotify.autodownload_esperanto.proto.AutoDownloadService", "StreamEnabledShowsCount", enabledShowsCountRequest).map(l6q.f130460t);
    }
}
