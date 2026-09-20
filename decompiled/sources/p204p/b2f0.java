package p204p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;

/* JADX INFO: loaded from: classes8.dex */
public final class b2f0 extends e2f0 {

    /* JADX INFO: renamed from: a */
    public final MessageResponseToken f22588a;

    public b2f0(MessageResponseToken messageResponseToken) {
        this.f22588a = messageResponseToken;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b2f0) && wj50.m88271j(this.f22588a, ((b2f0) obj).f22588a);
    }

    public final int hashCode() {
        return this.f22588a.hashCode();
    }
}
