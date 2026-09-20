package p204p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;

/* JADX INFO: loaded from: classes8.dex */
public final class gfa extends uxg1 {

    /* JADX INFO: renamed from: b */
    public final MessageResponseToken f79314b;

    static {
        int i = MessageResponseToken.$stable;
    }

    public gfa(MessageResponseToken messageResponseToken) {
        this.f79314b = messageResponseToken;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gfa) && wj50.m88271j(this.f79314b, ((gfa) obj).f79314b);
    }

    public final int hashCode() {
        return this.f79314b.hashCode();
    }
}
