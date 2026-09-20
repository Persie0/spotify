package p204p;

import com.spotify.esperanto.esperanto.ClientBase;
import com.spotify.pending_events.esperanto.proto.ReplacePendingEventRequest;
import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: classes2.dex */
public final class bin0 extends ClientBase {
    /* JADX INFO: renamed from: a */
    public final Single m29349a(ReplacePendingEventRequest replacePendingEventRequest) {
        return callSingle("spotify.pending_events.esperanto.proto.PendingEvents", "ReplacePendingEvent", replacePendingEventRequest).map(y3z.f269017V0);
    }
}
