package p204p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;

/* JADX INFO: loaded from: classes8.dex */
public final class c2f0 extends e2f0 {

    /* JADX INFO: renamed from: a */
    public final MessageResponseToken f33380a;

    public c2f0(MessageResponseToken messageResponseToken) {
        this.f33380a = messageResponseToken;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c2f0) && wj50.m88271j(this.f33380a, ((c2f0) obj).f33380a);
    }

    public final int hashCode() {
        return this.f33380a.hashCode();
    }
}
