package p204p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;

/* JADX INFO: loaded from: classes8.dex */
public final class d2f0 extends e2f0 {

    /* JADX INFO: renamed from: a */
    public final MessageResponseToken f44560a;

    public d2f0(MessageResponseToken messageResponseToken) {
        this.f44560a = messageResponseToken;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d2f0) && wj50.m88271j(this.f44560a, ((d2f0) obj).f44560a);
    }

    public final int hashCode() {
        return this.f44560a.hashCode();
    }
}
