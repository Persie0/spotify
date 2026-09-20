package p204p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DiscardReason;

/* JADX INFO: loaded from: classes8.dex */
public final class ct40 extends ft40 {

    /* JADX INFO: renamed from: a */
    public final DiscardReason f41767a;

    public ct40(DiscardReason discardReason) {
        this.f41767a = discardReason;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ct40) && wj50.m88271j(this.f41767a, ((ct40) obj).f41767a);
    }

    public final int hashCode() {
        return this.f41767a.hashCode();
    }
}
