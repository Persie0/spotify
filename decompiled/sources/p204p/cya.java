package p204p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.domain.models.ApplicationState;

/* JADX INFO: loaded from: classes2.dex */
public final class cya extends vya {

    /* JADX INFO: renamed from: a */
    public final ApplicationState f43194a;

    public cya(ApplicationState applicationState) {
        this.f43194a = applicationState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cya) && this.f43194a == ((cya) obj).f43194a;
    }

    public final int hashCode() {
        return this.f43194a.hashCode();
    }
}
