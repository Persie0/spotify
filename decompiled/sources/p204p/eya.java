package p204p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.domain.models.CacheState;

/* JADX INFO: loaded from: classes2.dex */
public final class eya extends vya {

    /* JADX INFO: renamed from: a */
    public final CacheState f63996a;

    public eya(CacheState cacheState) {
        this.f63996a = cacheState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eya) && this.f63996a == ((eya) obj).f63996a;
    }

    public final int hashCode() {
        return this.f63996a.hashCode();
    }
}
