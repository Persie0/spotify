package p204p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;

/* JADX INFO: loaded from: classes8.dex */
public final class g3f0 extends j3f0 {

    /* JADX INFO: renamed from: a */
    public final MessageResponseToken f76207a;

    public g3f0(MessageResponseToken messageResponseToken) {
        this.f76207a = messageResponseToken;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g3f0) && wj50.m88271j(this.f76207a, ((g3f0) obj).f76207a);
    }

    public final int hashCode() {
        return this.f76207a.hashCode();
    }
}
