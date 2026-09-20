package p204p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.domain.models.CarConnectionState;

/* JADX INFO: loaded from: classes2.dex */
public final class fya extends vya {

    /* JADX INFO: renamed from: a */
    public final CarConnectionState f74663a;

    public fya(CarConnectionState carConnectionState) {
        this.f74663a = carConnectionState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fya) && this.f74663a == ((fya) obj).f74663a;
    }

    public final int hashCode() {
        return this.f74663a.hashCode();
    }
}
