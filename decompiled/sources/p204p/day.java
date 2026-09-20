package p204p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DiscardReason;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.Rule;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes8.dex */
public abstract class day {
    /* JADX INFO: renamed from: a */
    public static DiscardReason m35513a(Rule rule, String str) {
        switch (cay.f35946a[rule.ordinal()]) {
            case 1:
                return DiscardReason.AdStartedPlaying.INSTANCE;
            case 2:
                return DiscardReason.CarConnected.INSTANCE;
            case 3:
                return DiscardReason.AppBackgrounded.INSTANCE;
            case 4:
                return new DiscardReason.ConflictingMessagePresenting(str);
            case 5:
                return DiscardReason.ContextSwitched.INSTANCE;
            case 6:
                return DiscardReason.AppIsOffline.INSTANCE;
            case 7:
                return DiscardReason.NowPlayingViewPresenting.INSTANCE;
            case 8:
                return DiscardReason.InlineCardIncorrectTriggerType.INSTANCE;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
