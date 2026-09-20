package p204p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.domain.models.AdPlayingState;

/* JADX INFO: loaded from: classes2.dex */
public final class aya extends vya {

    /* JADX INFO: renamed from: a */
    public final AdPlayingState f21171a;

    public aya(AdPlayingState adPlayingState) {
        this.f21171a = adPlayingState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aya) && this.f21171a == ((aya) obj).f21171a;
    }

    public final int hashCode() {
        return this.f21171a.hashCode();
    }
}
