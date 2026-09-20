package p204p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;

/* JADX INFO: loaded from: classes11.dex */
public final class mf3 extends ig3 {

    /* JADX INFO: renamed from: a */
    public final MessageResponseToken f142942a;

    static {
        int i = MessageResponseToken.$stable;
    }

    public mf3(MessageResponseToken messageResponseToken) {
        this.f142942a = messageResponseToken;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mf3) && wj50.m88271j(this.f142942a, ((mf3) obj).f142942a);
    }

    public final int hashCode() {
        return this.f142942a.hashCode();
    }
}
